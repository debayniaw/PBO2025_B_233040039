package Pertemuan5;

public class Matakuliah {
	private String kode;
    private String nama;
    private String index;
    int sks;

    //konstruktor
    public Matakuliah(String kode, String nama, String index, int sks){
        super();
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    public double nilaiIndex(){
        switch (index.toUpperCase()) {
            case "A":
                return 4.0;
            case "AB":
                return 3.5;
            case "B":
                return 3.0;
            case "BC":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                return -1;
    }
}

    public String display(){
        return kode + " - "+ nama + " - "+ index;
    }
}