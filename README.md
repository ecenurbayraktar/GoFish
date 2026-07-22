# Go Fish Oyunu – CME1212 Ödev 2

Bu Java programı, klasik Go Fish kart oyununun basitleştirilmiş bir versiyonunu tek bağlantılı liste (SLL) ve çift bağlantılı liste (DLL) veri yapılarıyla gerçekleştirmektedir. Oyun 2 oyuncu (insan vs bilgisayar) arasında 1-6 numaralı 24 kartla oynanır.

## Amaç

Oyunun amacı, aynı numaraya sahip dört kartı (kitap/book) toplayarak en fazla kitabı elde etmektir. Oyun sonunda en çok kitabı olan oyuncu kazanır.

## Oyun Kuralları

- Her oyuncuya başlangıçta 7 kart dağıtılır.
- Kalan kartlar masa destesine (SLL3) konur.
- Oyuncular sırayla, ellerindeki kartlardan bir rank (sayı) sorar:
  - Eğer karşı taraf o sayıya sahipse tüm kartları verir.
  - Eğer yoksa "Go Fish!" denir ve oyuncu masadan kart çeker.
- Aynı sayıdan 4 kart toplayan oyuncu kitap oluşturur.
- Oyun, oyunculardan birinin eli bittiğinde sona erer.
- Kazanan veya berabere sonucu ekrana yazdırılır.

## Bilgisayar Oyuncu

Bilgisayar rastgele elindeki bir sayıdan sorar. Aynı kurallar geçerlidir.

## Yüksek Skor Tablosu

- `highscoretable.txt` dosyası okunur ve çift bağlı listeyle (DLL) sıralanır.
- Eğer oyuncu kazanırsa, toplam hamle sayısına göre tabloya eklenir.
- Daha az hamlede bitiren daha üstte yer alır.
- Tablo maksimum 10 oyuncu içerir.

## Önemli Kurallar

- **Sadece kendi yazdığınız SLL ve DLL sınıflarını kullanmalısınız.**
- Java'nın hazır `Array`, `ArrayList`, `Stack`, `Queue`, `List` sınıflarını kullanmayınız.
- Sadece bağlantılı liste yapılarıyla çözüm üretilmelidir.
- Hatalar uygun şekilde yönetilmelidir.
- Anlamlı değişken adları ve yorum satırları kullanılmalıdır.

## Dosya Yapısı

- `*.java`: Oyun, SLL, DLL ve skor işlemlerine ait kaynak dosyalar
- `highscoretable.txt`: Başlangıç yüksek skor verisi

##  Programı Çalıştırma

1. Java dosyalarını derleyin:
   ```bash
   javac *.java
   ```

2. Programı çalıştırın:
   ```bash
   java Main
   ```

3. Oyunu adım adım terminalde takip edin. Oyun sonunda skor tablosu görüntülenir.

## Geliştirici

- **Ad Soyad:** Ece Nur Bayraktar
- **Kurum:** Dokuz Eylül Üniversitesi

## Teslim Bilgisi

- Ders: CME1212 – Algoritmalar ve Programlama II

## Kaynakça

- [Go Fish Oyunu Hakkında](https://cardgames.io/gofish/)
..
*This project is developed for academic purposes. Please avoid plagiarism.*
