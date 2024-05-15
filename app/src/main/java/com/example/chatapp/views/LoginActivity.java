package com.example.chatapp.views;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.chatapp.R;
import com.example.chatapp.databinding.ActivityLoginBinding;
import com.example.chatapp.viewmodel.MyViewModel;

public class LoginActivity extends AppCompatActivity {

    MyViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        viewModel = new ViewModelProvider(this).get(MyViewModel.class);

        ActivityLoginBinding activityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        // passing thw viewModel variable here to the vModel variable in XML file
        activityLoginBinding.setVModel(viewModel);
    }
}