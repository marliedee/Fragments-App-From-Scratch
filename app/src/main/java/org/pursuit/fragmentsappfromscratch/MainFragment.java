package org.pursuit.fragmentsappfromscratch;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
private View rootView;
private TextView textView;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();
//        String myStr = bundle.getString("name");
        rootView =  inflater.inflate(R.layout.fragment_main, container, false);
        textView =  rootView.findViewById(R.id.frag_text);
//        textView.setText(myStr);
        return rootView;
    }

}
