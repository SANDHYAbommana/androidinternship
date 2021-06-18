package com.example.exampledatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.exampledatabase.RDB.RTable;
import com.example.exampledatabase.RDB.RViewModel;

public class MainActivity extends AppCompatActivity {
    EditText roll,name,num;
    RecyclerView rv;
    public static RViewModel rViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roll = findViewById(R.id.roll);
        name = findViewById(R.id.name);
        num = findViewById(R.id.phone);
        rv = findViewById(R.id.rv);
        rViewModel = new ViewModelProvider(this).get(RViewModel.class);


    }

    public void Save(View view) {
        RTable rTable = new RTable();
        rTable.setSroll(roll.getText().toString());
        rTable.setSname(name.getText().toString());
        rTable.setSnumber(num.getText().toString());
        rViewModel.insert(rTable);
        Toast.makeText(this,"Data Inserted",Toast.LENGTH_SHORT).show();
    }
}