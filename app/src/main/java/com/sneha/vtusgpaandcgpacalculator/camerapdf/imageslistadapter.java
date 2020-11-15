package com.sneha.vtusgpaandcgpacalculator.camerapdf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sneha.vtusgpaandcgpacalculator.R;

import java.util.ArrayList;

public class imageslistadapter extends BaseAdapter {

    private Context context;
    private  int layout;
    private ArrayList<savedimages> imagesList;

    public imageslistadapter(Context context, int layout, ArrayList<savedimages> imagesList) {
        this.context = context;
        this.layout = layout;
        this.imagesList = imagesList;
    }

    @Override
    public int getCount() {
        return imagesList.size();

    }

    @Override
    public Object getItem(int position) {
        return imagesList.get(position);

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        ImageView imageView;
        TextView txtName;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View row = view;
        ViewHolder holder = new ViewHolder();

        if(row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout, null);

            holder.txtName =  row.findViewById(R.id.txtName);
            holder.imageView =  row.findViewById(R.id.img);
            row.setTag(holder);
        }
        else {
            holder = (ViewHolder) row.getTag();
        }

        savedimages savedimages = imagesList.get(position);

        holder.txtName.setText(savedimages.getName());

        byte[] foodImage = savedimages.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(foodImage, 0, foodImage.length);
        holder.imageView.setImageBitmap(bitmap);

        return row;
    }
}
