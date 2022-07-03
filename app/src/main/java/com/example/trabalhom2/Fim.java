package com.example.trabalhom2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Fim extends AppCompatActivity {

    ListView listView;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;
    Button botao_pagar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fim);

        listView = findViewById(R.id.listView);
        items = new ArrayList<>();
        items.add("Canape de lula");
        items.add("Pasteizinhos da aprovacao");
        items.add("Porcao de batatas ");
        items.add("Fritas com bacon ");
        items.add("Pasta italiana ao molho sugo ");
        items.add("Penne carbonara ");
        items.add("Media");
        items.add("Sopa de camarao ");
        items.add("Sopa verde");
        items.add("Sopa de calabresa");
        items.add("Sopa de arroz");
        items.add("SKOL");
        items.add("Coca cola");
        items.add("Pepsi");
        items.add("Suco");
        items.add("Bolo");
        items.add("Torta");
        items.add("Sorvete");
        items.add("Cheesecake");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = items.get(position);
                makeToast(name);
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                makeToast("Removed"+items.get(position));
                removeItem(position);
                return false;
            }
        });

        botao_pagar = findViewById(R.id.button10);

        botao_pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), Pagamento.class);
                startActivity(intent);
            }
        });

        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);


    }

    public void removeItem(int remove){
           items.remove(remove);
           listView.setAdapter(adapter);
    }

    Toast t;

    private void makeToast(String s) {
        if (t != null) t.cancel();
        t = Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT);
        t.show();

    }

}



