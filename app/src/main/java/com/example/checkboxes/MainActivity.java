package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        checkBox = findViewById(R.id.checkBox);
    }


    // Method to handle radio button click
    public void onRadioButtonClicked(View view) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        Toast.makeText(this, "Selected Radio Button: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }

    // Method to handle checkbox click
    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        if (checked) {
            Toast.makeText(this, "Checkbox is checked", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Checkbox is unchecked", Toast.LENGTH_SHORT).show();
        }
    }
}