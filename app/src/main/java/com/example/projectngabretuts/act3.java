package com.example.projectngabretuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class act3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);

        Button btnPindah3 = findViewById(R.id.btnpindah3);

        btnPindah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(act3.this, MainActivity.class);
                startActivity(intent3);
            }
        });

        Spinner spin1 = findViewById(R.id.spin1);
        Button btn_Ambil = findViewById(R.id.btn_Ambil);
        TextView txtNama = findViewById(R.id.Data_Nama);

        List<String> ListNama = new ArrayList<String>();
        ListNama.add("Usop");
        ListNama.add("Ujang");
        ListNama.add("Ucok");
        ListNama.add("Udin");

        String[] arrayBaru = getResources().getStringArray(R.array.nama);
        ListNama.addAll(Arrays.asList(arrayBaru));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, ListNama);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adapter);

        //terkait even handler untuk btnAmbil
        btn_Ambil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = spin1.getSelectedItem().toString();
                txtNama.setText(nama);

                Toast.makeText(act3.this, "Anda mengambil ID : " + spin1.getSelectedItemId() ,
                        Toast.LENGTH_SHORT).show();

                Toast.makeText(act3.this, "position : " + spin1.getSelectedItemPosition() ,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}