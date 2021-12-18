package com.example.project.customTextview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class DancingSTextView extends AppCompatTextView {
    public DancingSTextView(@NonNull Context context) {
        super(context);
        setfonts();
    }

    public DancingSTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setfonts();
    }

    public DancingSTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setfonts();
    }
    private void setfonts(){
        Typeface typeface = Utils.getDancingS(getContext());
        setTypeface(typeface);
    }
}
