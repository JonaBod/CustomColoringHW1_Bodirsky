package edu.up.inclassproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class drawingCanvas extends SurfaceView {

    // For our fav color

    private Paint redPaint;
    private Paint darkGreenPaint;


    public drawingCanvas(Context context, AttributeSet attrs) {

        super(context, attrs);

        // tell the app to actually draw
        setWillNotDraw(false);

        redPaint = new Paint();
        redPaint.setColor(0xCCCCCCCC); //make red(silver)
        redPaint.setStyle(Paint.Style.FILL); //fill rect

        darkGreenPaint = new Paint();
        darkGreenPaint.setColor(0xFF119722); //make red
        darkGreenPaint.setStyle(Paint.Style.STROKE); //fill rect

        setBackgroundColor(0xFFFFFFff);
    }

    @Override
    protected void onDraw(Canvas canvas){
        canvas.drawRect(100,100,120,120, redPaint);
        canvas.drawCircle(250,100,50, darkGreenPaint);

        canvas.drawText("Hello", 400, 100, redPaint);

        // paint jack o lantern on canvas
        Bitmap pumpkinBmp = BitmapFactory.decodeResource(getResources(),R.drawable.pumpkin_img);

        pumpkinBmp = Bitmap.createScaledBitmap(pumpkinBmp,200,150,false);
        canvas.drawBitmap(pumpkinBmp, 200, 300, darkGreenPaint);
    }
}
