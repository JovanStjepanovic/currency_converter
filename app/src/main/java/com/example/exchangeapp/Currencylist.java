package com.example.exchangeapp;

import static com.example.exchangeapp.MainActivity.list;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;

public class Currencylist extends Activity {

private ListView listView;
    public static String pomocni;
ArrayList<Currencies>list2;
 ArrayList<Currencies> list3,list4,list5,list6,list7,list8,list9,list10,list11,list12,list13,list14,list15,list16,list17,list18;
    private EditText editText;
   private CardView cardView;
   private ImageView arrowback,search;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        cardView = findViewById(R.id.CardviewSearch);
        editText = findViewById(R.id.EditTExtSearch);
        arrowback = findViewById(R.id.ArrowBAck);
        search = findViewById(R.id.ImageviewSearch);
        listView = findViewById(R.id.ListVIEW);
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();
        list4= new ArrayList<>();
        list5 = new ArrayList<>();
        list6 = new ArrayList<>();
                list7= new ArrayList<>();
        list8  = new ArrayList<>();
        list9=new ArrayList<>();
        list10=new ArrayList<>();
        list11=new ArrayList<>();
        list12=new ArrayList<>();
        list13=new ArrayList<>();
        list14=new ArrayList<>();
        list15=new ArrayList<>();
        list16=new ArrayList<>();
        list17= new ArrayList<>();
        list18=new ArrayList<>();

        list2.addAll(list);

