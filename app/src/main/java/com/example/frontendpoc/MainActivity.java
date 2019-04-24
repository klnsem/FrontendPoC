package com.example.frontendpoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.frontendpoc.DoStuff.ViewNumberTwo;

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


    public void doActivity(View view) {
        Intent intent = new Intent(this, ViewNumberTwo.class);
        startActivity(intent);
    }
}