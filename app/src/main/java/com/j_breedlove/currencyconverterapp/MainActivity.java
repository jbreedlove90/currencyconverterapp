package com.j_breedlove.currencyconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // on click method for button
    public void convert(View view) {
        EditText dollarField = (EditText) findViewById(R.id.editText);

        Double dollarAmount = Double.parseDouble(dollarField.getText().toString());

        Double poundAmt = dollarAmount * 0.65;

        // Log.i("Dollar Field:", poundAmt.toString());

        Toast.makeText(getApplicationContext(), "Pound: " + poundAmt.toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
