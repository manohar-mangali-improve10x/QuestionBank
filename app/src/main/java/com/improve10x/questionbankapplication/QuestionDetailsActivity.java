package com.improve10x.questionbankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionDetailsActivity extends AppCompatActivity {
    TextView textViewTxt;
    RadioButton radioButton1Rb;
    RadioButton radioButton2Rb;
    RadioButton radioButton3Rb;
    RadioButton radioButton4Rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
        intiViews();
        Intent intent = getIntent();
        String question = intent.getStringExtra("Question");
        String optionA = intent.getStringExtra("Answer1");
        String optionB = intent.getStringExtra("Answer2");
        String optionC = intent.getStringExtra("Answer3");
        String optionD = intent.getStringExtra("Answer4");
        textViewTxt.setText(question);
        radioButton1Rb.setText(optionA);
        radioButton2Rb.setText(optionB);
        radioButton3Rb.setText(optionC);
        radioButton4Rb.setText(optionD);

    }

    private void intiViews() {
        textViewTxt = findViewById(R.id.textView_txt);
        radioButton1Rb = findViewById(R.id.radioButton1_rb);
        radioButton2Rb = findViewById(R.id.radioButton2_rb);
        radioButton3Rb = findViewById(R.id.radioButton3_rb);
        radioButton4Rb = findViewById(R.id.radioButton4_rb);
    }
}