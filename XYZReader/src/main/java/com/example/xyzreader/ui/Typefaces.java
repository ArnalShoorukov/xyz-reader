package com.example.xyzreader.ui;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Hashtable;

/**
 * Created by arnal on 6/27/17.
 */

public class Typefaces {
    private static final Hashtable<String, Typeface> cache = new Hashtable<>();

    public static Typeface get(Context c, String name) {
        synchronized (cache) {
            if (!cache.containsKey(name)) {
                Typeface t = Typeface.createFromAsset(
                        c.getAssets(),
                        String.format("fonts/%s", name)
                );
                cache.put(name, t);
            }
            return cache.get(name);
        }
    }
}
