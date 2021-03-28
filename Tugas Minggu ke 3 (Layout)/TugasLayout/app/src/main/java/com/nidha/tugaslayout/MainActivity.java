package com.nidha.tugaslayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private Button btnLinearLayout, btn_relative_layout, btn_constraint_layout, btn_frame_layout,
            btn_table_layout, btn_scroll_view,btn_scroll_view_horizontal, btn_material_design;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLinearLayout = findViewById(R.id.btn_linear_layout);
        btn_relative_layout = findViewById(R.id.btn_relative_layout);
        btn_constraint_layout = findViewById(R.id.btn_constraint_layout);
        btn_frame_layout = findViewById(R.id.btn_frame_layout);
        btn_table_layout = findViewById(R.id.btn_table_layout);
        btn_scroll_view = findViewById(R.id.btn_scroll_view);
        btn_scroll_view_horizontal =findViewById(R.id.btn_scroll_view_horizontal);
        btn_material_design = findViewById(R.id.btn_material_design);

        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LinearLayoutActivity.class));
            }
        });
        btn_relative_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RelativeLayoutActivity.class));
            }
        });
        btn_constraint_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ConstraintLayoutActivity.class));
            }
        });
        btn_frame_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FrameLayoutActivity.class));
            }
        });
        btn_table_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TableLayoutActivity.class));
            }
        });
        btn_scroll_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ScrollViewActivity.class));
            }
        });
        btn_scroll_view_horizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ScrollViewHorizontalactivity.class));
            }
        });
        btn_material_design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MaterialDesignActivity.class));
            }
        });
    }
}