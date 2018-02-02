package com.zjy.mydemo1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button btn=(Button) findViewById(R.id.button);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
//
//              intent网页
//               Intent  intent=new Intent(Intent.ACTION_VIEW);
//               intent.setData(Uri.parse("http://www.baidu.com"));
//               startActivity(intent);
         //intent 电话
//               Intent intent=new Intent(Intent.ACTION_DIAL);
//               intent.setData(Uri.parse("tel:1111"));
//               startActivity(intent);

               //intent传递数据到另一个活动
//               String data="hello zjy";
//               Intent  intent=new Intent(MainActivity.this,Main4Activity.class);
//               intent.putExtra("data_type",data);
//               startActivity(intent);


               Intent intent=new Intent(MainActivity.this,Main4Activity.class);
               startActivityForResult(intent,1);


          }
});


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){

            case 1:
                if (resultCode == RESULT_OK){
                    String redate=data.getStringExtra("data_re");
                    Log.d("Main",redate);
                }
                break;
            default:

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(MainActivity.this,"you click add",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.remove_item:
                Toast.makeText(MainActivity.this,"you  click remove ",Toast.LENGTH_SHORT).show();
                break;
                default:
        }
        return  true;
    }
}
