package com.oudedemo.listview;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.util.*;
import android.content.*;

public class MainActivity extends Activity 
{
    /*字符串数组类型用于存储列表展示的数据    */
    private String[] data= {"自定义列表","列表2","列表3","列表4","列表5","列表6","列表7","列表8","列表9","列表10","列表11","列表12"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /* 列表适配器   */
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listview = (ListView) findViewById(R.id.mainListView1);
        listview.setAdapter(adapter);
        /*  列表点击事件  */
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){

                @Override
                public void onItemClick(AdapterView<?> p1, View p2, int p3, long p4)
                {
                    
                    switch(p3){
                        case 0:
                             Intent intent = new Intent();
                             intent.setClass(MainActivity.this,CustomActivity.class);
                             startActivity(intent);
                        break;
                        default:
                        break;
                    }
                }
            });
       
    }
}
