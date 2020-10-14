package com.example.fragmenttest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmenttest.databinding.FragmentInputBinding;
import com.example.fragmenttest.model.Login;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class inputFragment extends Fragment {
    FragmentInputBinding binding;
    Login student;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_input, container, false);
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_input, container, false);
        student = new Login();
        binding.btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                student.setName(binding.txtName.getText().toString());
                student.setNIM(binding.txtNIM.getText().toString());
                bundle.putParcelable("student", student);
                Navigation.findNavController(view).navigate(R.id.action_inputFragment_to_displayFragment, bundle);
            }
        });
        return view;
    }
}