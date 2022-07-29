package com.njust.facedetection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private EditText mTitleField;
    private CharSequence titleName;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;
    private ImageButton mPhotoButton;
    private ImageView mPhotoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTitleField = (EditText)findViewById(R.id.capture_pic_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // This space intentionally left blank
            }
            @Override
            public void onTextChanged(
                    CharSequence s, int start, int before, int count) {
                titleName=s.toString();
            }
            @Override
            public void afterTextChanged(Editable s) {
                // This one too
            }
        });

//        mDateButton = (Button) v.findViewById(R.id.capture_pic_date);
//        mDateButton.setText(mCrime.getDate().toString());
//        mDateButton.setEnabled(false);
//
//        mSolvedCheckBox = (CheckBox)v.findViewById(R.id.crime_solved);
//        mSolvedCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView,
//                                         boolean isChecked) {
//                mCrime.setSolved(isChecked);
//            }
//        });
        mPhotoButton = (ImageButton) findViewById(R.id.capture_pic_camera);
        mPhotoView = (ImageView) findViewById(R.id.capture_pic);


    }





}