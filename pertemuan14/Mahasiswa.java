package pertemuan14;

public class Mahasiswa {
	private final String nim; // Nomor Induk Mahasiswa
    private String nama; // Nama mahasiswa
    private static int totalMahasiswa = 0; // Total mahasiswa
    public static final int MAX_SKS = 24; // Batas maksimum SKS
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++;
    }
    public void displayInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
    }
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}
