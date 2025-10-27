Nama : I Kadek Wira Atmaja
NIM : 2401020003
Matkul : PBO

Jawaban Soal UTS :  
- Class adalah cetak biru (rancangan) yang mendefinisikan atribut dan perilaku. 
Object adalah wujud nyata dari class tersebut.
Contoh: Course adalah class yang punya atribut courseName, credit, dan instructorName. 
Sedangkan Course c1 = new Course("Java", 3, "Pak Andi"); adalah object nyata dari class Course.


- Tambahkan validasi di setCredit agar nilai tidak negatif (misal jika < 0 maka jadi 0). Encapsulation penting karena melindungi data, menjaga konsistensi, dan mencegah perubahan sembarangan.


- Class Student: Akan memiliki atribut seperti name, studentId, dan sebuah daftar (list) dari Course.

    Class Course: Akan memiliki atribut seperti courseName, credit, dan instructorName.
    
    Hubungan (Relationship):
      
  - Akan ada sebuah garis lurus yang menghubungkan class Student dan class Course.
  - Di ujung garis yang menempel pada class Student, akan ada simbol belah ketupat kosong (diamond putih).
  - Simbol ini menandakan hubungan Aggregation, yang berarti Student "memiliki" Course, tetapi Course memiliki siklus hidup yang independen (jika Student dihapus, Course tidak ikut terhapus).

- Soal 4 Sudah ada di Code

- Abstract Class: Gunakan saat mendefinisikan template dasar untuk sekumpulan class yang saling berhubungan erat ("is-a") dan Anda ingin berbagi implementasi kode dan atribut.

    Interface: Gunakan saat mendefinisikan sebuah "kontrak" atau kemampuan ("can-do") yang harus dipenuhi oleh class manapun, terutama jika class tersebut tidak saling berhubungan, dan Anda ingin mengizinkan pewarisan ganda kemampuan.