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
		String[] name={"艾俊杰","罗世坤","虢莫非","田仰望","乔治","陈环宇","佩奇","浩哥","陈俊"};
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
			System.out.println("恭喜这三位幸运观众："+s);
		}
	}
}