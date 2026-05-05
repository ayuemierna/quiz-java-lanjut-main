package com.example.quiz.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz.models.Mahasiswa;
import com.example.quiz.services.MahasiswaService;

@RestController
@RequestMapping("mahasiswa")
public class MahasiswaController {

    private final MahasiswaService mahasiswaService;

    public MahasiswaController(MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }

    // running di http://localhost:8110/mahasiswa 
    // kerjakan bagian service dan controller 
    // model jangan dirubah 
    // kerjakan tanpa menggunakan AI 
    // hargai kemampuan diri sendiri dan junjung tinggi kejujuran 
    // nilai bukan hasil yang utama. 
    // selamat mengerjakan

    // @GetMapping()
    // 1. tampilkan semua data mahasiswa
    @GetMapping
    public List<Mahasiswa> getAll() {
        return mahasiswaService.getAll();
    }

    // @GetMapping("/{nim}")
    // 2. tampilkan data mahasiswa berdasarkan nim
    @GetMapping("/{nim}")
    public Mahasiswa getByNim(@PathVariable String nim) {
        return mahasiswaService.getByNim(nim);
    }

    // @PostMapping()
    // 3. tambahkan data mahasiswa
    @PostMapping
    public Mahasiswa add(@RequestBody Mahasiswa mahasiswa) {
        return mahasiswaService.add(mahasiswa);
    }

    // @PutMapping("/{nim}")
    // 4. update data mahasiswa
    @PutMapping("/{nim}")
    public Mahasiswa update(@PathVariable String nim,
                            @RequestBody Mahasiswa mahasiswa) {
        return mahasiswaService.update(nim, mahasiswa);
    }

    // @DeleteMapping("/{nim}")
    // 5. hapus data mahasiswa
    @DeleteMapping("/{nim}")
    public String delete(@PathVariable String nim) {
        boolean deleted = mahasiswaService.delete(nim);
        return deleted ? "Data berhasil dihapus" : "Data tidak ditemukan";
    }
}