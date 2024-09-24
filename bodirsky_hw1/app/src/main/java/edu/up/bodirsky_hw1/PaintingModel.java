// unused

package edu.up.bodirsky_hw1;

import android.graphics.Color;
import android.widget.TextView;

public class PaintingModel {

    public int redShade;
    public int greenShade;
    public int blueShade;
    public TextView element;


    // RGB getter and setter methods

    // use to update colors of object with seekbar sliders
    protected void rgbPaint(){
        int color = Color.rgb(0,0,0); //input values as ints in steps of 256
    }


    // Getter method to check redShade
    public int getRedShade() {
        return redShade;
    }
    // setter to change the num of redShade
    public void setRedShade(int redS){
        this.redShade = redS;
    }
    // Getter method to check greenShade
    public int getGreenShade() {
        return greenShade;
    }
    // setter to change the num of greenShade
    public void setGreenShade(int greenS){
        this.greenShade = greenS;
    }
    // Getter method to check blueShade
    public int getBlueShade() { return blueShade;    }
    // setter to change the num of blueShade
    public void setBlueShade(int blueS){ this.blueShade = blueS;   }


    // Getter method to check element
    public TextView getElement() { return element;    }
    // setter to change the element
    public void setElement(TextView e){ this.element = e;    }




}
