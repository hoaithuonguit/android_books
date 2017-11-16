package com.example.thuongdh.books.model;

import java.io.Serializable;

/**
 * Created by thuongdh on 17/11/2017.
 */

public class writer_model implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public writer_model() {
    }

    public writer_model(String name) {
        this.name = name;
    }
}
