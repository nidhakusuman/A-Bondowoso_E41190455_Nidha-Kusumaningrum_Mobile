package com.nidha.tugaske4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyleViewActivity extends AppCompatActivity {

    private MahasiswaAdapter mAdapter;
    private RecyclerView txt_nama_Mahasiswa;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyle_view);

        addData();

        txt_nama_Mahasiswa = findViewById(R.id.txt_nama_mahasiswa);

        mAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        txt_nama_Mahasiswa.setLayoutManager(new LinearLayoutManager(this));
        txt_nama_Mahasiswa.setAdapter(mAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa
                ("Nidha Kusumaningrum", "E41190455", "081314726617"));
        mahasiswaArrayList.add
                (new Mahasiswa("Dimas Maulana", "14143370309", "123456789"));
        mahasiswaArrayList.add
                (new Mahasiswa("Fadly Yonk", "1214234560", "987654321"));
        mahasiswaArrayList.add
                (new Mahasiswa("Ariyandi Nugraha", "1214658757", "19876554537"));
        mahasiswaArrayList.add
                (new Mahasiswa("Aham Siswana", "1215765747", "867565376545"));
        mahasiswaArrayList.add
                (new Mahasiswa("Andreansyah Mulianto", "0978656754764", "9798955667"));
        mahasiswaArrayList.add
                (new Mahasiswa("Mahendy Putra Armadany", "1215667473", "987654321"));
    }
}