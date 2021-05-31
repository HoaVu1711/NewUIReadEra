package com.example.newuireadera.ui.download;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.newuireadera.databinding.FragmentDownloadBinding;

public class DownlaodFragment extends Fragment {

    private DownloadViewModel downloadViewModel;
    private FragmentDownloadBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        downloadViewModel =
                new ViewModelProvider(this).get(DownloadViewModel.class);

        binding = FragmentDownloadBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}