package phyrex.designpattern.code.simplefactory;

public class OperateMul extends Operate {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		
		double result = 0.0d;
				
		result = numberA * numberB;
				
		return result;
	}

}
