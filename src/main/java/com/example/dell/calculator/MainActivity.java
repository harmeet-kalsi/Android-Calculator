package com.example.dell.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,buttonC,buttonadd,buttonsub,buttonmul,buttondiv,buttonequals;
    EditText edt1;
    float mValueone, mValuetwo;
    boolean mAddition, mSubtraction, mDivision, mMultiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button0 = (Button) findViewById(R.id.button0);
         button1 = (Button) findViewById(R.id.button1);
         button2 = (Button) findViewById(R.id.button2);
         button3 = (Button) findViewById(R.id.button3);
         button4 = (Button) findViewById(R.id.button4);
         button5 = (Button) findViewById(R.id.button5);
         button6 = (Button) findViewById(R.id.button6);
         button7 = (Button) findViewById(R.id.button7);
         button8 = (Button) findViewById(R.id.button8);
         button9 = (Button) findViewById(R.id.button9);
         button10 = (Button) findViewById(R.id.button10);
         buttonC = (Button) findViewById(R.id.button12);
         buttonadd = (Button) findViewById(R.id.button13);
         buttonsub = (Button) findViewById(R.id.button14);
         buttonmul = (Button) findViewById(R.id.button15);
         buttondiv = (Button) findViewById(R.id.button16);
         buttonequals = (Button) findViewById(R.id.button17);
         edt1 = (EditText) findViewById(R.id.EditText);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"0");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+".");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 == null) {
                    edt1.setText(edt1.getText() + "");
                } else {
                    mValueone = Float.parseFloat(edt1.getText() + "");
                    mAddition = true;
                    edt1.setText(null);
                }
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 == null) {
                    edt1.setText(edt1.getText() + "");
                } else {
                    mValueone = Float.parseFloat(edt1.getText() + "");
                    mSubtraction = true;
                    edt1.setText(null);
                }
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 == null) {
                    edt1.setText(edt1.getText() + "");
                } else {
                    mValueone = Float.parseFloat(edt1.getText() + "");
                    mMultiplication = true;
                    edt1.setText(null);
                }
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 == null) {
                    edt1.setText(edt1.getText() + "");
                } else {
                    mValueone = Float.parseFloat(edt1.getText() + "");
                    mDivision = true;
                    edt1.setText(null);
                }
            }

        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });
        buttonequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValuetwo = Float.parseFloat(edt1.getText()+"");
                if (mAddition == true)
                {
                    edt1.setText(mValueone + mValuetwo + "");
                    mAddition = false;
                }
                if (mSubtraction == true)
                {
                    edt1.setText(mValueone - mValuetwo + "");
                    mSubtraction = false;
                }
                if (mMultiplication == true)
                {
                    edt1.setText(mValueone * mValuetwo + "");
                    mMultiplication = false;
                }
                if (mDivision == true)
                {
                    edt1.setText(mValueone / mValuetwo + "");
                    mDivision = false;
                }
            }

        });
}
}