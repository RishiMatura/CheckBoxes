package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private CheckBox checkBox;
    EditText editText;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        checkBox = findViewById(R.id.checkBox);
        fab = findViewById(R.id.floatingActionButton);
        editText=findViewById(R.id.editTextText);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableIntent();
            }
        });
    }

    public void enableIntent(){
        String name = editText1.getText().toString();
        Intent intent = new Intent(this, GetNameActivity.class);
        intent.putExtra("Name", name);
        startActivity(intent);
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