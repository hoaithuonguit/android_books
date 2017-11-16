package com.example.thuongdh.books;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button btnBook, btnWriter, btnSetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setID();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        fragment_book fr = new fragment_book();
        transaction.replace(R.id.container, fr).commit();
        SetEvent();
    }

    private void SetEvent() {
        btnBook.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                fragment_book fr = new fragment_book();
                transaction.replace(R.id.container, fr).commit();
               // transaction.add(R.id.container, fr).commit();
            }
        });
        btnSetting.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                fragment_setting fr = new fragment_setting();
                transaction.replace(R.id.container, fr).commit();
               // transaction.add(R.id.container, fr).commit();
            }
        });
        btnWriter.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                fragment_writer fr = new fragment_writer();
                transaction.replace(R.id.container, fr).commit();
                // transaction.add(R.id.container, fr).commit();
            }
        });
    }

    private void setID() {
        btnBook = findViewById(R.id.btnSach);
        btnWriter = findViewById(R.id.btnTacGia);
        btnSetting = findViewById(R.id.btnSetting);
    }
}
