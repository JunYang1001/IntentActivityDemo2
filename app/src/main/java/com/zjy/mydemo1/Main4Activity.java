package com.zjy.mydemo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        //接受mainactivity传来的数据
//        Intent intent=getIntent();
//        String data=intent.getStringExtra("data_type");
//        Log.d("Main4Activity",data);

        Button button=(Button)findViewById(R.id.buttonq);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("data_re","ww zjy");
                setResult(RESULT_OK,intent);
                finish();
            }
        });


    }
}
