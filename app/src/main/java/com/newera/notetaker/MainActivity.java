package com.newera.notetaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText uname,pass;
    private Button btnlogin;
    private String username="Twice",password="12345";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findv();
        setLis();
    }
    private void findv(){
        uname=findViewById(R.id.un);
        pass=findViewById(R.id.p);
        btnlogin=findViewById(R.id.btnl);
    }
    private void setLis(){
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputun=uname.getText().toString();
                String inputp=pass.getText().toString();

                if(inputun.equals(username) && inputp.equals(password)){
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(i);
                    finish();

                }else{
                    Toast.makeText(MainActivity.this, "Login Fail", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
