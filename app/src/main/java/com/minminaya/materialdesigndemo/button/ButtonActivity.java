package com.minminaya.materialdesigndemo.button;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.minminaya.materialdesigndemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ButtonActivity extends AppCompatActivity {

    @BindView(R.id.floating_button)
    FloatingActionButton floatingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        ButterKnife.bind(this);

        floatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //逻辑
            }
        });
    }
}
