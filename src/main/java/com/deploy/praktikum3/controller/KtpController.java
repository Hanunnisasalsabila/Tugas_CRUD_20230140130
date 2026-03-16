package com.deploy.praktikum3.controller;

import com.deploy.praktikum3.model.dto.KtpDTO;
import com.deploy.praktikum3.service.KtpService;
import com.deploy.praktikum3.util.ApiResponse;
import com.deploy.praktikum3.util.ResponseUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ktp")
@CrossOrigin
public class KtpController {

    private final KtpService service;

    public KtpController(KtpService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<KtpDTO>> create(@RequestBody KtpDTO dto) {
        KtpDTO result = service.create(dto);
        return ResponseEntity.ok(ResponseUtil.success("Data KTP berhasil ditambahkan!", result));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<KtpDTO>>> getAll() {
        List<KtpDTO> result = service.findAll();
        return ResponseEntity.ok(ResponseUtil.success("Data KTP berhasil diambil!", result));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<KtpDTO>> getById(@PathVariable Integer id) {
        KtpDTO result = service.findById(id);
        return ResponseEntity.ok(ResponseUtil.success("Data KTP ditemukan!", result));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<KtpDTO>> update(@PathVariable Integer id, @RequestBody KtpDTO dto) {
        KtpDTO result = service.update(id, dto);
        return ResponseEntity.ok(ResponseUtil.success("Data KTP berhasil diperbarui!", result));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.ok(ResponseUtil.success("Data KTP berhasil dihapus!"));
    }
}