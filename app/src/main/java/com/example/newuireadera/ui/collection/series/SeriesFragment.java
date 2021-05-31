package com.example.newuireadera.ui.collection.series;

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

import com.example.newuireadera.R;
import com.example.newuireadera.adapter.AuthorAdapter;
import com.example.newuireadera.adapter.TabMainAdpter;
import com.example.newuireadera.databinding.FragmentAuthorBinding;
import com.example.newuireadera.databinding.FragmentSeriesBinding;
import com.example.newuireadera.model.Author;
import com.example.newuireadera.model.Series;
import com.example.newuireadera.ui.collection.author.AuthorViewModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SeriesFragment extends Fragment {

    private SeriesViewModel seriesViewModel;
    private FragmentSeriesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        seriesViewModel =
                new ViewModelProvider(this).get(SeriesViewModel.class);

        binding = FragmentSeriesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initSeries();
    }

    public void initSeries() {
        List<Series> mList = new ArrayList<>();
        mList.add(new Series(R.drawable.ic_author_tab, "Manson Mark", "1"));
        mList.add(new Series(R.drawable.ic_author_tab, "Manson Mark", "2"));
        mList.add(new Series(R.drawable.ic_author_tab, "Manson Mark", "3"));
        mList.add(new Series(R.drawable.ic_author_tab, "Manson Mark", "4"));
        mList.add(new Series(R.drawable.ic_author_tab, "Manson Mark", "5"));
        RecyclerView revAuthor = binding.rcvTabSeries;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        revAuthor.setLayoutManager(linearLayoutManager);
        AuthorAdapter adapter = new AuthorAdapter();
        adapter.setData(mList);
        revAuthor.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}