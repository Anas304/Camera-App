package com.example.videocamerwithfilter.widget;

import android.content.Context;
import android.graphics.BitmapFactory;

import com.example.videocamerwithfilter.R;
import com.daasuu.camerarecorder.egl.filter.GlFilter;
import com.daasuu.camerarecorder.egl.filter.GlLookUpTableFilter;

public enum Filters {
    //NORMAL,
    LOOKUP_TABLE;

    public static GlFilter getFilterrInstance(Filters filter, Context context) {
        switch (filter) {
            case LOOKUP_TABLE:
                return new GlLookUpTableFilter(BitmapFactory.decodeResource(context.getResources(), R.drawable.lookup_sample));

            default:
                return new GlFilter();
        }

    }

}
