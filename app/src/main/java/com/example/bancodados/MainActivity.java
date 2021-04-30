package com.example.bancodados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private ClienteDbHelper base;
    private EditText nome, cpf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        base = new ClienteDbHelper(getApplicationContext());
        nome = (EditText) findViewById(R.id.edNome);
        cpf = (EditText) findViewById(R.id.edCpf);
    }

    public void salvarCliente(View view) {
        Cliente cliente = new Cliente(nome.getText().toString(), cpf.getText().toString());
        base.salvarCliente(cliente);
        nome.setText("");
        cpf.setText("");
    }

    public void visualizarClientes(View view) {
        Intent intent = new Intent(getApplicationContext(), ViewActivity.class);
        startActivity(intent);
    }
}