package com.example.bancodados;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/*
ClienteDbHelper.java
A classe ClienteDbHelper.java deve ser criada para realizar a manipulação da tabela no banco de
dados. Ela será responsável por fazer as operações de acesso do banco. Para isso, a classe deve
estender a classe SQLiteOpenHelper. A codificação da classe deve ficar como na figura abaixo.
 */
public class ClienteDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATAVBASE_NAME = "Cliente.db";

    private static final String CREATE = "create table "
            + ClienteContract.ClienteDb.TABLE_NAME
            + "( "
            + ClienteContract.ClienteDb._ID + " integer primary key autoincrement, "
            + ClienteContract.ClienteDb.COLUMN_NOME + " text, "
            + ClienteContract.ClienteDb.COLUMN_CPF + " text)";

    public static final String DELETE = "drop table if exists " + ClienteContract.ClienteDb.TABLE_NAME;

    public ClienteDbHelper(Context context) {
        super(context, DATAVBASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DELETE);
        onCreate(db);
    }

    public boolean salvarCliente(cliente cliente) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ClienteContract.ClienteDb.COLUMN_NOME, cliente.getNome());
        contentValues.put(ClienteContract.ClienteDb.COLUMN_CPF, cliente.getCpf());
        long id = db.insert(ClienteContract.ClienteDb.TABLE_NAME, null, contentValues);
        cliente.setId(id);
        return true;
    }

    public ArrayList consultarClientes() {
        ArrayList lista = new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from " + ClienteContract.ClienteDb.TABLE_NAME, null);
        while (cursor.moveToNext()) {
            lista.add(
                    new cliente(
                        cursor.getLong(cursor.getColumnIndex(ClienteContract.ClienteDb._ID)),
                        cursor.getString(cursor.getColumnIndex(ClienteContract.ClienteDb.COLUMN_NOME)),
                        cursor.getString(cursor.getColumnIndex(ClienteContract.ClienteDb.COLUMN_CPF))
                    )
            );
        }
        return lista;
    }
}
