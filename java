package com.example.attendanceapp;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox student1, student2, student3;
    Button submit;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        student1 = findViewById(R.id.s1);
        student2 = findViewById(R.id.s2);
        student3 = findViewById(R.id.s3);
        submit = findViewById(R.id.submit);
        result = findViewById(R.id.result);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = "";

                res += "Student 1: " + (student1.isChecked() ? "Present\n" : "Absent\n");
                res += "Student 2: " + (student2.isChecked() ? "Present\n" : "Absent\n");
                res += "Student 3: " + (student3.isChecked() ? "Present\n" : "Absent\n");

                result.setText(res);
            }
        });
    }
}
