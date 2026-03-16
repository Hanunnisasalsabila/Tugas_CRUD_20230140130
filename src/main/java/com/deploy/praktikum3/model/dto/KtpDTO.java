package com.deploy.praktikum3.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

@Data
public class KtpDTO {

    private Integer id;
    private String nomorKtp;
    private String namaLengkap;
    private String alamat;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Jakarta")
    private Date tanggalLahir;

    private String jenisKelamin;

}
