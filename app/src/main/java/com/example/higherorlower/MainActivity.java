package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    public void generateRandomNumber(){

        Random rand = new Random();

        randomNumber = rand.nextInt(20)+1;

    }

    int randomNumber;
    public void guess (View view) {

        EditText editText = (EditText) findViewById(R.id.editText);

        int guessValue =Integer.parseInt(editText.getText().toString());

        String message;

        if(guessValue>randomNumber) {

            message = "Lower";


        } else if (guessValue<randomNumber) {

            message = "Higher";
        }

        else {

            message = "You got it! Try again!";

            generateRandomNumber();
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

Log.i("info", "button pressed");



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();

    }
}
