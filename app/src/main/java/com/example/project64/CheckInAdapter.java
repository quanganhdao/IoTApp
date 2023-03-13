package com.example.project64;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project64.models.CheckIn;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class CheckInAdapter extends RecyclerView.Adapter<CheckInAdapter.CheckInViewHolder> {

    public Context context;
    public List<CheckIn> mCheckIns ;

    public CheckInAdapter(Context context, List<CheckIn> checkIns) {
        mCheckIns = checkIns;
        this.context = context;
    }

    @NonNull
    @Override
    public CheckInViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.checkin_item, parent, false);
        return new CheckInViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CheckInViewHolder holder, int position) {
        CheckIn checkIn = mCheckIns.get(position);
        holder.textId.setText(String.valueOf(checkIn.getId()) );
        holder.textUsername.setText(checkIn.getUsername());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        holder.textTime.setText(sdf.format(checkIn.getTime()));
    }

    @Override
    public int getItemCount() {
        return mCheckIns.size();
    }

    static class CheckInViewHolder extends RecyclerView.ViewHolder {
        TextView textId;
        TextView textUsername;
        TextView textTime;

        CheckInViewHolder(View itemView) {
            super(itemView);
            textId = itemView.findViewById(R.id.text_id);
            textUsername = itemView.findViewById(R.id.text_username);
            textTime = itemView.findViewById(R.id.text_time);
        }
    }


}
