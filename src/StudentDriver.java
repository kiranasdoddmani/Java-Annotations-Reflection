import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentDriver {
    static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Student student=new Student();
        Method method=student.getClass().getMethod("Study");

        if(method.isAnnotationPresent(Important.class)){
            method.invoke(student);
        }
    }
}
