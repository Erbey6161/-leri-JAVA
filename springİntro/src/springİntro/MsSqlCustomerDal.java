package springİntro;

public class MsSqlCustomerDal implements ICustomerDal {

	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	@Override
	public void add() {
		System.out.println("MsSql veri tabanına eklendi");
		System.out.println("Connection String : " +this.connectionString);
	}

}
