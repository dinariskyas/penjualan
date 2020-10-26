package com.example.penjualan;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.penjualan.databinding.FragmentBlankDetailBinding;
import com.example.penjualan.models.Penjualan;

public class BlankFragmentDetail extends Fragment {
    FragmentBlankDetailBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_blank_detail,container,false);
        Penjualan penjualan = requireArguments().getParcelable("penjualan");

        binding.setPenjualan(penjualan);
        return binding.getRoot();
    }
}