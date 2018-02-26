package com.oudedemo.listview;
import android.app.*;
import android.os.*;
import java.util.*;
import android.widget.*;
import android.util.*;

public class CustomActivity extends Activity
{
    private List<MyList> list = new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom);
        initMylist();
        MyListAdapter myadapter = new MyListAdapter(CustomActivity.this,R.layout.mylist,list);
        ListView listView = (ListView) findViewById(R.id.customListView1);
        listView.setAdapter(myadapter);
    }

    private void initMylist()
    {
        for (int i=0;i<2;i++){
            MyList  list1 = new MyList("List1",R.drawable.ic_launcher);
            list.add(list1);
            MyList  list2 = new MyList("List2",R.drawable.ic_launcher);
            list.add(list2);
            MyList  list3 = new MyList("List3",R.drawable.ic_launcher);
            list.add(list3);
            MyList  list4 = new MyList("List4",R.drawable.ic_launcher);
            list.add(list4);
            MyList  list5 = new MyList("List5",R.drawable.ic_launcher);
            list.add(list5);
            MyList  list6 = new MyList("List6",R.drawable.ic_launcher);
            list.add(list6);
            MyList  list7 = new MyList("List7",R.drawable.ic_launcher);
            list.add(list7);
        }
    }
    
    
}
