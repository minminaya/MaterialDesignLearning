package com.minminaya.materialdesigndemo.dialogs;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.minminaya.materialdesigndemo.App;
import com.minminaya.materialdesigndemo.MainActivity;
import com.minminaya.materialdesigndemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DialogsActivity extends AppCompatActivity {


    @BindView(R.id.alert)
    Button alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogs);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.alert, R.id.toast, R.id.toast_custom, R.id.confirmation_dialogs_single_custom, R.id.confirmation_dialogs_multi, R.id.confirmation_dialogs_single})
    public void onViewClicked(View view) {

        switch (view.getId()) {
            case R.id.alert:
                AlertDialog.Builder builder = new AlertDialog.Builder(DialogsActivity.this, R.style.MyAlert)
                        .setTitle("title")
                        .setMessage("message")
                        .setPositiveButton("PositiveButton", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DialogsActivity.this, "PositiveButton", Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("NegativeButton", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DialogsActivity.this, "NegativeButton", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                break;
            case R.id.toast:
                Toast toast = Toast.makeText(DialogsActivity.this, "text", Toast.LENGTH_SHORT);
                int gravity = Gravity.CENTER;
                int xOffSet = 0;
                int yOffSet = 200;
                toast.setGravity(gravity, xOffSet, yOffSet);
                //设置字体颜色
                TextView textView = toast.getView().findViewById(android.R.id.message);
                textView.setTextColor(Color.YELLOW);

                toast.getView().setBackgroundColor(getResources().getColor(R.color.indigo));
                toast.show();
                break;
            case R.id.toast_custom:
                Toast toast1 = new Toast(this);//创建Toast实例
                //创建自定义View
                View view1 = getLayoutInflater().inflate(R.layout.toast_custom, null);
                //设置自定义ciew
                toast1.setView(view1);

                toast1.setDuration(Toast.LENGTH_SHORT);

                //设置位置
                int margin = getResources().getDimensionPixelSize(R.dimen.toast_vertical_margin);
                toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER_VERTICAL, 0, margin);

                toast1.show();
                break;
            case R.id.confirmation_dialogs_single:
                AlertDialog.Builder builder2 = new AlertDialog.Builder(DialogsActivity.this)
                        .setTitle("title")
                        .setSingleChoiceItems(getResources().getStringArray(R.array.dog_list), 0, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setPositiveButton("PositiveButton", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DialogsActivity.this, "PositiveButton", Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("NegativeButton", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DialogsActivity.this, "NegativeButton", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog2 = builder2.create();
                alertDialog2.show();
                break;
            case R.id.confirmation_dialogs_multi:
                AlertDialog.Builder builder3 = new AlertDialog.Builder(DialogsActivity.this)
                        .setTitle("title")
                        .setMultiChoiceItems(getResources().getStringArray(R.array.dog_list), null, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                            }
                        })
                        .setPositiveButton("PositiveButton", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DialogsActivity.this, "PositiveButton", Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("NegativeButton", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DialogsActivity.this, "NegativeButton", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog3 = builder3.create();
                alertDialog3.show();
                break;
            case R.id.confirmation_dialogs_single_custom:
                //初始化样式
                AlertDialog.Builder builder4 = new AlertDialog.Builder(DialogsActivity.this, R.style.MyConfirmationDialog)
                        .setTitle("title")
                        .setMultiChoiceItems(getResources().getStringArray(R.array.dog_list), null, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                            }
                        })
                        .setPositiveButton("PositiveButton", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DialogsActivity.this, "PositiveButton", Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("NegativeButton", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DialogsActivity.this, "NegativeButton", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog4 = builder4.create();
                alertDialog4.show();
                break;
        }
    }
}
