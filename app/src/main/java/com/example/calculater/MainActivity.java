package com.example.calculater;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText crunchifyEditText;

    float mValueOne, mValueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;
    ArrayList<String> his= new ArrayList<String>(10);
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
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        crunchifyEditText = (EditText) findViewById(R.id.edt1);
        buttonAdd.setEnabled(false);
        buttonSub.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonDivision.setEnabled(false);
        button10.setEnabled(false);
        buttonEqual.setEnabled(false);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "1");
                buttonAdd.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
                buttonDivision.setEnabled(true);
                button10.setEnabled(true);
                buttonEqual.setEnabled(true);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "2");
                buttonAdd.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
                buttonDivision.setEnabled(true);
                button10.setEnabled(true);
                buttonEqual.setEnabled(true);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "3");
                buttonAdd.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
                buttonDivision.setEnabled(true);
                button10.setEnabled(true);
                buttonEqual.setEnabled(true);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "4");
                buttonAdd.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
                buttonDivision.setEnabled(true);
                button10.setEnabled(true);
                buttonEqual.setEnabled(true);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "5");
                buttonAdd.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
                buttonDivision.setEnabled(true);
                button10.setEnabled(true);
                buttonEqual.setEnabled(true);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "6");
                buttonAdd.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
                buttonDivision.setEnabled(true);
                button10.setEnabled(true);
                buttonEqual.setEnabled(true);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "7");
                buttonAdd.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
                buttonDivision.setEnabled(true);
                button10.setEnabled(true);
                buttonEqual.setEnabled(true);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "8");
                buttonAdd.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
                buttonDivision.setEnabled(true);
                button10.setEnabled(true);
                buttonEqual.setEnabled(true);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "9");
                buttonAdd.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
                buttonDivision.setEnabled(true);
                button10.setEnabled(true);
                buttonEqual.setEnabled(true);
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "0");
                buttonAdd.setEnabled(true);
                buttonSub.setEnabled(true);
                buttonMul.setEnabled(true);
                buttonDivision.setEnabled(true);
                button10.setEnabled(true);
                buttonEqual.setEnabled(true);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    crunchifyDivision = false;
                    mSubtract = false;
                    crunchifyMultiplication = false;
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyAddition = true;
                    crunchifyEditText.setText(null);
                    his.add(crunchifyEditText.getText().toString());
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyDivision = false;
                crunchifyMultiplication = false;
                crunchifyAddition = false;
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                mSubtract = true;
                crunchifyEditText.setText(null);
                his.add(crunchifyEditText.getText().toString());
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyDivision = false;
                mSubtract = false;
                crunchifyAddition = false;
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyMultiplication = true;
                crunchifyEditText.setText(null);
                his.add(crunchifyEditText.getText().toString());
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyMultiplication = false;
                mSubtract = false;
                crunchifyAddition = false;
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyDivision = true;
                crunchifyEditText.setText(null);
                his.add(crunchifyEditText.getText().toString());
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

                if (crunchifyAddition == true) {
                    crunchifyDivision = false;
                    mSubtract = false;
                    crunchifyMultiplication = false;
                    crunchifyEditText.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
            }

                if (mSubtract == true) {
                    crunchifyDivision = false;
                    crunchifyMultiplication = false;
                    crunchifyAddition = false;
                    crunchifyEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {

                    crunchifyDivision = false;
                    mSubtract = false;
                    crunchifyAddition = false;
                    crunchifyEditText.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    crunchifyMultiplication = false;
                    mSubtract = false;
                    crunchifyAddition = false;
                    crunchifyEditText.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
                his.add(crunchifyEditText.getText().toString());
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonAdd.setEnabled(false);
                buttonSub.setEnabled(false);
                buttonMul.setEnabled(false);
                buttonDivision.setEnabled(false);
                button10.setEnabled(false);
    buttonEqual.setEnabled(false);
                crunchifyEditText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + ".");
            }
        });
    }


    public void history(View view) {

        for ( int j=0; j<his.size(); j++ )
           crunchifyEditText.setText(his.get(j)+"" );
    }



}