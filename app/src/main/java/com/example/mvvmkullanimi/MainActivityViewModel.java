package com.example.mvvmkullanimi;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private String sonuc = "0";

    public String getSonuc(){
        return sonuc;
    }

    //Side effect
    public void toplamaYap(String alinanSayi1,String alinanSayi2){
        int sayi1 = Integer.parseInt(alinanSayi1);
        int sayi2 = Integer.parseInt(alinanSayi2);

        int toplam = sayi1 + sayi2;
        sonuc = String.valueOf(toplam);
    }

    public void carpmaYap(String alinanSayi1,String alinanSayi2){
        int sayi1 = Integer.parseInt(alinanSayi1);
        int sayi2 = Integer.parseInt(alinanSayi2);

        int carpma = sayi1 * sayi2;
        sonuc = String.valueOf(carpma);
    }
}
