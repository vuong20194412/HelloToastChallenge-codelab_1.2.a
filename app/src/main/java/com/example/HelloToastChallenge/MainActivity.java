package com.example.HelloToastChallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnToast = findViewById(R.id.button_toast);
        Button btnCount = findViewById(R.id.button_count);
        TextView mShowCount = findViewById(R.id.show_count);

        btnToast.setOnClickListener(v -> showToast());
        btnCount.setOnClickListener(v -> countUp(mShowCount));
    }

    private void showToast() {
        Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT).show();
    }

    private void countUp(TextView mShowCount) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(String.valueOf(mCount));
        }
    }
}