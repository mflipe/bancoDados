package com.example.bancodados;

import android.provider.BaseColumns;

/*
ClienteContract.java
A classe ClienteContract.java deve ser criada de maneira que contenha as definições básicas da
base de dados qu será criada. No exemplo será definida uma tabela para cliente. Caso fosse
necessário criar novas tabelas, suas estruturas seriam definidas nessa classe. A codificação da
classe deve ficar como ilustrado na figura abaixo.
 */
public class ClienteContract {

    public ClienteContract(){
    }

    public static abstract class ClienteDb implements BaseColumns {
        public static final String TABLE_NAME = "cliente";
        public static final String COLUMN_NOME = "nome";
        public static final String COLUMN_CPF = "cpf";
    }

}
