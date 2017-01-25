/*
    Author : Indra Kusuma
    Build : DICODING
    Kelas : Belajar Membangun Aplikasi Android Native

*/
package com.nbs.apps.hitungluas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//add textUtils
import android.text.TextUtils;
//add Toast
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edtPanjang = (EditText)findViewById(R.id.edt_panjang);
        edtLebar = (EditText)findViewById(R.id.edt_lebar);
        btnHitung = (Button)findViewById(R.id.btn_hitung);
        txtLuas = (TextView)findViewById(R.id.txt_luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validasi jika textField kosong
                if(TextUtils.isEmpty(edtPanjang.getText()) || TextUtils.isEmpty(edtLebar.getText())){
                    //isi pesan
                    Toast.makeText(MainActivity.this,"Nilai yang dimasukkan tidak boleh kosong",Toast.LENGTH_SHORT).show();

                }else {
                    String panjang = edtPanjang.getText().toString().trim();
                    String lebar = edtLebar.getText().toString().trim();

                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);

                    double luas = p * l;

                    txtLuas.setText("Luas : "+luas);
                }
            }
        });
    }
}