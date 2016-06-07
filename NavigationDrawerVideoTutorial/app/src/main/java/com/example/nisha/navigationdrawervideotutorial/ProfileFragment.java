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
public class ProfileFragment extends Fragment {
    View myView;
    Button edit; //#### alt + enter
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.profile, container, false);
        edit = (Button)myView.findViewById(R.id.btnedit); //####
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Intent in = new Intent(getApplicationContext(), Add_Asset.class);
                Intent in = new Intent(getActivity(), EditProfile.class);

                startActivity(in);

            }
        });
        return myView;
    }
}
