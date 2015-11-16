package com.example.tashtash.listview;

/**
 * Created by User on 16/11/2015.
 */

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TaskListBaseAdapter extends BaseAdapter {

    public TaskListBaseAdapter(Context context, List<TaskItem> items) {
        this.items = items;
        this.context = context;
    }

    static class ViewHolder {
        TextView tv_description;
       /* TextView tv_done;*/
        ImageView img_itemImage;
    }

    private Context context;
    private List<TaskItem> items;

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        if (this.items != null && items.size() > position)
            return this.items.get(position);
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(
                    R.layout.list_view_item, null);
            holder = new ViewHolder();
            holder.tv_description = (TextView) convertView
                    .findViewById(R.id.textView_description);
            /*holder.tv_done = (TextView) convertView
                    .findViewById(R.id.textView_done);*/
            holder.img_itemImage = (ImageView) convertView
                    .findViewById(R.id.imageView1);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv_description.setText(items.get(position).getDescription());
        /*holder.tv_done.setText(String.valueOf(items.get(position).getDone()));*/
        holder.img_itemImage.setImageResource(items.get(position).getImageResource());
        return convertView;
    }

}
