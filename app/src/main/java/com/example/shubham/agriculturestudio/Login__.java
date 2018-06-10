package com.example.shubham.agriculturestudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class Login__ extends AppCompatActivity {
    private EditText Mobileno;
    private EditText Passwd;
    private TextView Info;
    private Button login;
    private TextView forpass;
    private TextView CrAcc;
    private int count=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__);

        Mobileno=(EditText)findViewById(R.id.editText5);
        Passwd=(EditText)findViewById(R.id.editText6);
        Info=(TextView)findViewById(R.id.textView2);
        login=(Button)findViewById(R.id.button2);
        forpass=(TextView)findViewById(R.id.textView5);
        CrAcc=(TextView)findViewById(R.id.textView6);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Mobileno.getText().toString(),Passwd.getText().toString());

            }
        });
        CrAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login__.this,Sinup__.class);
                startActivity(intent);
            }
        });
    }
    private void validate(String mobileno, String passwd){
        if(mobileno.equals("5345341234") && passwd.equals("abc")){
            Intent intent=new Intent(Login__.this,MainActivity.class);
            startActivity(intent);
        }
        else if (mobileno.equals("1234567890") && passwd.equals("qwerty")){
            Intent intent=new Intent(Login__.this,MainActivity.class);
            startActivity(intent);
        }
        else if(mobileno.equals("2345678901") && passwd.equals("qaz")){
            Intent intent=new Intent(Login__.this,MainActivity.class);
        }
        else{
            count--;
            Info.setText("No. of Attempts Left: "+String.valueOf(count));
            if(count==0){
                login.setEnabled(false);
            }
        }
    }
}
