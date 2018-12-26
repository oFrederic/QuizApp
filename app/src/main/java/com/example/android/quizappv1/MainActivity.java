package com.example.android.quizappv1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Check if the answer of question 1 is correct.
     *
     * @return whether or not the answer is correct.
     */
    private boolean checkQuestion1() {
        CheckBox answerQuestion1A = findViewById(R.id.check_1_a);
        boolean hasCheckedA = answerQuestion1A.isChecked();
        CheckBox answerQuestion1B = findViewById(R.id.check_1_b);
        boolean hasCheckedB = answerQuestion1B.isChecked();
        CheckBox answerQuestion1C = findViewById(R.id.check_1_c);
        boolean hasCheckedC = answerQuestion1C.isChecked();
        CheckBox answerQuestion1D = findViewById(R.id.check_1_d);
        boolean hasCheckedD = answerQuestion1D.isChecked();

        return hasCheckedA & hasCheckedB & hasCheckedD & !hasCheckedC;

    }

    /**
     * Check if the answer of question 2 is correct.
     *
     * @return whether or not the answer is correct.
     */
    private boolean checkQuestion2() {
        RadioButton answerQuestion2 = findViewById(R.id.radio_button_2_b);
        return answerQuestion2.isChecked();

    }

    /**
     * Check if the answer of question 3 is correct.
     *
     * @return whether or not the answer is correct.
     */
    private boolean checkQuestion3() {
        String goodAnswer = "black";
        EditText answerQuestion3 = findViewById(R.id.edit_text_answer_3);
        String userAnswer = answerQuestion3.getText().toString();
        return goodAnswer.equalsIgnoreCase(userAnswer);

    }

    /**
     * Check if the answer of question 4 is correct.
     *
     * @return whether or not the answer is correct.
     */
    private boolean checkQuestion4() {
        CheckBox answerQuestion4A = findViewById(R.id.check_4_a);
        boolean hasCheckedA = answerQuestion4A.isChecked();
        CheckBox answerQuestion4B = findViewById(R.id.check_4_b);
        boolean hasCheckedB = answerQuestion4B.isChecked();
        CheckBox answerQuestion4C = findViewById(R.id.check_4_c);
        boolean hasCheckedC = answerQuestion4C.isChecked();
        CheckBox answerQuestion4D = findViewById(R.id.check_4_d);
        boolean hasCheckedD = answerQuestion4D.isChecked();

        return !hasCheckedA & hasCheckedB & hasCheckedC & !hasCheckedD;

    }

    /**
     * Check if the answer of question 5 is correct.
     *
     * @return whether or not the answer is correct.
     */
    private boolean checkQuestion5() {
        RadioButton answerQuestion5 = findViewById(R.id.radio_button_5_d);
        return answerQuestion5.isChecked();

    }

    /**
     * Check if the answer of question 6 is correct.
     *
     * @return whether or not the answer is correct.
     */
    private boolean checkQuestion6() {
        String goodAnswer = "1870";
        EditText answerQuestion6 = findViewById(R.id.edit_text_answer_6);
        String userAnswer = answerQuestion6.getText().toString();
        return goodAnswer.equals(userAnswer);

    }

    /**
     * Check all answer, count and display the correct answer value on the screen.
     */
    public void checkQuestion(View v) {
        //number of correct answer
        int correctAnswer = 0;

        if (checkQuestion1()) {
            correctAnswer++;

        }

        if (checkQuestion2()) {
            correctAnswer++;

        }

        if (checkQuestion3()) {
            correctAnswer++;


        }

        if (checkQuestion4()) {
            correctAnswer++;

        }

        if (checkQuestion5()) {
            correctAnswer++;

        }

        if (checkQuestion6()) {
            correctAnswer++;

        }

        displayCorrectAnswer(correctAnswer);
        Toast toast = Toast.makeText(getApplicationContext(), "You got " + correctAnswer + " out of 6 correct answer!", Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * This method displays the correct answer value on the screen.
     */
    private void displayCorrectAnswer(int correctAnswer) {
        TextView numberOfCorrectAnswer = findViewById(R.id.number_of_correct_answer);
        numberOfCorrectAnswer.setText("" + correctAnswer);
    }
}
