package com.example.exchangeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  private TextView textExchange;

  private ImageView imageList;
  private CardView cardView;
  private Button button;
 private RecyclerView recyclerView;
public static ArrayList<Currencies>list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textExchange=findViewById(R.id.Exchange);
        imageList=findViewById(R.id.Imagelist);
        recyclerView=findViewById(R.id.RecyclerView);
       list=new ArrayList<>();

        list.add(new Currencies("USD","American Dollar", R.drawable.usa,"$","1.00 = $ 1.00","1.00 = R$ 5.20","1.00 = ¥ 135.18","1.00 = kr 10.46","1.00 = J$ 153.32","1.00 = £ 0.83","1.00 = Kč 22.09","1.00 = $ 1.36","1.00 = R 18.14","1.00 = ¥6.91","1.00 = $197.97"," 1.00 = CHF0.94","1.00 = Є0.94","1.00 = $17.96"));
        list.add(new Currencies("BRL","Brazilian Real", R.drawable.brazil,"R$","1.00 = $0.19","1.00 = R$1.00","1.00 = ¥26.15","1.00 = kr2.01","1.00 = J$29.51","1.00 = £0.16","1.00 = Kč4.25","1.00 = $0.26","1.00 = R3.49","1.00 = ¥1.33","1.00 = $38.16"," 1.00 = CHF0.18","1.00 = Є0.18","1.00 = $3.46"));
        list.add(new Currencies("JPY","Japanese Yen", R.drawable.japan,"¥","1.00= $0.0073","1.00 = R$0.038","1.00 = ¥1.00","1.00 = kr0.077","1.00 = J$1.13","1.00 =  £0.0061","1.00 = Kč0.16","1.00 = $0.010","1.00 = R0.13","1.00 = ¥0.051","1.00 = $1.46"," 1.00 = CHF0.0069","1.00 = Є0.0069","1.00 = $0.13"));
        list.add(new Currencies("SEK","Swedish Krona", R.drawable.sweden,"kr","1.00 = $0.095","1.00 = R$0.59","1.00 = ¥12.99","1.00 = kr1.00","1.00 = J$14.66","1.00 = £0.079","1.00 = Kč2.11","1.00 = $0.13","1.00 = R1.74","1.00 = ¥0.66","1.00 = $18.93","1.00 = CHF0.90 ","1.00 = Є0.90","1.00 = $1.72"));
        list.add(new Currencies("JMD","Jamaican Dollar", R.drawable.jamaica," J$ ","1.00 = $0.0065","1.00 =R$ 0.034","1.00 = ¥0.89","1.00 = kr0.068","1.00 = J$1.00","1.00 = £0.0054","1.00 = Kč0.14","1.00 = $0.0089","1.00 = R0.12","1.00 = ¥0.045","1.00 =$ 1.28"," 1.00 = CHF0.0061","1.00 = Є0.0061","1.00 = $0.12"));
        list.add(new Currencies("GBP","Pound Sterling", R.drawable.gb,"£","1.00 = $1.20","1.00 = R$6.25","1.00 = ¥163.49","1.00 = kr12.58","1.00 = J$184.52","1.00 = £1.00","1.00 = Kč26.58","1.00 = $1.64","1.00 = R21.83","1.00 = ¥8.31","1.00 = $238.26","1.00 = CHF1.13 ","1.00 = Є1.13","1.00 = $21.61"));
        list.add(new Currencies("CZK","Czech Koruna", R.drawable.czechc,"Kč","1.00 = $0.045","1.00 = R$0.24","1.00 = ¥6.15","1.00 = kr0.47","1.00 = J$6.94","1.00 = £0.038","1.00 = Kč1.00","1.00 =$ 0.062","1.00 = R0.82","1.00 = ¥0.31","1.00 = $8.96"," 1.00 = CHF0.042","1.00 = Є0.043","1.00 = $0.81"));
        list.add(new Currencies("CAD","Canadian Dollar", R.drawable.canada,"$","1.00 =$ 0.74","1.00 = R$3.82","1.00 = ¥99.75","1.00 = kr7.68","1.00 = J$112.58","1.00 = £0.61","1.00 = Kč16.22","1.00 = $1.00","1.00 = R13.22","1.00 = ¥5.07","1.00 = $145.37"," 1.00 = CHF0.69","1.00 = Є0.69","1.00 = $13.19"));
        list.add(new Currencies("ZAR","South African Rand", R.drawable.soutafr,"R","1.00 = $0,055","1.00 = R$0.29","1.00 = ¥7.49","1.00 = kr0.58","1.00 = J$8.45","1.00 = £0.46","1.00 = Kč1.22","1.00 = $0.075","1.00 = R1.00","1.00 = ¥0.38","1.00 = $10.91"," 1.00 = CHF0.052","1.00 = Є0.052","1.00 = $0.99"));
        list.add(new Currencies("CNY","Chinese Yuan", R.drawable.chinaa,"¥","1.00 = $0.14","1.00 = R$0.75","1.00 =¥ 19.67","1.00 = kr1.51","1.00 = J$12.20","1.00 = £0.12","1.00 = Kč3.20","1.00 = $0.20","1.00 = R2.63","1.00 = ¥1.00","1.00 = $28.66"," 1.00 = CHF0.14","1.00 = Є0.14","1.00 = $2.60"));
        list.add(new Currencies("ARS","Argentine Peso", R.drawable.argent,"$","1.00 = $0.0051","1.00 =R$ 0.026","1.00 = ¥0.69","1.00 = kr0.053","1.00 = J$0.77","1.00 = £0.0042","1.00 = Kč0.11","1.00 = $0.0069","1.00 = R0.92","1.00 = ¥0.035","1.00 = $1.00"," 1.00 = CHF0.0047","1.00 = Є0.0047","1.00 = $0.091"));
        list.add(new Currencies("CHF","Swiss Franc", R.drawable.swiss,"CHF","1.00 = $1.07","1.00 = R$5.55","1.00 =¥ 145.12","1.00 = kr11.17","1.00 = J$163.74","1.00 = £0.89","1.00 = Kč23.59","1.00 = $1.45","1.00 = R19.38","1.00 = ¥7.38","1.00 = $210.59","1.00 = CHF1.00 ","1.00 = Є1.00","1.00 = $19.18"));
        list.add(new Currencies("EUR","Euro", R.drawable.portugal,"Є","1.00 = $1.06","1.00 =R$ 5.53","1.00 = ¥144.68","1.00 =kr 11.12","1.00 = J$163.29","1.00 = £0.88","1.00 = Kč23.52","1.00 = $1.45","1.00 = R19.29","1.00 = ¥7.36","1.00 = $210.85"," 1.00 = CHF1.00","1.00 = Є1.00","1.00 = $19.09"));
        list.add(new Currencies("MXN","Mexican Peso", R.drawable.mexo,"$","1.00 = $0.055","1.00 = R$0.29","1.00 = ¥7.57","1.00 = kr0.58","1.00 = J$8.54","1.00 = £0.046","1.00 = Kč2.23","1.00 = $0.076","1.00 = R1.01","1.00 = ¥0.38","1.00 = $11.03"," 1.00 = CHF0.052","1.00 = Є0.052","1.00 = $1.00"));




       recyclerView.setAdapter(new Rvadapter(list));
      recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));

      imageList.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent= new Intent(getApplicationContext(),Currencylist.class);

              startActivity(intent);

          }
      });








    }
}