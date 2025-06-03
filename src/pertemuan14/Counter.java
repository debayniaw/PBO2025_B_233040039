package pertemuan14;

public class Counter {
	private static int instanceCount = 0; // Menghitung jumlah instance
    public Counter() {
        instanceCount++;
    }
    public static int getInstanceCount() {
        return instanceCount;
    }
}
