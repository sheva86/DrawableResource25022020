package com.example.drawableresource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox mCbAndroid;
RadioGroup mRadioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mRadioGroup = findViewById(R.id.radioGroup);
//        mCbAndroid = findViewById(R.id.checkbox);
//        mCbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked == true){
//                    Toast.makeText(MainActivity.this,"Đã check",Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this,"Bỏ check",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                switch (checkedId){
//                    case R.id.radioAndroid :
//                        Toast.makeText(MainActivity.this, "Android", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.radioJava:
//                        Toast.makeText(MainActivity.this, "Java", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.radioPHP:
//                        Toast.makeText(MainActivity.this, "PHP", Toast.LENGTH_SHORT).show();
//                        break;
//                }
//            }
//        });
    }
}
