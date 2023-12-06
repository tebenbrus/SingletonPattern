

public class SystemApp {
    public static void main(String[] args) {

        QueueSystem queueSystem = QueueSystem.getInstance();

        java.lang.System.out.println("Initial Queue Number: " + queueSystem.getCurrentQueueNumber());

        int queueNumber1 = queueSystem.generateNextQueueNumber();
        java.lang.System.out.println("User 1 obtained Queue Number: " + queueNumber1);

        int queueNumber2 = queueSystem.generateNextQueueNumber();
        java.lang.System.out.println("User 2 obtained Queue Number: " + queueNumber2);

        java.lang.System.out.println("Real-time Queue Number: " + queueSystem.getCurrentQueueNumber());

        queueSystem.resetQueueNumber(100);

    }
}
