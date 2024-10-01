package edu.up.bodirsky_hw1b;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;

/*external sources:
classes made available by nuxoll
copied and jsut changed for triangles
 */

public class CustomTriangle extends CustomElement{

    // variables necesssary for the triangle
    private int x;
    private int y;
    private int width;
    private int height;

    Path path = new Path();

    public CustomTriangle(String name, int color, int x, int y, int initW, int initH){
        super(name,color);

        this.x = x;
        this.y = y;
        this.width = initW;
        this.height = initH;

    }


    /* External sources:
    https://kylewbanks.com/blog/drawing-triangles-rhombuses-and-other-shapes-on-android-canvas
    explained how to draw custom objects using draw path
     */
    public void drawMe(Canvas canvas){

        int halfW = width/2;

        path.reset();
        path.moveTo(x,y);
        path.lineTo(x+width,y);
        path.lineTo(x+halfW,y-height);
        path.lineTo(x,y);
        path.close();

        canvas.drawPath(path, myPaint);
    }

    @Override
    public boolean containsPoint(int x, int y) {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void drawHighlight(Canvas canvas) {

    }


    //TODO add drawTriangle function for better readability
}
