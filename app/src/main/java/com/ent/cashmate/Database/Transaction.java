package com.ent.cashmate.Database;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "transactions")
public class Transaction {
    @PrimaryKey(autoGenerate = true)// به عنوان کلید اصلی (اتوماتیک تولید می شود)

    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "title") // عنوان فاکتور
    private String title;

    @ColumnInfo(name = "Type")// نوع تراکنش (مثل خرید، فروش)
    private int Type;

    @ColumnInfo(name = "TypeItemId") // زیر شاخه تراکنش
    private int TypeItemId;

    @ColumnInfo(name = "price") // مبلغ
    private double price;

    @ColumnInfo(name = "date") // زمان تراکنش
    private Long date;

    public Transaction(int id, String title, int type, int typeItemId, double price, Long date) {
        this.id = id;
        this.title = title;
        Type = type;
        TypeItemId = typeItemId;
        this.price = price;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public int getTypeItemId() {
        return TypeItemId;
    }

    public void setTypeItemId(int typeItemId) {
        TypeItemId = typeItemId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
}
