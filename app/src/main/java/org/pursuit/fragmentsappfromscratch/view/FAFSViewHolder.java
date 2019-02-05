package org.pursuit.fragmentsappfromscratch.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.pursuit.fragmentsappfromscratch.DisplayActivity;
import org.pursuit.fragmentsappfromscratch.MainFragment;
import org.pursuit.fragmentsappfromscratch.R;
import org.pursuit.fragmentsappfromscratch.model.planet;

public class FAFSViewHolder extends RecyclerView.ViewHolder {
    private static TextView imageView;
    public FAFSViewHolder(@NonNull final View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.recyclced_image_view);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemView.getContext(), DisplayActivity.class);
                itemView.getContext().startActivity(intent);
            }
        });
    }

    public void onBind (planet Planet) {
        imageView.setText(Planet.getName());

    }
}
