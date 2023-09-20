package com.app.testdynamicimageinrecyclerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;

import androidx.compose.ui.graphics.Canvas;

public class CustomCanvasView extends View {
    private Bitmap canvasBitmap;
    private Canvas canvas;

    public CustomCanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // Initialization and setup
    }

    public void setCanvasData(CanvasData canvasData) {
        // Set canvas data and trigger redraw
    }

//    @Override
    protected void onDraw(Canvas canvas) {
        // Perform your canvas drawing here using canvasBitmap
    }
}
