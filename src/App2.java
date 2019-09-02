import com.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

      Person pp=(Person) context.getBean("person");

        System.out.println(pp);
    }
}
