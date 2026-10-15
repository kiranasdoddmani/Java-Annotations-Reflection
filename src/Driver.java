import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Driver {
    static void main(String[] args) throws InterruptedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        DBOperation dbOperation=new DBOperation();
            Method method=dbOperation.getClass().getMethod("ReadData");

            if(method.isAnnotationPresent(LongExcecutionTime.class)){
                Long start=System.currentTimeMillis();
                method.invoke(dbOperation);

                Long end=System.currentTimeMillis();

                System.out.println("Execution Time :-"+(end-start));
            }
    }
}

// method.invoke() is used in Java Reflection to execute a method dynamically at runtime
