package com.example.project.customTextview;

import android.content.Context;
import android.graphics.Typeface;

public class Utils {
    private static Typeface dancingS;

    public static Typeface getDancingS(Context context) {
        if (dancingS == null){
           dancingS = Typeface.createFromAsset(context.getAssets(), "fonts/DancingScript-Regular.otf");
        }
        return dancingS;
    }
}
