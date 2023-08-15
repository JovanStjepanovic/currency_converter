package com.example.exchangeapp;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import java.util.ArrayList;
import java.util.Locale;

public class ListAdapter extends BaseAdapter {




    public ListAdapter(Context context, ArrayList<Currencies> list) {
        this.context = context;
        this.list = list;
    }

    private Context context;
    private ArrayList<Currencies>list;
    @Override
    public int getCount() {

        return list.size();
    }




    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView( final int position, View convertView, final ViewGroup parent) {



            View row = convertView;
            Holderclass holderclass;
            if (row == null) {
                LayoutInflater inflater = LayoutInflater.from(context);
                row = inflater.inflate(R.layout.listview_item, parent, false);
                holderclass = new Holderclass();
                holderclass.text2 = row.findViewById(R.id.TextViewIDLIst);
                holderclass.text3 = row.findViewById(R.id.TextviewListFullname);
                holderclass.image3 = row.findViewById(R.id.circleImageView);
                holderclass.imageSearch=row.findViewById(R.id.ImageviewSearch);
                row.setTag(holderclass);
            } else {
                holderclass = (Holderclass) row.getTag();

            }


                Currencies currencies = list.get(position);
                holderclass.text2.setText(currencies.id);
                holderclass.text3.setText(currencies.name);
                holderclass.image3.setImageResource(currencies.image);








            return row;


        }






    public class Holderclass {
      public TextView text2,text3,TextLISt;
       public ImageView image3,imageSearch,IMageArrow;
      public EditText text4;
    public CardView cardView;

    }

}
