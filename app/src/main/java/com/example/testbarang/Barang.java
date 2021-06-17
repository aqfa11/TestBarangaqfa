package com.example.testbarang;

import java.io.Serializable;

public class Barang implements Serializable {
    private String kode,nama;

    public Barang(){}

    public String getKode() {
        return kode;
    }

    public void setKode(String kd) {
        this.kode = kd;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nm) {
        this.nama = nm;
    }

    @Override
    public String toString() {
        return " " + kode + '\n' + " " + nama;
    }

    public Barang(String kd,String nm){
        kode = kd;
        nama = nm;
    }
}