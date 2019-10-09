package br.senac.es.trabalhoreferencia.model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import br.senac.es.trabalhoreferencia.R;

public class Tab2Fragmant extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =
                inflater.inflate(R.layout.fragment_two, container, false);

return  view;
    }
}
