package com.oudedemo.listview;
import android.widget.*;
import android.content.*;
import java.util.*;
import android.view.*;

public class MyListAdapter extends ArrayAdapter<MyList>
{
    private int resourceId;
    public MyListAdapter(Context context, int textViewResourceId, List<MyList> objects){
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyList mylist = getItem(position); // 获取当前项的MyList实例
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.listImage = (ImageView) view.findViewById (R.id.list_image);
            viewHolder.listName = (TextView) view.findViewById (R.id.list_name);
            view.setTag(viewHolder); // 将ViewHolder存储在View中
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag(); // 重新获取ViewHolder
        }
        viewHolder.listImage.setImageResource(mylist.getImageId());
        viewHolder.listName.setText(mylist.getName());
        return view;
    }

    class ViewHolder {

        ImageView listImage;

        TextView listName;

    }
    
    
   
}