        list3.add(new Currencies("BRL", "Brazilian Real", R.drawable.brazil, "R$", "1.00 = $0.19", "1.00 = R$1.00", "1.00 = ¥26.15", "1.00 = kr2.01", "1.00 = J$29.51", "1.00 = £0.16", "1.00 = Kč4.25", "1.00 = $0.26", "1.00 = R3.49", "1.00 = ¥1.33", "1.00 = $38.16", " 1.00 = CHF0.18", "1.00 = Є0.18", "1.00 = $3.46"));
        list4.add(new Currencies("JPY", "Japanese Yen", R.drawable.japan, "¥", "1.00= $0.0073", "1.00 = R$0.038", "1.00 = ¥1.00", "1.00 = kr0.077", "1.00 = J$1.13", "1.00 =  £0.0061", "1.00 = Kč0.16", "1.00 = $0.010", "1.00 = R0.13", "1.00 = ¥0.051", "1.00 = $1.46", " 1.00 = CHF0.0069", "1.00 = Є0.0069", "1.00 = $0.13"));
        list5.add(new Currencies("SEK", "Swedish Krona", R.drawable.sweden, "kr", "1.00 = $0.095", "1.00 = R$0.59", "1.00 = ¥12.99", "1.00 = kr1.00", "1.00 = J$14.66", "1.00 = £0.079", "1.00 = Kč2.11", "1.00 = $0.13", "1.00 = R1.74", "1.00 = ¥0.66", "1.00 = $18.93", "1.00 = CHF0.90 ", "1.00 = Є0.90", "1.00 = $1.72"));
        list6.add(new Currencies("JMD", "Jamaican Dollar", R.drawable.jamaica, " J$ ", "1.00 = $0.0065", "1.00 =R$ 0.034", "1.00 = ¥0.89", "1.00 = kr0.068", "1.00 = J$1.00", "1.00 = £0.0054", "1.00 = Kč0.14", "1.00 = $0.0089", "1.00 = R0.12", "1.00 = ¥0.045", "1.00 =$ 1.28", " 1.00 = CHF0.0061", "1.00 = Є0.0061", "1.00 = $0.12"));
        list7.add(new Currencies("GBP", "Pound Sterling", R.drawable.gb, "£", "1.00 = $1.20", "1.00 = R$6.25", "1.00 = ¥163.49", "1.00 = kr12.58", "1.00 = J$184.52", "1.00 = £1.00", "1.00 = Kč26.58", "1.00 = $1.64", "1.00 = R21.83", "1.00 = ¥8.31", "1.00 = $238.26", "1.00 = CHF1.13 ", "1.00 = Є1.13", "1.00 = $21.61"));
        list8.add(new Currencies("CZK", "Czech Koruna", R.drawable.czechc, "Kč", "1.00 = $0.045", "1.00 = R$0.24", "1.00 = ¥6.15", "1.00 = kr0.47", "1.00 = J$6.94", "1.00 = £0.038", "1.00 = Kč1.00", "1.00 =$ 0.062", "1.00 = R0.82", "1.00 = ¥0.31", "1.00 = $8.96", " 1.00 = CHF0.042", "1.00 = Є0.043", "1.00 = $0.81"));
        list9.add(new Currencies("CAD", "Canadian Dollar", R.drawable.canada, "$", "1.00 =$ 0.74", "1.00 = R$3.82", "1.00 = ¥99.75", "1.00 = kr7.68", "1.00 = J$112.58", "1.00 = £0.61", "1.00 = Kč16.22", "1.00 = $1.00", "1.00 = R13.22", "1.00 = ¥5.07", "1.00 = $145.37", " 1.00 = CHF0.69", "1.00 = Є0.69", "1.00 = $13.19"));
        list10.add(new Currencies("ZAR", "South African Rand", R.drawable.soutafr, "R", "1.00 = $0,055", "1.00 = R$0.29", "1.00 = ¥7.49", "1.00 = kr0.58", "1.00 = J$8.45", "1.00 = £0.46", "1.00 = Kč1.22", "1.00 = $0.075", "1.00 = R1.00", "1.00 = ¥0.38", "1.00 = $10.91", " 1.00 = CHF0.052", "1.00 = Є0.052", "1.00 = $0.99"));
        list11.add(new Currencies("CNY", "Chinese Yuan", R.drawable.chinaa, "¥", "1.00 = $0.14", "1.00 = R$0.75", "1.00 =¥ 19.67", "1.00 = kr1.51", "1.00 = J$12.20", "1.00 = £0.12", "1.00 = Kč3.20", "1.00 = $0.20", "1.00 = R2.63", "1.00 = ¥1.00", "1.00 = $28.66", " 1.00 = CHF0.14", "1.00 = Є0.14", "1.00 = $2.60"));
        list12.add(new Currencies("ARS", "Argentine Peso", R.drawable.argent, "$", "1.00 = $0.051", "1.00 =R$ 0.026", "1.00 = ¥0.69", "1.00 = kr0.053", "1.00 = J$0.77", "1.00 = £0.0042", "1.00 = Kč0.11", "1.00 = $0.0069", "1.00 = R0.92", "1.00 = ¥0.035", "1.00 = $1.00", " 1.00 = CHF0.0047", "1.00 = Є0.0047", "1.00 = $0.091"));
        list13.add(new Currencies("CHF", "Swiss Franc", R.drawable.swiss, "CHF", "1.00 = $1.07", "1.00 = R$5.55", "1.00 =¥ 145.12", "1.00 = kr11.17", "1.00 = J$163.74", "1.00 = £0.89", "1.00 = Kč23.59", "1.00 = $1.45", "1.00 = R19.38", "1.00 = ¥7.38", "1.00 = $210.59", "1.00 = CHF1.00 ", "1.00 = Є1.00", "1.00 = $19.18"));
        list14.add(new Currencies("EUR", "Euro", R.drawable.portugal, "Є", "1.00 = $1.06", "1.00 =R$ 5.53", "1.00 = ¥144.68", "1.00 =kr 11.12", "1.00 = J$163.29", "1.00 = £0.88", "1.00 = Kč23.52", "1.00 = $1.45", "1.00 = R19.29", "1.00 = ¥7.36", "1.00 = $210.85", " 1.00 = CHF1.00", "1.00 = Є1.00", "1.00 = $19.09"));
        list15.add(new Currencies("MXN", "Mexican Peso", R.drawable.mexo, "$", "1.00 = $0.055", "1.00 = R$0.29", "1.00 = ¥7.57", "1.00 = kr0.58", "1.00 = J$8.54", "1.00 = £0.046", "1.00 = Kč2.23", "1.00 = $0.076", "1.00 = R1.01", "1.00 = ¥0.38", "1.00 = $11.03", " 1.00 = CHF0.052", "1.00 = Є0.052", "1.00 = $1.00"));

        list16.add(new Currencies("USD", "American Dollar", R.drawable.usa, "$", "1.00 = $ 1.00", "1.00 = R$ 5.20", "1.00 = ¥ 135.18", "1.00 = kr 10.46", "1.00 = J$ 153.32", "1.00 = £ 0.83", "1.00 = Kč 22.09", "1.00 = $ 1.36", "1.00 = R 18.14", "1.00 = ¥6.91", "1.00 = $197.97", " 1.00 = CHF0.94", "1.00 = Є0.94", "1.00 = $17.96"));

        //Keyword Peso
        list17.add(new Currencies("MXN", "Mexican Peso", R.drawable.mexo, "$", "1.00 = $0.055", "1.00 = R$0.29", "1.00 = ¥7.57", "1.00 = kr0.58", "1.00 = J$8.54", "1.00 = £0.046", "1.00 = Kč2.23", "1.00 = $0.076", "1.00 = R1.01", "1.00 = ¥0.38", "1.00 = $11.03", " 1.00 = CHF0.052", "1.00 = Є0.052", "1.00 = $1.00"));
        list17.add(new Currencies("ARS", "Argentine Peso", R.drawable.argent, "$", "1.00 = $0.051", "1.00 =R$ 0.026", "1.00 = ¥0.69", "1.00 = kr0.053", "1.00 = J$0.77", "1.00 = £0.0042", "1.00 = Kč0.11", "1.00 = $0.0069", "1.00 = R0.92", "1.00 = ¥0.035", "1.00 = $1.00", " 1.00 = CHF0.0047", "1.00 = Є0.0047", "1.00 = $0.091"));

