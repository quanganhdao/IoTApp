package com.example.project64;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.project64.databinding.FragmentFirstBinding;
import com.example.project64.models.CheckIn;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private CheckInAdapter checkInAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        checkInAdapter = new CheckInAdapter(getActivity().getApplicationContext(), getFakeCheckIns());
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        binding.recyclerView.setAdapter(checkInAdapter);



        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public List<CheckIn> getFakeCheckIns() {
        List<CheckIn> checkIns = new ArrayList<>();

        checkIns.add(new CheckIn(1, "user1", new Date()));
        checkIns.add(new CheckIn(2, "user2", new Date()));
        checkIns.add(new CheckIn(3, "user3", new Date()));
        checkIns.add(new CheckIn(4, "user4", new Date()));
        checkIns.add(new CheckIn(5, "user5", new Date()));

        return checkIns;
    }

}