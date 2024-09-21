package edu.up.inclassproject;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.drawing_canvas);

    } */

    private String[] schools = {
            "Shiley", "Pamplin", "Nursing"
            };

    // Original
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        int c = 0; // counter that increments when button is pressed
        Button butCont = findViewById(R.id.butContinue); // reference from xml to code
        butCont.setText("Hooray!");
        // if (butUpdate.st) c++;

        // spinner
        /*Spinner spinSchools = findViewById(R.id.spinSchool);
        ArrayAdapter<String> = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, schools);
        spinSchools.;*/

        // get ref to button
        Button butUpdate = findViewById(R.id.butUpdate); // reference from xml to code
        SeekBar seekMax = findViewById(R.id.seekMax);
        SeekBar seekMin = findViewById(R.id.seekMin);

        // get ref to obj
        TextView tvCountAmount = findViewById(R.id.tvCountAmount);
        TextView tvMax = findViewById(R.id.tvMax);
        TextView tvMin = findViewById(R.id.tvMin);
        ExampleController updateObj = new ExampleController(tvCountAmount, tvMax, tvMin, seekMax);

        // Connect the updateMe button with an upHandler object
        butUpdate.setOnClickListener(updateObj);
        seekMax.setOnSeekBarChangeListener(updateObj);
        seekMin.setOnSeekBarChangeListener(updateObj);

    }

}