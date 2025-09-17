package CustamizeCollection;
class MyArrayList {
    private int[] data;
    private int size;

            public MyArrayList() {
        data = new int[5]; 
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            reSize();
        }
              data[size++] = value;
    }

    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return data[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public void display() {
        System.out.print("MyArrayList: ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    private void reSize() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display(); 

        System.out.println("Element at index 1: " + list.get(1)); 

        list.remove(1);
        list.display();

        System.out.println("Completed");
    }
}
