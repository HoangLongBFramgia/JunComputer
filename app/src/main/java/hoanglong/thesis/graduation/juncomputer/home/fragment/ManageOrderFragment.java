package hoanglong.thesis.graduation.juncomputer.home.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hoanglong.thesis.graduation.juncomputer.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ManageOrderFragment extends Fragment {


    public ManageOrderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_manage_order, container, false);
    }

}
