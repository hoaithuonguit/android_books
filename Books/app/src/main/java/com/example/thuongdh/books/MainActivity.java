package com.example.thuongdh.books;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        {
            Thread start = new Thread(){
                public void run()
                {
                    try {
                        sleep(2000);
                    } catch (Exception ex){

                    }
                    finally {
                        Intent change = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(change);
                    }
                }
            };
            start.start();
        }
    }
}
