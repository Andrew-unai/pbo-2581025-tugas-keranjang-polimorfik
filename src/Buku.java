import java.util.Locale;

public abstract class Buku {                          // DIUBAH: abstract
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() {                        // BARU: dipakai untuk link unduh
        return judul;
    }

    public int getHarga() {                           // BARU: ketentuan 4
        return harga;
    }

    public abstract int hargaAkhir();                 // DIUBAH: tidak punya isi lagi

    public abstract String keterangan();              // BARU

    public void tampilkanInfo() {                     // DIUBAH: jadi empat baris
        System.out.println(judul + " (" + penulis + ")");
        System.out.printf("  %-11s : %s%n", "Harga", formatRupiah(harga));
        System.out.printf("  %-11s : %s%n", "Keterangan", keterangan());
        System.out.printf("  %-11s : %s%n", "Harga akhir", formatRupiah(hargaAkhir()));
    }

    protected static String formatRupiah(int angka) {
        return "Rp" + String.format(Locale.US, "%,d", angka).replace(',', '.');
    }
}