package edu.up.inclassproject;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class ExampleController implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    //get reference to tvCount
    private TextView tvCountAmount;
    private TextView tvMax;
    private TextView tvMin;
    private SeekBar seekMax;
    private SeekBar seekMin;

    // constructor
    public ExampleController(TextView initTvCountNum, TextView initTvMax, TextView initTvMin, SeekBar initSeekMax){

        this.tvCountAmount = initTvCountNum;
        this.tvMax = initTvMax;
        this.tvMin = initTvMin;
        this.seekMax = initSeekMax;

    }

    @Override
    public void onClick(View view) {

        CharSequence cseq = tvCountAmount.getText();
        String textVal = cseq.toString();

        int intVal = Integer.parseInt(textVal);

        intVal++;
        // put the new value back into the tv
        tvCountAmount.setText(""+intVal);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int seekProg, boolean fromUser) {
        if (seekBar == seekMax) tvMax.setText(""+seekProg);
        else tvMin.setText(""+seekProg);

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) { /* unused */   }
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {  /* unused */  }
}
