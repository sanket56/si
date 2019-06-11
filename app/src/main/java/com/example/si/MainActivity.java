package com.example.si;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText ed1,ed2,ed3;
    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      button=findViewById(R.id.button);
      ed1=findViewById(R.id.ed1);
      ed2=findViewById(R.id.ed2);
      ed3=findViewById(R.id.ed3);
      textview=findViewById(R.id.ed4);
    }
    public  void  calculate(View view) {

      String s=ed1.getText().toString().trim();
      int p=Integer.parseInt(s);

       s=ed2.getText().toString().trim();
        int t=Integer.parseInt(s);

         s=ed3.getText().toString().trim();
        int r=Integer.parseInt(s);

      int ans=(p*t*r)/100;


      textview.setText(String.valueOf(ans));






    }










}






