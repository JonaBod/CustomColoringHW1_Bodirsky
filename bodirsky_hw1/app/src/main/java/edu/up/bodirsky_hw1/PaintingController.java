package edu.up.bodirsky_hw1;

import android.widget.SeekBar;

public class PaintingController implements SeekBar.OnSeekBarChangeListener{

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
}
