package com.hafizapps;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class ActivityCount extends AppCompatActivity{
    private TextView mShowCount;
    private int currentCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        mShowCount = findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        currentCount++;
        mShowCount.setText(String.valueOf(currentCount));
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_pesan, Toast.LENGTH_SHORT);
        toast.show();
    }
}