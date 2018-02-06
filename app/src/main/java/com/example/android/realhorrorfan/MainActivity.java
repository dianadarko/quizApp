package com.example.android.realhorrorfan;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {

    String right = "Right answer!";
    String wrong = "Wrong answer!";


    TextView question1Feedback;
    TextView question2Feedback;
    TextView question3Feedback;
    TextView question4Feedback;

    int q1Points = 0;
    int q2Points = 0;
    int q3Points = 0;
    int q4Points = 0;
    int q5Points = 0;

    private TextView q1PointsText;
    private CheckBox q2AnsOne;
    private CheckBox q2AnsTwo;
    private CheckBox q2AnsThree;
    private CheckBox q2AnsFour;
    private TextView q2PointsText;
    private EditText q3EditText;
    private TextView q3PointsText;
    private EditText q4EditText;
    private TextView q4PointsText;
    private EditText q5EditText;
    private TextView q5PointsText;
    private TextView question5Feedback;
    private TextView totalPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*this is for the custom font i use*/
        TextView tx = (TextView)findViewById(R.id.main_title);
        TextView tx1 = (TextView)findViewById(R.id.question_no1);
        TextView tx2 = (TextView)findViewById(R.id.question_no2);
        //TextView tx = (TextView)findViewById(R.id.);
        TextView tx3 = (TextView)findViewById(R.id.question_no3);
        TextView tx4 = (TextView)findViewById(R.id.question_no4);
        TextView tx5 = (TextView)findViewById(R.id.question_no5);
        //TextView tx = (TextView)findViewById(R.id.);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/truelies.otf");
        tx.setTypeface(custom_font);
        tx1.setTypeface(custom_font);
        tx2.setTypeface(custom_font);
        tx3.setTypeface(custom_font);
        tx4.setTypeface(custom_font);
        tx5.setTypeface(custom_font);

        question1Feedback = (TextView) findViewById(R.id.question1_feedback);
        question2Feedback = (TextView) findViewById(R.id.question2_feedback);
        question3Feedback = (TextView) findViewById(R.id.question3_feedback);
        question4Feedback = (TextView) findViewById(R.id.question4_feedback);
        question5Feedback = (TextView) findViewById(R.id.question5_feedback);

        totalPoints = (TextView) findViewById(R.id.total_points);
        totalPoints.setTypeface(custom_font);

        // Question 1
        q1PointsText = (TextView) findViewById(R.id.question1_points);
        q1PointsText.setText(String.valueOf(q1Points));

        // Question 2
        q2AnsOne = (CheckBox) findViewById(R.id.check_answer1);
        q2AnsTwo = (CheckBox) findViewById(R.id.check_answer2);
        q2AnsThree = (CheckBox) findViewById(R.id.check_answer3);
        q2AnsFour = (CheckBox) findViewById(R.id.check_answer4);

        q2PointsText = (TextView) findViewById(R.id.question2_points);
        q2PointsText.setText(String.valueOf(q2Points));

        // Question 3
        q3EditText = (EditText) findViewById(R.id.pyramidHead_answer);
        q3PointsText = (TextView) findViewById(R.id.question3_points);
        q3PointsText.setText(String.valueOf(q3Points));
        q3EditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                // TODO Auto-generated method stub

                if ((actionId== EditorInfo.IME_ACTION_DONE )   )
                {
                    //Toast.makeText(getActivity(), "call",45).show();
                    // hide virtual keyboard
                    InputMethodManager imm = (InputMethodManager)MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(q3EditText.getWindowToken(), 0);

                    if (q3EditText.getText().toString().toLowerCase().equals("pyramid head")) {
                        q3Points = 1;
                        question3Feedback.setText(right);
                    } else {
                        q3Points = 0;
                        question3Feedback.setText(wrong);
                    }
                    q3PointsText.setText(String.valueOf(q3Points));
                    updateTotalPoints();
                    return true;
                }
                return false;
            }
        });

        // Question 4
        q4EditText = (EditText) findViewById(R.id.paleMan_answer);
        q4PointsText = (TextView) findViewById(R.id.question4_points);
        q4PointsText.setText(String.valueOf(q4Points));
        q4EditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                // TODO Auto-generated method stub

                if ((actionId== EditorInfo.IME_ACTION_DONE )   )
                {
                    //Toast.makeText(getActivity(), "call",45).show();
                    // hide virtual keyboard
                    InputMethodManager imm = (InputMethodManager)MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(q3EditText.getWindowToken(), 0);

                    if (q4EditText.getText().toString().toLowerCase().equals("pale man")) {
                        q4Points = 1;
                        question4Feedback.setText(right);
                    } else {
                        q4Points = 0;
                        question4Feedback.setText(wrong);
                    }
                    q4PointsText.setText(String.valueOf(q4Points));
                    updateTotalPoints();
                    return true;
                }
                return false;
            }
        });

        // Question 5
        q5EditText = (EditText) findViewById(R.id.theToiletGhoul_answer);
        q5PointsText = (TextView) findViewById(R.id.question5_points);
        q5PointsText.setText(String.valueOf(q5Points));
        q5EditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                // TODO Auto-generated method stub

                if ((actionId== EditorInfo.IME_ACTION_DONE )   )
                {
                    //Toast.makeText(getActivity(), "call",45).show();
                    // hide virtual keyboard
                    InputMethodManager imm = (InputMethodManager)MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(q3EditText.getWindowToken(), 0);

                    if (q5EditText.getText().toString().toLowerCase().equals("the toilet ghoul")) {
                        q5Points = 1;
                        question5Feedback.setText(right);
                    } else {
                        q5Points = 0;
                        question5Feedback.setText(wrong);
                    }
                    q5PointsText.setText(String.valueOf(q5Points));
                    updateTotalPoints();
                    return true;
                }
                return false;
            }
        });
    }

    public void answerOne(View v) {
        if (v.getId() == R.id.halloween_answer4) {
            question1Feedback.setText(right);
            q1Points = 1;
        } else {
            question1Feedback.setText(wrong);
            q1Points = 0;
        }
        q1PointsText.setText(String.valueOf(q1Points));
        updateTotalPoints();
    }

    public void answerTwo(View v) {
        int points = 0;

        if (q2AnsOne.isChecked()) {
            points += 1;
        }

        if (q2AnsTwo.isChecked()) {
            points += 1;
        }

        if (q2AnsThree.isChecked()) {
            points += 1;
        }

        if (q2AnsFour.isChecked()) {
            points += 1;
        }

        if (points == 4) {
            question2Feedback.setText(right);
        } else  {
            question2Feedback.setText(wrong);
        }

        q2Points = points;
        q2PointsText.setText(String.valueOf(q2Points));
        updateTotalPoints();
    }

    private void updateTotalPoints() {
        totalPoints.setText("Total points: " + String.valueOf(q1Points + q2Points + q3Points + q4Points + q5Points));
    }



}
