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
public class CategoryFragment extends Fragment  {
    View myView;
    Button asset, savings;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.category, container, false);
        asset = (Button)myView.findViewById(R.id.btnasset);
        savings = (Button)myView.findViewById(R.id.btnsavings);
        //asset.setOnClickListener(this);
        asset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Intent in = new Intent(getApplicationContext(), Add_Asset.class);
                Intent in = new Intent(getActivity(), Asset_Details.class);

                startActivity(in);

            }
        });

        savings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Intent in = new Intent(getApplicationContext(), Add_Asset.class);
                Intent in = new Intent(getActivity(), Asset_Details.class);

                startActivity(in);

            }
        });

        return myView;
    }

/*
    @Override
    public void onClick(View v) {
        String button = asset.getText().toString();
        Intent in = new Intent(getActivity(), Asset_Details.class);

        startActivity(in);
    }
*/

}