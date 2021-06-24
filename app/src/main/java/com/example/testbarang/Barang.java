package com.example.testbarang;

import java.io.Serializable;

public class Barang implements Serializable {
    private String kode,nama,id;

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
        return "Barang{" +
                ", nama='" + nama + '\n'+
                ", kode='" + kode + '\n' +
                "id='" + id + '\n' +
                '}';
    }

    public Barang(String kd,String nm){
        kode = kd;
        nama = nm;
    }

    public String getId(){return id;}
    public void setId(String id){this.id = id;}
}