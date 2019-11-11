package com.databinding.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.databinding.MainActivity;
import com.databinding.R;
import com.databinding.custom.CustomClickListener;
import com.databinding.databinding.ItemRowBinding;
import com.databinding.model.DataModel;

import java.util.ArrayList;

public class VersionRecyclerViewAdapter extends RecyclerView.Adapter<VersionRecyclerViewAdapter.VersionViewHolder> implements CustomClickListener {

    private Activity mActivity;
    private ArrayList<DataModel> mArrayList;

    public VersionRecyclerViewAdapter(MainActivity mainActivity, ArrayList<DataModel> mArrayList) {
        this.mActivity = mainActivity;
        this.mArrayList = mArrayList;
    }

    @NonNull
    @Override
    public VersionRecyclerViewAdapter.VersionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRowBinding itemRowBinding = DataBindingUtil.inflate(LayoutInflater.from(mActivity), R.layout.item_row, parent, false);
        return new VersionViewHolder(itemRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull VersionViewHolder holder, int position) {
        DataModel dataModel = mArrayList.get(position);
        holder.bind(dataModel);
        holder.itemRowBinding.setItemClickListener(this);
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    @Override
    public void cardClicked(DataModel dataModel) {
        Toast.makeText(mActivity, "You clicked " + dataModel.getAndroidVersion(),
                Toast.LENGTH_LONG).show();
    }


    class VersionViewHolder extends RecyclerView.ViewHolder {
        ItemRowBinding itemRowBinding;

        VersionViewHolder(@NonNull ItemRowBinding itemRowBinding) {
            super(itemRowBinding.getRoot());
            this.itemRowBinding = itemRowBinding;
        }

        void bind(DataModel dataModel) {
            itemRowBinding.setDataModel(dataModel);
            itemRowBinding.executePendingBindings();
        }
    }
}
