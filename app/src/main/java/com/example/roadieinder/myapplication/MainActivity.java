package com.example.roadieinder.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void toast(String msg){
        Toast t = Toast.makeText(this,msg,Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                final EditText e = (EditText)findViewById(R.id.name);
                final EditText e1 = (EditText)findViewById(R.id.user);
                final EditText e2 = (EditText)findViewById(R.id.email);
                final EditText e3 = (EditText)findViewById(R.id.pass);
                final EditText e4 = (EditText)findViewById(R.id.confirm);
                final Button b = (Button)findViewById(R.id.save);
                final String s = e.getText().toString();
                     String s1 = e1.getText().toString();
                 String s2 = e2.getText().toString();
                final String s3 = e3.getText().toString();
                final String s4 = e4.getText().toString();





              e1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                  @Override
                  public void onFocusChange(View view, boolean b) {
                      if(s.contains(" ")){
                          e.setError("Enter Full Name");
                      }
                  }
              });
               e2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                   @Override
                   public void onFocusChange(View view, boolean b) {
                       if(e.getText().length()==0){
                           e1.setError("Enter UserName Then Proceed");
                       }
                       if ( e.getText().length()==0 && e1.getText().length()==0){
                           e.setError(" Enter FullName Then Proceed");
                           e1.setError(" Enter UserName Then Proceed");

                       }                   }
               });
               e3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                   @Override
                   public void onFocusChange(View view, boolean b) {
                       if ((e2.getText().length()==0  )){
                           e2.setError("Enter EmailId Then Proceed");
                       }
                       if (e.getText().length()==0 &&   e1.getText().length()==0 && e2.getText().length()==0 )
                       {
                           e.setError("Enter Full Name Then Proceed ");
                           e1.setError("Enter UserName Then Proceed ");
                           e2.setError("Enter EmailId Then Proceed ");
                       }
                   }
               });

        e4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((e3.getText().length()==0) ){
                    e3.setError("Enter PassWord Then Proceed");
                }
                if (e.getText().length()==0 &&   e1.getText().length()==0 && e2.getText().length()==0 && e3.getText().length()==0 )
                {
                    e.setError("Enter Full Name Then Proceed ");
                    e1.setError("Enter UserName Then Proceed ");
                    e2.setError("Enter EmailId Then Proceed ");
                    e3.setError("Enter PassWord Then Proceed ");
                }
            }
        });




               b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (e4.getText().length()==0){
                            e4.setError("Enter PassWord to confirm Then Proceed");
                        }
                        if (e.getText().length()==0 &&   e1.getText().length()==0 && e2.getText().length()==0 && e3.getText().length()==0 && e4.getText().length()==0)
                        {
                            e.setError("Enter Full Name Then Proceed ");
                            e1.setError("Enter UserName Then Proceed ");
                            e2.setError("Enter EmailId Then Proceed ");
                            e3.setError("Enter PassWord Then Proceed ");
                            e4.setError("Eter PassWord to confirm Then Proceed");

                        }
                        {
                        if(s3.equals(s4)){
                            toast("Account Created");
                           /* Intent i = new Intent(MainActivity.this,Main2Activity.class);
                            i.putExtra("Username",s1);
                            i.putExtra("password",s2);
                            startActivityForResult(i,1);*/}

                        else
                            toast("Unable to Create Account");
                        }
                    }

                });

            }

    }

