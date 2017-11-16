package com.example.thuongdh.books;

import java.util.ArrayList;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by thuongdh on 17/11/2017.
 */

public class fragment_setting extends Fragment {
    private View myv;
    Spinner sp;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    Button btnUpdate, btnVote, btnInfo;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myv = inflater.inflate(R.layout.fr_setting, container, false);
        sp = myv.findViewById(R.id.spSetting);
        btnInfo = myv.findViewById(R.id.btnfrSettingInfo);
        btnUpdate = myv.findViewById(R.id.btnfrSettingUpdateData);
        btnVote = myv.findViewById(R.id.btnfrSettingDG);
        setsp();
        return myv;
    }

    private void setsp() {
        arrayList = new ArrayList<String>();
        arrayList.add("Tiếng việt");
        arrayList.add("Tiếng Anh");
        arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(arrayAdapter);
    }
}
