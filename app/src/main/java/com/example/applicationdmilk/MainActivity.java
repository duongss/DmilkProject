package com.example.applicationdmilk;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.applicationdmilk.Utils.Transaction;
import com.example.applicationdmilk.View.Login.LoginFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initCreate();
    }

    private void initView() {
    }

    private void initCreate() {
        Transaction transactionFragment = new Transaction(this);
        LoginFragment loginFragment = new LoginFragment();
        transactionFragment.replaceFragmentWithoutBackStack(loginFragment, R.id.id_activity_main_fl_login);
    }


}
