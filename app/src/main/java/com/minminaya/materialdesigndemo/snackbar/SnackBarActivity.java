package com.minminaya.materialdesigndemo.snackbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.minminaya.materialdesigndemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SnackBarActivity extends AppCompatActivity {

    @BindView(R.id.btn_snack_bar)
    Button btnSnackBar;
    @BindView(R.id.btn_snack_bar_custom)
    Button btnSnackBarCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_snack_bar, R.id.btn_snack_bar_custom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_snack_bar:
                //实际使用时，这个view可以用DecorView来代替，获取方法：getWindow().getDecorView()
                //有个弊端，有虚拟按键的手机SnackBar会显示在虚拟按键那里，
                // 解决方法：1.Snackbar向上偏移虚拟按键高度
                //2.SnackBar显示同时虚拟按键隐藏
                Snackbar.make(view, "title", Snackbar.LENGTH_SHORT)
                        .addCallback(new BaseTransientBottomBar.BaseCallback<Snackbar>() {
                            @Override
                            public void onDismissed(Snackbar transientBottomBar, int event) {
                                super.onDismissed(transientBottomBar, event);
                            }

                            @Override
                            public void onShown(Snackbar transientBottomBar) {
                                super.onShown(transientBottomBar);
                            }
                        })
                        .setAction("Action", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).show();
                break;
            case R.id.btn_snack_bar_custom:
                //获取实例
                Snackbar snackbar = Snackbar.make(view, "title", Snackbar.LENGTH_SHORT);
                //设置action的字体颜色
                snackbar.setActionTextColor(getResources().getColor(R.color.indigo));
                //获取snackbar的view实例
                View snackView = snackbar.getView();
                //snackbarTextView的id
                int snackbarTextId = android.support.design.R.id.snackbar_text;
                //获取snackbar中的TextView
                TextView textView = snackView.findViewById(snackbarTextId);
                //设置textview的颜色
                textView.setTextColor(Color.YELLOW);
                //设置sanckbar背景颜色
                snackView.setBackgroundColor(Color.MAGENTA);
                //设置snackbar的Action
                snackbar.setAction("action", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                snackbar.show();
                break;
        }
    }
}
