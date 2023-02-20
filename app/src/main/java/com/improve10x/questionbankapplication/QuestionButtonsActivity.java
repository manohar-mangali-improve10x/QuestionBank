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
    Button spinner1Btn;
    Button spinner2Btn;
    Button spinner3Btn;


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
        handleSpinner1Btn();
        handleSpinner2Btn();
        handleSpinner3Btn();


    }

    private void handleSpinner2Btn() {
        spinner2Btn.setOnClickListener(v -> {
            String question = " public class Solution{\n" +
                    "       public static void main(String[] args){\n" +
                    "                     byte x = 127;\n" +
                    "                     x++;\n" +
                    "                     x++;\n" +
                    "                     System.out.print(x);\n" +
                    "       }\n" +
                    "}";
            String[] options = {"-127","127","129","2"};
            String answer = "-127";
            navigateToSpinnerQuestion(question,options,answer);
        });
    }

    private void handleSpinner3Btn() {
        spinner3Btn.setOnClickListener(v -> {
            String question = "  Find the value of A[1] after execution of the following program.\n" +
                    "\n" +
                    "int[] A = {0,2,4,1,3};\n" +
                    "for(int i = 0; i < a.length; i++){\n" +
                    "    a[i] = a[(a[i] + 3) % a.length];\n" +
                    "}";
            String[] options = {"0","1","2","3"};
            String answer = "1";
            navigateToSpinnerQuestion(question,options,answer);
        });

    }

    private void handleSpinner1Btn() {
        spinner1Btn.setOnClickListener(v -> {
            String question = " Number of primitive data types in Java are?";
            String[] options = {"6","7","8","9"};
            String answer = "8";
            navigateToSpinnerQuestion(question,options,answer);
        });

    }

    private void handleCheckBoxQno3Btn() {
        checkBoxQno3Btn.setOnClickListener(v -> {
            String question = " Which of the following planets";
            String optionA = "Mercury";
            String optionB = "Jupiter";
            String optionC = "Saturn";
            String optionD = "Sun";
            String answer = "abc";
            navigateToCheckBoxDetails(question,optionA,optionB,optionC,optionD,answer);
        });

    }

    private void handleCheckBoxQno2Btn() {
        checkBoxQno2Btn.setOnClickListener(v -> {
            String question = " Select activity lifecycle methods in Android";
            String optionA = "On Create";
            String optionB = "On Stop";
            String optionC = "On Resume";
            String optionD = "On Pause";
            String answer = "abcd";
            navigateToCheckBoxDetails(question,optionA,optionB,optionC,optionD,answer);

        });
    }

    private void handleCheckBoxQno1Btn() {
        checkBoxQno1Btn.setOnClickListener(v -> {
            String question = "Select all the parts of a computer";
            String optionA = "cat";
            String optionB = "Mouse";
            String optionC = "Monitor";
            String optionD = "keyboard";
            String answer = "bcd";
            navigateToCheckBoxDetails(question,optionA,optionB,optionC,optionD,answer);

        });
    }

    private void handleQuestion3Btn() {
        question3Btn.setOnClickListener(v -> {
            String question = "What will be the output when input is 6. It must return Fizz if the number is divisible by 3 It must return Buzz if the number is divisible by 5.  It must return FizzBuzz if the number is divisible by  both 3 and 5. It must return a number if none of the above conditions are true.";
            String optionA = "Fizz";
            String optionB = "Buzz";
            String optionC = "Fizzbuzz";
            String optionD = "6";
            String answer = "a";
            navigateToQuestionDetails(question,optionA,optionB,optionC,optionD,answer);

        });
    }

    private void handleQuestion2Btn() {
        question2Btn.setOnClickListener(v -> {
            String question = "Given a = 10, b = 20, return true the sum of both numbers is less than hundred  otherwise return false";
            String optionA = "true";
            String optionB = "false";
            String optionC = "All of the above";
            String optionD = "None of the above";
            String answer = "a";
            navigateToQuestionDetails(question,optionA,optionB,optionC,optionD,answer);
        });

    }

    private void navigateToQuestionDetails(String question,String optionA,String optionB,String optionC,String optionD, String answer) {
        Intent questionDetailsIntent = new Intent(this, QuestionDetailsActivity.class);
        questionDetailsIntent.putExtra("Question",question);
        questionDetailsIntent.putExtra("Answer1",optionA);
        questionDetailsIntent.putExtra("Answer2",optionB);
        questionDetailsIntent.putExtra("Answer3",optionC);
        questionDetailsIntent.putExtra("Answer4",optionD);
        questionDetailsIntent.putExtra("answer",answer);
        startActivity(questionDetailsIntent);

    }
    private void navigateToSpinnerQuestion(String question,String[] options, String answer) {
        Intent spinnerIntent = new Intent(this, SpinnerQuestionActivity.class);
        spinnerIntent.putExtra("Question", question);
        spinnerIntent.putExtra("answer", answer);
        spinnerIntent.putExtra("options", options);
        startActivity(spinnerIntent);
    }

        private void navigateToCheckBoxDetails(String question,String optionA,String optionB,String optionC,String optionD,String answer){
        Intent checkBoxIntent = new Intent(this,QuestionsCheckBoxActivity.class);
        checkBoxIntent.putExtra("question",question);
        checkBoxIntent.putExtra("option1",optionA);
        checkBoxIntent.putExtra("option2",optionB);
        checkBoxIntent.putExtra("option3",optionC);
        checkBoxIntent.putExtra("option",optionD);
        checkBoxIntent.putExtra("answer",answer);
        startActivity(checkBoxIntent);
    }

    private void question1Btn() {
        question1Btn.setOnClickListener(view -> {
            String question = "How  many planets  in solar system";
            String optionA = "12";
            String optionB = "8";
            String optionC = "10";
            String optionD = "9";
            String answer = "b";
            navigateToQuestionDetails(question,optionA,optionB,optionC,optionD,answer);
        });
    }

    private void intiViews() {
        question1Btn = findViewById(R.id.question1_btn);
        question2Btn = findViewById(R.id.question2_btn);
        question3Btn = findViewById(R.id.question3_btn);
        checkBoxQno1Btn = findViewById(R.id.qno1_btn);
        checkBoxQno2Btn = findViewById(R.id.qno2_btn);
        checkBoxQno3Btn = findViewById(R.id.qno3_btn);
        spinner1Btn = findViewById(R.id.spinner1_btn);
        spinner2Btn = findViewById(R.id.spinner2_btn);
        spinner3Btn = findViewById(R.id.spinner3_btn);

    }

}