package com.example.applicationdmilk.Utils;

import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Transaction {
    private Context mContext;

    public Transaction(Context context) {
        this.mContext = context;
    }

    public void replaceFragmentWithoutBackStack(final Fragment fragment, int id) {
        FragmentTransaction transaction = ((AppCompatActivity) mContext)
                .getSupportFragmentManager()
                .beginTransaction();
        try {
            transaction.replace(id, fragment)
                    .commit();
        } catch (Exception e) {
            Toast.makeText(mContext, "ViewHolder " + e.getMessage(), Toast.LENGTH_SHORT)
                    .show();
        }
    }
}
