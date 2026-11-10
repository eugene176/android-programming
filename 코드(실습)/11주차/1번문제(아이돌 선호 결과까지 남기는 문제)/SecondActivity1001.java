package com.example.chapter10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class SecondActivity1001 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second1001_main);


        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        Button btnSelect = (Button) findViewById(R.id.btnselect);
        TextView textSelect = (TextView) findViewById(R.id.textSelect);
        RadioButton idol1 = (RadioButton)findViewById(R.id.idol1);
        RadioButton idol2 = (RadioButton)findViewById(R.id.idol2);
        RadioButton idol3 = (RadioButton)findViewById(R.id.idol3);
        RadioButton idol4 = (RadioButton)findViewById(R.id.idol4);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                String idolname;
                if (idol1.isChecked() == true) {
                    idolname = idol1.getText().toString();
                    textSelect.setText("선택완료: "+idolname);
                }
                else if(idol2.isChecked() == true){
                    idolname = idol2.getText().toString();
                    textSelect.setText("선택완료: "+idolname);
                } else if (idol3.isChecked() == true) {
                    idolname = idol3.getText().toString();
                    textSelect.setText("선택완료: "+idolname);
                } else if (idol4.isChecked() == true) {
                    idolname = idol4.getText().toString();
                    textSelect.setText("선택완료: "+ idolname);
                }
            }

        });

    }

}
