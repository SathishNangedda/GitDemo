package abcd;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import abcd.CalculatorStub.Add;
import abcd.CalculatorStub.AddResponse;
import abcd.CalculatorStub.Subtract;
import abcd.CalculatorStub.SubtractResponse;

public class SoabBasedTesting {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub

CalculatorStub driver = new CalculatorStub("http://www.dneonline.com/calculator.asmx?WSDL");

//Create object for Add Request

Add req = new Add();

req.setIntA(95);

req.setIntB(55);


//Create the Object for Add Response

AddResponse  res = driver.add(req);

System.out.println(res.getAddResult());


//Create the Object for Subtract Request

Subtract req1 = new Subtract();

req1.setIntA(90);
req1.setIntB(50);


//Create the Object for Subtract Response

SubtractResponse res1 = driver.subtract(req1);

System.out.println(res1.getSubtractResult());

	}

}
