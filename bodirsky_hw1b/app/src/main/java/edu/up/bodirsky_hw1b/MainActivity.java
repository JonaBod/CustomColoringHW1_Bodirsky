package edu.up.bodirsky_hw1b;

import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private PaintingView paintingView;
    private PaintingModel paintingModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        paintingView = findViewById(R.id.paintingView);
        if (paintingView == null) {
            Log.e("MainActivity", "PaintingView is null! Check the ID in XML and Java.");
        } else {
            // Safely access the PaintingModel only if paintingView is not null
            paintingModel = paintingView.getPaintingModel();
            if (paintingModel == null) {
                Log.e("MainActivity", "PaintingModel is null!");
            }
        }


        /*
        External source:
        in class activity Nuxoll (lizard canvas)
         */

        TextView element = findViewById(R.id.tvElement);
        SeekBar seekRed = findViewById(R.id.seekRed);
        SeekBar seekGreen = findViewById(R.id.seekGreen);
        SeekBar seekBlue = findViewById(R.id.seekBlue);

        PaintingController paintingController = new PaintingController(paintingView);

        seekRed.setOnSeekBarChangeListener(paintingController);
        seekGreen.setOnSeekBarChangeListener(paintingController);
        seekBlue.setOnSeekBarChangeListener(paintingController);




    }
}