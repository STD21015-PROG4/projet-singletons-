import org.example.ClassUniqueInstance;

public class ClassUniqueInstanceTest {
    public static void main(String[] args) {

        ClassUniqueInstance instance1 = ClassUniqueInstance.INSTANCE;
        ClassUniqueInstance instance2 = ClassUniqueInstance.INSTANCE;


        instance1.setClick(5);

        System.out.println("Compteur de clics de instance1 : " + instance1.getClick());
        System.out.println("Compteur de clics de instance2 : " + instance2.getClick());
    }
}
