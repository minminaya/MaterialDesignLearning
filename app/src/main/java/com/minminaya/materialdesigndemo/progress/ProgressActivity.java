package com.minminaya.materialdesigndemo.progress;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;

import com.minminaya.materialdesigndemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProgressActivity extends AppCompatActivity {

    @BindView(R.id.swipe)
    SwipeRefreshLayout swipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        ButterKnife.bind(this);

        swipe.setColorSchemeResources(R.color.red, R.color.yellow, R.color.greenyellow, R.color.bisque);
        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

            }
        });
    }
}
