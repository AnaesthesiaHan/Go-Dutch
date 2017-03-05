package com.example.administrator.godutch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //String amount;
    EditText totalAmount,perNbr;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalAmount=(EditText) findViewById( R.id.etAmount);
        perNbr=(EditText) findViewById(R.id.etNbr);
        display=(TextView) findViewById(R.id.tv_AmountPerPerson);

    }
    public  void  btuCompute(View v){
        Double total = Double.parseDouble(totalAmount.getText().toString());
        Double persons=Double.parseDouble(perNbr.getText().toString());
        Double share=total/persons;
        share=Double.valueOf(Math.round(share*100));
        share=share/100;

        Toast.makeText(getBaseContext(),"The amount to share is:"+share,Toast.LENGTH_SHORT).show();
    }

}
