package com.example.android.nintendoquizapp;


import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    int counter = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //audio setup
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.mario);

        //radiobutton setups
        final RadioButton button_one = (RadioButton) findViewById(R.id.group_1_button_4);

        final RadioButton button_two = (RadioButton) findViewById(R.id.group_2_button_2);

        final RadioButton button_three = (RadioButton) findViewById(R.id.group_3_button_3);

        final RadioButton button_five = (RadioButton) findViewById(R.id.group_5_button_3);

        final RadioButton button_seven = (RadioButton) findViewById(R.id.group_7_button_2);

        final RadioButton button_eight = (RadioButton) findViewById(R.id.group_8_button_1);

        final RadioButton button_nine = (RadioButton) findViewById(R.id.group_9_button_2);

        final RadioButton button_ten = (RadioButton) findViewById(R.id.group_10_button_3);

        //checkbox setup
        final CheckBox box_one = (CheckBox) findViewById(R.id.check_group_4_box_1);

        final CheckBox box_two = (CheckBox) findViewById(R.id.check_group_4_box_2);

        final CheckBox box_three = (CheckBox) findViewById(R.id.check_group_4_box_3);

        final CheckBox box_four = (CheckBox) findViewById(R.id.check_group_4_box_4);

        //editText setup
        final EditText text = (EditText) findViewById(R.id.group_6_edit_text_1);

        //set listener
        Button zero = (Button) findViewById(R.id.score);
        zero.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //radiobutton checks
                boolean button_one_is_checked = button_one.isChecked();
                if(button_one_is_checked) {counter += 1;}

                boolean button_two_is_checked = button_two.isChecked();
                if(button_two_is_checked) {counter += 1;}

                boolean button_three_is_checked = button_three.isChecked();
                if(button_three_is_checked) {counter += 1;}

                boolean button_five_is_checked = button_five.isChecked();
                if(button_five_is_checked) {counter += 1;}

                boolean button_seven_is_checked = button_seven.isChecked();
                if(button_seven_is_checked) {counter += 1;}

                boolean button_eight_is_checked = button_eight.isChecked();
                if(button_eight_is_checked) {counter += 1;}

                boolean button_nine_is_checked = button_nine.isChecked();
                if(button_nine_is_checked) {counter += 1;}

                boolean button_ten_is_checked = button_ten.isChecked();
                if(button_ten_is_checked) {counter += 1;}

                //checkbox checks
                boolean box_one_is_checked = box_one.isChecked();
                boolean box_two_is_checked = box_two.isChecked();
                boolean box_four_is_checked = box_four.isChecked();

                if(box_one_is_checked || box_two_is_checked || box_four_is_checked)
                {counter += 1;}

                //editText check
                String name = text.getText().toString();

                if(name.equals("sega")) {counter += 1;}

                //play audio
                mp.start();

                //display amount correct in a toast
                Context context = getApplicationContext();
                CharSequence text = "Congratulations! You have " + counter +
                        " correct";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

    }

}
