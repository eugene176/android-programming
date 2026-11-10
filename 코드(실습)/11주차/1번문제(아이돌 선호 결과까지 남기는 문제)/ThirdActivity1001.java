package com.example.chapter10;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity1001 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.third1001_main);


        Button btnSelect = (Button) findViewById(R.id.btnSelect);
        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast select = Toast.makeText(getApplicationContext(),"버튼 눌렸습니다",Toast.LENGTH_SHORT);
                select.show();

            }
        });

    }
}
