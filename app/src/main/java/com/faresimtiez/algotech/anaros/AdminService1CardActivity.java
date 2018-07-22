package com.faresimtiez.algotech.anaros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AdminService1CardActivity extends AppCompatActivity {
    Button rdv_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_service1_card);

        rdv_btn=(Button)findViewById(R.id.btn_service1);
        rdv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AdminService1CardActivity.this, AdminRDVActivityActivity.class);
                startActivity(i);
            }
        });
    }
}
