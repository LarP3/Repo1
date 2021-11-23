package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CarOff extends AppCompatActivity {

    ListView list;
    ArrayList<String> lista;
    ArrayAdapter adapter;
    Button _btnBack;
    SQLiteOpenHelper openHelper;
    SQLiteDatabase database;
    Database local= new Database(this);



    Car car = new Car();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_off);
        list = (ListView)findViewById(R.id.ListDelete);
        Database db = new Database(getApplicationContext());
        lista = db.llenar_lista();
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice,lista);
        list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        _btnBack = (Button)findViewById(R.id.btnBack2);

        list.setAdapter(adapter);

        _btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(getApplicationContext(), Lista.class);
                startActivity(intento);
            }
        });

        this.setTitle("MyWill");

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               Object obj = list.getAdapter().getItem(position);
               String item_id = String.valueOf(obj.toString().charAt(0));

               local.deleteData(item_id);

               int pos = list.getCheckedItemPosition();
               if ( pos> -1){
                   adapter.remove(lista.get(pos).toString());
               }
               adapter.notifyDataSetChanged();

           }

       });


    }


}
