package com.example.laba7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TVOut = (TextView) findViewById(R.id.tvOut);
        Button btnOk = (Button) findViewById(R.id.btnOk);
        Button btnCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnOk:
                        // кнопка ОК
                        TVOut.setText("Нажата кнопка ОК");
                        break;
                    case R.id.btnCancel:
                        // кнопка Cancel
                        TVOut.setText("Нажата кнопка Cancel");
                        break;
                }

            }
        };

        btnOk.setOnClickListener(oclBtn);
        btnCancel.setOnClickListener(oclBtn);
    }
}
