import java.util.Random;
public class Student{
	public boolean inContions(String[] target,String name){
		for(String ss:target){
			if(name.equals(ss)){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] arggs){
		String[] name={"������","������","�Ī��","������","����","�»���","����","�Ƹ�","�¿�"};
		String[] names=new String[3];
		Random r=new Random();
		Student stu=new Student();
		for(int i=0;i<3;){
			int temp=r.nextInt(name.length);
			if(stu.inContions(names,name[temp])){
				names[i++]=name[temp];
			}
		}
		for(String s:names){
			System.out.println("��ϲ����λ���˹��ڣ�"+s);
		}
	}
}