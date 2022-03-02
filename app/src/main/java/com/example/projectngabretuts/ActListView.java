package com.example.projectngabretuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ActListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_list_view);

        ListView list = findViewById(R.id.List_kegiatan);
        String[] listKegiatan = new String[]{
                "Belanja", "Olahraga", "Main Game", "Pura-pura ngoding", "nyanyi", "joget", "binjai", "gelud", "membangkang",
                "ngaji", "main bola"
        };

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listKegiatan);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), "ID" + i + "\n" + "JUDUL : " + listKegiatan[i],
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}