package com.example.frontendpoc.DoStuff;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.frontendpoc.R;

public class ViewNumberTwo extends AppCompatActivity {


    int number;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Intent intent = getIntent();
        this.number = 51;
        this.name = "Bananmannen";
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
