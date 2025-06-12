import java.util.LinkedList;
import java.util.Queue;

public class ParkingPool {
    private final Queue<RegistrarParking> orderQueue = new LinkedList<>();

    public synchronized void addOrder(RegistrarParking order) {
        orderQueue.add(order);
        notify();  // Notify waiting threads that a new order is available
    }

    public synchronized RegistrarParking getOrder() throws InterruptedException {
        while (orderQueue.isEmpty()) {
            wait();  // Wait until an order is available
        }
        return orderQueue.poll();
    }
}