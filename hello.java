//package是包名
package hello;

//引入头文件
import java.util.Scanner;

//类
//有public修饰的类名必须与文件名一致
//public可有可无，但是只能出现一个
public class hello {
    //main函数 是java程序入口
    public static void main(String[] args) {
        //创建对象 获取用户的输入
        //如果没加头文件，鼠标移上去按住Alt+Shift+Enter可选择自动添加头文件
        Scanner scanner=new Scanner(System.in);

        double avg = 0;
        double sum = 0;
        for (int i=0;i<3;i++){
            System.out.println("请输入整数");
            //接收数据
            int a = scanner.nextInt();
            sum+=a;
        }
        avg = sum/3;
        System.out.println("平均分是:"+avg);

        //日志




        //int a = scanner.nextInt();//阻塞方法

        //输出a
        //System.out.println(a);

//        Person person = new Person();
//        person.age = 100;

    }
}

//创建类名首字母大写易分辨
class Person{
    int age;

}
