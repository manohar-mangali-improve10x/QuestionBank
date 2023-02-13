package com.improve10x.questionbankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class QuestionsCheckBoxActivity extends AppCompatActivity {
    TextView question;
    CheckBox option1Cb;
    CheckBox option2Cb;
    CheckBox option3Cb;
    CheckBox option4Cb;
    Button verifyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_check_box);
        intiViews();
        getQuestionOptionData();
        displayAllData();
    }

    private void displayAllData() {

    }

    private void getQuestionOptionData() {

    }

    private void intiViews() {
        question = findViewById(R.id.question_txt);
        option1Cb = findViewById(R.id.option1_cb);
        option2Cb = findViewById(R.id.option2_cb);
        option3Cb = findViewById(R.id.option3_cb);
        option4Cb = findViewById(R.id.option4_cb);
    }
}