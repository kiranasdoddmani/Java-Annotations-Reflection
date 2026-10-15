@MyAnnotation(value="Hello EveryOne Welcome to Annotation")
public class Main {
    public static void main(String[] args) {
        Class<Main> obj=Main.class;
         if(obj.isAnnotationPresent(MyAnnotation.class)){
              MyAnnotation annotation=obj.getAnnotation(MyAnnotation.class);
             System.out.println(annotation.value());
         }
    }
}
