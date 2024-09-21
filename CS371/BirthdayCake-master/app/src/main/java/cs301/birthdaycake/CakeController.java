package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    private CakeView cakeView;
    private CakeModel cakeModel;
    private Button butBlowout;

    /*
     * Constructor to reference to a CakeView model
     */
    public CakeController(CakeView view, Button button){
        this.cakeView = view;
        this.cakeModel = cakeView.getCakeModel();
        this.butBlowout = button;
    }

    // click method for blowing out candles
    @Override
    public void onClick(View view) {
        if (cakeModel.isCandleLit()) {
            cakeModel.setCandleLit(false);
            butBlowout.setText("Light up");
        }else{
            cakeModel.setCandleLit(true);
            butBlowout.setText("Blow out");
        }
        cakeView.invalidate();
        //Log.d("cake", "click!");
        //butBlowout.setText("Light up");
    }

    // switch method that removes/draws candles
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        int id = compoundButton.getId();

        if(id == R.id.swCandles) {
            cakeModel.setCandle(b);
        } else if (id == R.id.swFrosting) {
            if (b){
                cakeModel.setHasFrosting(true);
            }else{
                cakeModel.setHasFrosting(false);
            }
        }
        cakeView.invalidate();

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeModel.setCandleAmount(i);
        cakeView.invalidate();
    }

    // Unused
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {  }
    // Unused
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {  }
}
