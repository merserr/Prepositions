package com.example.prepositions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView work_stroke;
    TextView textscore1;
    TextView textscore2;
    CheckBox CheckBox;
    CheckBox CheckBox1;
    CheckBox CheckBox2;
    int score1 = 0;
    int score2 = 0;
    int num_preposition = 0;
    int num_word = 0;
    int num_button = 0;
    boolean check;
    String preposition = "Bei";
    String article = "...";
    String noun = "Mann";
    String CreateStringOutput = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        CheckBox = (CheckBox) findViewById(R.id.checkBox);
        CheckBox1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox2 = (CheckBox) findViewById(R.id.checkBox2);
        work_stroke = (TextView) findViewById(R.id.workstroke);
        textscore1 = (TextView) findViewById(R.id.score1);
        textscore2 = (TextView) findViewById(R.id.score2);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);

        work_stroke.setText(preposition + " " + article + " " + noun);
        ChangePrepositionen();
        ChangeWord();
        CreateString ();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d("LOG_TAG", "button1 click");
                num_button = 1;
                article = "der";
                CreateString ();
                CheckWord();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d("LOG_TAG", "button2 click");
                num_button = 2;
                article = "die";
                CreateString ();
                CheckWord();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d("LOG_TAG", "button3 click");
                num_button = 3;
                article = "das";
                CreateString ();
                CheckWord();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d("LOG_TAG", "button4 click");
                num_button = 4;
                article = "den";
                CreateString ();
                CheckWord();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d("LOG_TAG", "button5 click");
                num_button = 5;
                article = "dem";
                CreateString ();
                CheckWord();

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d("LOG_TAG", "button5 click");
                num_button = 6;
                article = "";
                CreateString ();
                CheckWord();

            }
        });


    }
    void CreateString() {

        if(num_preposition != 14){
            CreateStringOutput = preposition + " " + article + " " + noun;
        }else{
            CreateStringOutput = preposition + " " + article + " " + noun + " herum";
        }
        Log.d("LOG_TAG", CreateStringOutput);
        work_stroke.setText(CreateStringOutput);
    }

    void ChangePrepositionen() {

        switch (num_preposition) {

            case 0:
                preposition = "bei";
                break;
            case 1:
                preposition = "mit";
                break;
            case 2:
                preposition = "nach";
                break;
            case 3:
                preposition = "aus";
                break;
            case 4:
                preposition = "außer";
                break;
            case 5:
                preposition = "von";
                break;
            case 6:
                preposition = "zu";
                break;
            case 7:
                preposition = "seit";
                break;
            case 8:
                preposition = "ab";
                break;
            case 9:
                preposition = "bis";
                break;
            case 10:
                preposition = "gegen";
                break;
            case 11:
                preposition = "ohne";
                break;
            case 12:
                preposition = "für";
                break;
            case 13:
                preposition = "durch";
                break;
            case 14:
                preposition = "um";
                break;

        }
    }
    void ChangeWord() {

        switch (num_word){
            case 0:
                noun = "Mann";
                break;
            case 1:
                noun = "Frau";
                break;
            case 2:
                noun = "Kind";
                break;
            case 3:
                noun = "Menschen";
                break;
            case 4:
                noun = "Tag";
                break;

            case 6:
                noun = "";
                break;
            case 7:
                noun = "";
                break;
            case 8:
                noun = "";
                break;
            case 9:
                noun = "";
                break;
            case 10:
                noun = "";
                break;
            case 11:
                noun = "";
                break;
            case 12:
                noun = "";
                break;
            case 13:
                noun = "";
                break;
            case 14:
                noun = "";
                break;
            case 15:
                noun = "";
                break;

        }

    }

    void CheckWord() {
        check=false;
        if(num_preposition < 9){
            if(num_word == 0||num_word == 4){
                if(num_button == 5){
                    check=true;
                }
            }
            if(num_word == 1){
                if(num_button == 1){
                    check=true;
                }
            }
            if(num_word == 2){
                if(num_button == 5){
                    check=true;
                }
            }
            if(num_word == 3){
                if(num_button == 4){
                    check=true;
                }
            }
        }
        //==
        if(num_preposition >= 9){
            if(num_word == 0||num_word == 4){
                if(num_button == 4){
                    check=true;
                }
            }
            if(num_word == 1){
                if(num_button == 2){
                    check=true;
                }
            }
            if(num_word == 2){
                if(num_button == 3){
                    check=true;
                }
            }
            if(num_word == 3){
                if(num_button == 2){
                    check=true;
                }
            }
        }
        int vibrmillis;
        if(check){
            work_stroke.setTextColor(Color.GREEN);
            vibrmillis = 60;
            Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
            vibrator.vibrate(vibrmillis);
            score1 = score1 +1;
            textscore1.setText(String.valueOf(score1));
            Nextemal();
        }else{
            work_stroke.setTextColor(Color.RED);
            vibrmillis = 200;
            Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
            vibrator.vibrate(vibrmillis);
            score2 = score2 +1;
            textscore2.setText(String.valueOf(score2));
        }


        Log.d("LOG_TAG", preposition+" "+article+" "+noun);
        Log.d("LOG_TAG", num_preposition+" "+article+" "+num_word);
    }
    void Nextemal(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                article = "...";
                //num_word = 4;

                if((CheckBox.isChecked())&&(!CheckBox1.isChecked())) {
                    Random random = new Random();
                    num_preposition = random.nextInt(8 + 1);
                }
                if((!CheckBox.isChecked())&&(CheckBox1.isChecked())) {
                    Random random = new Random();
                    num_preposition = random.nextInt(6 + 1)+9;
                }
                if((CheckBox.isChecked())&&(CheckBox1.isChecked())) {
                    Random random = new Random();
                    num_preposition = random.nextInt(14 + 1);
                }
                if(CheckBox2.isChecked()) {
                    if(num_preposition == 7||num_preposition == 8||num_preposition == 9){
                        num_word = 4;
                    }else{
                        Random random2 = new Random();
                        num_word = random2.nextInt(3 + 1);
                    }

                }
                ChangePrepositionen();
                ChangeWord();
                CreateString ();
                work_stroke.setTextColor(Color.WHITE);
                // действие будет выполнено через 2с
            }
        }, 2000);
    }
}