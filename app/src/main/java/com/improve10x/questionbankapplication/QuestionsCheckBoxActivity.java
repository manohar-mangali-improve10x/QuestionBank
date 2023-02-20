package com.improve10x.questionbankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class QuestionsCheckBoxActivity extends AppCompatActivity implements IQuestionActivity {
    TextView question;
    CheckBox option1Cb;
    CheckBox option2Cb;
    CheckBox option3Cb;
    CheckBox option4Cb;
    Button verifyBtn;
    String question1;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_check_box);
        intiViews();
        getQuestions();
        displayQuestions();
        handleVerifyBtn();
    }

    @Override
    public void handleVerifyBtn() {
        verifyBtn.setOnClickListener(v -> {
            verifyAnswer();

        });
    }

    @Override
    public void verifyAnswer() {

    }

    @Override
    public String getSelectOptions() {
        return null;
    }

    @Override
    public void displayQuestions() {
        question.setText(question1);
        option1Cb.setText(optionA);
        option2Cb.setText(optionB);
        option3Cb.setText(optionC);
        option4Cb.setText(optionD);

    }

    @Override
    public void getQuestions() {
        Intent intent= getIntent();
        question1 = intent.getStringExtra("question");
        optionA = intent.getStringExtra("option1");
        optionB = intent.getStringExtra("option2");
        optionC = intent.getStringExtra("option3");
        optionD = intent.getStringExtra("option4");
        answer = intent.getStringExtra("answer");
    }


    public void intiViews() {
        question = findViewById(R.id.question_txt);
        option1Cb = findViewById(R.id.option1_cb);
        option2Cb = findViewById(R.id.option2_cb);
        option3Cb = findViewById(R.id.option3_cb);
        option4Cb = findViewById(R.id.option4_cb);
        verifyBtn = findViewById(R.id.verify_btn);
    }
}