        //Keyword Dollar
        list18.add(new Currencies("USD", "American Dollar", R.drawable.usa, "$", "1.00 = $ 1.00", "1.00 = R$ 5.20", "1.00 = ¥ 135.18", "1.00 = kr 10.46", "1.00 = J$ 153.32", "1.00 = £ 0.83", "1.00 = Kč 22.09", "1.00 = $ 1.36", "1.00 = R 18.14", "1.00 = ¥6.91", "1.00 = $197.97", " 1.00 = CHF0.94", "1.00 = Є0.94", "1.00 = $17.96"));
        list18.add(new Currencies("JMD", "Jamaican Dollar", R.drawable.jamaica, " J$ ", "1.00 = $0.0065", "1.00 =R$ 0.034", "1.00 = ¥0.89", "1.00 = kr0.068", "1.00 = J$1.00", "1.00 = £0.0054", "1.00 = Kč0.14", "1.00 = $0.0089", "1.00 = R0.12", "1.00 = ¥0.045", "1.00 =$ 1.28", " 1.00 = CHF0.0061", "1.00 = Є0.0061", "1.00 = $0.12"));
        list18.add(new Currencies("CAD", "Canadian Dollar", R.drawable.canada, "$", "1.00 =$ 0.74", "1.00 = R$3.82", "1.00 = ¥99.75", "1.00 = kr7.68", "1.00 = J$112.58", "1.00 = £0.61", "1.00 = Kč16.22", "1.00 = $1.00", "1.00 = R13.22", "1.00 = ¥5.07", "1.00 = $145.37", " 1.00 = CHF0.69", "1.00 = Є0.69", "1.00 = $13.19"));
//POCETNI ADAPTER
        ListAdapter listAdapter1 = new ListAdapter(getApplicationContext(), list2);
    // NAKON UNOSA
        ListAdapter listAdapter2 = new ListAdapter(getApplicationContext(), list3);
        ListAdapter listAdapter3 = new ListAdapter(getApplicationContext(), list4);
        ListAdapter listAdapter4 = new ListAdapter(getApplicationContext(), list5);
        ListAdapter listAdapter5 = new ListAdapter(getApplicationContext(), list6);
        ListAdapter listAdapter6 = new ListAdapter(getApplicationContext(), list7);
        ListAdapter listAdapter7 = new ListAdapter(getApplicationContext(), list8);
        ListAdapter listAdapter8 = new ListAdapter(getApplicationContext(), list9);
        ListAdapter listAdapter9 = new ListAdapter(getApplicationContext(), list10);
        ListAdapter listAdapter10 = new ListAdapter(getApplicationContext(), list11);
        ListAdapter listAdapter11 = new ListAdapter(getApplicationContext(), list12);
        ListAdapter listAdapter12 = new ListAdapter(getApplicationContext(), list13);
        ListAdapter listAdapter13 = new ListAdapter(getApplicationContext(), list14);
        ListAdapter listAdapter14 = new ListAdapter(getApplicationContext(), list15);
        ListAdapter listAdapter15 = new ListAdapter(getApplicationContext(), list16);
        ListAdapter listAdapter16 = new ListAdapter(getApplicationContext(), list17);
        ListAdapter listAdapter17 = new ListAdapter(getApplicationContext(), list18);





        listView.setAdapter(listAdapter1);


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pomocni = editText.getText().toString();



                if (pomocni.equalsIgnoreCase("BRL") || pomocni.equalsIgnoreCase("Brazilian Real") || pomocni.equalsIgnoreCase(" Real") || pomocni.equalsIgnoreCase("Brazilian")|| pomocni.equalsIgnoreCase("Brazil")) {
                    listView.setAdapter(listAdapter2);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }
                else if (pomocni.equalsIgnoreCase("JPY" )|| pomocni.equalsIgnoreCase(" Japanese yen" ) ||pomocni.equalsIgnoreCase("Yen" ) || pomocni.equalsIgnoreCase("Japanese")|| pomocni.equalsIgnoreCase("Japan")){
                    listView.setAdapter(listAdapter3);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }

                else if (pomocni.equalsIgnoreCase("SEK" )|| pomocni.equalsIgnoreCase(" Swedish Krona " ) ||pomocni.equalsIgnoreCase("Swedish" ) ||pomocni.equalsIgnoreCase("Krona" )|| pomocni.equalsIgnoreCase("Sweden")){
                    listView.setAdapter(listAdapter4);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }

