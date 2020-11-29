import java.util.Arrays;

public class CustomArrayList<E> {

	static int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object elements[];

	CustomArrayList(){
		elements = new Object[DEFAULT_CAPACITY];
	}

	public void add(E value){
		if (size == elements.length){
			ensureCapacity();
		}
		elements[size++] = value;
	}
	
	private void ensureCapacity(){
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	public E get(int index){
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + " Size: " + index);
		}
		return (E) elements[index];
	}

}

class Test {
	public static void main(String[] args) {
		CustomArrayList<Integer> customArrayList = new CustomArrayList<>();

		customArrayList.add(10);
		customArrayList.add(10);
		customArrayList.add(10);
		customArrayList.add(10);
		customArrayList.add(10);
		customArrayList.add(10);
		customArrayList.add(10);
		customArrayList.add(10);
		customArrayList.add(10);

		System.out.println(customArrayList.get(5));

	}
}