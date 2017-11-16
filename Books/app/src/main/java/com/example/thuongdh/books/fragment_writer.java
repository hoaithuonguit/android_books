package com.example.thuongdh.books;

import com.example.thuongdh.books.adapter.writer_adapter;
import com.example.thuongdh.books.model.writer_model;

import java.util.ArrayList;

import android.app.Fragment;
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

public class fragment_writer extends Fragment {
    private View myv;
    TextView textView;
    ListView listView;
    ArrayList<writer_model> arrayList;
    writer_adapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myv = inflater.inflate(R.layout.fr_writer, container, false);
        textView = myv.findViewById(R.id.tvfrWriter);
        listView = myv.findViewById(R.id.lvfrWriter);

        setView();
        return myv;
    }

    private void setView() {
        arrayList = new ArrayList<writer_model>();
        arrayList.add(new writer_model("Liaquat Ahamed"));
        arrayList.add(new writer_model("Ernest Hemingway"));
        arrayList.add(new writer_model("Stephen Barker & Rob Cole"));
        arrayList.add(new writer_model("John Medina"));
        arrayList.add(new writer_model("Martin Manser"));
        arrayList.add(new writer_model("Harper Lee"));
        arrayList.add(new writer_model("Alexandre Dumas"));
        arrayList.add(new writer_model("Liaquat Ahamed"));

        adapter = new writer_adapter(getActivity(), R.layout.lv_writer, arrayList);
        adapter.setDropDownViewResource(R.layout.lv_writer);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
