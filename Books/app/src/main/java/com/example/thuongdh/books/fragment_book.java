package com.example.thuongdh.books;

import com.example.thuongdh.books.adapter.book_adapter;
import com.example.thuongdh.books.model.book_model;

import java.util.ArrayList;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by thuongdh on 17/11/2017.
 */

public class fragment_book extends Fragment {
    private View myv;
    ArrayList<book_model> arrayList;
    book_adapter adapter;
    TextView textView;
    ListView listView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myv = inflater.inflate(R.layout.fr_book, container, false);
        textView = myv.findViewById(R.id.tvfrBook);
        listView = myv.findViewById(R.id.lvfrBook);
        setView();
        return myv;
    }

    private void setView() {
        arrayList = new ArrayList<book_model>();
        arrayList.add(new book_model("Những ông trùm tài chính", "Liaquat Ahamed"));
        arrayList.add(new book_model("Giã từ vũ khí", "Ernest Hemingway"));
        arrayList.add(new book_model("Quản Lý Dự Án", "Stephen Barker & Rob Cole"));
        arrayList.add(new book_model("Luật trí não", "John Medina"));
        arrayList.add(new book_model("Sức Mạnh Tư Duy", "Martin Manser"));
        arrayList.add(new book_model("Giết con chim Nhại", "Harper Lee"));
        arrayList.add(new book_model("Ba người lính ngự lâm", "Alexandre Dumas"));
        arrayList.add(new book_model("Những ông trùm tài chính", "Liaquat Ahamed"));
        arrayList.add(new book_model("Giã từ vũ khí", "Ernest Hemingway"));
        arrayList.add(new book_model("Quản Lý Dự Án", "Stephen Barker & Rob Cole"));
        arrayList.add(new book_model("Luật trí não", "John Medina"));

        adapter = new book_adapter(getActivity(), R.layout.lv_book, arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                fragment_book_detail fr = new fragment_book_detail();
                transaction.replace(R.id.container, fr).commit();
            }
        });
    }


}
