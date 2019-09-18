package com.example.buyticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup ticketType;
    private RadioGroup ticketNum;
    private TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ticketType = findViewById(R.id.ticketType);
        txv = findViewById(R.id.txv);
        ticketNum = findViewById(R.id.ticketNum);
    }

    public void showType(View v) {
        RadioButton select;
        String num = "";

        if (ticketType.getCheckedRadioButtonId() == -1) {
            txv.setText("Please choose which type of ticket you want");
            return;
        }
        else {
            int typeId = ticketType.getCheckedRadioButtonId();
            select = findViewById(typeId);
        }

        if (ticketNum.getCheckedRadioButtonId() == -1) {
            txv.setText("Please choose how many tickets you want");
            return;
        }
        else if (ticketNum.getCheckedRadioButtonId() == R.id.buyOneTicket)
            num = "1";
        else if (ticketNum.getCheckedRadioButtonId() == R.id.buyTwoTicket)
            num = "2";
        else if (ticketNum.getCheckedRadioButtonId() == R.id.buyThreeTicket)
            num = "3";
        else if (ticketNum.getCheckedRadioButtonId() == R.id.buyFourTicket)
            num = "4";


        txv.setText("you buy " + num + " " + select.getText() + " tickets");
    }
}
