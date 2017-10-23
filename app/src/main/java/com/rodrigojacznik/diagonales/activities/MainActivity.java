package com.rodrigojacznik.diagonales.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rodrigojacznik.diagonales.R;
import com.rodrigojacznik.diagonales.helpers.StreetCalculator;

public class MainActivity extends AppCompatActivity {
    private EditText streetView;
    private EditText numberView;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.streetView = (EditText) findViewById(R.id.street);
        this.numberView = (EditText) findViewById(R.id.number);
        this.result = (TextView) findViewById(R.id.result);
    }

    public void calculateStreet(View v) {
        Integer street = Integer.valueOf(this.streetView.getText().toString());
        Integer number = Integer.valueOf(this.numberView.getText().toString());

        String result = StreetCalculator.calculateStreet(street, number);

        if (result.equals("")) {
            result = getString(R.string.error);
        }

        this.result.setText(result);
        this.result.setVisibility(View.VISIBLE);
    }
}
