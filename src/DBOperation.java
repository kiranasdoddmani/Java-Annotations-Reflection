public class DBOperation {
    @LongExcecutionTime
    public void ReadData() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("Task Completed");
    }
}


