package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerDal=new CustomerManager(new SqlCustomerDal());
		customerDal.add();
	}

}
