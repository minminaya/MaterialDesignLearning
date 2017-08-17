package com.minminaya.materialdesigndemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.minminaya.materialdesigndemo.RatingBarActivity.RatingActivity;
import com.minminaya.materialdesigndemo.bottom_navigation.BottomNavigationActivity;
import com.minminaya.materialdesigndemo.button.ButtonActivity;
import com.minminaya.materialdesigndemo.cardview.CardViewActivity;
import com.minminaya.materialdesigndemo.dialogs.DialogsActivity;
import com.minminaya.materialdesigndemo.progress.ProgressActivity;
import com.minminaya.materialdesigndemo.selection_control.CheckBoxActivity;
import com.minminaya.materialdesigndemo.selection_control.SelectControlActivity;
import com.minminaya.materialdesigndemo.snackbar.SnackBarActivity;
import com.minminaya.materialdesigndemo.text_fields.TextFieldsActivity;
import com.minminaya.materialdesigndemo.toolbar.ToolBarActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_checkBox)
    Button btnCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_checkBox, R.id.btn_progress, R.id.btn_snack_bar1, R.id.btn_dialogs, R.id.btn_bottom_navigation, R.id.btn_text_fields, R.id.btn_toolbar, R.id.btn_button, R.id.btn_select_control, R.id.btn_ratingBar, R.id.btn_cardView})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_checkBox:
                openActivity(CheckBoxActivity.class);
                break;
            case R.id.btn_text_fields:
                openActivity(TextFieldsActivity.class);
                break;
            case R.id.btn_toolbar:
                openActivity(ToolBarActivity.class);
                break;
            case R.id.btn_button:
                openActivity(ButtonActivity.class);
                break;
            case R.id.btn_select_control:
                openActivity(SelectControlActivity.class);
                break;
            case R.id.btn_ratingBar:
                openActivity(RatingActivity.class);
                break;
            case R.id.btn_cardView:
                openActivity(CardViewActivity.class);
                break;
            case R.id.btn_bottom_navigation:
                openActivity(BottomNavigationActivity.class);
                break;
            case R.id.btn_dialogs:
                openActivity(DialogsActivity.class);
                break;
            case R.id.btn_snack_bar1:
                openActivity(SnackBarActivity.class);
                break;
            case R.id.btn_progress:
                openActivity(ProgressActivity.class);
                break;
        }
    }

    public void openActivity(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}
