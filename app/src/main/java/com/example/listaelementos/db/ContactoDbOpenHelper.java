package com.example.listaelementos.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class ContactoDbOpenHelper extends SQLiteOpenHelper {

    public static String DATABASE_NAME = "agenda.db";
    public static int VERSION = 1;

    String CREATE_TABLE_CONTACTO = "CREATE TABLE contacto (id INTEGER PRIMARY KEY autoincrement, " +
            "nombre TEXT, " +
            "apellido_p TEXT, " +
            "apellido_m TEXT, " +
            "telefono TEXT);";

    String INSERT_CONTACTO1 = "INSERT INTO contacto (nombre, apellido_p, apellido_m, telefono) " +
            "VALUES ('Loreto', 'López', 'Pino', '+56945102885')";

    public ContactoDbOpenHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_CONTACTO);
        Log.i("Openhelper", "Se creó tabla contacto");

        db.execSQL(INSERT_CONTACTO1);
        Log.i("Openhelper", "Se insertó contacto");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

