package com.example.lab1alif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;
    Button resetButton;
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign items in display(activity_main.xml) into variable
        tvMessage = (TextView) findViewById(R.id.textView);
        submitButton = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editText);
        resetButton = (Button) findViewById(R.id.resetButton);
    }

    public void displayText(View view) {
        String text = etName.getText().toString();

        tvMessage.setText("Welcome, " + text);
        Toast toast = Toast.makeText(this,"Welcome", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void resetButton(View view) {
        etName.getText().clear();
        tvMessage.setText("Welcome!"); // Clear the welcome message TextView
        Toast toast2 = Toast.makeText(this, "Name cleared", Toast.LENGTH_SHORT);
        toast2.show();
    }
}