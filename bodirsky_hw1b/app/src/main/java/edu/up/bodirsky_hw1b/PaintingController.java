// unused

package edu.up.bodirsky_hw1b;

import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;

public class PaintingController implements SeekBar.OnSeekBarChangeListener, View.OnTouchListener{

    private PaintingView paintingView;
    private PaintingModel paintingModel;

    // constructor to reference
    public PaintingController(PaintingView view){
        this.paintingView = view;
        this.paintingModel = paintingView.getPaintingModel();
    }



    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


    /*
    external citation:
    in class activity Lizard canvas (Nuxoll)
     */
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        //Find out where the touch occurred (x,y)
        float xLoc = motionEvent.getX();  //display pixels
        float yLoc = motionEvent.getY();  //display pixels

        // depending on location select the correct element



        return false;
    }
}
