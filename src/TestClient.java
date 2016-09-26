import com.tcs.service.CalServiceSoapBindingStub;


public class TestClient {
	
	public static void main(String[] args) throws Exception{
		
		java.net.URL endpointUrl = new java.net.URL("http://localhost:8080/CalculatorService_Axis1/services/CalService");
		
		org.apache.axis.client.Service service = new org.apache.axis.client.Service();
		
		CalServiceSoapBindingStub stub = new CalServiceSoapBindingStub(endpointUrl, service);
		
		int add = stub.add(15, 25);
		int sub = stub.sub(15, 10);
		
		System.out.println("Add Result :" + add);
		System.out.println("Sub Result :" + sub);
	}

}
