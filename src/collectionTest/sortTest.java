package collectionTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class myTool{
	public static void stusentSort(List list) {
		Object[] st= list.toArray();
		//Arrays.sort(st, (Comparator)c);
	}
    public static void teacherSort(List list) {
		
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
	
}
class Teacher{
	String Tname;
	int Tage;
	Teacher(String tn,int ta){
		Tname=tn;
		Tage=ta;
	}
}
public class sortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
