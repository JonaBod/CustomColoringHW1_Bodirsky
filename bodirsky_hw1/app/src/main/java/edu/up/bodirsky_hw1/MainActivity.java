package edu.up.bodirsky_hw1;

import android.os.Bundle;
import android.util.Log;

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



        PaintingController paintingController = new PaintingController(paintingView);




    }
}