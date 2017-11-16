package com.example.thuongdh.books.model;

import java.io.Serializable;

/**
 * Created by thuongdh on 17/11/2017.
 */

public class book_model implements Serializable {
    private String bookName, writer;

    public book_model() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public book_model(String bookName, String writer) {
        this.bookName = bookName;
        this.writer = writer;
    }
}
