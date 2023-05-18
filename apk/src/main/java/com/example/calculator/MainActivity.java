package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView resultTv,solutionTv;
    MaterialButton buttonC,buttonBrackOpen,buttonBrackClose;
    MaterialButton buttonDivide,buttonMultiply,buttonPlus,buttonminus,buttonequal;
    MaterialButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    MaterialButton buttonAC,buttondot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTv =findViewById(R.id.result_tv);
        solutionTv =findViewById(R.id.solution_tv);

        assign(buttonC,R.id.button_c);
        assign(buttonBrackOpen,R.id.button_open_bracket);
        assign(buttonBrackClose,R.id.button_close_bracket);
        assign(buttonDivide,R.id.button_divide);
        assign(buttonMultiply,R.id.button_multiply);
        assign(buttonPlus,R.id.button_plus);
        assign(buttonminus,R.id.button_minus);
        assign(buttonequal,R.id.button_equal);
        assign(button0,R.id.button_0);
        assign(button1,R.id.button_1);
        assign(button2,R.id.button_2);
        assign(button3,R.id.button_3);
        assign(button4,R.id.button_4);
        assign(button5,R.id.button_5);
        assign(button6,R.id.button_6);
        assign(button7,R.id.button_7);
        assign(button8,R.id.button_8);
        assign(button9,R.id.button_9);
        assign(buttonAC,R.id.button_AC);
        assign(buttondot,R.id.button_dot);

    }



    void assign(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}