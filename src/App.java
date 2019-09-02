import com.daomian.Car;
import com.daomian.HelloWorld;
import com.daomian.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        HelloWorld obj = (HelloWorld) context.getBean("hello");
        //obj.printHello();

//
//       Car car=(Car) context.getBean("car2");
//        System.out.println(car.getPrice());


        Person person=(Person) context.getBean("p1");
        System.out.println("===ref=="+person.getCar().getPrice());



        Person p3=(Person) context.getBean("p3");
        System.out.println(p3.getId());

    }
}
