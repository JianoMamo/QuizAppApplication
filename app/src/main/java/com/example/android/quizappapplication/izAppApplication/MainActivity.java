package com.example.android.quizappapplication.izAppApplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.android.quizappapplication.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //Variable score for the score.
    int score = 0;

    //This method is called when the submit order is called.
    public void submitScore(View view) {

        //Gets name from the name field.
        EditText nameUser =  findViewById(R.id.name_edit_text);
        String name = nameUser.getText().toString();

        //Gets text from question 1.
        EditText aOne =  findViewById(R.id.answerOne_edit_text);
        String ansOne = aOne.getText().toString().trim();

        //Gets text from question 2.
        EditText aTwo = findViewById(R.id.answerTwo_edit_text);
        String ansTwo = aTwo.getText().toString().trim();

        //Checks which radio button is checked in question 3.
        RadioButton aThreeOneRadioButton = findViewById(R.id.date1);
        boolean answerThreeOne = aThreeOneRadioButton.isChecked();
        RadioButton aThreeTwoRadioButton =  findViewById(R.id.date2);
        boolean answerThreeTwo = aThreeTwoRadioButton.isChecked();
        RadioButton aThreeThreeRadioButton = findViewById(R.id.date3);
        boolean answerThreeThree = aThreeThreeRadioButton.isChecked();


        //Checks which  radio button is checked in question 4.
        RadioButton aFourOneRadioButton = findViewById(R.id.date4);
        boolean answerFourOne =  aFourOneRadioButton.isChecked();
        RadioButton  aFourTwoRadioButton = findViewById(R.id.date5);
        boolean answerFourTwo =  aFourTwoRadioButton.isChecked();
        RadioButton  aFourThreeRadioButton = findViewById(R.id.date6);
        boolean answerFourThree =  aFourThreeRadioButton.isChecked();


        //Checks which  radio button is checked in question 5.
        RadioButton aFiveOneRadioButton =  findViewById(R.id.law1);
        boolean answerFiveOne = aFiveOneRadioButton.isChecked();
        RadioButton aFiveTwoRadioButton =  findViewById(R.id.law2);
        boolean answerFiveTwo = aFiveTwoRadioButton.isChecked();
        RadioButton aFiveThreeRadioButton =  findViewById(R.id.law3);
        boolean answerFiveThree = aFiveThreeRadioButton.isChecked();


        //Checks which of the checkboxes are checked in question 6.
        CheckBox aSixOneCheckBox =  findViewById(R.id.planet1);
        boolean answerSixOne = aSixOneCheckBox.isChecked();
        CheckBox aSixTwoCheckBox =  findViewById(R.id.planet2);
        boolean answerSixTwo = aSixTwoCheckBox.isChecked();
        CheckBox aSixThreeCheckBox =  findViewById(R.id.planet3);
        boolean answerSixThree = aSixThreeCheckBox.isChecked();


        //Checks which of the checkboxes are checked in question 7.
        CheckBox aSevenOneCheckBox = findViewById(R.id.energyOne);
        boolean answerSevenOne = aSevenOneCheckBox.isChecked();
        CheckBox aSevenTwoCheckBox = findViewById(R.id.energyTwo);
        boolean answerSevenTwo = aSevenTwoCheckBox.isChecked();
        CheckBox aSevenThreeCheckBox = findViewById(R.id.energyThree);
        boolean answerSevenThree = aSevenThreeCheckBox.isChecked();


        //Checks which of the checkboxes are checked in question 8.
        CheckBox aEightOneCheckBox = findViewById(R.id.temperatureOne);
        boolean answerEightOne = aEightOneCheckBox.isChecked();
        CheckBox aEightTwoCheckBox = findViewById(R.id.temperatureTwo);
        boolean answerEightTwo = aEightTwoCheckBox.isChecked();
        CheckBox aEightThreeCheckBox = findViewById(R.id.temperatureThree);
        boolean answerEightThree = aEightThreeCheckBox.isChecked();


        //Variable int calculates the final score by calling calculateScore method.
        int finalScore = calculateScore(name, ansOne, ansTwo,
                answerThreeOne, answerThreeTwo, answerThreeThree,
                answerFourOne, answerFourTwo, answerFourThree,
                answerFiveOne, answerFiveTwo, answerFiveThree,
                answerSixOne, answerSixTwo, answerSixThree,
                answerSevenOne, answerSevenTwo, answerSevenThree,
                answerEightOne, answerEightTwo, answerEightThree);


        //Checks if name is given.
        if (name.isEmpty()) {
            Toast.makeText(this, getString(R.string.no_name), Toast.LENGTH_SHORT).show();
        }

        //Checks if question 1 is answered.
        if (ansOne.isEmpty()) {
            Toast.makeText(this, getString(R.string.question) + " 1 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }

        //Checks if question 2 is answered.
        if (ansTwo.isEmpty()) {
            Toast.makeText(this, getString(R.string.question) + " 2 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }

        //Checks if question 3 is answered.
        if (!(answerThreeOne || answerThreeTwo || answerThreeThree)) {
            Toast.makeText(this, getString(R.string.question) + " 3 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }


        //Checks if question 4 is answered.
        if (!(answerFourOne || answerFourTwo || answerFourThree)) {
            Toast.makeText(this, getString(R.string.question) + " 4 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }

        //Checks if question 5 is answered.
        if (!(answerFiveOne || answerFiveTwo || answerFiveThree)) {
            Toast.makeText(this, getString(R.string.question) + " 5 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }


        //Checks if question 6 is answered.
        if (!(answerSixOne || answerSixTwo || answerSixThree)) {
            Toast.makeText(this, getString(R.string.question) + " 6 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }

        //Checks if question 7 is answered.
        if (!(answerSevenOne || answerSevenTwo || answerSevenThree)) {
            Toast.makeText(this, getString(R.string.question) + " 7 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }

        //Checks if question 8 is answered.
        if (!(answerEightOne || answerEightTwo || answerEightThree)) {
            Toast.makeText(this, getString(R.string.question) + " 8 " + getString(R.string.is_not_answered), Toast.LENGTH_SHORT).show();
        }



        //Displays final score in the toast view at the end of the app.
        //Shows toast if the score is less than 30.
        if (finalScore < 30) {
            Toast.makeText(this, name + " " + getString(R.string.your_score_is) + " " + score + " " + getString(R.string.toast_score_1), Toast.LENGTH_LONG).show();
        }

        //Displays final score in the toast view at the end of the app.
        //Shows toast if the score is less than 110.
        else if (finalScore < 110) {
            Toast.makeText(this, name + " " + getString(R.string.your_score_is) + " " + score + " " + getString(R.string.toast_score_2), Toast.LENGTH_LONG).show();
        }

        //Displays final score in the toast view at the end of the app.
        //Shows toast if the score is 110 (Perfect game).
        if (finalScore == 110) {
            Toast.makeText(this, name + " " + getString(R.string.your_score_is) + " " + score + " " + getString(R.string.toast_score_3), Toast.LENGTH_LONG).show();
        }


    }


    /**

     * @param ansOne       for the answer in the question 1 (EditText).
     * @param ansTwo       for the answer in the question 2 (EditText).
     * @param answerFour1  is whether the user has checked the first checkbox in question 4. (correct)
     * @param answerFour2  is whether the user has checked the second checkbox in question 4. (false)
     * @param answerFour3  is whether the user has checked the third checkbox in question 4. (correct)
     * @param answerFive1  is whether the user has checked the first checkbox in question 5. (correct)
     * @param answerFive2  is whether the user has checked the second checkbox in question 5. (correct)
     * @param answerFive3  is whether the user has checked the third checkbox in question 5. (false)
     * @param answerSix1   is whether the user has checked the first checkbox in question 6. (false)
     * @param answerSix2   is whether the user has checked the second checkbox in question 6. (false)
     * @param answerSix3   is whether the user has checked the third checkbox in question 6. (false)
     * @param answerSeven1 is whether the user has checked the first radiobutton in question 7. (false)
     * @param answerSeven2 is whether the user has checked the second radiobutton in question 7. (correct)
     * @param answerSeven3 is whether the user has checked the third radiobutton in question 7. (false)
     * @param answerEight1 is whether the user has checked the first radiobutton in question 8. (false)
     * @param answerEight2 is whether the user has checked the second radiobutton in question 8. (false)
     * @param answerEight3 is whether the user has checked the third radiobutton in question 8. (false)
     * @return returns the score.
     */


    private int calculateScore(String name,String ansOne, String ansTwo,
                               boolean answerThree1, boolean answerThree2, boolean answerThree3,
                               boolean answerFour1, boolean answerFour2, boolean answerFour3,
                               boolean answerFive1, boolean answerFive2, boolean answerFive3,
                               boolean answerSix1, boolean answerSix2, boolean answerSix3,
                               boolean answerSeven1, boolean answerSeven2, boolean answerSeven3,
                               boolean answerEight1, boolean answerEight2, boolean answerEight3
                              ) {




        //Checks whether the user has answered correctly in the question 1.
        if (ansOne.equals("Hygrometer") || ansOne.equals("hygrometer")) {
            score += 10;
        }
        //Checks whether the user has answered correctly in the question 2.
        if (ansTwo.equals("Third law") || ansTwo.equals("third law") || ansTwo.equals("third law of Newton") ||ansTwo.equals("Third law of Newton") || ansTwo.equals("Newton's third law")) {
            score += 10;
        }

        //Checks whether the user has checked the right radio button in question 3 (right radio button is 3).

        if (answerThree3) {
            score += 10 ;
        }


        //Checks whether the user has checked the right radio button in question 4 (right radio button is 3).

        if (answerFour3) {
            score += 10 ;
        }


        //Checks whether the user has checked the right radio button in question 5 (right radio button is 3).

        if (answerFive3) {
            score += 10;
        }

        //Checks whether the user has checked the right checkboxes in question 6 (right checkboxes are 1 and 2).
        if (answerSix1 ) {
            score += 10;
        }

        if (answerSix2) {
            score += 10;
        }


        //Checks whether the user has checked the right checkboxes in question 7 (right checkbox is 3).

        if (answerSeven3) {
            score += 10;
        }

        //Checks whether the user has checked the right checkboxes in question 8 (right checkboxes are 1,2 and 3).
        if (answerEight1) {
            score += 10;
        }

        if(answerEight2) {
            score += 10;
        }

        if(answerEight3) {
            score += 10;
        }


        //Returns final score.
        return score;
    }

    public void resetScore(View view) {
        score = 0;


    }


}
