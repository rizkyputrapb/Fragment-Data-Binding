package com.example.fragmenttest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmenttest.databinding.FragmentDisplayBinding;
import com.example.fragmenttest.model.Login;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

public class displayFragment extends Fragment {
    FragmentDisplayBinding binding;
    Login student;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display, container, false);
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_display, container, false);
        Bundle bundle = this.getArguments();
        student = bundle.getParcelable("student");
        binding.setLogin(student);
        return view;
    }
}