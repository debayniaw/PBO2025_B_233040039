package pertemuan14;

public class TestMahasiswa {
	public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("123456", "Alice");
        Mahasiswa m2 = new Mahasiswa("654321", "Bob");
        m1.displayInfo();
        m2.displayInfo();
        System.out.println("Total Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}
