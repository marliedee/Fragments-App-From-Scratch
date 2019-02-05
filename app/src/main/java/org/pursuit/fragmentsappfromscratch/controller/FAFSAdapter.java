package org.pursuit.fragmentsappfromscratch.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.fragmentsappfromscratch.R;
import org.pursuit.fragmentsappfromscratch.model.Planets;
import org.pursuit.fragmentsappfromscratch.model.planet;
import org.pursuit.fragmentsappfromscratch.view.FAFSViewHolder;

import java.util.List;

public class FAFSAdapter extends RecyclerView.Adapter<FAFSViewHolder> {

    private List<planet> imageList;
    public FAFSAdapter (List<planet> imageList) {
        this.imageList = imageList;
    }
    @Override
    public FAFSViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_view_holder, viewGroup, false);
        return new FAFSViewHolder(childView);    }

    @Override
    public void onBindViewHolder(@NonNull FAFSViewHolder fafsViewHolder, int i) {

        planet image = imageList.get(i);
        fafsViewHolder.onBind(image);

    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }
}
