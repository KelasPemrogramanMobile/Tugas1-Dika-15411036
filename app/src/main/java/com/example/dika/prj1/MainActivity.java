package com.example.dika.prj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edNama) EditText edNama;
    @BindView(R.id.edNpm) EditText edNpm;
    @BindView(R.id.edNilai_quiz) EditText edNilai_quiz;
    @BindView(R.id.edNilai_tugas) EditText edNilai_tugas;
    @BindView(R.id.edNilai_uts) EditText edNilai_uts;
    @BindView(R.id.edNilai_uas) EditText edNilai_uas;

    @BindView(R.id.txtnama) TextView txtnama;
    @BindView(R.id.txtnpm) TextView txtnpm;
    @BindView(R.id.txtquiz) TextView txtquiz;
    @BindView(R.id.txttugas) TextView txttugas;
    @BindView(R.id.txtuts) TextView txtuts;
    @BindView(R.id.txtuas) TextView txtuas;

    @OnClick(R.id.btnKlik)
    void teks_tampil(){

        String nama = edNama.getText().toString();
        String npm = edNpm.getText().toString();
        String quiz = edNilai_quiz.getText().toString();
        String tugas = edNilai_tugas.getText().toString();
        String uts = edNilai_uts.getText().toString();
        String uas = edNilai_uas.getText().toString();

        String A = nama+""+npm+""+quiz+""+tugas+""+uts+""+uas;

        Toast.makeText(getApplicationContext(),A,Toast.LENGTH_LONG).show();

        txtnama.setText(nama);
        txtnpm.setText(npm);
        txtquiz.setText(quiz);
        txttugas.setText(tugas);
        txtuts.setText(uts);
        txtuas.setText(uas);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

}
