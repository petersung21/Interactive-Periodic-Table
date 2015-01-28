package com.example.liam.interactiveperiodictable;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    double sum = 0;
    double[] list = {1.0079, 4.0029, 6.941, 9.0122, 10.811, 12.011, 14.007, 15.999, 18.998, 20.18,
            22.99, 24.305, 26.982, 28.086, 30.974, 32.065, 35.453, 39.948, 39.098, 40.078, 44.956,
            47.867, 50.942, 51.996, 54.938, 55.845, 58.933, 58.593, 63.546, 65.39, 69.723, 72.61,
            74.922, 78.96, 79.904, 83.8, 85.468, 87.62, 88.906, 91.224, 92.906, 95.94, 98, 101.07,
            102.91, 106.42, 107.87, 112.41, 114.82, 118.71, 121.76, 127.6, 126.9, 131.29, 132.91,
            137.33, 138.91, 140.12, 140.91, 144.24, 145, 150.36, 151.96, 157.25, 158.93, 162.5,
            164.93, 167.26, 168.93, 173.04, 174.97, 178.49, 180.95, 183.84, 186.21, 190.23, 192.22,
            195.08, 196.97, 200.59, 204.38, 207.2, 209.98, 209, 210, 222, 223, 226, 227, 232.04,
            231.04, 238.03, 237, 244, 243, 247, 247, 251, 252, 257, 258, 259, 262, 261, 262, 266,
            264, 269, 268, 271, 272, 277, 248.18, 289, 288.19, 293, 294, 294};
    int[] arrayi = new int[118];
    String[] order = new String[118];
    int ordercount = 0;
    String[] arrays =  { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl",
            "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr",
            "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "P", "Sm",
            "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn",
            "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds",
            "Rg", "Cn", "Uut", "Fl", "Uuq", "Lv", "Uus", "Uuo"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getActionBar();
        actionBar.hide();

        final TextView t = (TextView)findViewById(R.id.SumDisplay);
        final TextView s = (TextView)findViewById(R.id.FormulaDisplay);
        for(int i = 0; i<118; i++) {
            arrayi[i] = 0;
        }
        for(int i = 0; i<118; i++)
        {
            order[i]="";
        }
        Button clrNumber = (Button) findViewById(R.id.clrNumber);

        //Declaring Buttons
        Button calc1 = (Button)findViewById(R.id.button1);
        Button calc2 = (Button)findViewById(R.id.button2);
        Button calc3 = (Button)findViewById(R.id.button3);
        Button calc4 = (Button)findViewById(R.id.button4);
        Button calc5 = (Button)findViewById(R.id.button5);
        Button calc6 = (Button)findViewById(R.id.button6);
        Button calc7 = (Button)findViewById(R.id.button7);
        Button calc8 = (Button)findViewById(R.id.button8);
        Button calc9 = (Button)findViewById(R.id.button9);
        Button calc10 = (Button)findViewById(R.id.button10);
        Button calc11 = (Button)findViewById(R.id.button11);
        Button calc12 = (Button)findViewById(R.id.button12);
        Button calc13 = (Button)findViewById(R.id.button13);
        Button calc14 = (Button)findViewById(R.id.button14);
        Button calc15 = (Button)findViewById(R.id.button15);
        Button calc16 = (Button)findViewById(R.id.button16);
        Button calc17 = (Button)findViewById(R.id.button17);
        Button calc18 = (Button)findViewById(R.id.button18);
        Button calc19 = (Button)findViewById(R.id.button19);
        Button calc20 = (Button)findViewById(R.id.button20);
        Button calc21 = (Button)findViewById(R.id.button21);
        Button calc22 = (Button)findViewById(R.id.button22);
        Button calc23 = (Button)findViewById(R.id.button23);
        Button calc24 = (Button)findViewById(R.id.button24);
        Button calc25 = (Button)findViewById(R.id.button25);
        Button calc26 = (Button)findViewById(R.id.button26);
        Button calc27 = (Button)findViewById(R.id.button27);
        Button calc28 = (Button)findViewById(R.id.button28);
        Button calc29 = (Button)findViewById(R.id.button29);
        Button calc30 = (Button)findViewById(R.id.button30);
        Button calc31 = (Button)findViewById(R.id.button31);
        Button calc32 = (Button)findViewById(R.id.button32);
        Button calc33 = (Button)findViewById(R.id.button33);
        Button calc34 = (Button)findViewById(R.id.button34);
        Button calc35 = (Button)findViewById(R.id.button35);
        Button calc36 = (Button)findViewById(R.id.button36);
        Button calc37 = (Button)findViewById(R.id.button37);
        Button calc38 = (Button)findViewById(R.id.button38);
        Button calc39 = (Button)findViewById(R.id.button39);
        Button calc40 = (Button)findViewById(R.id.button40);
        Button calc41 = (Button)findViewById(R.id.button41);
        Button calc42 = (Button)findViewById(R.id.button42);
        Button calc43 = (Button)findViewById(R.id.button43);
        Button calc44 = (Button)findViewById(R.id.button44);
        Button calc45 = (Button)findViewById(R.id.button45);
        Button calc46 = (Button)findViewById(R.id.button46);
        Button calc47 = (Button)findViewById(R.id.button47);
        Button calc48 = (Button)findViewById(R.id.button48);
        Button calc49 = (Button)findViewById(R.id.button49);
        Button calc50 = (Button)findViewById(R.id.button50);
        Button calc51 = (Button)findViewById(R.id.button51);
        Button calc52 = (Button)findViewById(R.id.button52);
        Button calc53 = (Button)findViewById(R.id.button53);
        Button calc54 = (Button)findViewById(R.id.button54);
        Button calc55 = (Button)findViewById(R.id.button55);
        Button calc56 = (Button)findViewById(R.id.button56);
        Button calc57 = (Button)findViewById(R.id.button57);
        Button calc58 = (Button)findViewById(R.id.button58);
        Button calc59 = (Button)findViewById(R.id.button59);
        Button calc60 = (Button)findViewById(R.id.button60);
        Button calc61 = (Button)findViewById(R.id.button61);
        Button calc62 = (Button)findViewById(R.id.button62);
        Button calc63 = (Button)findViewById(R.id.button63);
        Button calc64 = (Button)findViewById(R.id.button64);
        Button calc65 = (Button)findViewById(R.id.button65);
        Button calc66 = (Button)findViewById(R.id.button66);
        Button calc67 = (Button)findViewById(R.id.button67);
        Button calc68 = (Button)findViewById(R.id.button68);
        Button calc69 = (Button)findViewById(R.id.button69);
        Button calc70 = (Button)findViewById(R.id.button70);
        Button calc71 = (Button)findViewById(R.id.button71);
        Button calc72 = (Button)findViewById(R.id.button72);
        Button calc73 = (Button)findViewById(R.id.button73);
        Button calc74 = (Button)findViewById(R.id.button74);
        Button calc75 = (Button)findViewById(R.id.button75);
        Button calc76 = (Button)findViewById(R.id.button76);
        Button calc77 = (Button)findViewById(R.id.button77);
        Button calc78 = (Button)findViewById(R.id.button78);
        Button calc79 = (Button)findViewById(R.id.button79);
        Button calc80 = (Button)findViewById(R.id.button80);
        Button calc81 = (Button)findViewById(R.id.button81);
        Button calc82 = (Button)findViewById(R.id.button82);
        Button calc83 = (Button)findViewById(R.id.button83);
        Button calc84 = (Button)findViewById(R.id.button84);
        Button calc85 = (Button)findViewById(R.id.button85);
        Button calc86 = (Button)findViewById(R.id.button86);
        Button calc87 = (Button)findViewById(R.id.button87);
        Button calc88 = (Button)findViewById(R.id.button88);
        Button calc89 = (Button)findViewById(R.id.button89);
        Button calc90 = (Button)findViewById(R.id.button90);
        Button calc91 = (Button)findViewById(R.id.button91);
        Button calc92 = (Button)findViewById(R.id.button92);
        Button calc93 = (Button)findViewById(R.id.button93);
        Button calc94 = (Button)findViewById(R.id.button94);
        Button calc95 = (Button)findViewById(R.id.button95);
        Button calc96 = (Button)findViewById(R.id.button96);
        Button calc97 = (Button)findViewById(R.id.button97);
        Button calc98 = (Button)findViewById(R.id.button98);
        Button calc99 = (Button)findViewById(R.id.button99);
        Button calc100 = (Button)findViewById(R.id.button100);
        Button calc101 = (Button)findViewById(R.id.button101);
        Button calc102 = (Button)findViewById(R.id.button102);
        Button calc103 = (Button)findViewById(R.id.button103);
        Button calc104 = (Button)findViewById(R.id.button104);
        Button calc105 = (Button)findViewById(R.id.button105);
        Button calc106 = (Button)findViewById(R.id.button106);
        Button calc107 = (Button)findViewById(R.id.button107);
        Button calc108 = (Button)findViewById(R.id.button108);
        Button calc109 = (Button)findViewById(R.id.button109);
        Button calc110 = (Button)findViewById(R.id.button110);
        Button calc111 = (Button)findViewById(R.id.button111);
        Button calc112 = (Button)findViewById(R.id.button112);
        Button calc113 = (Button)findViewById(R.id.button113);
        Button calc114 = (Button)findViewById(R.id.button114);
        Button calc115 = (Button)findViewById(R.id.button115);
        Button calc116 = (Button)findViewById(R.id.button116);
        Button calc117 = (Button)findViewById(R.id.button117);
        Button calc118 = (Button)findViewById(R.id.button118);

        //Button invisibility
        calc1.setVisibility(View.VISIBLE);
        calc1.setBackgroundColor(Color.TRANSPARENT);
        calc2.setVisibility(View.VISIBLE);
        calc2.setBackgroundColor(Color.TRANSPARENT);
        calc3.setVisibility(View.VISIBLE);
        calc3.setBackgroundColor(Color.TRANSPARENT);
        calc4.setVisibility(View.VISIBLE);
        calc4.setBackgroundColor(Color.TRANSPARENT);
        calc5.setVisibility(View.VISIBLE);
        calc5.setBackgroundColor(Color.TRANSPARENT);
        calc6.setVisibility(View.VISIBLE);
        calc6.setBackgroundColor(Color.TRANSPARENT);
        calc7.setVisibility(View.VISIBLE);
        calc7.setBackgroundColor(Color.TRANSPARENT);
        calc8.setVisibility(View.VISIBLE);
        calc8.setBackgroundColor(Color.TRANSPARENT);
        calc9.setVisibility(View.VISIBLE);
        calc9.setBackgroundColor(Color.TRANSPARENT);
        calc10.setVisibility(View.VISIBLE);
        calc10.setBackgroundColor(Color.TRANSPARENT);
        calc11.setVisibility(View.VISIBLE);
        calc11.setBackgroundColor(Color.TRANSPARENT);
        calc12.setVisibility(View.VISIBLE);
        calc12.setBackgroundColor(Color.TRANSPARENT);
        calc13.setVisibility(View.VISIBLE);
        calc13.setBackgroundColor(Color.TRANSPARENT);
        calc14.setVisibility(View.VISIBLE);
        calc14.setBackgroundColor(Color.TRANSPARENT);
        calc15.setVisibility(View.VISIBLE);
        calc15.setBackgroundColor(Color.TRANSPARENT);
        calc16.setVisibility(View.VISIBLE);
        calc16.setBackgroundColor(Color.TRANSPARENT);
        calc17.setVisibility(View.VISIBLE);
        calc17.setBackgroundColor(Color.TRANSPARENT);
        calc18.setVisibility(View.VISIBLE);
        calc18.setBackgroundColor(Color.TRANSPARENT);
        calc19.setVisibility(View.VISIBLE);
        calc19.setBackgroundColor(Color.TRANSPARENT);
        calc20.setVisibility(View.VISIBLE);
        calc20.setBackgroundColor(Color.TRANSPARENT);
        calc21.setVisibility(View.VISIBLE);
        calc21.setBackgroundColor(Color.TRANSPARENT);
        calc22.setVisibility(View.VISIBLE);
        calc22.setBackgroundColor(Color.TRANSPARENT);
        calc23.setVisibility(View.VISIBLE);
        calc23.setBackgroundColor(Color.TRANSPARENT);
        calc24.setVisibility(View.VISIBLE);
        calc24.setBackgroundColor(Color.TRANSPARENT);
        calc25.setVisibility(View.VISIBLE);
        calc25.setBackgroundColor(Color.TRANSPARENT);
        calc26.setVisibility(View.VISIBLE);
        calc26.setBackgroundColor(Color.TRANSPARENT);
        calc27.setVisibility(View.VISIBLE);
        calc27.setBackgroundColor(Color.TRANSPARENT);
        calc28.setVisibility(View.VISIBLE);
        calc28.setBackgroundColor(Color.TRANSPARENT);
        calc29.setVisibility(View.VISIBLE);
        calc29.setBackgroundColor(Color.TRANSPARENT);
        calc30.setVisibility(View.VISIBLE);
        calc30.setBackgroundColor(Color.TRANSPARENT);
        calc31.setVisibility(View.VISIBLE);
        calc31.setBackgroundColor(Color.TRANSPARENT);
        calc32.setVisibility(View.VISIBLE);
        calc32.setBackgroundColor(Color.TRANSPARENT);
        calc33.setVisibility(View.VISIBLE);
        calc33.setBackgroundColor(Color.TRANSPARENT);
        calc34.setVisibility(View.VISIBLE);
        calc34.setBackgroundColor(Color.TRANSPARENT);
        calc35.setVisibility(View.VISIBLE);
        calc35.setBackgroundColor(Color.TRANSPARENT);
        calc36.setVisibility(View.VISIBLE);
        calc36.setBackgroundColor(Color.TRANSPARENT);
        calc37.setVisibility(View.VISIBLE);
        calc37.setBackgroundColor(Color.TRANSPARENT);
        calc38.setVisibility(View.VISIBLE);
        calc38.setBackgroundColor(Color.TRANSPARENT);
        calc39.setVisibility(View.VISIBLE);
        calc39.setBackgroundColor(Color.TRANSPARENT);
        calc40.setVisibility(View.VISIBLE);
        calc40.setBackgroundColor(Color.TRANSPARENT);
        calc41.setVisibility(View.VISIBLE);
        calc41.setBackgroundColor(Color.TRANSPARENT);
        calc42.setVisibility(View.VISIBLE);
        calc42.setBackgroundColor(Color.TRANSPARENT);
        calc43.setVisibility(View.VISIBLE);
        calc43.setBackgroundColor(Color.TRANSPARENT);
        calc44.setVisibility(View.VISIBLE);
        calc44.setBackgroundColor(Color.TRANSPARENT);
        calc45.setVisibility(View.VISIBLE);
        calc45.setBackgroundColor(Color.TRANSPARENT);
        calc46.setVisibility(View.VISIBLE);
        calc46.setBackgroundColor(Color.TRANSPARENT);
        calc47.setVisibility(View.VISIBLE);
        calc47.setBackgroundColor(Color.TRANSPARENT);
        calc48.setVisibility(View.VISIBLE);
        calc48.setBackgroundColor(Color.TRANSPARENT);
        calc49.setVisibility(View.VISIBLE);
        calc49.setBackgroundColor(Color.TRANSPARENT);
        calc50.setVisibility(View.VISIBLE);
        calc50.setBackgroundColor(Color.TRANSPARENT);
        calc51.setVisibility(View.VISIBLE);
        calc51.setBackgroundColor(Color.TRANSPARENT);
        calc52.setVisibility(View.VISIBLE);
        calc52.setBackgroundColor(Color.TRANSPARENT);
        calc53.setVisibility(View.VISIBLE);
        calc53.setBackgroundColor(Color.TRANSPARENT);
        calc54.setVisibility(View.VISIBLE);
        calc54.setBackgroundColor(Color.TRANSPARENT);
        calc55.setVisibility(View.VISIBLE);
        calc55.setBackgroundColor(Color.TRANSPARENT);
        calc56.setVisibility(View.VISIBLE);
        calc56.setBackgroundColor(Color.TRANSPARENT);
        calc57.setVisibility(View.VISIBLE);
        calc57.setBackgroundColor(Color.TRANSPARENT);
        calc58.setVisibility(View.VISIBLE);
        calc58.setBackgroundColor(Color.TRANSPARENT);
        calc59.setVisibility(View.VISIBLE);
        calc59.setBackgroundColor(Color.TRANSPARENT);
        calc60.setVisibility(View.VISIBLE);
        calc60.setBackgroundColor(Color.TRANSPARENT);
        calc61.setVisibility(View.VISIBLE);
        calc61.setBackgroundColor(Color.TRANSPARENT);
        calc62.setVisibility(View.VISIBLE);
        calc62.setBackgroundColor(Color.TRANSPARENT);
        calc63.setVisibility(View.VISIBLE);
        calc63.setBackgroundColor(Color.TRANSPARENT);
        calc64.setVisibility(View.VISIBLE);
        calc64.setBackgroundColor(Color.TRANSPARENT);
        calc65.setVisibility(View.VISIBLE);
        calc65.setBackgroundColor(Color.TRANSPARENT);
        calc66.setVisibility(View.VISIBLE);
        calc66.setBackgroundColor(Color.TRANSPARENT);
        calc67.setVisibility(View.VISIBLE);
        calc67.setBackgroundColor(Color.TRANSPARENT);
        calc68.setVisibility(View.VISIBLE);
        calc68.setBackgroundColor(Color.TRANSPARENT);
        calc69.setVisibility(View.VISIBLE);
        calc69.setBackgroundColor(Color.TRANSPARENT);
        calc70.setVisibility(View.VISIBLE);
        calc70.setBackgroundColor(Color.TRANSPARENT);
        calc71.setVisibility(View.VISIBLE);
        calc71.setBackgroundColor(Color.TRANSPARENT);
        calc72.setVisibility(View.VISIBLE);
        calc72.setBackgroundColor(Color.TRANSPARENT);
        calc73.setVisibility(View.VISIBLE);
        calc73.setBackgroundColor(Color.TRANSPARENT);
        calc74.setVisibility(View.VISIBLE);
        calc74.setBackgroundColor(Color.TRANSPARENT);
        calc75.setVisibility(View.VISIBLE);
        calc75.setBackgroundColor(Color.TRANSPARENT);
        calc76.setVisibility(View.VISIBLE);
        calc76.setBackgroundColor(Color.TRANSPARENT);
        calc77.setVisibility(View.VISIBLE);
        calc77.setBackgroundColor(Color.TRANSPARENT);
        calc78.setVisibility(View.VISIBLE);
        calc78.setBackgroundColor(Color.TRANSPARENT);
        calc79.setVisibility(View.VISIBLE);
        calc79.setBackgroundColor(Color.TRANSPARENT);
        calc80.setVisibility(View.VISIBLE);
        calc80.setBackgroundColor(Color.TRANSPARENT);
        calc81.setVisibility(View.VISIBLE);
        calc81.setBackgroundColor(Color.TRANSPARENT);
        calc82.setVisibility(View.VISIBLE);
        calc82.setBackgroundColor(Color.TRANSPARENT);
        calc83.setVisibility(View.VISIBLE);
        calc83.setBackgroundColor(Color.TRANSPARENT);
        calc84.setVisibility(View.VISIBLE);
        calc84.setBackgroundColor(Color.TRANSPARENT);
        calc85.setVisibility(View.VISIBLE);
        calc85.setBackgroundColor(Color.TRANSPARENT);
        calc86.setVisibility(View.VISIBLE);
        calc86.setBackgroundColor(Color.TRANSPARENT);
        calc87.setVisibility(View.VISIBLE);
        calc87.setBackgroundColor(Color.TRANSPARENT);
        calc88.setVisibility(View.VISIBLE);
        calc88.setBackgroundColor(Color.TRANSPARENT);
        calc89.setVisibility(View.VISIBLE);
        calc89.setBackgroundColor(Color.TRANSPARENT);
        calc90.setVisibility(View.VISIBLE);
        calc90.setBackgroundColor(Color.TRANSPARENT);
        calc91.setVisibility(View.VISIBLE);
        calc91.setBackgroundColor(Color.TRANSPARENT);
        calc92.setVisibility(View.VISIBLE);
        calc92.setBackgroundColor(Color.TRANSPARENT);
        calc93.setVisibility(View.VISIBLE);
        calc93.setBackgroundColor(Color.TRANSPARENT);
        calc94.setVisibility(View.VISIBLE);
        calc94.setBackgroundColor(Color.TRANSPARENT);
        calc95.setVisibility(View.VISIBLE);
        calc95.setBackgroundColor(Color.TRANSPARENT);
        calc96.setVisibility(View.VISIBLE);
        calc96.setBackgroundColor(Color.TRANSPARENT);
        calc97.setVisibility(View.VISIBLE);
        calc97.setBackgroundColor(Color.TRANSPARENT);
        calc98.setVisibility(View.VISIBLE);
        calc98.setBackgroundColor(Color.TRANSPARENT);
        calc99.setVisibility(View.VISIBLE);
        calc99.setBackgroundColor(Color.TRANSPARENT);
        calc100.setVisibility(View.VISIBLE);
        calc100.setBackgroundColor(Color.TRANSPARENT);
        calc101.setVisibility(View.VISIBLE);
        calc101.setBackgroundColor(Color.TRANSPARENT);
        calc102.setVisibility(View.VISIBLE);
        calc102.setBackgroundColor(Color.TRANSPARENT);
        calc103.setVisibility(View.VISIBLE);
        calc103.setBackgroundColor(Color.TRANSPARENT);
        calc104.setVisibility(View.VISIBLE);
        calc104.setBackgroundColor(Color.TRANSPARENT);
        calc105.setVisibility(View.VISIBLE);
        calc105.setBackgroundColor(Color.TRANSPARENT);
        calc106.setVisibility(View.VISIBLE);
        calc106.setBackgroundColor(Color.TRANSPARENT);
        calc107.setVisibility(View.VISIBLE);
        calc107.setBackgroundColor(Color.TRANSPARENT);
        calc108.setVisibility(View.VISIBLE);
        calc108.setBackgroundColor(Color.TRANSPARENT);
        calc109.setVisibility(View.VISIBLE);
        calc109.setBackgroundColor(Color.TRANSPARENT);
        calc110.setVisibility(View.VISIBLE);
        calc110.setBackgroundColor(Color.TRANSPARENT);
        calc111.setVisibility(View.VISIBLE);
        calc111.setBackgroundColor(Color.TRANSPARENT);
        calc112.setVisibility(View.VISIBLE);
        calc112.setBackgroundColor(Color.TRANSPARENT);
        calc113.setVisibility(View.VISIBLE);
        calc113.setBackgroundColor(Color.TRANSPARENT);
        calc114.setVisibility(View.VISIBLE);
        calc114.setBackgroundColor(Color.TRANSPARENT);
        calc115.setVisibility(View.VISIBLE);
        calc115.setBackgroundColor(Color.TRANSPARENT);
        calc116.setVisibility(View.VISIBLE);
        calc116.setBackgroundColor(Color.TRANSPARENT);
        calc117.setVisibility(View.VISIBLE);
        calc117.setBackgroundColor(Color.TRANSPARENT);
        calc118.setVisibility(View.VISIBLE);
        calc118.setBackgroundColor(Color.TRANSPARENT);

        clrNumber.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sum = 0;
                String.format("%.2f", sum);
                t.setText(sum + "g/mol");
                s.setText("");
                for(int i = 0; i<118; i++) {
                    arrayi[i] = 0;
                }
                for(int i = 0; i<118; i++)
                {
                    order[i]="";
                }
                ordercount = 0;
            }
        });

        calc1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[0];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[0]))){
                    order[ordercount] = arrays[0];
                    ordercount++;
                }
                arrayi[0] = (arrayi[0] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[1];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[1]))){
                    order[ordercount] = arrays[1];
                    ordercount++;
                }
                arrayi[1] = (arrayi[1] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[2];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[2]))){
                    order[ordercount] = arrays[2];
                    ordercount++;
                }
                arrayi[2] = (arrayi[2] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[3];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[3]))){
                    order[ordercount] = arrays[3];
                    ordercount++;
                }
                arrayi[3] = (arrayi[3] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[4];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[4]))){
                    order[ordercount] = arrays[4];
                    ordercount++;
                }
                arrayi[4] = (arrayi[4] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[5];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[5]))){
                    order[ordercount] = arrays[5];
                    ordercount++;
                }
                arrayi[5] = (arrayi[5] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[6];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[6]))){
                    order[ordercount] = arrays[6];
                    ordercount++;
                }
                arrayi[6] = (arrayi[6] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[7];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[7]))){
                    order[ordercount] = arrays[7];
                    ordercount++;
                }
                arrayi[7] = (arrayi[7] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[8];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[8]))){
                    order[ordercount] = arrays[8];
                    ordercount++;
                }
                arrayi[8] = (arrayi[8] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[9];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[9]))){
                    order[ordercount] = arrays[9];
                    ordercount++;
                }
                arrayi[9] = (arrayi[9] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[10];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[10]))){
                    order[ordercount] = arrays[10];
                    ordercount++;
                }
                arrayi[10] = (arrayi[10] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[11];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[11]))){
                    order[ordercount] = arrays[11];
                    ordercount++;
                }
                arrayi[11] = (arrayi[11] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[12];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[12]))){
                    order[ordercount] = arrays[12];
                    ordercount++;
                }
                arrayi[12] = (arrayi[12] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc14.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[13];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[13]))){
                    order[ordercount] = arrays[13];
                    ordercount++;
                }
                arrayi[13] = (arrayi[13] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc15.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[14];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[14]))){
                    order[ordercount] = arrays[14];
                    ordercount++;
                }
                arrayi[14] = (arrayi[14] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc16.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[15];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[15]))){
                    order[ordercount] = arrays[15];
                    ordercount++;
                }
                arrayi[15] = (arrayi[15] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc17.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[16];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[16]))){
                    order[ordercount] = arrays[16];
                    ordercount++;
                }
                arrayi[16] = (arrayi[16] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc18.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[17];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[17]))){
                    order[ordercount] = arrays[17];
                    ordercount++;
                }
                arrayi[17] = (arrayi[17] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc19.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[18];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[18]))){
                    order[ordercount] = arrays[18];
                    ordercount++;
                }
                arrayi[18] = (arrayi[18] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc20.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[19];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[19]))){
                    order[ordercount] = arrays[19];
                    ordercount++;
                }
                arrayi[19] = (arrayi[19] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc21.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[20];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[20]))){
                    order[ordercount] = arrays[20];
                    ordercount++;
                }
                arrayi[20] = (arrayi[20] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc22.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[21];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[21]))){
                    order[ordercount] = arrays[21];
                    ordercount++;
                }
                arrayi[21] = (arrayi[21] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc23.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[22];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[22]))){
                    order[ordercount] = arrays[22];
                    ordercount++;
                }
                arrayi[22] = (arrayi[22] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc24.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[23];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[23]))){
                    order[ordercount] = arrays[23];
                    ordercount++;
                }
                arrayi[23] = (arrayi[23] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc25.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[24];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[24]))){
                    order[ordercount] = arrays[24];
                    ordercount++;
                }
                arrayi[24] = (arrayi[24] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc26.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[25];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[25]))){
                    order[ordercount] = arrays[25];
                    ordercount++;
                }
                arrayi[25] = (arrayi[25] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc27.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[26];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[26]))){
                    order[ordercount] = arrays[26];
                    ordercount++;
                }
                arrayi[26] = (arrayi[26] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc28.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[27];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[27]))){
                    order[ordercount] = arrays[27];
                    ordercount++;
                }
                arrayi[27] = (arrayi[27] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc29.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[28];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[28]))){
                    order[ordercount] = arrays[28];
                    ordercount++;
                }
                arrayi[28] = (arrayi[28] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc30.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[29];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[29]))){
                    order[ordercount] = arrays[29];
                    ordercount++;
                }
                arrayi[29] = (arrayi[29] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc31.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[30];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[30]))){
                    order[ordercount] = arrays[30];
                    ordercount++;
                }
                arrayi[30] = (arrayi[30] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc32.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[31];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[31]))){
                    order[ordercount] = arrays[31];
                    ordercount++;
                }
                arrayi[31] = (arrayi[31] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc33.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[32];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[32]))){
                    order[ordercount] = arrays[32];
                    ordercount++;
                }
                arrayi[32] = (arrayi[32] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc34.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[33];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[33]))){
                    order[ordercount] = arrays[33];
                    ordercount++;
                }
                arrayi[33] = (arrayi[33] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc35.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[34];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[34]))){
                    order[ordercount] = arrays[34];
                    ordercount++;
                }
                arrayi[34] = (arrayi[34] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc36.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[35];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[35]))){
                    order[ordercount] = arrays[35];
                    ordercount++;
                }
                arrayi[35] = (arrayi[35] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc37.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[36];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[36]))){
                    order[ordercount] = arrays[36];
                    ordercount++;
                }
                arrayi[36] = (arrayi[36] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc38.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[37];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[37]))){
                    order[ordercount] = arrays[37];
                    ordercount++;
                }
                arrayi[37] = (arrayi[37] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc39.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[38];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[38]))){
                    order[ordercount] = arrays[38];
                    ordercount++;
                }
                arrayi[38] = (arrayi[38] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc40.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[39];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[39]))){
                    order[ordercount] = arrays[39];
                    ordercount++;
                }
                arrayi[39] = (arrayi[39] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc41.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[40];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[40]))){
                    order[ordercount] = arrays[40];
                    ordercount++;
                }
                arrayi[40] = (arrayi[40] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc42.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[41];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[41]))){
                    order[ordercount] = arrays[41];
                    ordercount++;
                }
                arrayi[41] = (arrayi[41] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc43.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[42];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[42]))){
                    order[ordercount] = arrays[42];
                    ordercount++;
                }
                arrayi[42] = (arrayi[42] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc44.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[43];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[43]))){
                    order[ordercount] = arrays[43];
                    ordercount++;
                }
                arrayi[43] = (arrayi[43] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc45.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[44];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[44]))){
                    order[ordercount] = arrays[44];
                    ordercount++;
                }
                arrayi[44] = (arrayi[44] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc46.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[45];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[45]))){
                    order[ordercount] = arrays[45];
                    ordercount++;
                }
                arrayi[45] = (arrayi[45] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc47.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[46];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[46]))){
                    order[ordercount] = arrays[46];
                    ordercount++;
                }
                arrayi[46] = (arrayi[46] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc48.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[47];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[47]))){
                    order[ordercount] = arrays[47];
                    ordercount++;
                }
                arrayi[47] = (arrayi[47] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc49.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[48];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[48]))){
                    order[ordercount] = arrays[48];
                    ordercount++;
                }
                arrayi[48] = (arrayi[48] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc50.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[49];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[49]))){
                    order[ordercount] = arrays[49];
                    ordercount++;
                }
                arrayi[49] = (arrayi[49] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc51.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[50];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[50]))){
                    order[ordercount] = arrays[50];
                    ordercount++;
                }
                arrayi[50] = (arrayi[50] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc52.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[51];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[51]))){
                    order[ordercount] = arrays[51];
                    ordercount++;
                }
                arrayi[51] = (arrayi[51] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc53.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[52];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[52]))){
                    order[ordercount] = arrays[52];
                    ordercount++;
                }
                arrayi[52] = (arrayi[52] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc54.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[53];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[53]))){
                    order[ordercount] = arrays[53];
                    ordercount++;
                }
                arrayi[53] = (arrayi[53] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc55.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[54];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[54]))){
                    order[ordercount] = arrays[54];
                    ordercount++;
                }
                arrayi[54] = (arrayi[54] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc56.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[55];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[55]))){
                    order[ordercount] = arrays[55];
                    ordercount++;
                }
                arrayi[55] = (arrayi[55] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc57.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[56];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[56]))){
                    order[ordercount] = arrays[56];
                    ordercount++;
                }
                arrayi[56] = (arrayi[56] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc58.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[57];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[57]))){
                    order[ordercount] = arrays[57];
                    ordercount++;
                }
                arrayi[57] = (arrayi[57] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc59.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[58];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[58]))){
                    order[ordercount] = arrays[58];
                    ordercount++;
                }
                arrayi[58] = (arrayi[58] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc60.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[59];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[59]))){
                    order[ordercount] = arrays[59];
                    ordercount++;
                }
                arrayi[59] = (arrayi[59] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc61.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[60];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[60]))){
                    order[ordercount] = arrays[60];
                    ordercount++;
                }
                arrayi[60] = (arrayi[60] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc62.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[61];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[61]))){
                    order[ordercount] = arrays[61];
                    ordercount++;
                }
                arrayi[61] = (arrayi[61] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc63.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[62];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[62]))){
                    order[ordercount] = arrays[62];
                    ordercount++;
                }
                arrayi[62] = (arrayi[62] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc64.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[63];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[63]))){
                    order[ordercount] = arrays[63];
                    ordercount++;
                }
                arrayi[63] = (arrayi[63] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc65.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[64];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[64]))){
                    order[ordercount] = arrays[64];
                    ordercount++;
                }
                arrayi[64] = (arrayi[64] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc66.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[65];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[65]))){
                    order[ordercount] = arrays[65];
                    ordercount++;
                }
                arrayi[65] = (arrayi[65] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc67.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[66];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[66]))){
                    order[ordercount] = arrays[66];
                    ordercount++;
                }
                arrayi[66] = (arrayi[66] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc68.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[67];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[67]))){
                    order[ordercount] = arrays[67];
                    ordercount++;
                }
                arrayi[67] = (arrayi[67] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc69.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[68];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[68]))){
                    order[ordercount] = arrays[68];
                    ordercount++;
                }
                arrayi[68] = (arrayi[68] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc70.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[69];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[69]))){
                    order[ordercount] = arrays[69];
                    ordercount++;
                }
                arrayi[69] = (arrayi[69] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc71.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[70];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[70]))){
                    order[ordercount] = arrays[70];
                    ordercount++;
                }
                arrayi[70] = (arrayi[70] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc72.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[71];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[71]))){
                    order[ordercount] = arrays[71];
                    ordercount++;
                }
                arrayi[71] = (arrayi[71] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc73.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[72];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[72]))){
                    order[ordercount] = arrays[72];
                    ordercount++;
                }
                arrayi[72] = (arrayi[72] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc74.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[73];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[73]))){
                    order[ordercount] = arrays[73];
                    ordercount++;
                }
                arrayi[73] = (arrayi[73] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc75.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[74];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[74]))){
                    order[ordercount] = arrays[74];
                    ordercount++;
                }
                arrayi[74] = (arrayi[74] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc76.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[75];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[75]))){
                    order[ordercount] = arrays[75];
                    ordercount++;
                }
                arrayi[75] = (arrayi[75] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc77.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[76];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[76]))){
                    order[ordercount] = arrays[76];
                    ordercount++;
                }
                arrayi[76] = (arrayi[76] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc78.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[77];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[77]))){
                    order[ordercount] = arrays[77];
                    ordercount++;
                }
                arrayi[77] = (arrayi[77] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc79.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[78];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[78]))){
                    order[ordercount] = arrays[78];
                    ordercount++;
                }
                arrayi[78] = (arrayi[78] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc80.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[79];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[79]))){
                    order[ordercount] = arrays[79];
                    ordercount++;
                }
                arrayi[79] = (arrayi[79] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc81.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[80];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[80]))){
                    order[ordercount] = arrays[80];
                    ordercount++;
                }
                arrayi[80] = (arrayi[80] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc82.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[81];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[81]))){
                    order[ordercount] = arrays[81];
                    ordercount++;
                }
                arrayi[81] = (arrayi[81] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc83.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[82];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[82]))){
                    order[ordercount] = arrays[82];
                    ordercount++;
                }
                arrayi[82] = (arrayi[82] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc84.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[83];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[83]))){
                    order[ordercount] = arrays[83];
                    ordercount++;
                }
                arrayi[83] = (arrayi[83] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc85.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[84];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[84]))){
                    order[ordercount] = arrays[84];
                    ordercount++;
                }
                arrayi[84] = (arrayi[84] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc86.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[85];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[85]))){
                    order[ordercount] = arrays[85];
                    ordercount++;
                }
                arrayi[85] = (arrayi[85] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc87.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[86];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[86]))){
                    order[ordercount] = arrays[86];
                    ordercount++;
                }
                arrayi[86] = (arrayi[86] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc88.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[87];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[87]))){
                    order[ordercount] = arrays[87];
                    ordercount++;
                }
                arrayi[87] = (arrayi[87] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc89.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[88];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[88]))){
                    order[ordercount] = arrays[88];
                    ordercount++;
                }
                arrayi[88] = (arrayi[88] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc90.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[89];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[89]))){
                    order[ordercount] = arrays[89];
                    ordercount++;
                }
                arrayi[89] = (arrayi[89] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc91.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[90];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[90]))){
                    order[ordercount] = arrays[90];
                    ordercount++;
                }
                arrayi[90] = (arrayi[90] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc92.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[91];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[91]))){
                    order[ordercount] = arrays[91];
                    ordercount++;
                }
                arrayi[91] = (arrayi[91] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc93.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[92];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[92]))){
                    order[ordercount] = arrays[92];
                    ordercount++;
                }
                arrayi[92] = (arrayi[92] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc94.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[93];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[93]))){
                    order[ordercount] = arrays[93];
                    ordercount++;
                }
                arrayi[93] = (arrayi[93] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc95.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[94];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[94]))){
                    order[ordercount] = arrays[94];
                    ordercount++;
                }
                arrayi[94] = (arrayi[94] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc96.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[95];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[95]))){
                    order[ordercount] = arrays[95];
                    ordercount++;
                }
                arrayi[95] = (arrayi[95] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc97.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[96];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[96]))){
                    order[ordercount] = arrays[96];
                    ordercount++;
                }
                arrayi[96] = (arrayi[96] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc98.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[97];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[97]))){
                    order[ordercount] = arrays[97];
                    ordercount++;
                }
                arrayi[97] = (arrayi[97] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc99.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[98];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[98]))){
                    order[ordercount] = arrays[98];
                    ordercount++;
                }
                arrayi[98] = (arrayi[98] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc100.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[99];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[99]))){
                    order[ordercount] = arrays[99];
                    ordercount++;
                }
                arrayi[99] = (arrayi[99] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc101.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[100];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[100]))){
                    order[ordercount] = arrays[100];
                    ordercount++;
                }
                arrayi[100] = (arrayi[100] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc102.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[101];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[101]))){
                    order[ordercount] = arrays[101];
                    ordercount++;
                }
                arrayi[101] = (arrayi[101] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc103.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[102];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[102]))){
                    order[ordercount] = arrays[102];
                    ordercount++;
                }
                arrayi[102] = (arrayi[102] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc104.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[103];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[103]))){
                    order[ordercount] = arrays[103];
                    ordercount++;
                }
                arrayi[103] = (arrayi[103] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc105.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[104];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[104]))){
                    order[ordercount] = arrays[104];
                    ordercount++;
                }
                arrayi[104] = (arrayi[104] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc106.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[105];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[105]))){
                    order[ordercount] = arrays[105];
                    ordercount++;
                }
                arrayi[105] = (arrayi[105] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc107.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[106];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[106]))){
                    order[ordercount] = arrays[106];
                    ordercount++;
                }
                arrayi[106] = (arrayi[106] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc108.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[107];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[107]))){
                    order[ordercount] = arrays[107];
                    ordercount++;
                }
                arrayi[107] = (arrayi[107] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc109.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[108];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[108]))){
                    order[ordercount] = arrays[108];
                    ordercount++;
                }
                arrayi[108] = (arrayi[108] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc110.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[109];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[109]))){
                    order[ordercount] = arrays[109];
                    ordercount++;
                }
                arrayi[109] = (arrayi[109] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc111.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[110];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[110]))){
                    order[ordercount] = arrays[110];
                    ordercount++;
                }
                arrayi[110] = (arrayi[110] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc112.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[111];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[111]))){
                    order[ordercount] = arrays[111];
                    ordercount++;
                }
                arrayi[111] = (arrayi[111] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc113.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[112];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[112]))){
                    order[ordercount] = arrays[112];
                    ordercount++;
                }
                arrayi[112] = (arrayi[112] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc114.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[113];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[113]))){
                    order[ordercount] = arrays[113];
                    ordercount++;
                }
                arrayi[113] = (arrayi[113] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc115.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[114];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[114]))){
                    order[ordercount] = arrays[114];
                    ordercount++;
                }
                arrayi[114] = (arrayi[114] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc116.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[115];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[115]))){
                    order[ordercount] = arrays[115];
                    ordercount++;
                }
                arrayi[115] = (arrayi[115] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc117.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[116];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[116]))){
                    order[ordercount] = arrays[116];
                    ordercount++;
                }
                arrayi[116] = (arrayi[116] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });
        calc118.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sum = sum + list[117];
                String sum1 = String.format("%.2f", sum);
                t.setText(sum1 + "g/mol");
                if (!((Arrays.asList(order)).contains(arrays[117]))){
                    order[ordercount] = arrays[117];
                    ordercount++;
                }
                arrayi[117] = (arrayi[117] + 1);
                ChemicalFormula(arrayi, arrays, s, order, ordercount);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void ChemicalFormula(int[] arrayi, String[] arrays, TextView t, String[] order, int count)
    {
        t.setText("");
        String output = "";
        int location=0;

        for(int i = 0; i<count; i++) {
            for(int a = 0; a<118; a++){
                if (arrays[a]==order[i]){
                    location = a;
                }
            }
            if (arrayi[location] > 1) {
                output = output + arrays[location] + "<sub><small>" + arrayi[location] + "</small></sub>";
            }
            else if (arrayi[location] == 1){
                output = output + arrays[location];
            }
        }
        t.setText(Html.fromHtml(output));
    }
}
