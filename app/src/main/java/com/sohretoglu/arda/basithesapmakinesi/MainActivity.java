package com.sohretoglu.arda.basithesapmakinesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView);
    }
    public void sum (View sum)
    {
        int a = Integer.parseInt(editText.getText().toString());
        int b = Integer.parseInt(editText2.getText().toString());
        int resultInt = a+b;
        textView.setText("Sonuc :" + resultInt);

    }
    public void deduct(View deduct)
    {
        int a = Integer.parseInt(editText.getText().toString());
        int b = Integer.parseInt(editText2.getText().toString());
        int resultInt = a-b;
        textView.setText("Sonuc :" + resultInt);

    }
    public void multiply (View multiply)
    {
        int a = Integer.parseInt(editText.getText().toString());
        int b = Integer.parseInt(editText2.getText().toString());
        int resultInt = a*b;
        textView.setText("Sonuc :" + resultInt);

    }
    public void divide (View divide)
    {
        int a = Integer.parseInt(editText.getText().toString());
        int b = Integer.parseInt(editText2.getText().toString());
        int resultInt = a/b;
        textView.setText("Sonuc :" + resultInt);

    }
}
