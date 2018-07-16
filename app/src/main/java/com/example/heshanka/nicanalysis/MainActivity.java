package com.example.heshanka.nicanalysis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    EditText et;
    TextView tv,tv2,tv3;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.editText);
        tv = (TextView) findViewById(R.id.textView2);
        tv2 = (TextView) findViewById(R.id.textView3);
        tv3 = (TextView) findViewById(R.id.textView4);
        b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                if(et.getText().toString().equals("") || et.getText().toString().startsWith("0")|| et.getText().toString().length()<9 || et.getText().toString().length()>9){
                    tv.setText("The information you entered is wrong!");
                }
                else {
                    int nic = Integer.parseInt(et.getText().toString());
                    //int nic2 = Integer.parseInt(et.getText().toString().substring(2, 5));
                    int year = nic / 10000000;


                   // String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
                    int curr_age= 2016-1900-year;
                    tv3.setText("(So your current age is, "+curr_age + ")");

                    int g = (nic%10000000) / 10000;
                    if(g>=500){
                        tv2.setText("You are a female");
                        if ((year % 4 == 0 && year %100 != 0) || year %400 == 0) {

                            int jan = 31;
                            int feb = 28 + jan;
                            int mar = 31 + feb;
                            int april = 30 + mar;
                            int may = 31 + april;
                            int june = 30 + may;
                            int july = 31 + june;
                            int aug = 31 + july;
                            int sep = 30 + aug;
                            int oct = 31 + sep;
                            int nov = 30 + oct;
                            int dec = 31 + nov;

                            int t = g-500;
                            if (t <= jan) {
                                String month = "JANUARY";
                                int date = t;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (feb)) {
                                String month = "FEBRUARY";
                                int date = t-jan;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (mar)) {
                                String month = "MARCH";
                                int date = t-feb;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (april)) {
                                String month = "APRIL";
                                int date = t-mar;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= may) {
                                String month = "MAY";
                                int date = t-april;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (june)) {
                                String month = "JUNE";
                                int date = t-may;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (july)) {
                                String month = "JULY";
                                int date = t-june;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (aug)) {
                                String month = "AUGUST";
                                int date = t-july;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (sep)) {
                                String month = "SEPTEMBER";
                                int date = t-aug;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (oct)) {
                                String month = "OCTOBER";
                                int date = t-sep;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (nov)) {
                                String month = "NOVEMBER";
                                int date = t-oct;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else {
                                String month = "DECEMBER";
                                int date = t-nov;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            }

                        }

                        else{
                            int jan = 31;
                            int feb = 29 + jan;
                            int mar = 31 + feb;
                            int april = 30 + mar;
                            int may = 31 + april;
                            int june = 30 + may;
                            int july = 31 + june;
                            int aug = 31 + july;
                            int sep = 30 + aug;
                            int oct = 31 + sep;
                            int nov = 30 + oct;
                            int dec = 31 + nov;

                            int t = g-500;

                            if (t <= jan) {
                                String month = "JANUARY";
                                int date = t;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (feb)) {
                                String month = "FEBRUARY";
                                int date = t-jan;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (mar)) {
                                String month = "MARCH";
                                int date = t-feb;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (april)) {
                                String month = "APRIL";
                                int date = t-mar;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= may) {
                                String month = "MAY";
                                int date = t-april;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (june)) {
                                String month = "JUNE";
                                int date = t-may;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (july)) {
                                String month = "JULY";
                                int date = t-june;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (aug)) {
                                String month = "AUGUST";
                                int date = t-july;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (sep)) {
                                String month = "SEPTEMBER";
                                int date = t-aug;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (oct)) {
                                String month = "OCTOBER";
                                int date = t-sep;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (t <= (nov)) {
                                String month = "NOVEMBER";
                                int date = t-oct;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else {
                                String month = "DECEMBER";
                                int date = t-nov;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            }
                        }
                    }
                    else{
                        tv2.setText("You are a male");

                        if ((year % 4 == 0 && year %100 != 0) || year %400 == 0) {

                            int jan = 31;
                            int feb = 28 + jan;
                            int mar = 31 + feb;
                            int april = 30 + mar;
                            int may = 31 + april;
                            int june = 30 + may;
                            int july = 31 + june;
                            int aug = 31 + july;
                            int sep = 30 + aug;
                            int oct = 31 + sep;
                            int nov = 30 + oct;
                            int dec = 31 + nov;

                            if (g <= jan) {
                                String month = "JANUARY";
                                int date = g;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (feb)) {
                                String month = "FEBRUARY";
                                int date = g-jan;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (mar)) {
                                String month = "MARCH";
                                int date = g-feb;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (april)) {
                                String month = "APRIL";
                                int date = g-mar;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= may) {
                                String month = "MAY";
                                int date = g-april;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (june)) {
                                String month = "JUNE";
                                int date = g-may;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (july)) {
                                String month = "JULY";
                                int date = g-june;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (aug)) {
                                String month = "AUGUST";
                                int date = g-july;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (sep)) {
                                String month = "SEPTEMBER";
                                int date = g-aug;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (oct)) {
                                String month = "OCTOBER";
                                int date = g-sep;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (nov)) {
                                String month = "NOVEMBER";
                                int date = g-oct;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else {
                                String month = "DECEMBER";
                                int date = g-nov;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            }

                        }

                        else{
                            int jan = 31;
                            int feb = 29 + jan;
                            int mar = 31 + feb;
                            int april = 30 + mar;
                            int may = 31 + april;
                            int june = 30 + may;
                            int july = 31 + june;
                            int aug = 31 + july;
                            int sep = 30 + aug;
                            int oct = 31 + sep;
                            int nov = 30 + oct;
                            int dec = 31 + nov;

                            if (g <= jan) {
                                String month = "JANUARY";
                                int date = g;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (feb)) {
                                String month = "FEBRUARY";
                                int date = g-jan;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (mar)) {
                                String month = "MARCH";
                                int date = g-feb;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (april)) {
                                String month = "APRIL";
                                int date = g-mar;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= may) {
                                String month = "MAY";
                                int date = g-april;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (june)) {
                                String month = "JUNE";
                                int date = g-may;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (july)) {
                                String month = "JULY";
                                int date = g-june;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (aug)) {
                                String month = "AUGUST";
                                int date = g-july;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (sep)) {
                                String month = "SEPTEMBER";
                                int date = g-aug;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (oct)) {
                                String month = "OCTOBER";
                                int date = g-sep;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else if (g <= (nov)) {
                                String month = "NOVEMBER";
                                int date = g-oct;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            } else {
                                String month = "DECEMBER";
                                int date = g-nov;
                                tv.setText("You were born on 19"+year + " " + month+" "+ date+"th");
                            }
                        }
                    }

            }
        }


            });

    }
}

