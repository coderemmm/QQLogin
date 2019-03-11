package com.example.chengjie.qqlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mBtn = (Button) findViewById(R.id.BT);

        mBtn.setOnClickListener(this);



    }


    @Override
    public void onClick(View v){
        
    }

}
