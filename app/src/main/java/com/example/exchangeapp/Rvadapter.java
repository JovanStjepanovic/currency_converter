package com.example.exchangeapp;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Scanner;

public class Rvadapter extends RecyclerView.Adapter {

  private ArrayList<Currencies>list;
public static double convert;
public static double result;
 public static  int b;
  public static int c;
    public Rvadapter(ArrayList<Currencies> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



            View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_currency, parent, false);


            return new Holderclass(row);




        }






    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {



               Currencies currency = list.get(position);

               Holderclass myHolderclass = (Holderclass) holder;

               ((Holderclass) holder).ArrowBottomLeft.setImageResource(R.drawable.baseline_keyboard_arrow_left_24);
               ((Holderclass) holder).ArrowBottomRight.setImageResource(R.drawable.baseline_keyboard_arrow_right_24);
               ((Holderclass) holder).ArrowTopleft.setImageResource(R.drawable.baseline_keyboard_arrow_left_24);
               ((Holderclass) holder).ArrowTopRight.setImageResource(R.drawable.baseline_keyboard_arrow_right_24);
               ((Holderclass) holder).ConvertTO.setText("Convert To");


               ((Holderclass) holder).ID1.setText(list.get(0).id);
               ((Holderclass) holder).country1.setImageResource(R.drawable.usa);
               ((Holderclass) holder).Name1.setText(list.get(0).name);
               ((Holderclass) holder).convertRate1.setText(list.get(0).simbol + list.get(0).value1);


                   ((Holderclass) holder).ID2.setText(list.get(0).id);
                   ((Holderclass) holder).country2.setImageResource(R.drawable.usa);
                   ((Holderclass) holder).Name2.setText(list.get(0).name);
                   ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value1);

               c = 0;


               ((Holderclass) holder).ArrowTopRight.setOnClickListener(new View.OnClickListener() {


                   @Override
                   public void onClick(View v) {


                       c = c + 1;

                       if (c == 1) {

                           ((Holderclass) holder).ID1.setText(list.get(1).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.brazil);
                           ((Holderclass) holder).Name1.setText(list.get(1).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(1).simbol + list.get(1).value2);

                       } else if (c == 2) {

                           ((Holderclass) holder).ID1.setText(list.get(2).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.japan);
                           ((Holderclass) holder).Name1.setText(list.get(2).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(2).simbol + list.get(2).value3);


                       } else if (c == 3) {

                           ((Holderclass) holder).ID1.setText(list.get(3).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.sweden);
                           ((Holderclass) holder).Name1.setText(list.get(3).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(3).simbol + list.get(3).value4);

                       } else if (c == 4) {

                           ((Holderclass) holder).ID1.setText(list.get(4).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.jamaica);
                           ((Holderclass) holder).Name1.setText(list.get(4).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(4).simbol + list.get(4).value5);

                       } else if (c == 5) {

                           ((Holderclass) holder).ID1.setText(list.get(5).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.gb);
                           ((Holderclass) holder).Name1.setText(list.get(5).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(5).simbol + list.get(5).value6);

                       } else if (c == 6) {

                           ((Holderclass) holder).ID1.setText(list.get(6).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.czechc);
                           ((Holderclass) holder).Name1.setText(list.get(6).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(6).simbol + list.get(6).value7);
                       } else if (c == 7) {

                           ((Holderclass) holder).ID1.setText(list.get(7).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.canada);
                           ((Holderclass) holder).Name1.setText(list.get(7).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(7).simbol + list.get(7).value8);

                       } else if (c == 8) {

                           ((Holderclass) holder).ID1.setText(list.get(8).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.soutafr);
                           ((Holderclass) holder).Name1.setText(list.get(8).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(8).simbol + list.get(8).value9);
                       } else if (c == 9) {

                           ((Holderclass) holder).ID1.setText(list.get(9).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.chinaa);
                           ((Holderclass) holder).Name1.setText(list.get(9).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(9).simbol + list.get(9).value10);
                       } else if (c == 10) {

                           ((Holderclass) holder).ID1.setText(list.get(10).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.argent);
                           ((Holderclass) holder).Name1.setText(list.get(10).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(10).simbol + list.get(10).value11);
                       } else if (c == 11) {

                           ((Holderclass) holder).ID1.setText(list.get(11).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.swiss);
                           ((Holderclass) holder).Name1.setText(list.get(11).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(11).simbol + list.get(11).value12);
                       } else if (c == 12) {

                           ((Holderclass) holder).ID1.setText(list.get(12).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.portugal);
                           ((Holderclass) holder).Name1.setText(list.get(12).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(12).simbol + list.get(12).value13);
                       } else if (c == 13) {

                           ((Holderclass) holder).ID1.setText(list.get(13).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.mexo);
                           ((Holderclass) holder).Name1.setText(list.get(13).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(13).simbol + list.get(13).value14);

                       } else {
                           c = 13;
                       }


                   }
               });

               ((Holderclass) holder).ArrowTopleft.setOnClickListener(new View.OnClickListener() {

                   @Override
                   public void onClick(View v) {
                       c = c - 1;
                       if (c == 12) {

                           ((Holderclass) holder).ID1.setText(list.get(12).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.portugal);
                           ((Holderclass) holder).Name1.setText(list.get(12).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(12).simbol + list.get(12).value13);

                       } else if (c == 11) {

                           ((Holderclass) holder).ID1.setText(list.get(11).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.swiss);
                           ((Holderclass) holder).Name1.setText(list.get(11).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(11).simbol + list.get(11).value12);


                       } else if (c == 10) {

                           ((Holderclass) holder).ID1.setText(list.get(10).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.argent);
                           ((Holderclass) holder).Name1.setText(list.get(3).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(10).simbol + list.get(10).value11);

                       } else if (c == 9) {
                           ((Holderclass) holder).ID1.setText(list.get(9).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.chinaa);
                           ((Holderclass) holder).Name1.setText(list.get(9).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(9).simbol + list.get(9).value10);

                       } else if (c == 8) {
                           ((Holderclass) holder).ID1.setText(list.get(8).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.soutafr);
                           ((Holderclass) holder).Name1.setText(list.get(8).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(8).simbol + list.get(8).value9);

                       } else if (c == 7) {
                           ((Holderclass) holder).ID1.setText(list.get(7).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.canada);
                           ((Holderclass) holder).Name1.setText(list.get(7).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(7).simbol + list.get(7).value8);
                       } else if (c == 6) {
                           ((Holderclass) holder).ID1.setText(list.get(6).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.czechc);
                           ((Holderclass) holder).Name1.setText(list.get(6).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(6).simbol + list.get(6).value7);
                       } else if (c == 5) {
                           ((Holderclass) holder).ID1.setText(list.get(5).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.gb);
                           ((Holderclass) holder).Name1.setText(list.get(5).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(5).simbol + list.get(5).value6);
                       } else if (c == 4) {
                           ((Holderclass) holder).ID1.setText(list.get(4).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.jamaica);
                           ((Holderclass) holder).Name1.setText(list.get(4).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(4).simbol + list.get(4).value5);
                       } else if (c == 3) {
                           ((Holderclass) holder).ID1.setText(list.get(3).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.sweden);
                           ((Holderclass) holder).Name1.setText(list.get(3).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(3).simbol + list.get(3).value4);

                       } else if (c == 2) {
                           ((Holderclass) holder).ID1.setText(list.get(2).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.japan);
                           ((Holderclass) holder).Name1.setText(list.get(2).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(2).simbol + list.get(2).value3);
                       } else if (c == 1) {
                           ((Holderclass) holder).ID1.setText(list.get(1).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.brazil);
                           ((Holderclass) holder).Name1.setText(list.get(1).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(1).simbol + list.get(1).value2);
                       } else if (c == 0) {
                           ((Holderclass) holder).ID1.setText(list.get(0).id);
                           ((Holderclass) holder).country1.setImageResource(R.drawable.usa);
                           ((Holderclass) holder).Name1.setText(list.get(0).name);
                           ((Holderclass) holder).convertRate1.setText(list.get(0).simbol + list.get(0).value1);

                       } else {
                           c = 0;
                       }


                   }
               });

               b = 0;

               ((Holderclass) holder).ArrowBottomRight.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       b = b + 1;

                       if (b == 1 ) {

                           ((Holderclass) holder).ID2.setText(list.get(1).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.brazil);
                           ((Holderclass) holder).Name2.setText(list.get(1).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value2);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value2);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value2);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value2);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value2);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value2);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value2);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value2);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value2);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value2);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value2);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value2);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value2);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value2);
                           }


                       } else if (b == 2) {

                           ((Holderclass) holder).ID2.setText(list.get(2).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.japan);
                           ((Holderclass) holder).Name2.setText(list.get(2).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");

                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value3);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value3);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value3);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value3);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value3);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value3);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value3);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value3);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value3);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value3);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value3);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value3);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value3);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value3);
                           }


                       } else if (b == 3 ) {

                           ((Holderclass) holder).ID2.setText(list.get(3).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.sweden);
                           ((Holderclass) holder).Name2.setText(list.get(3).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value4);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value4);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value4);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value4);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value4);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value4);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value4);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value4);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value4);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value4);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value4);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value4);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value4);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value4);
                           }


                       } else if (b == 4 ) {

                           ((Holderclass) holder).ID2.setText(list.get(4).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.jamaica);
                           ((Holderclass) holder).Name2.setText(list.get(4).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value5);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value5);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value5);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value5);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value5);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value5);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value5);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value5);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value5);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value5);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value5);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value5);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value5);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value5);
                           }


                       } else if (b == 5 ) {

                           ((Holderclass) holder).ID2.setText(list.get(5).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.gb);
                           ((Holderclass) holder).Name2.setText(list.get(5).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value6);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value6);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value6);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value6);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value6);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value6);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value6);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value6);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value6);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value6);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value6);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value6);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value6);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value6);
                           }


                       } else if (b == 6 ) {

                           ((Holderclass) holder).ID2.setText(list.get(6).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.czechc);
                           ((Holderclass) holder).Name2.setText(list.get(6).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value7);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value7);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value7);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value7);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value7);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value7);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value7);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value7);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value7);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value7);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value7);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value7);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value7);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value7);
                           }


                       } else if (b == 7 ) {

                           ((Holderclass) holder).ID2.setText(list.get(7).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.canada);
                           ((Holderclass) holder).Name2.setText(list.get(7).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value8);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value8);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value8);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value8);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value8);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value8);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value8);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value8);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value8);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value8);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value8);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value8);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value8);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value8);
                           }


                       } else if (b == 8 ) {

                           ((Holderclass) holder).ID2.setText(list.get(8).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.soutafr);
                           ((Holderclass) holder).Name2.setText(list.get(8).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value9);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value9);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value9);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value9);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value9);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value9);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value9);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value9);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value9);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value9);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value9);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value9);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value9);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value9);
                           }


                       } else if (b == 9 ) {

                           ((Holderclass) holder).ID2.setText(list.get(9).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.chinaa);
                           ((Holderclass) holder).Name2.setText(list.get(9).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value10);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value10);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value10);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value10);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value10);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value10);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value10);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value10);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value10);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value10);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value10);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value10);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value10);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value10);
                           }


                       } else if (b == 10 ) {

                           ((Holderclass) holder).ID2.setText(list.get(10).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.argent);
                           ((Holderclass) holder).Name2.setText(list.get(10).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value11);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value11);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value11);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value11);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value11);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value11);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value11);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value11);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value11);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value11);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value11);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value11);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value11);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value11);
                           }


                       } else if (b == 11 ) {

                           ((Holderclass) holder).ID2.setText(list.get(11).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.swiss);
                           ((Holderclass) holder).Name2.setText(list.get(11).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value12);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value12);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value12);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value12);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value12);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value12);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value12);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value12);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value12);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value12);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value12);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value12);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value12);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value12);
                           }


                       } else if (b == 12 ) {

                           ((Holderclass) holder).ID2.setText(list.get(12).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.portugal);
                           ((Holderclass) holder).Name2.setText(list.get(12).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value13);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value13);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value13);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value13);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value13);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value13);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value13);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value13);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value13);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value13);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value13);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value13);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value13);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value13);
                           }


                       } else if (b == 13 ) {

                           ((Holderclass) holder).ID2.setText(list.get(13).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.mexo);
                           ((Holderclass) holder).Name2.setText(list.get(13).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value14);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value14);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value14);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value14);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value14);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value14);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value14);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value14);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value14);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value14);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value14);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value14);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value14);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value14);
                           }


                       } else {
                           b = 13;
                       }


                   }
               });

               ((Holderclass) holder).ArrowBottomLeft.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {

                       b = b - 1;
                       if (b == 12 ) {

                           ((Holderclass) holder).ID2.setText(list.get(12).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.portugal);
                           ((Holderclass) holder).Name2.setText(list.get(12).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value13);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value13);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value13);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value13);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value13);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value13);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value13);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value13);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value13);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value13);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value13);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value13);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value13);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value13);
                           }


                       } else if (b == 11 ) {

                           ((Holderclass) holder).ID2.setText(list.get(11).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.swiss);
                           ((Holderclass) holder).Name2.setText(list.get(11).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value12);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value12);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value12);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value12);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value12);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value12);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value12);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value12);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value12);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value12);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value12);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value12);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value12);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value12);
                           }


                       } else if (b == 10 ) {

                           ((Holderclass) holder).ID2.setText(list.get(10).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.argent);
                           ((Holderclass) holder).Name2.setText(list.get(3).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value11);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value11);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value11);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value11);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value11);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value11);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value11);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value11);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value11);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value11);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value11);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value11);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value11);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value11);
                           }


                       } else if (b == 9 ) {
                           ((Holderclass) holder).ID2.setText(list.get(9).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.chinaa);
                           ((Holderclass) holder).Name2.setText(list.get(9).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value10);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value10);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value10);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value10);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value10);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value10);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value10);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value10);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value10);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value10);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value10);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value10);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value10);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value10);
                           }


                       } else if (b == 8 ) {
                           ((Holderclass) holder).ID2.setText(list.get(8).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.soutafr);
                           ((Holderclass) holder).Name2.setText(list.get(8).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value9);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value9);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value9);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value9);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value9);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value9);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value9);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value9);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value9);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value9);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value9);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value9);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value9);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value9);
                           }


                       } else if (b == 7 ) {
                           ((Holderclass) holder).ID2.setText(list.get(7).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.canada);
                           ((Holderclass) holder).Name2.setText(list.get(7).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value8);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value8);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value8);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value8);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value8);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value8);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value8);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value8);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value8);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value8);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value8);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value8);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value8);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value8);
                           }


                       } else if (b == 6 ) {
                           ((Holderclass) holder).ID2.setText(list.get(6).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.czechc);
                           ((Holderclass) holder).Name2.setText(list.get(6).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value7);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value7);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value7);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value7);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value7);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value7);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value7);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value7);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value7);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value7);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value7);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value7);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value7);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value7);
                           }


                       } else if (b == 5 ) {
                           ((Holderclass) holder).ID2.setText(list.get(5).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.gb);
                           ((Holderclass) holder).Name2.setText(list.get(5).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value6);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value6);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value6);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value6);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value6);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value6);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value6);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value6);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value6);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value6);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value6);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value6);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value6);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value6);
                           }


                       } else if (b == 4 ) {
                           ((Holderclass) holder).ID2.setText(list.get(4).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.jamaica);
                           ((Holderclass) holder).Name2.setText(list.get(4).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value5);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value5);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value5);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value5);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value5);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value5);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value5);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value5);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value5);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value5);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value5);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value5);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value5);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value5);
                           }


                       } else if (b == 3 ) {
                           ((Holderclass) holder).ID2.setText(list.get(3).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.sweden);
                           ((Holderclass) holder).Name2.setText(list.get(3).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value4);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value4);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value4);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value4);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value4);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value4);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value4);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value4);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value4);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value4);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value4);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value4);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value4);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value4);
                           }


                       } else if (b == 2 ) {
                           ((Holderclass) holder).ID2.setText(list.get(2).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.japan);
                           ((Holderclass) holder).Name2.setText(list.get(2).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value3);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value3);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value3);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value3);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value3);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value3);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value3);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value2);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value3);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value3);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value3);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value3);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value3);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value3);
                           }


                       } else if (b == 1 ) {
                           ((Holderclass) holder).ID2.setText(list.get(1).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.brazil);
                           ((Holderclass) holder).Name2.setText(list.get(1).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value2);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value2);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value2);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value2);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value2);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value2);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value2);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value2);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value2);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value2);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value2);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value2);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value2);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value2);
                           }


                       } else if (b == 0 ) {
                           ((Holderclass) holder).ID2.setText(list.get(0).id);
                           ((Holderclass) holder).country2.setImageResource(R.drawable.usa);
                           ((Holderclass) holder).Name2.setText(list.get(0).name);
                           ( (Holderclass) holder).ConverResult2.setText(" Result");
                           if (c == 0) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(0).simbol + list.get(0).value1);

                           } else if (c == 1) {

                               ((Holderclass) holder).ConvertRate2.setText(list.get(1).simbol + list.get(1).value1);


                           } else if (c == 2) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(2).simbol + list.get(2).value1);
                           } else if (c == 3) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(3).simbol + list.get(3).value1);
                           } else if (c == 4) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(4).simbol + list.get(4).value1);
                           } else if (c == 5) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(5).simbol + list.get(5).value1);
                           } else if (c == 6) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(6).simbol + list.get(6).value1);
                           } else if (c == 7) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(7).simbol + list.get(7).value1);
                           } else if (c == 8) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(8).simbol + list.get(8).value1);
                           } else if (c == 9) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(9).simbol + list.get(9).value1);
                           } else if (c == 10) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(10).simbol + list.get(10).value1);
                           } else if (c == 11) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(11).simbol + list.get(11).value1);
                           } else if (c == 12) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(12).simbol + list.get(12).value1);
                           } else if (c == 13) {
                               ((Holderclass) holder).ConvertRate2.setText(list.get(13).simbol + list.get(13).value1);
                           }


                       } else {
                           b = 0;
                       }


                   }
               });


               ((Holderclass) holder).cardView.setMinimumWidth(0);
                ((Holderclass) holder).button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (b==c){
                            Toast.makeText(v.getContext(), "CURRENCIES MUST BE DIFFERENT", Toast.LENGTH_LONG).show();
                        }

                        else {

                            String pomocni = ((Holderclass) holder).enterCurrency.getText().toString();
                            convert = Double.parseDouble(pomocni);

                            Convert();
                            ( (Holderclass) holder).ConverResult2.setText(" "+result);


                        }


                    }
                });





    }



    @Override
    public int getItemCount() {
        return 1;


    }
 public class Holderclass extends RecyclerView.ViewHolder{

 public EditText enterCurrency;
 public TextView convertRate1,ConvertRate2,ID1,Name1,ID2,Name2,ConverResult2,ConvertTO;
 public ImageView ArrowTopleft,ArrowTopRight,ArrowBottomLeft,ArrowBottomRight;
  public ImageView country1,country2,TEST;
  public Button button;
  public CardView cardView;
   public Holderclass(@NonNull View itemView) {
     super(itemView);
    enterCurrency=itemView.findViewById(R.id.EdittextEnterSum);
    convertRate1=itemView.findViewById(R.id.TextviewRate);
    ID1=itemView.findViewById(R.id.TextViewNameShort);
    Name1=itemView.findViewById(R.id.TextViewNameFull);
    country1=itemView.findViewById(R.id.CircleviewFlag);

    ConvertRate2=itemView.findViewById(R.id.TextviewRate2);
    ID2=itemView.findViewById(R.id.TextViewNameShort2);
    Name2=itemView.findViewById(R.id.TextViewNameFull2);
    ConverResult2=itemView.findViewById(R.id.TextViewConversionResult);
   country2=itemView.findViewById(R.id.CircleviewFlag2);
   ConvertTO=itemView.findViewById(R.id.ConvertTO);

   ArrowTopleft=itemView.findViewById(R.id.LeftArrow);
   ArrowTopRight=itemView.findViewById(R.id.ArrowRight);

   ArrowBottomLeft=itemView.findViewById(R.id.LeftArrow2);
   ArrowBottomRight=itemView.findViewById(R.id.ArrowRight2);
       button=itemView.findViewById(R.id.ConvertButton);
       cardView = itemView.findViewById(R.id.cardView);

   }

    }




 public static void Convert(){


//S.A.D
  if (c== 0 && b==1) {
      result= convert *5.20;
  }
  else if (c== 0 && b==2) {
      result= convert *135.18;
  }
  else if (c== 0 && b==3) {
      result= convert *10.46;
  } else if (c== 0 && b==4) {
      result= convert *153.32;
  } else if (c== 0 && b==5) {
      result= convert *0.83;
  } else if (c== 0 && b==6) {
      result= convert *22.09;
  } else if (c== 0 && b==7) {
      result= convert *1.36;
  } else if (c== 0 && b==8) {
      result= convert *18.14;
  } else if (c== 0 && b==9) {
      result= convert *6.91;
  } else if (c== 0 && b==10) {
      result= convert *197.7;
  } else if (c== 0 && b==11) {
      result= convert *50.94;
  } else if (c== 0 && b==12) {
      result= convert *0.94;
  } else if (c== 0 && b==13) {
      result= convert *17.96;
  }
//BRAZIL

  else if (c== 1 && b==0) {
      result= convert *0.19;
  } else if (c== 1 && b==2) {
      result= convert *26.15;
  } else if (c== 1 && b==3) {
      result= convert *2.01;
  } else if (c== 1 && b==4) {
      result= convert *29.51;
  } else if (c== 1 && b==5) {
      result= convert *0.16;
  } else if (c== 1 && b==6) {
      result= convert *4.25;
  } else if (c== 1 && b==7) {
      result= convert *0.26;
  } else if (c== 1 && b==8) {
      result= convert *3.49;
  }
  else if (c== 1 && b==9) {
      result= convert *1.33;
  }
  else if (c== 1 && b==10) {
      result= convert *38.16;
  } else if (c== 1 && b==11) {
      result= convert *0.18;
  } else if (c== 1 && b==12) {
      result= convert *0.18;
  } else if (c== 1 && b==13) {
      result= convert *3.46;

//JAPAN

  } else if (c== 2 && b==0) {
      result= convert *0.0073;
  }
  else if (c== 2 && b==1) {
      result= convert *0.038;
  } else if (c== 2 && b==3) {
      result= convert *0.077;
  } else if (c== 2 && b==4) {
      result= convert *1.13;
  } else if (c== 2 && b==5) {
      result= convert *0.0061;
  } else if (c== 2 && b==6) {
      result= convert *0.16;
  } else if (c== 2 && b==7) {
      result= convert *0.010;
  } else if (c== 2 && b==8) {
      result= convert *0.13;
  } else if (c== 2 && b==9) {
      result= convert *0.051;
  } else if (c==2 && b==10) {
      result= convert *1.46;
  } else if (c== 2 && b==11) {
      result= convert *0.0069;
  } else if (c== 2 && b==12) {
      result= convert *0.0069;
  }
else if (c==2 && b==13){
      result= convert *0.13;
     }


  //SVEDSKA


  else if (c== 3 && b==0) {
      result= convert *0.095;
  } else if (c==3 && b==1) {
      result= convert *0.59;
  } else if (c== 3 && b==2) {
      result= convert *12.99;
  }
  else if (c== 3 && b==4) {
      result= convert *14.66;
  } else if (c== 3 && b==5) {
      result= convert *0.079;
  } else if (c== 3 && b==6) {
      result= convert *2.11;
  }
  else if (c== 3 && b==7) {
      result= convert *0.13;
  } else if (c== 3 && b==8) {
      result= convert *1.74;
  } else if (c== 3 && b==9) {
      result= convert *0.66;
  }
  else if (c== 3 && b==10) {
      result= convert *18.93;
  } else if (c== 3 && b==11) {
      result= convert *0.90;
  } else if (c== 3 && b==12) {
      result= convert *0.90;
  } else if (c==3 && b==13) {
      result= convert *1.72;
  }

   //JAMAJKA

  else if (c== 4 && b==0) {
      result= convert *0.0065;
  } else if (c==4 && b==1) {
      result= convert *0.034;
  } else if (c== 4 && b==2) {
      result= convert *0.89;
  }
  else if (c==4 && b==3) {
      result= convert *0.068;
  } else if (c== 4 && b==5) {
      result= convert *0.0054;
  } else if (c== 4 && b==6) {
      result= convert *0.14;
  }
  else if (c== 4 && b==7) {
      result= convert *0.0089;
  } else if (c== 4 && b==8) {
      result= convert *0.12;
  } else if (c== 4 && b==9) {
      result= convert *0.045;
  }
  else if (c== 4 && b==10) {
      result= convert *1.28;
  } else if (c== 4 && b==11) {
      result= convert *0.0061;
  } else if (c== 4 && b==12) {
      result= convert *0.0061;
  } else if (c==4 && b==13) {
      result= convert *0.12 ;
  }


  //U.K.
  else if (c== 5 && b==0) {
      result= convert *1.20;
  } else if (c==5 && b==1) {
      result= convert *6.25;
  } else if (c== 5 && b==2) {
      result= convert *163.49;
  }
  else if (c== 5 && b==3) {
      result= convert *12.58;
  } else if (c== 5 && b==4) {
      result= convert *184.52;
  } else if (c== 5 && b==6) {
      result= convert *26.58;
  }
  else if (c== 5 && b==7) {
      result= convert *1.64;
  } else if (c==5 && b==8) {
      result= convert *21.83;
  } else if (c== 5 && b==9) {
      result= convert *8.31;
  }
  else if (c== 5 && b==10) {
      result= convert *238.26;
  } else if (c== 5 && b==11) {
      result= convert *1.13;
  } else if (c== 5 && b==12) {
      result= convert *1.13;
  } else if (c==5 && b==13) {
      result= convert *21.61;
  }
  //CESKA
  else if (c== 6 && b==0) {
      result= convert *0.045;
  } else if (c==6 && b==1) {
      result= convert *0.24;
  } else if (c== 6 && b==2) {
      result= convert *6.15;
  }
  else if (c== 6 && b==3) {
      result= convert *0.47;
  } else if (c== 6 && b==4) {
      result= convert *6.94;
  } else if (c== 6 && b==5) {
      result= convert *0.038;
  }
  else if (c== 6 && b==7) {
      result= convert *0.062;
  } else if (c== 6 && b==8) {
      result= convert *0.82;
  } else if (c== 6 && b==9) {
      result= convert *0.31;
  }
  else if (c== 6 && b==10) {
      result= convert *8.96;
  } else if (c== 6 && b==11) {
      result= convert *0.048;
  } else if (c== 6 && b==12) {
      result= convert *0.043;
  } else if (c==6 && b==13) {
      result= convert *0.81;
  }
 //KANADA
  else if (c== 7 && b==0) {
      result= convert *0.74;
  } else if (c==7 && b==1) {
      result= convert *3.82;
  } else if (c== 7 && b==2) {
      result= convert *99.75;
  }
  else if (c== 7 && b==3) {
      result= convert *7.68;
  } else if (c== 7 && b==4) {
      result= convert *112.58;
  } else if (c== 7 && b==5) {
      result= convert *0.61;
  }
  else if (c== 7 && b==6) {
      result= convert *16.22;
  } else if (c== 7 && b==8) {
      result= convert *13.22;
  } else if (c== 7 && b==9) {
      result= convert *5.07;
  }
  else if (c== 7 && b==10) {
      result= convert *145.37;
  } else if (c== 7 && b==11) {
      result= convert *0.69;
  } else if (c== 7 && b==12) {
      result= convert *0.69;
  } else if (c==7 && b==13) {
      result= convert *13.19;
  }
   //J.A.R.
  else if (c==8 && b==0) {
      result= convert *0.055;
  } else if (c==8 && b==1) {
      result= convert *0.29;
  } else if (c== 8 && b==2) {
      result= convert *7.49;
  }
  else if (c== 8 && b==3) {
      result= convert *0.58;
  } else if (c== 8 && b==4) {
      result= convert *8.45;
  } else if (c== 8 && b==5) {
      result= convert *0.046;
  }
  else if (c== 8 && b==6) {
      result= convert *1.22;
  } else if (c== 8 && b==7) {
      result= convert *0.075;
  } else if (c== 8 && b==9) {
      result= convert *0.38;
  }
  else if (c== 8 && b==10) {
      result= convert *10.91;
  } else if (c== 8 && b==11) {
      result= convert *0.052;
  } else if (c== 8 && b==12) {
      result= convert *0.052;
  } else if (c==8 && b==13) {
      result= convert *0.99;
  }
//KINA
  else if (c== 9 && b==0) {
      result= convert *0.14;
  } else if (c==9 && b==1) {
      result= convert *0.75;
  } else if (c== 9&& b==2) {
      result= convert *19.67;
  }
  else if (c== 9 && b==3) {
      result= convert *1.51;
  } else if (c== 9 && b==4) {
      result= convert *12.20;
  } else if (c== 9 && b==5) {
      result= convert *0.12;
  }
  else if (c== 9 && b==6) {
      result= convert *3.20;
  } else if (c== 9 && b==7) {
      result= convert *0.20;
  } else if (c== 9 && b==8) {
      result= convert *2.63;
  }
  else if (c== 9 && b==10) {
      result= convert *28.66;
  } else if (c== 9 && b==11) {
      result= convert *0.14;
  } else if (c== 9 && b==12) {
      result= convert *0.14;
  } else if (c==9 && b==13) {
      result= convert *2.60;
  }
   //ARGENTINA
  else if (c== 10 && b==0) {
      result= convert *0.0051;
  } else if (c==10 && b==1) {
      result= convert *0.026;
  } else if (c== 10 && b==2) {
      result= convert *0.69;
  }
  else if (c== 10 && b==3) {
      result= convert *0.053;
  } else if (c== 10 && b==4) {
      result= convert *0.77;
  } else if (c== 10 && b==5) {
      result= convert *0.0042;
  }
  else if (c== 10 && b==6) {
      result= convert *0.11;
  } else if (c== 10 && b==7) {
      result= convert *0.0069;
  } else if (c== 10 && b==8) {
      result= convert *0.092;
  }
  else if (c== 10 && b==9) {
      result= convert *0.035;
  } else if (c== 10 && b==11) {
      result= convert *0.0047;
  } else if (c== 10 && b==12) {
      result= convert *0.0047;
  } else if (c==10 && b==13) {
      result= convert *0.091;
  }
  //SVAJCARSKA
  else if (c== 11 && b==0) {
      result= convert *1.07;
  } else if (c==11 && b==1) {
      result= convert *5.55;
  } else if (c== 11 && b==2) {
      result= convert *145.12;
  }
  else if (c== 11 && b==3) {
      result= convert *11.17;
  } else if (c== 11&& b==4) {
      result= convert *163.79;
  } else if (c== 11 && b==5) {
      result= convert *0.89;
  }
  else if (c== 11 && b==6) {
      result= convert *23.59;
  } else if (c== 11 && b==7) {
      result= convert *1.45;
  } else if (c== 11 && b==8) {
      result= convert *19.38;
  }
  else if (c== 11 && b==9) {
      result= convert *7.38;
  } else if (c== 11 && b==10) {
      result= convert *210.59;
  } else if (c== 11 && b==12) {
      result= convert *1;
  } else if (c==11 && b==13) {
      result= convert *19.18;
  }
   //PORTUGAL
  else if (c== 12 && b==0) {
      result= convert *1.06;
  } else if (c==12 && b==1) {
      result= convert *5.53;
  } else if (c== 12 && b==2) {
      result= convert *144.68;
  }
  else if (c== 12 && b==3) {
      result= convert *11.12;
  } else if (c== 12 && b==4) {
      result= convert *163.29;
  } else if (c== 12 && b==5) {
      result= convert *0.88;
  }
  else if (c== 12 && b==6) {
      result= convert *23.52;
  } else if (c== 12 && b==7) {
      result= convert *1.45;
  } else if (c== 12 && b==8) {
      result= convert *19.29;
  }
  else if (c== 12 && b==9) {
      result= convert *7.36;
  } else if (c== 12 && b==10) {
      result= convert *210.85;
  } else if (c== 12 && b==11) {
      result= convert *1;
  } else if (c==12 && b==13) {
      result= convert *19.09;
  }
// MEKSIKO
  else if (c== 13 && b==0) {
      result= convert *0.055;
  } else if (c==13 && b==1) {
      result= convert *0.29;
  } else if (c== 13 && b==2) {
      result= convert *7.57;
  } else if (c==13 && b==3) {
      result= convert *0.58;
  } else if (c== 13 && b==4) {
      result= convert *8.54;
  } else if (c== 13 && b==5) {
      result= convert *0.046;
  } else if (c== 13 && b==6) {
      result= convert *1.23;
  }
  else if (c== 13 && b==7) {
      result= convert *0.076;
  } else if (c== 13 && b==8) {
      result= convert *1.01;
  } else if (c== 13 && b==9) {
      result= convert *0.38;
  }
  else if (c==13 && b==10) {
      result= convert *11.03;
  } else if (c== 13 && b==11) {
      result= convert *0.052;
  } else if (c== 13 && b==12) {
      result= convert *0.052;
  }




    }


}
