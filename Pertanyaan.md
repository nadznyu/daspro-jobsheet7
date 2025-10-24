**Pertanyaan Percobaan 1**
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program
Percobaan 1!
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang
terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
 if (nilai > tertinggi) {
    tertinggi = nilai;
}
 if (nilai < terendah) {
    terendah = nilai;
}
4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa
mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).
Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi
dan terendah!
5. Commit dan push kode program ke Github

**Jawaban Percobaan 1**
1. Komponen perulangan FOR yaitu inisialisasi, kondisi, update
    for (int i = 1; i <= 10; i++)
    - inisialisasi (int i = 1)
    - kondisi (i <= 10)
    - update (i++)
2. Jika variabel tertinggi diinisialisasi 100, dan variabel terendah diinisialisasi 0, maka         program yang keluar akan selalu mencetak 
Nilai tertinggi: 100.0
Nilai terendah: 0.0
Sebagai contoh saya akan memasukkan nilai 80, apakah nilai 80 lebih besar dari 100? Tidak. Lalu apakah nilai 80 lebih kecil dari 0? Tidak, maka program akan mengeluarkan output seperti di atas, karena nilai 80 tidak pernah tercatat.
3. Fungsi : 
Pada blok if pertama memastikan bahwa variabel tertinggi selalu menyimpan nilai terbesar yang pernah dimasukkan hingga saat ini. Kemudian blok if kedua memastikan bahwa variabel terendah selalu menyimpan nilai terkecil yang pernah dimasukkan.
Alur kerja :
 if (nilai > tertinggi) : pada kode program yang pertama akan memeriksa apakah nilai yang baru dimasukkan lebih besar daripada nilai yang saat ini disimpan sebagai yang tertinggi (0).
 tertinggi = nilai : jika nilai baru yang dimasukkan memang lebih besar, maka variabel tertinggi diperbarui dengan nilai input yang baru.
 if (nilai < terendah) : pada kode program yang kedua ini akan memeriksa apakah nilai yang baru dimasukkan lebih kecil daripada nilai yang saat ini disimpan sebagai yang terendah (100).
 terendah = nilai : jika nilai baru yang dimasukkan memang lebih kecil, maka variabel terendah diperbarui dengan nilai input yang baru.
4. Saya menambahkan if else untuk modifikasi program


**Pertanyaan Percobaan 2**
1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
 if (nilai < 0 || nilai > 100) {
    System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
    continue;
}
a. nilai < 0 || nilai > 100
b. continue
2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya
dituliskan di awal perulangan WHILE?
3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE
akan berjalan?
4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A,
program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
5. Commit dan push kode program ke Github

**Pertanyaan Percobaan 3**
1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali
adalah “batal”, maka berapa kali perulangan dilakukan?
2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen
inisialisasi dan update?


