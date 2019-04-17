package com.example.frontendpoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        //ändra textboxen
        final TextView helloTextView = (TextView) findViewById(R.id.textView4);
        helloTextView.setText("butts");

    }
}
