public class Main {
	public static void main(String[] args) {
		Customer customer;
                String SenCustomerName = "Raul Villarin";
                String RegCustomerName = "Irgieneo Calderon";
                
               
		RegularCustomer regularCustomer = new RegularCustomer(RegCustomerName, 5000);
            
		SeniorCustomer seniorCustomer = new SeniorCustomer(SenCustomerName, 5000);

		customer = regularCustomer;
		System.out.println(customer.getName()+" " +customer.calculateBill());

		customer = seniorCustomer;
		System.out.println(customer.getName()+" "+customer.calculateBill());
	}
 }