                else if (pomocni.equalsIgnoreCase("JMD" )|| pomocni.equalsIgnoreCase(" Jamaican Dollar " ) ||pomocni.equalsIgnoreCase("Jamaican" )|| pomocni.equalsIgnoreCase("Jamaica") ){
                    listView.setAdapter(listAdapter5);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }


                else if (pomocni.equalsIgnoreCase("GBP" )|| pomocni.equalsIgnoreCase(" Pound Sterling " ) ||pomocni.equalsIgnoreCase("Pound" ) || pomocni.equalsIgnoreCase("Sterling")|| pomocni.equalsIgnoreCase("UK") || pomocni.equalsIgnoreCase("Great Britain")){
                    listView.setAdapter(listAdapter6);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }

                else if (pomocni.equalsIgnoreCase("CZK" )|| pomocni.equalsIgnoreCase(" Czech Koruna " ) ||pomocni.equalsIgnoreCase("Koruna" ) || pomocni.equalsIgnoreCase("Czech") ){
                    listView.setAdapter(listAdapter7);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }

                else if (pomocni.equalsIgnoreCase("CAD" )|| pomocni.equalsIgnoreCase(" Canadian Dollar " ) ||pomocni.equalsIgnoreCase("Canadian" )|| pomocni.equalsIgnoreCase("Canada" )){
                    listView.setAdapter(listAdapter8);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }

                else if (pomocni.equalsIgnoreCase("ZAR" )|| pomocni.equalsIgnoreCase("South African Rand " ) ||pomocni.equalsIgnoreCase("Rand" ) || pomocni.equalsIgnoreCase("SouthAfrican Rand") || pomocni.equalsIgnoreCase("South African ")|| pomocni.equalsIgnoreCase("South Africa ") ||  pomocni.equalsIgnoreCase("SouthAfrica ")){
                    listView.setAdapter(listAdapter9);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }

                else if (pomocni.equalsIgnoreCase("CNY" )|| pomocni.equalsIgnoreCase("Chinese Yuan" ) ||pomocni.equalsIgnoreCase("Chinese" ) || pomocni.equalsIgnoreCase("Yuan") || pomocni.equalsIgnoreCase("China ") || pomocni.equalsIgnoreCase("Chinese ")){
                    listView.setAdapter(listAdapter10);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }

                else if (pomocni.equalsIgnoreCase("ARS" )|| pomocni.equalsIgnoreCase(" Argentine Peso " )  || pomocni.equalsIgnoreCase("Argentine")||pomocni.equalsIgnoreCase("ArgentinePeso") || pomocni.equalsIgnoreCase("Argentina ")){
                    listView.setAdapter(listAdapter11);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }

                else if (pomocni.equalsIgnoreCase("CHF" )|| pomocni.equalsIgnoreCase(" Swiss Franc " ) ||pomocni.equalsIgnoreCase(" Franc" ) || pomocni.equalsIgnoreCase("Swiss")|| pomocni.equalsIgnoreCase("Switzerland ")){
                    listView.setAdapter(listAdapter12);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }

                else if (pomocni.equalsIgnoreCase("EUR" )|| pomocni.equalsIgnoreCase(" Portugal " ) ||pomocni.equalsIgnoreCase("Euro" ) || pomocni.equalsIgnoreCase("portugaleuro")){
                    listView.setAdapter(listAdapter13);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }

                else if (pomocni.equalsIgnoreCase("MXN" )|| pomocni.equalsIgnoreCase(" Mexican Peso " ) ||pomocni.equalsIgnoreCase("Mexican" )|| pomocni.equalsIgnoreCase("MEXICO") ){
                    listView.setAdapter(listAdapter14);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }

                else if (pomocni.equalsIgnoreCase("USD") || pomocni.equalsIgnoreCase("American Dollar") || pomocni.equalsIgnoreCase("American") || pomocni.equalsIgnoreCase("USA") ){
                    listView.setAdapter(listAdapter15);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }
                else if (pomocni.equalsIgnoreCase("Peso" )){
                    listView.setAdapter(listAdapter16);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }
                else if (pomocni.equalsIgnoreCase("Dollar" )){
                    listView.setAdapter(listAdapter17);
                    Toast.makeText(Currencylist.this, "Hold search icon for full list or type in wanted currency", Toast.LENGTH_LONG).show();
                }

             else {
                    Toast.makeText(Currencylist.this, "Invalid input try again", Toast.LENGTH_SHORT).show();
                }


            }


        });

     search.setOnLongClickListener(new View.OnLongClickListener() {
         @Override
         public boolean onLongClick(View v) {


            listView.setAdapter(listAdapter1);


             return true;
         }
     });


     arrowback.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             onBackPressed();
         }
     });





    }



}
