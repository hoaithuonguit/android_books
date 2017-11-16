package com.example.thuongdh.books.adapter;

import com.example.thuongdh.books.R;
import com.example.thuongdh.books.model.book_model;

import java.util.List;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by thuongdh on 17/11/2017.
 */

public class book_adapter extends ArrayAdapter<book_model> {
    Activity context;
    int resource;
    List<book_model> objects;
    public book_adapter(@NonNull Activity context, int resource, @NonNull List<book_model> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource, null);

        ImageView img = row.findViewById(R.id.imvBook);
        TextView txtName = row.findViewById(R.id.tvlvBookName);
        TextView txtWriter = row.findViewById(R.id.tvlvBookWriter);
        final book_model book = this.objects.get(position);
        img.setImageResource(R.drawable.book);
        txtName.setText(book.getBookName());
        txtWriter.setText(book.getWriter());
        return  row;
    }
}
