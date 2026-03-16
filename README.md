# Tugas CRUD KTP
Nama   : Hanun Nisa Salsabila

NIM    : 20230140130

Kelas  : C

## Database

**Schema:** `spring`  
**Tabel:** `ktp`

<img width="1306" height="698" alt="image" src="https://github.com/user-attachments/assets/721b4cfe-f7b8-4258-9a9f-f03aa682503c" />

## Pengujian API di Postman
### ➕ POST `/ktp` — Tambah Data KTP

**Request:**
```json
{
  "nomorKtp": "3276010410712345",
  "namaLengkap": "Jeje Pratama",
  "alamat": "Jl. Sudirman No. 99, Jakarta",
  "tanggalLahir": "2003-08-27",
  "jenisKelamin": "Laki - Laki"
}
```

**Response `200 OK`:**
```json
{
  "success": true,
    "message": "Data KTP berhasil ditambahkan!",
    "data": {
        "alamat": "Jl. Sudirman No. 99, Jakarta",
        "id": 7,
        "jenisKelamin": "Laki - Laki",
        "namaLengkap": "Jeje Pratama",
        "nomorKtp": "3276010410712345",
        "tanggalLahir": "2003-08-27"
  }
}
```
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/aaff404a-d6f7-4762-92fe-d89e92bfbf63" />

**Response Error — NIK duplikat (`500`):**
```json
{
  "success": false,
  "message": "Nomor KTP sudah ada",
  "data": null
}
```
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/0823fb2c-4c62-4f8a-aa91-ee5e229cece9" />

### 📋 GET `/ktp` — Ambil Semua Data

**Response `200 OK`:**
```json
{
  "success": true,
    "message": "Data KTP berhasil diambil!",
    "data": [
        {
            "alamat": "jl. Universitas Muhammadiyah Yogyakarta",
            "id": 4,
            "jenisKelamin": "Perempuan",
            "namaLengkap": "Hanun Nisa Salsabila",
            "nomorKtp": "3251436790900052",
            "tanggalLahir": "2005-08-27"
        },
        {
            "alamat": "Jl. Sudirman No. 99, Jakarta",
            "id": 7,
            "jenisKelamin": "Laki - Laki",
            "namaLengkap": "Jeje Pratama",
            "nomorKtp": "3276010410712345",
            "tanggalLahir": "2003-08-27"
        }
    ]
}
```
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/9fff521b-b0e5-4643-93ea-f1459172a1d3" />

### 🔍 GET `/ktp/{id}` — Ambil Data by ID

**Response `200 OK`:**
```json
{
  "success": true,
    "message": "Data KTP ditemukan!",
    "data": {
        "alamat": "Jl. Sakura No. 5, RT 02/RW 03, Kel. Sukosari, Kec. Kartoharjo, Kota Madiun",
        "id": 8,
        "jenisKelamin": "Laki-laki",
        "namaLengkap": "Yoga Prasetyo",
        "nomorKtp": "3578231706010011",
        "tanggalLahir": "1999-10-22"
    }
}
```
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/bd62fe98-c2ac-4ed1-acbd-c80a689728ba" />

**Response Error — ID tidak ditemukan:**
```json
{
  "success": false,
  "message": "Data tidak ditemukan",
  "data": null
}
```
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/07572cf8-cee3-4a18-9b05-b7b1741c865c" />

### ✏️ PUT `/ktp/{id}` — Update Data KTP

```json
{
  "nomorKtp": "3276010410712345",
  "namaLengkap": "Jeje Pratama",
  "alamat": "Jl. Sudirman No. 99, Jakarta Barat",
  "tanggalLahir": "2003-09-27",
  "jenisKelamin": "Laki - Laki"
}
```

**Response `200 OK`:**
```json
{
  "success": true,
    "message": "Data KTP berhasil diperbarui!",
    "data": {
        "alamat": "Jl. Sudirman No. 99, Jakarta Barat",
        "id": 7,
        "jenisKelamin": "Laki - Laki",
        "namaLengkap": "Jeje Pratama",
        "nomorKtp": "3276010410712345",
        "tanggalLahir": "2003-09-27"
    }
}
```
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/09915d74-1307-459e-adcb-a8f3795337c7" />

### 🗑️ DELETE `/ktp/{id}` — Hapus Data KTP

**Response `200 OK`:**
```json
{
  "success": true,
  "message": "Data KTP berhasil dihapus!",
  "data": null
}
```
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/80a38347-6cb0-4fb7-b81d-1169de4be992" />

---

## 🖥️ Screenshot Tampilan

### Halaman Utama
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/90d2fcaf-add3-4680-aa71-119e780e26d2" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/eff2af4f-2c7e-497e-b63f-198870be9a9b" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/687f6f54-503d-4622-a998-fcaf2c655929" />

### Tambah Data KTP
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/c1de0601-5976-4043-9ccd-65dfcd4302cf" />

### Data Berhasil Ditambahkan
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/f78a34c5-13c8-46da-b591-287daf39d066" />

### Edit Data KTP
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/ba7145d2-cbb9-4aee-8c46-212f4eaec30a" />

### Data Berhasil Diperbarui
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/cb58b755-af96-493f-8d3e-59f78ba5fbfe" />

### Konfirmasi Hapus
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/a90ade03-9a50-4a73-851b-cb71cd48e79e" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/ec17bbad-fce5-4bc3-9e52-d3993e0bb584" />

### Validasi Form
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/c8f007cb-b2e1-41de-87fd-49a9f1aa4329" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/2e058dfe-7715-40b1-97a8-c1d0a7d2c4a8" />
