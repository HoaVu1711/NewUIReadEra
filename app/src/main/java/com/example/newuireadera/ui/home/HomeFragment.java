package com.example.newuireadera.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newuireadera.R;
import com.example.newuireadera.adapter.ListBookAdapter;
import com.example.newuireadera.databinding.FragmentHomeBinding;
import com.example.newuireadera.adapter.TabMainAdpter;
import com.example.newuireadera.model.Book;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initTabMain();
        initBookList();
    }

    public void initTabMain() {
        List<String> mList = new ArrayList<>();
        mList.add("All");
        mList.add("Reading Now");
        mList.add("Favorites");
        mList.add("Have Read");
        mList.add("Collections");

        RecyclerView revTabName = binding.revTabMain;
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
    public void initBookList() {
        List<Book> mList = new ArrayList<>();
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        RecyclerView revTabName = binding.rcvBook;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),3);
        revTabName.setLayoutManager(gridLayoutManager);
        ListBookAdapter adapter = new ListBookAdapter();
        adapter.setData(mList);
        revTabName.setAdapter(adapter);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}