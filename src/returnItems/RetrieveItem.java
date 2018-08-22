package returnItems;

import java.sql.SQLException;

import database.DBConnect;

public class RetrieveItem {
	
	private DBConnect connect = new DBConnect();
		
	public void allProduct() throws SQLException {
		String searchAll = "SELECT * FROM product";
    	
    	try {
			connect.selectQueryProduct(searchAll);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Problem occurred at executeQuery operation : " + e);
			throw e;
		}
    	
    }
    
    public void searchProduct(String productName) throws SQLException {
    	String searchByName = "SELECT * FROM product p WHERE p.name LIKE '%" + productName + "%';";
    	
    	try {
			connect.selectQueryProduct(searchByName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Problem occurred at executeQuery operation : " + e);
			throw e;
		}
    	
    }
    
    public void searchAllCoffee() throws SQLException {
		String searchAllCoff = "SELECT * FROM product WHERE type='Coffee';";
    	
    	try {
			connect.selectQueryProduct(searchAllCoff);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Problem occurred at executeQuery operation : " + e);
			throw e;
		}
    }
    
    public void searchAllEquipment() throws SQLException {
		String searchAllEquip = "SELECT * FROM product WHERE type='Equipment';";
    	
    	try {
			connect.selectQueryProduct(searchAllEquip);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Problem occurred at executeQuery operation : " + e);
			throw e;
		}
    }
    
    public void addProduct(String name, String type, String description, int cost, int stock) throws SQLException {
		String addProduct = "INSERT INTO product (name, stock, cost, type, description) VALUES  ('" + name + "', " + stock + 
				"," + cost + ", '" + type + ", '" + description + "');";
    	
    	try {
			connect.updateQuery(addProduct);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Problem occurred at executeQuery operation : " + e);
			throw e;
		}
    }

}
