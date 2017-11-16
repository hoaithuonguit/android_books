package com.example.thuongdh.books.adapter;

import com.example.thuongdh.books.R;
import com.example.thuongdh.books.model.writer_model;

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

public class writer_adapter extends ArrayAdapter<writer_model> {
    Activity context;
    int resource;
    List<writer_model> objects;
    public writer_adapter(@NonNull Activity context, int resource, @NonNull List<writer_model> objects) {
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

        ImageView imageView = row.findViewById(R.id.imvWriter);
        TextView textView = row.findViewById(R.id.tvWriter);
        final writer_model writer  = this.objects.get(position);
        imageView.setImageResource(R.drawable.people);
        textView.setText(writer.getName());
        return row;
    }
}
