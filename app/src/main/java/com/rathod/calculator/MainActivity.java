package com.rathod.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double n1 = 0, n2 = 0;
    TextView edittext;

    TextView btn_1;
    TextView btn_2;
    TextView btn_3;
    TextView btn_4;
    TextView btn_5;
    TextView btn_6;
    TextView btn_7;
    TextView btn_8;
    TextView btn_9;
    TextView btn_0;
    TextView btn_add;
    TextView btn_sub;
    TextView btn_multi;
    TextView btn_divide;
    TextView btn_modulus;
    TextView btn_equal;
    TextView btn_del;
    TextView btn_dot;
    TextView btn_ac;
    boolean Add, Sub, Multiply, Divide, Remainder, deci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_1 = findViewById(R.id.one_btn);
        btn_2 = findViewById(R.id.two_btn);
        btn_3 = findViewById(R.id.three_btn);
        btn_4 = findViewById(R.id.four_btn);
        btn_5 = findViewById(R.id.five_btn);
        btn_6 = findViewById(R.id.six_btn);
        btn_7 = findViewById(R.id.seven_btn);
        btn_8 = findViewById(R.id.eight_btn);
        btn_9 = findViewById(R.id.nine_btn);
        btn_0 = findViewById(R.id.zero_btn);
        btn_add = findViewById(R.id.add_btn);
        btn_sub = findViewById(R.id.sub_btn);
        btn_multi = findViewById(R.id.multiply_btn);
        btn_divide = findViewById(R.id.divide_btn);
        btn_modulus = findViewById(R.id.mod);
        btn_equal = findViewById(R.id.equalto_btn);
        btn_del = findViewById(R.id.clear_all);
        btn_dot = findViewById(R.id.dot_btn);
        btn_ac = findViewById(R.id.clear_one);
        edittext = (TextView) findViewById(R.id.display);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "7");
            }
        });


        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "9");
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "0");
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edittext.getText().length() != 0) {
                    n1 = Float.parseFloat(edittext.getText() + "");
                    Add = true;
                    deci = false;
                    edittext.setText(null);
                }
            }
        });


        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edittext.getText().length() != 0) {
                    n1 = Float.parseFloat(edittext.getText() + "");
                    Sub = true;
                    deci = false;
                    edittext.setText(null);
                }
            }
        });

        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edittext.getText().length() != 0) {
                    n1 = Float.parseFloat(edittext.getText() + "");
                    Multiply = true;
                    deci = false;
                    edittext.setText(null);
                }
            }
        });


        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edittext.getText().length() != 0) {
                    n1 = Float.parseFloat(edittext.getText() + "");
                    Divide = true;
                    deci = false;
                    edittext.setText(null);
                }
            }
        });

        btn_modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edittext.getText().length() != 0) {
                    n1 = Float.parseFloat(edittext.getText() + "");
                    Remainder = true;
                    deci = false;
                    edittext.setText(null);
                }
            }
        });


        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Add || Sub || Multiply || Divide || Remainder) {
                    n2 = Float.parseFloat(edittext.getText() + "");
                }

                if (Add) {

                    edittext.setText(n1 + n2 + "");
                    Add = false;
                }

                if (Sub) {

                    edittext.setText(n1 - n2 + "");
                    Sub = false;
                }

                if (Multiply) {
                    edittext.setText(n1 * n2 + "");
                    Multiply = false;
                }

                if (Divide) {
                    edittext.setText(n1 / n2 + "");
                    Divide = false;
                }
                if (Remainder) {
                    edittext.setText(n1 % n2 + "");
                    Remainder = false;
                }
            }
        });
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText("");
                n1 = 0;
                n2 = 0;
            }
        });
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText("");
                n1 = 0;
                n2 = 0;
            }
        });


        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (deci) {
                } else {
                    edittext.setText(edittext.getText() + ".");
                    deci = true;
                }

            }

        });

    }
}

