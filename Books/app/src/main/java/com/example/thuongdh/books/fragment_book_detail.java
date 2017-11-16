package com.example.thuongdh.books;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by thuongdh on 17/11/2017.
 */

public class fragment_book_detail extends Fragment {
    View myv;
    TextView textView1,textView2,textView3;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myv = inflater.inflate(R.layout.fr_book_detail, container, false);
        textView1 = myv.findViewById(R.id.tvfrBookDetailDetailShowShow);
        textView2 = myv.findViewById(R.id.tvfrBookDetailNameShow);
        textView3 = myv.findViewById(R.id.tvfrBookDetailWriterShow);
        textView3.setText("Stephen Barker & Rob Cole");
        textView2.setText("Những ông trùm tài chính");
        textView1.setText("là một tiểu thuyết của nhà văn người Pháp Alexandre Dumas cha, là cuốn đầu tiên của bộ ba tập truyện gồm Les Trois Mousquetaires, Vingt Ans après (Hai mươi năm sau), và Le Vicomte de Bragelonne (Tử tước de Bragelonne). Bộ tiểu thuyết kể về những cuộc phiêu lưu của chàng lính ngự lâm d’Artagnan, từ lúc anh còn trẻ cho đến lúc già. “Ba người lính ngự lâm” là cuốn nổi tiếng nhất và cũng là hay nhất trong bộ ba, đã được dựng thành phim nhiều lần, cũng như phim truyền hình, phim hoạt hình Pháp, và hoạt hình Nhật Bản.");
        return myv;
    }
}
