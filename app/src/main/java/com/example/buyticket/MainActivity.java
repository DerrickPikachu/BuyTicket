package com.example.buyticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup ticketType;
    private TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ticketType = findViewById(R.id.ticketType);
        txv = findViewById(R.id.txv);
    }

    public void showType(View v) {
        if (ticketType.getCheckedRadioButtonId() == -1) {
            txv.setText("Please choose which type of ticket you want");
        }
        else {
            int typeId = ticketType.getCheckedRadioButtonId();
            RadioButton select = findViewById(typeId);
            txv.setText("you buy a " + select.getText() + " ticket");
        }
    }
}
