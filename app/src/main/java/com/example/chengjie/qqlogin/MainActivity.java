package com.example.chengjie.qqlogin;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin; //登录按钮
    private Button btnRegiter; //注册按钮
    private TextView tv1; //用户名输入框
    private EditText ev2; //密码输入框
    String userName = "CJ";//设置登录用户名
    String passWord  = "CJ815815";//设置登录密码
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button) findViewById(R.id.btn_Login);
        btnRegiter = (Button) findViewById(R.id.btn_Register);
        tv1 = (TextView) findViewById(R.id.et_1);
        ev2 = (EditText) findViewById(R.id.et_2);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName = tv1.getText().toString();
                if (userName.equals("chengjie")){
                    Toast.makeText(MainActivity.this, "用户名正确", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "用户名不正确",Toast.LENGTH_SHORT).show();
                }
            }
        });

        ev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passWord = ev2.getText().toString();
                if (passWord.equals("123456")){
                    Toast.makeText(MainActivity.this, "密码正确", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "密码错误", Toast.LENGTH_SHORT).show();

                }
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this).setTitle("登录弹框：")
                        .setMessage("是否确认登录?")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(MainActivity.this, LoginActivity.class );
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .create();
                dialog.show();
            }
        });

        btnRegiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this).setTitle("注册弹框：")
                        .setMessage("是否确认注册?")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .create();
                dialog.show();
            }
        });


    }
}
