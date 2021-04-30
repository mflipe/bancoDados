package com.example.bancodados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/*
A programação na classe ViewActivity deve implementar o processo de chamada da consulta ao
banco de dados para selecionar todos os clientes cadastrados, exibindo a lista de clientes na tela
(usando o componente ListView). Essa implementação deve ser realizada no método "onCreate".
 */
public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        ListView lista = (ListView) findViewById(R.id.lsLista);
        ClienteDbHelper base = new ClienteDbHelper(getApplicationContext());
        ArrayAdapter<Cliente> arrayAD = new ArrayAdapter<Cliente>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                base.consultarClientes());
        lista.setAdapter(arrayAD);
    }
}