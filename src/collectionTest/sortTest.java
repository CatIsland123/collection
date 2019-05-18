package collectionTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class myTool{
	//自然排序
	public static <T extends Comparable> void studentSort(T[] array) {
		for(int i = 0;i<array.length;i++) {
			int index=i;
			for(int j=i;j<array.length;j++) {
				if(array[index].compareTo(array[j])>0)
					index=j;
			}
			if(index!=i) {
			T temp=array[index];
			array[index]=array[i];
			array[i]=temp;
		}
		}
		
	}
	//指定排序
    public static <T> void teacherSort(T[] array ,Comparator<T> comparator) {
		for(int i=1;i<array.length;i++) {
			if(comparator.compare(array[i], array[i-1])<0) {
				T temp=array[i];
				int  j=i;
				do {
					array[j]=array[j-1];
					j--;
				}while(j>0&&comparator.compare(array[i], array[i-1])<0);
				array[j]=temp;
			}
		}
	}
}
class  Student implements Comparable{
	String Sname;
	int Sage;
	Student(String sn,int sa){
		Sname=sn;
		Sage=sa;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s=(Student) o;
		int result=Sage>s.Sage?1:(Sage<s.Sage?-1:0);
		return result;
	}

	@Override
	public String toString() {
		return "Student [Sname=" + Sname + ", Sage=" + Sage + "]";
	}
	
	
}
class Teacher{
	String Tname;
	int Tage;
	Teacher(String tn,int ta){
		Tname=tn;
		Tage=ta;
	}
	@Override
	public String toString() {
		return "Teacher [Tname=" + Tname + ", Tage=" + Tage + "]";
	}
}
class teacherComparator implements Comparator<Teacher>{

	@Override
	public int compare(Teacher o1, Teacher o2) {
		// TODO Auto-generated method stub
		return o1.Tage-o2.Tage;
	}
	
}
public class sortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("使用自然排序");
		Student [] sts= {new Student("Lin",19),new Student("Ain",29),new Student("Cin",16)};
        myTool.studentSort(sts);
        for(Student s:sts)
        	System.out.println(s);
	}
	//使用比较器排序

}
