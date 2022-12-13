package com.example.cqupt_3g;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Load_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        Button buttonLoad=(Button) findViewById(R.id.load);
        Button buttonRegister=(Button) findViewById(R.id.register);
        EditText loadAccount=(EditText) findViewById(R.id.loadAccount);
        EditText loadPassword=(EditText) findViewById(R.id.loadPassword);
        SharedPreferences register=getSharedPreferences("register",MODE_PRIVATE);



        buttonLoad.setOnClickListener(new View.OnClickListener() {
            String a= loadAccount.getText().toString();
            String b= register.getString("account","1");
            String c= loadPassword.getText().toString();
            String d= register.getString("password","0");
            @Override
            public void onClick(View v) {
                if(a.equals(b)&&c.equals(d)) {
                    Toast.makeText(Load_Activity.this, "登陆成功", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Load_Activity.this, MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(Load_Activity.this, "登陆失败", Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Load_Activity.this,Register_Activity.class);
                startActivity(intent);
            }
        });
    }
}