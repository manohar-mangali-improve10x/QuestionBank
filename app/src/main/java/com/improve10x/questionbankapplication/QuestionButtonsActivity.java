package com.improve10x.questionbankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class QuestionButtonsActivity extends AppCompatActivity {
    Button question1Btn;
    Button question2Btn;
    Button question3Btn;
    Button checkBoxQno1Btn;
    Button checkBoxQno2Btn;
    Button checkBoxQno3Btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_buttons);
        intiViews();
        question1Btn();
        handleQuestion2Btn();
        handleQuestion3Btn();
        handleCheckBoxQno1Btn();
        handleCheckBoxQno2Btn();
        handleCheckBoxQno3Btn();

    }

    private void handleCheckBoxQno3Btn() {
    }

    private void handleCheckBoxQno2Btn() {
    }

    private void handleCheckBoxQno1Btn() {
    }

    private void handleQuestion3Btn() {
        question3Btn.setOnClickListener(v -> {
            String question = "What will be the output when input is 6. It must return Fizz if the number is divisible by 3 It must return Buzz if the number is divisible by 5.  It must return FizzBuzz if the number is divisible by  both 3 and 5. It must return a number if none of the above conditions are true.";
            String optionA = "Fizz";
            String optionB = "Buzz";
            String optionC = "Fizzbuzz";
            String optionD = "6";
            navigateToQuestionDetails(question,optionA,optionB,optionC,optionD);

        });
    }

    private void handleQuestion2Btn() {
        question2Btn.setOnClickListener(v -> {
            String question = "Given a = 10, b = 20, return true the sum of both numbers is less than hundred  otherwise return false";
            String optionA = "true";
            String optionB = "false";
            String optionC = "All of the above";
            String optionD = "None of the above";
            navigateToQuestionDetails(question,optionA,optionB,optionC,optionD);
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
        checkBoxQno1Btn = findViewById(R.id.qno1_cb);
        checkBoxQno2Btn = findViewById(R.id.qno2_cb);
        checkBoxQno3Btn = findViewById(R.id.qno3_cb);

    }

}