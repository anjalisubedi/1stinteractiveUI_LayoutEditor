package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private Button mToast, mCount;
    private TextView mIncrement;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToast = findViewById(R.id.toast);
        mCount = findViewById(R.id.count);
        mIncrement = findViewById(R.id.increment);

        mCount.setOnClickListener(this);
        mToast.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.count:

                int count = 0;
                count++;
                mIncrement.setText(""+count);

                break;

            case R.id.toast:

                Toast toast = Toast.makeText(this, R.string.hello, Toast.LENGTH_SHORT);
                toast.show();

                break;
        }
    }
}