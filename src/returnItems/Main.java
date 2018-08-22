package returnItems;

import java.sql.SQLException;

public class Main {
	
	public static void main(String[]args) throws SQLException {
	RetrieveItem retrieveTest = new RetrieveItem();
	
	retrieveTest.searchProduct("GeneriCo");
    //retrieveTest.addProduct("Test", "Coffee", "A bold new taste that constantly changes.", 10, 90);
    retrieveTest.allProduct();
	}
}
