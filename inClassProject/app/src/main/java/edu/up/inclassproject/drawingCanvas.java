package edu.up.inclassproject;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class drawingCanvas extends SurfaceView {

    // For our fav color

   // private Paint = new ________!!!_________

    public drawingCanvas(Context context, AttributeSet attrs) {

        super(context, attrs);
        Paint redPaint = new Paint();
        redPaint.setColor(0xFFFF0000); //make red
        redPaint.setStyle(Paint.Style.FILL); //fill rect
    }

    @Override
    protected void onDraw(Canvas canvas){
// Java
/* void paint(Graphics g){
g.setColor(Color.red);
g.fillRect(x,y,w,h);//or g.drawRect
}
 */
    Paint redPaint = new Paint();
    redPaint.setColor(0xFFFF0000); //make red
    redPaint.setStyle(Paint.Style.FILL); //fill rect
    canvas.drawRect(100,100,200,100, redPaint);
    }
}
