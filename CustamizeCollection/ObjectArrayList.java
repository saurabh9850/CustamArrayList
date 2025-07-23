package CustamizeCollection;

public class ObjectArrayList {
	 private Object[] data;
	 private int size;
	 
	 public ObjectArrayList() {
		  data=new Object[10];
		 size=0;
	 }
	 public void add(Object value) {
		 if(size==data.length)
		 {
			 newSize();
		 }
		 data[size++]=value;
		 
	 }
	 public void remove(int index)
	 {
		 if(index<0||index>=data.length)throw new IndexOutOfBoundsException(index);
		 for(int i=index;i<size-1;i++)
		 {
			 data[i]=data[i+1];
		 }
		 data[--size]=null;
	 }
	 public Object get(int index)
	 {
		 if(index<0||index>=size)throw new ArrayIndexOutOfBoundsException(index);
		 return data[index];
	 }
   public void display() {
	 for(int i=0;i<size;i++)
	 {
		 System.out.println(data[i]);
		 
	 }
   }
	private void newSize() {
		// TODO Auto-generated method stub
		Object[] newData=new Object[2*(data.length)];
		for(int i=0;i<size;i++)
		{
			newData[i]=data[i];
			
		}
		data=newData;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectArrayList list=new ObjectArrayList();
		list.add("Saurabh");
		list.add(12);
		list.add(true);
		list.add('S');
		list.display();
		list.remove(1);
		list.get(2);
		list.display();
		

	}

}
