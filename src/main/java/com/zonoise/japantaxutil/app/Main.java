package com.zonoise.japantaxutil.app;
import 住宅ローン.元利均等返済;

import java.util.ArrayList;
import java.util.stream.IntStream;

import static java.lang.System.out;
/**
 * Created by zonoise on 2017/11/22.
 */
public class Main {
    public static void main(String[] args){

        ArrayList<元利均等返済.month> monthArrayList = new ArrayList<元利均等返済.month>(200);

        out.print("aaa");
        元利均等返済 hensai = new 元利均等返済(500*10000,0.01,5*10000);

            do{
                元利均等返済.month m = hensai.run();
                monthArrayList.add(m);
                hensai.set借入金(hensai.get借入金() - m.get返済元金());
            }while(hensai.get借入金() > 0);



        monthArrayList.forEach(m -> {
            out.print(m.get返済元金());
            out.print('\t');

            out.print(m.get返済利息());
            out.print('\t');

            out.print(m.get返済前借入金残高());
            out.print('\t');

            out.print(m.get返済後借入金残高());
            out.print('\n');
        });
    }
}
