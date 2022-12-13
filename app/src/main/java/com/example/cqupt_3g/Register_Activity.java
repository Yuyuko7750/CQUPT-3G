package com.example.cqupt_3g;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button finish=(Button) findViewById(R.id.registered);
        EditText account=(EditText) findViewById(R.id.account);
        EditText password=(EditText) findViewById(R.id.account);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=getSharedPreferences("register",MODE_PRIVATE).edit();
                editor.putString("account", account.getText().toString());
                editor.putString("password", account.getText().toString());
                editor.apply();
                Toast.makeText(Register_Activity.this,"注册成功，已自动登录",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(Register_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}