package edu.up.bodirsky_hw1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceView;

public class PaintingView extends SurfaceView {

    Paint red = new Paint();

    private PaintingModel paintingModel;

    public static final float centerTopMiddle = 0;


    public PaintingView(Context context) {
        super(context);

        //This is essential or your onDraw method won't get called
        setWillNotDraw(false);

        //setup colors here
        red.setColor(0xFFFF0000);  //bright red
        red.setStyle(Paint.Style.FILL);

        setBackgroundColor(Color.WHITE);  //better than black default

        this.paintingModel = new PaintingModel();
    }

    // allows other parts of the program to access the paintingModel
    public PaintingModel getPaintingModel() { return this.paintingModel; }


    public void onDraw(Canvas canvas){
        canvas.drawRect(100, 100, 2000, 2000, red);
    }
}
