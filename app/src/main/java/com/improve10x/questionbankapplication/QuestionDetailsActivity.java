package com.improve10x.questionbankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionDetailsActivity extends AppCompatActivity implements IQuestionActivity{
    TextView textViewTxt;
    RadioGroup radioGroupRg;
    RadioButton radioButton1Rb;
    RadioButton radioButton2Rb;
    RadioButton radioButton3Rb;
    RadioButton radioButton4Rb;
    Button verifyBtn;
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
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
        String correctAnswer = getSelectOptions();
        if (answer.equals(correctAnswer)){
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public String getSelectOptions() {
        int selectAnswer = radioGroupRg.getCheckedRadioButtonId();
        String result = " ";
        if (selectAnswer == R.id.radioButton1_rb) {
            result = "a";
        }else if (selectAnswer == R.id.radioButton2_rb) {
            result = "b";
        }else  if (selectAnswer == R.id.radioButton3_rb) {
            result = "c";
        }else  if (selectAnswer == R.id.radioButton4_rb){
            result = "d";
        }
        return result;

    }



    @Override
    public void displayQuestions() {
        textViewTxt.setText(question);
        radioButton1Rb.setText(optionA);
        radioButton2Rb.setText(optionB);
        radioButton3Rb.setText(optionC);
        radioButton4Rb.setText(optionD);


    }

    @Override
    public void getQuestions() {
        Intent intent = getIntent();
        question = intent.getStringExtra("Question");
        optionA = intent.getStringExtra("Answer1");
        optionB = intent.getStringExtra("Answer2");
        optionC = intent.getStringExtra("Answer3");
        optionD = intent.getStringExtra("Answer4");
        answer = intent.getStringExtra("answer");

    }

    private void intiViews() {
        textViewTxt = findViewById(R.id.textView_txt);
        radioButton1Rb = findViewById(R.id.radioButton1_rb);
        radioButton2Rb = findViewById(R.id.radioButton2_rb);
        radioButton3Rb = findViewById(R.id.radioButton3_rb);
        radioButton4Rb = findViewById(R.id.radioButton4_rb);
        verifyBtn = findViewById(R.id.verify_btn);
        radioGroupRg = findViewById(R.id.radio_rg);
    }
}