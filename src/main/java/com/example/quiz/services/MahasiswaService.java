package com.example.quiz.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.quiz.models.Mahasiswa;

@Service
public class MahasiswaService {

    private final Map<String, Mahasiswa> mahasiswaMap = new HashMap<>();

    public MahasiswaService() {
        // data awal
        Mahasiswa m1 = new Mahasiswa("123", "John Doe");
        Mahasiswa m2 = new Mahasiswa("456", "Jane Doe");

        mahasiswaMap.put(m1.getNim(), m1);
        mahasiswaMap.put(m2.getNim(), m2);
    }

    // 1. tampilkan semua data mahasiswa
    public List<Mahasiswa> getAll() {
        return new ArrayList<>(mahasiswaMap.values());
    }

    // 2. tampilkan data mahasiswa berdasarkan nim
    public Mahasiswa getByNim(String nim) {
        return mahasiswaMap.get(nim);
    }

    // 3. tambahkan data mahasiswa
    public Mahasiswa add(Mahasiswa mahasiswa) {
        mahasiswaMap.put(mahasiswa.getNim(), mahasiswa);
        return mahasiswa;
    }

    // 4. update data mahasiswa
    public Mahasiswa update(String nim, Mahasiswa mahasiswa) {
        if (mahasiswaMap.containsKey(nim)) {
            mahasiswa.setNim(nim);
            mahasiswaMap.put(nim, mahasiswa);
            return mahasiswa;
        }
        return null;
    }

    // 5. hapus data mahasiswa
    public boolean delete(String nim) {
        return mahasiswaMap.remove(nim) != null;
    }
}