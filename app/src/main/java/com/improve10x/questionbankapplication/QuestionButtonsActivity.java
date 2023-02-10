package com.improve10x.questionbankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class QuestionButtonsActivity extends AppCompatActivity {
    Button question1Btn;
    Button question2Btn;
    Button question3Btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_buttons);
        intiViews();
        question1Btn();
        handleQuestion2Btn();

    }

    private void handleQuestion2Btn() {
        question2Btn.setOnClickListener(v -> {
            String question2 = ""
        });

    }

    private void navigateToQuestionDetails(String question,String optionA,String optionB,String optionC,String optionD) {
        Intent questionDetailsIntent = new Intent(this, QuestionDetailsActivity.class);
        questionDetailsIntent.putExtra("Question",question);
        questionDetailsIntent.putExtra("Answer1",optionA);
        questionDetailsIntent.putExtra("Answer2",optionB);
        questionDetailsIntent.putExtra("Answer3",optionC);
        questionDetailsIntent.putExtra("Answer4",optionD);
        startActivity(questionDetailsIntent);

    }

    private void question1Btn() {
        question1Btn.setOnClickListener(view -> {
            String question = "How  many planets  in solar system";
            String optionA = "12";
            String optionB = "8";
            String optionC = "10";
            String optionD = "9";
            navigateToQuestionDetails(question,optionA,optionB,optionC,optionD);
        });
    }

    private void intiViews() {
        question1Btn = findViewById(R.id.question1_btn);
        question2Btn = findViewById(R.id.question2_btn);
        question3Btn = findViewById(R.id.question3_btn);

    }

}