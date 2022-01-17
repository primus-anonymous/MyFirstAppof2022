package com.neocaptainnemo.myfirstappof2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText inputOne = findViewById(R.id.input_one);
        EditText inputTwo = findViewById(R.id.input_two);

        Button compare = findViewById(R.id.btn_compare);
        TextView result = findViewById(R.id.result);

        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String input1 = inputOne.getText().toString();
                    String input2 = inputTwo.getText().toString();

                    Log.v("MainActivityDigits", "First input " + input1);
                    Log.v("MainActivityDigits", "Second input " + input2);

                    Integer one = Integer.valueOf(input1);
                    Integer two = Integer.valueOf(input2);

                    if (one.equals(two)) {
                        result.setText("Equal");
                    } else {
                        result.setText("Not Equal");
                    }

                } catch (NumberFormatException exc) {
                    result.setText("Please enter a digit, dummy!");
                }
            }
        });
    }
}