package com.firida_diane.exercice2tp4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
public class FragmentPaypal extends DialogFragment
{
    private TextView textpseudo,textpassword;
    private EditText editpseudo,editpassword;
    private Button yes;
    public FragmentPaypal() {
    }

    public static FragmentPaypal newInstance(String title) {
        FragmentPaypal frag = new FragmentPaypal();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.paypal, container, false);
        textpassword = view.findViewById(R.id.textpseudo);
        textpassword = view.findViewById(R.id.textpassword);
        editpseudo= (EditText) view.findViewById(R.id.editpseudo);
        editpassword= (EditText) view.findViewById(R.id.editpassword);
        yes = view.findViewById(R.id.yes);
        return view;
    }


}
