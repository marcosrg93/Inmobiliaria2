package es.marcos.inmobiliariacp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Ayudante  extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "inmobiliaria.db";
    public static final int DATABASE_VERSION = 1;

    public Ayudante(Context context) {
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql;
        sql="create table "+Contrato.TablaInmuebles.TABLA+
                " ("+ Contrato.TablaInmuebles._ID+
                " integer primary key autoincrement, "+
                Contrato.TablaInmuebles.DIRECCION+" text, "+
                Contrato.TablaInmuebles.TITULO+" text, "+
                Contrato.TablaInmuebles.PRECIO+" text, "+
                Contrato.TablaInmuebles.SUBIDO+" integer default 0)";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}