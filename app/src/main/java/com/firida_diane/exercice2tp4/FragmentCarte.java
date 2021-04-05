package com.firida_diane.exercice2tp4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
public class FragmentCarte extends DialogFragment
{
    private EditText editfirstnam,editlastnam,editnumcarte,editcode,editdate;
    private TextView textfirstnam,textlastnam,textnumcarte,textcode,textdate;
    private Button ok;
    public FragmentCarte() {

    }

    public static FragmentCarte newInstance(String title) {
        FragmentCarte frag = new FragmentCarte();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.carte, container, false);
        ok = view.findViewById(R.id.ok);

        textfirstnam = view.findViewById(R.id.textfirstnam);
        textlastnam = view.findViewById(R.id.textlastnam);
        textnumcarte = view.findViewById(R.id.textnumcart);
        textcode = view.findViewById(R.id.textcode);
        textdate = view.findViewById(R.id.textdate);
        editfirstnam= view.findViewById(R.id.editfirstnam);
        editlastnam= view.findViewById(R.id.editlastnam);
        editnumcarte= view.findViewById(R.id.editnumcart);
        editcode=  view.findViewById(R.id.editcode);
        editdate=view.findViewById(R.id.editdate);

        return view;
    }



}
