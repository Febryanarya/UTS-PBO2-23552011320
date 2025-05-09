
# UTS Pemrograman Berorientasi Obyek 2
<ul>
  <li>Mata Kuliah: Pemrograman Berorientasi Obyek 2</li>
  <li>Dosen Pengampu: <a href="https://github.com/Muhammad-Ikhwan-Fathulloh">Muhammad Ikhwan Fathulloh</a></li>
</ul>

## Profil
<ul>
  <li>Nama: {Mochamad Arya Febryan}</li>
  <li>NIM: {23552011320}</li>
  <li>Studi Kasus: {Kasir Apotek}</li>
</ul>

## Judul Studi Kasus
<p>Kasir Apotek.</p>

## Penjelasan Studi Kasus
<p>Sistem ini dirancang untuk mengelola transaksi pembelian obat, baik menggunakan resep dokter maupun pembelian langsung tanpa resep. 
  Studi kasus ini relevan untuk skenario apotek di mana pelanggan dapat:

.Mendaftarkan data pasien.

.Melihat dan mengelola obat yang tersedia.

.Menginput resep dari dokter dan mendata detail resep.

.Melakukan transaksi pembelian, termasuk menghitung total harga obat yang dibeli.</p>

## Penjelasan 4 Pilar OOP dalam Studi Kasus

### 1. Inheritance
<p>Menyembunyikan detail implementasi dengan membungkus data dan fungsi dalam satu kelas.

Contoh:

Class PasienService, ObatService, dan TransaksiService menyimpan data dan logika dalam satu tempat.

Informasi seperti nama, umur, harga obat, dll disimpan dalam variabel yang hanya dapat diakses melalui method tertentu (getter/setter jika ditambahkan).</p>

### 2. Encapsulation
<p>Membuat hierarki antar class dengan mewariskan sifat dari class induk ke anak.

Contoh:

Abstract class TenagaMedis diwarisi oleh class Dokter dan Apoteker.

Class Dokter bisa memiliki properti dan metode umum dari TenagaMedis seperti nama, id, atau metode verifikasiResep().</p>

### 3. Polymorphism
<p>Kemampuan objek untuk mengambil banyak bentuk (method override/overload).

Contoh:

Method verifikasi() pada class TenagaMedis bisa memiliki implementasi berbeda di class Dokter dan Apoteker.</p>

### 4. Abstract
<p>Menyembunyikan kompleksitas dan hanya menampilkan fitur penting.

Contoh:

TenagaMedis dibuat sebagai abstract class yang mendefinisikan struktur dasar tenaga medis, tanpa harus tahu bagaimana Dokter atau Apoteker bekerja secara detail.

User cukup tahu bisa memanggil verifikasi() tanpa tahu cara kerjanya di belakang layar.</p>

## Demo Proyek
<ul>
  <li>Github: <a href="">Github</a></li>
  <li>Youtube: <a href="">Youtube</a></li>
</ul>
