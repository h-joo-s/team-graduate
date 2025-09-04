package com.example.day0319project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.FieldClassification;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button plus, cancel,mul;
    EditText num1, num2;
    TextView result;
    Integer res;  //수정하기
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = findViewById(R.id.plus);
        mul = findViewById(R.id.mul);
        cancel = findViewById(R.id.cancel);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);

        num1.setText(""+(int)((Math.random()*100)+1));
        num2.setText(""+(int)((Math.random()*100)+1));
        plus.setOnClickListener(this);
        mul.setOnClickListener(this);
        cancel.setOnClickListener(this);
//        plus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                res=Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString());
//                result.setText("합="+res.toString());
//            }
//        });
//        cancel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                num1.setText(""); //"": 공백
//                num2.setText("");
//                result.setText("");
//            }
//        });
    }

    @Override
    public void onClick(View view) {
        if (view == plus) {
            res=Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString());
            result.setText("합="+res.toString());
        }else if (view == mul){
            res=Integer.parseInt(num1.getText().toString())*Integer.parseInt(num2.getText().toString());
            result.setText("곱="+res.toString());
        }else if (view == cancel){
            num1.setText(""); //"": 공백
            num2.setText("");
            result.setText("");
            int a = (int) ((Math.random()*10)+1);
        }
    }
}
