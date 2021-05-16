package com.zakyidhafi.uicomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imgButtonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgButtonAdd = findViewById(R.id.imgButtonAdd);

        imgButtonAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.imgButtonAdd) {
            Toast.makeText(this, "Berhasil", Toast.LENGTH_LONG).show();
        }
    }
}