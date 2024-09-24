package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cakeview = findViewById(R.id.cakeview);
        Button butBlowout = findViewById(R.id.butBlowOut); // reference from xml to code
        CakeController cakeController = new CakeController(cakeview, butBlowout);

        butBlowout.setOnClickListener(cakeController);

        Switch swCandles = findViewById(R.id.swCandles);
        Switch swFrosting = findViewById(R.id.swFrosting);
        swCandles.setOnCheckedChangeListener(cakeController);
        swFrosting.setOnCheckedChangeListener(cakeController);

        SeekBar seekCandleAmount = findViewById(R.id.seekCandleAmount);
        seekCandleAmount.setOnSeekBarChangeListener(cakeController);

    }
    public void goodbye(View button){
        //System.out.println("Goodbye");
        Log.i("button", "Goodbye");
        finishAffinity();
    }
}
