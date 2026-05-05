package com.example.quiz.models;

public class Mahasiswa {
    private String nim;
    private String nama_mahasiswa;

    // Constructor
    public Mahasiswa() {}

    public Mahasiswa(String nim, String nama_mahasiswa) {
        this.nim = nim;
        this.nama_mahasiswa = nama_mahasiswa;
    }

    // Getter & Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNamaMahasiswa() {
        return nama_mahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.nama_mahasiswa = namaMahasiswa;
    }

    // Optional: toString() untuk debugging
    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama_mahasiswa='" + nama_mahasiswa + '\'' +
                '}';
    }
}
