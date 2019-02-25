package com.company;

public class MesinKopi {
    private String JenisKopi;
    private String Topping;
    private int JumlahStokKopi;

    public void setJenisKopi(String JenisKopi){
        this.JenisKopi=JenisKopi;
    }
    public void setTopping(String Topping){

        this.Topping=Topping;
    }
    public void setJumlahStokKopi(int JumlahStokKopi){
        this.JumlahStokKopi=JumlahStokKopi;
    }
    public String getJenisKopi(){
        return JenisKopi;
    }
    public String getTopping(){
        return Topping;
    }
    public int getJumlahStokKopi(){
        return JumlahStokKopi;
    }
}


