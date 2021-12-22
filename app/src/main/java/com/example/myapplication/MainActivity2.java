package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {

    EditText username, password;
    Button signin;
    DataBase DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        username = findViewById(R.id.username1);
        password = findViewById(R.id.password1);
        signin = findViewById(R.id.signin1);
        DB = new DataBase(this);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user=username.getText().toString();
                String pass=password.getText().toString();

                if (TextUtils.isEmpty(user) ||  TextUtils.isEmpty(pass))
                    Toast.makeText(MainActivity2.this,"All fields Required", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass=DB.checkusernamepassword(user,pass);
                    if (checkuserpass==true){
                        Toast.makeText(MainActivity2.this,"Login Successful",Toast.LENGTH_SHORT).show();
                        Intent intent =new Intent(getApplicationContext(),MainActivity3.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(MainActivity2.this,"Login Failed",Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}
