package com.improve10x.questionbankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerQuestionActivity extends AppCompatActivity implements IQuestionActivity {
    Button verifyBtn;
    Spinner spinnerSp;
    TextView spinnerTxt;
    String question;
    String answer;
    String[] options = {};
    ArrayAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_question);
        initViews();
        getQuestions();
        displayQuestions();
        setUpAdapter();
        connectAdapter();
        handleVerifyBtn();
    }

    private void connectAdapter() {
        spinnerSp.setAdapter(adapter);

    }

    private void setUpAdapter() {
        adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,options);


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
        }else{
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public String getSelectOptions() {
        String selectOptions = (String) spinnerSp.getSelectedItem();
        return selectOptions;
    }

    @Override
    public void displayQuestions() {
        spinnerTxt.setText(question);

    }

    @Override
    public void getQuestions() {
        Intent intent = getIntent();
        question = intent.getStringExtra("Question");
        options  = intent.getStringArrayExtra("options");
        answer = intent.getStringExtra("answer");

    }


    private void initViews() {
        verifyBtn = findViewById(R.id.verify_btn);
        spinnerSp = findViewById(R.id.spinner_sp);
        spinnerTxt = findViewById(R.id.spinner_txt);
    }
}