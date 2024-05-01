package task1;

public class ProductService {

    public void processOrder(Order order) {
        Customer customer = order.getCustomer();
        Address address = customer.getAddress();
        address.updateCity("New City");
    }

}

