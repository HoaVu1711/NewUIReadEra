package com.example.newuireadera.ui.category;

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
import com.example.newuireadera.databinding.FragmentCategoryBinding;
import com.example.newuireadera.databinding.FragmentSettingBinding;
import com.example.newuireadera.ui.category.CategoryViewModel;
import com.example.newuireadera.ui.setting.SettingViewModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CategoryFragment extends Fragment {

    private CategoryViewModel categoryViewModel;
    private FragmentCategoryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        categoryViewModel =
                new ViewModelProvider(this).get(CategoryViewModel.class);

        binding = FragmentCategoryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initTabCategory();
    }

    public void initTabCategory() {
        List<String> mList = new ArrayList<>();
        mList.add("All");
        mList.add("Reading Now");
        mList.add("Favorites");
        mList.add("Have Read");
        mList.add("Collections");

        RecyclerView revTabName = binding.rcvTabCategory;
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