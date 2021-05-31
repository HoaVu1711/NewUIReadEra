package com.example.newuireadera.ui.collection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newuireadera.adapter.TabMainAdpter;
import com.example.newuireadera.databinding.FragmentCollectionBinding;
import com.example.newuireadera.databinding.FragmentSettingBinding;
import com.example.newuireadera.ui.setting.SettingViewModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionFragment extends Fragment {

    private CollectionViewModel collectionViewModel;
    private FragmentCollectionBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        collectionViewModel =
                new ViewModelProvider(this).get(CollectionViewModel.class);

        binding = FragmentCollectionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initCollectionMain();
    }

    public void initCollectionMain() {
        List<String> mList = new ArrayList<>();
        mList.add("Author");
        mList.add("Series");
        mList.add("Trash");
        mList.add("Format");
        RecyclerView revTabName = binding.rcvTabCollection;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);
        revTabName.setLayoutManager(linearLayoutManager);
        TabMainAdpter adapter = new TabMainAdpter(new TabMainAdpter.IClickTab() {
            @Override
            public void onClickTabItem(int position) {

            }
        });

        adapter.setData(mList);
        revTabName.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}