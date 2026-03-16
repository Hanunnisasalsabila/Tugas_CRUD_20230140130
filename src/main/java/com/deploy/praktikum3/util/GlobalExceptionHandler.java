package com.deploy.praktikum3.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // Menangkap semua error yang dilempar menggunakan RuntimeException
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ApiResponse<Object>> handleRuntimeException(RuntimeException ex) {

        // Membungkus pesan error dari service ke dalam format ResponseUtil buatanmu
        ApiResponse<Object> response = ResponseUtil.error(ex.getMessage());

        // Mengembalikan response dengan HTTP Status 500 (Internal Server Error)
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}