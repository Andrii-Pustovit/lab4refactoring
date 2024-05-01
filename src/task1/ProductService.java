package task1;

public class ProductService {

    public void processOrder(Order order) {

        // Довгий ланцюжок викликів

        order.getCustomer().getAddress().updateCity("New City");

    }

}
