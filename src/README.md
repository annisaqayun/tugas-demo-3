# SISTEM PEMESANAN BUKU
## Deskripsi Proyek

SISTEM PEMESANAN BUKU adalah sebuah proyek Java sederhana yang mempresentasikan sistem pemesanan buku.
Proyek ini memungkinkan pengguna untuk membuat pesanan buku dengan menyertakan informasi judul buku,
jumlah, dan harga satuan. Sistem akan mwnghitung total harga pesanan termasuk pajak sebesar 10%, serta
menampilkan rincian pesanan dan total harga yang sudah di hitung. Proyek ini cocok sebagai latihan dasar
dalam memahami konsep kelas, objek, konstruktor, metode, dan enskapsulasi dalam bahasa pemrograman Java.

## Struktur Kelas
Proyek terdiri dari dua kelas utama :
1. BookOrder - Kelas yang berfungsi untuk mendefinisikan pesanan buku, menghitung total harga pesanan, 
dan menampilkan rincian pemesanan.
2. Main - Kelas Utama yang berfungsi untuk menjalankan aplikasi dengan membuat istance "BookOrder" dan
memanggil metode untuk menampilkan rincian pesanan.

## Fitur
1. Iniliasasi pesanan - Membuat objek "BookOrder" dengan judul buku, jumlah, dan harga.
2. Perhitungan Total Harga - Menghitung total harga pesanan dengan pajak 10%
3. Tampilan Detail Pesanan - Menampilkan informasi buku, jumlah, harga satuan, dan total harga.

## Prasyarat
Pastikan Anda sudah menginstal : 

Java Development Kit (JDK) versi 8 atau lebih baru

## Cara Menjalankan Proyek
1. Kloning atau unduh repositori ini ke dalam komputer Anda.
2. Navigasi ke folder proyek melalui terminal atau Command Prompt.
3. Kompilasi program dengan menjalankan perintah berikut:
   ```bash
   javac Main.java BookOrder.java
   
## Contoh Output
Saat program dijalankan, output akan menampilkan rincian pesanan sebagai berikut:

Book Title: Learn Java

Quantity: 2

Price: 150.0

Total Price: 330.0

## Struktur Kode
Proyek ini memiliki dua kelas utama yang bekerja bersama untuk mengelola dan menampilkan informasi pesanan buku.

## 1. Kelas `BookOrder`
Kelas ini bertanggung jawab untuk menyimpan informasi tentang pesanan buku, menghitung total harga dengan pajak, dan 
menampilkan detail pesanan.

#### Atribut
- `pajak` : Konstanta yang menyimpan nilai pajak, yaitu `1.10` (10%).
- `bookTitle` : Menyimpan judul buku yang dipesan.
- `quantity` : Menyimpan jumlah buku yang dipesan.
- `price`: Menyimpan harga satuan buku.

#### Konstruktor
- `BookOrder (String bookTitle, int quantity, double price)` : Konstruktor ini menerima judul buku, jumlah, dan harga 
satuan sebagai parameter, lalu menginisialisasi atribut kelas.

#### Metode
- `calculateTotalPrice()`: Menghitung total harga pesanan termasuk pajak (harga satuan, jumlah dan pajak).
- `showOrderDetails()` : Memanggil metode privat untuk menampilkan detail pesanan dan total harga.
- `displayOrderDetails()` : (Privat) Menampilkan informasi judul buku, jumlah, dan harga satuan.
- `displayTotalPrice()` : (Privat) Menampilkan total harga pesanan setelah dihitung dengan metode `calculateTotalPrice()`.
- Getter dan Setter : 
  - `getBookTitle()` dan `setBookTitle(String bookTitle)`
  - `getQuantity()` dan `setQuantity(int quantity)`
  - `getPrice()` dan `setPrice(double price)`

  Getter dan setter digunakan untuk mengakses dan memperbarui nilai atribut, menjaga enkapsulasi.

## 2. Kelas `Main`
Kelas ini bertindak sebagai titik awal untuk menjalankan aplikasi. Pada metode `main`, sebuah objek `BookOrder` dibuat 
dengan parameter judul buku, jumlah, dan harga, lalu metode `showOrderDetails()` dipanggil untuk menampilkan rincian pesanan.

#### Metode
- `main(String[] args)` : Metode utama yang membuat instance `BookOrder` dan menampilkan detail pesanan dengan memanggil 
`showOrderDetails()`. Secara keseluruhan, struktur kode ini mengimplementasikan prinsip enkapsulasi dan abstraksi di mana 
kelas `BookOrder` menyembunyikan detail implementasi dari pengguna dan hanya menampilkan informasi yang diperlukan melalui 
metode publiknya.

## Catatan Tambahan
- Pajak saat ini ditetapkan sebesar 10% . Jika Anda ingin mengubah nilai pajak, ubah nilai konstanta pajak di dalam kelas BookOrder.
- Saat ini, metode displayOrderDetails() dan displayTotalPrice() bersifat privat dan hanya dapat dipanggil di dalam kelas BookOrder.

## Lisensi
Proyek ini bebas digunakan untuk tujuan pembelajaran. README ini mencakup deskripsi proyek, fitur, cara menjalankan, contoh
output, struktur kode, dan beberapa catatan tambahan. Informasi ini akan membantu pengguna memahami cara menggunakan proyek dan menjalankannya.
