package edu.up.inclassproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.drawing_canvas);

    }
    public void incrementMe(View theView){
        Button butUpdate = findViewById(R.id.butUpdate);
        //get reference to tvCount
        TextView tvCountAmount = findViewById(R.id.tvCountAmount);

        CharSequence cseq = tvCountAmount.getText();
        String textVal = cseq.toString();

        int intVal = Integer.parseInt(textVal);

        intVal++;

        tvCountAmount.setText(""+intVal);
    }
    /* Original
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        int c = 0; // counter that increments when button is pressed
        Button butUpdate = findViewById(R.id.butUpdate); // reference from xml to code
        butUpdate.setText("increment");
        // if (butUpdate.st) c++;
    }
     */
}