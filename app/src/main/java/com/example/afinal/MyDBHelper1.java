package com.example.afinal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelper1 extends SQLiteOpenHelper {
    private static final String name = "mdatabase.db";
    private static final int version = 1;

    MyDBHelper1(Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        //建立資料表的SQL語法
        //運動項目跟有沒有做
        db.execSQL("CREATE TABLE myTable(sport text PRIMARY KEY, yn String NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion){
        //需要加入刪除資料表的SQL語法
        db.execSQL("DROP TABLE IF EXISTS myTable");
        onCreate(db);
    }

}
