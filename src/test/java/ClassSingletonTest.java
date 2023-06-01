import org.example.ClassSingleton;

public class ClassSingletonTest {
    public static void main(String[] args) {

        ClassSingleton singleton1 = ClassSingleton.getInstance();
        ClassSingleton singleton2 = ClassSingleton.getInstance();


        singleton1.setDescription("Nouvelle description");


        System.out.println("Description du singleton1 : " + singleton1.getDescription());
        System.out.println("Description du singleton2 : " + singleton2.getDescription());
    }
}

