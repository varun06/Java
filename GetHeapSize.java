public class GetHeapSize{
	public static void main(String[] args) {
		long heapSize = Runtime.getRuntime().totalMemory();
		System.out.println("Heap Size = " + heapSize);
	}
}