package com.newera.notetaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button btnadd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d("HomeActivity","onCreate called!");
        findViews();
        setListeners();
    }
    private void findViews(){
        btnadd=findViewById(R.id.btnadd);
    }
    private void setListeners(){
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this, AddNoteActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("HomeActivity","onStart called!");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("HomeActivity","onResume called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("HomeActivity","onPause called!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("HomeActivity","onStop called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("HomeActivity","onDestroy called!");
    }
}
