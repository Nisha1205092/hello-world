package com.example.nisha.navigationdrawervideotutorial;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Nisha on 4/15/16.
 */
public class CategoryFragment extends Fragment implements View.OnClickListener{
    View myView;
    Button asset;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.category, container, false);
        asset = (Button)myView.findViewById(R.id.btnasset);
        asset.setOnClickListener(this);
        return myView;
    }


    @Override
    public void onClick(View v) {
        Intent in = new Intent(getActivity(), Asset_Details.class);

        startActivity(in);
    }
}