package com.nhscomputerclub.androidtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView helloTextView = findViewById(R.id.hello_textview);
        final Button clickButton = findViewById(R.id.clickButton);

        helloTextView.setText("Hello Mr. Fincher");

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Handle button click
                clickButton.setText("Clicked");
            }
        });


    }
}
