package edu.up.bodirsky_hw1b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;

import java.util.ArrayList;

public class PaintingView extends SurfaceView {

    //Paint red = new Paint();

    private ArrayList<CustomElement> elements = new ArrayList();

    private PaintingModel paintingModel;

    // first initializing of colors
    int sky = Color.rgb(63,225,255);
    int grass = Color.rgb(107,242,107);
    int mountain = Color.rgb(146,146,146);
    int sun = Color.rgb(236,250,43);
    int houseBody = Color.rgb(255,255,255);
    int houseRoof = Color.rgb(190,43,43);



    /* external citation:
    Birthday cake Lab example
     */
    public PaintingView(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.paintingModel = new PaintingModel();

        //This is essential or your onDraw method won't get called
        setWillNotDraw(false);

    }

    // allows other parts of the program to access the paintingModel
    public PaintingModel getPaintingModel() { return this.paintingModel; }



    @Override
    public void onDraw(Canvas canvas){

        /*
        external source:
        shogi game project
         */
        // Clear the canvas
        canvas.drawColor(Color.WHITE);

        int width = canvas.getWidth();
        int height = canvas.getHeight();

        // define the 6 elements


        // light blue rectangle background representing the sky
        CustomElement newbie = new CustomRect("Sky", sky,0,0,width,height );
        elements.add(newbie);

        // grass around the bottom
        int grassLayer = height*7/8;
        newbie = new CustomRect("Grass", grass, 0, grassLayer,width, height);
        elements.add(newbie);

        // grey triangle in the left representing a mountain
        int mountW = width/2;
        int mountH = height*2/3;
        newbie = new CustomTriangle("Mountain", mountain, width/8, grassLayer, mountW, mountH);
        elements.add(newbie);

        // yellow circle top left for the sun
        int sunR = height/10;
        newbie = new CustomCircle("Sun", sun, sunR*2, sunR*2, sunR);
        elements.add(newbie);

        // house on the right
        // main foundation white
        int houseBodyHeight = height/2;
        newbie = new CustomRect("HouseBody", houseBody, width*3/5, houseBodyHeight, width*3/5+width/4, grassLayer );
        elements.add(newbie);

        // red triangle roof
        newbie = new CustomTriangle("HouseRoof", houseRoof, width*3/5, houseBodyHeight, width/4, height/5);
        elements.add(newbie);


        /*
        External source:
        Nuxoll
        copied form in class activity
         */
        for(CustomElement currentElement : elements){
            currentElement.drawMe(canvas);
        }

    }
}
