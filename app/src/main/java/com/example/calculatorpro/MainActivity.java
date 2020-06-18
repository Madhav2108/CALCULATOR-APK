package com.example.calculatorpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
Button zero ,one ,two ,three ,four ,five ,six,seven,eight,nine,plus ,minus,mul,div,clear,dot,equal;
boolean addition=false,
    subtraction=false,
    division=false,
    multiplication=false;

double first,second,temp;

    TextView tv,tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DecimalFormat form = new DecimalFormat("0.00");


        tv1= findViewById(R.id.tv1);
        tv= findViewById(R.id.tv);
        zero =findViewById(R.id.zero);
        one =findViewById(R.id.one);
        two =findViewById(R.id.two);
        three =findViewById(R.id.three);
        four =findViewById(R.id.four);
        five =findViewById(R.id.five);
        six =findViewById(R.id.six);
        seven =findViewById(R.id.seven);
        eight =findViewById(R.id.eight);
        nine =findViewById(R.id.nine);
        plus =findViewById(R.id.plus);
        minus =findViewById(R.id.minus);
        mul =findViewById(R.id.mul);
        div =findViewById(R.id.div);
        clear =findViewById(R.id.clear);
        dot =findViewById(R.id.dot);
        equal =findViewById(R.id.equal);

tv.setMovementMethod(new ScrollingMovementMethod());

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textw=""+tv.getText();
                if(textw.length()<13) {
                    tv.append("0");
                }
                temp=Double.valueOf(""+tv.getText());
                tv1.setText("");
                tv1.append("=" + temp);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textw=""+tv.getText();
                if(textw.length()<13)
            tv.append("1");
                temp=Double.valueOf(""+tv.getText());
                tv1.setText("");
                tv1.append("="+temp);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String textw=""+tv.getText();
                if(textw.length()<13)
                tv.append("2");
                temp=Double.valueOf(""+tv.getText());
                tv1.setText("");
                tv1.append("=" + temp);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String textw=""+tv.getText();
                if(textw.length()<13)
                tv.append("3");
                temp=Double.valueOf(""+tv.getText());
                tv1.setText("");
                tv1.append("=" + temp);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String textw=""+tv.getText();
                if(textw.length()<13)
                tv.append("4");
                temp=Double.valueOf(""+tv.getText());
                tv1.setText("");
                tv1.append("=" + temp);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String textw=""+tv.getText();
                if(textw.length()<13)
                tv.append("5");
                temp=Double.valueOf(""+tv.getText());
                tv1.setText("");
                tv1.append("=" + temp);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String textw=""+tv.getText();
                if(textw.length()<13)
                tv.append("6");
                temp=Double.valueOf(""+tv.getText());
                tv1.setText("");
                tv1.append("=" + temp);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String textw=""+tv.getText();
                if(textw.length()<13)
                tv.append("7");
                temp=Double.valueOf(""+tv.getText());
                tv1.setText("");
                tv1.append("=" + temp);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String textw=""+tv.getText();
                if(textw.length()<13)
                tv.append("8");
                temp=Double.valueOf(""+tv.getText());
                tv1.setText("");
                tv1.append("=" + temp);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String textw=""+tv.getText();
                if(textw.length()<13)
                tv.append("9");
                temp=Double.valueOf(""+tv.getText());
                tv1.setText("");
                tv1.append("=" + temp);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first=Double.valueOf(""+tv.getText());
                addition=true;
                tv.setText("");

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("\n-\n");

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("×");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("/");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append(".");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    second = Double.valueOf("" + tv.getText());


                    if (addition) {
                        tv.setText("" + (first + second));
                    }
                    //reset the flag
                    addition = false;
                    subtraction = false;
                    division = false;
                    multiplication = false;
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "Error",Toast.LENGTH_LONG).show();

                }

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textw=""+tv.getText();

                try {
                    tv.setText(textw.substring(0, textw.length() - 1));
                    temp=Double.valueOf(""+tv.getText());
                    tv1.setText("");
                    tv1.append("=" + temp);

                }
                catch(Exception e){
                    Toast.makeText(MainActivity.this, "We have nothing to clear",Toast.LENGTH_LONG).show();
                    tv1.setText("0");
                    tv1.setText("=0");
                }

            }
        });
        clear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tv.setText("");
                return false;
            }
        });
    }

}
