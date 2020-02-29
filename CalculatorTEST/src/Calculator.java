
public class Calculator {
	public int addition(int x,int y){

		return x + y;

	}

	public int subtraction(int x, int y) {

		return x - y;

	}

 	public double division(int x, int y) {

		return (double)x / (double)y;

	}

 	public int multiplication(int x, int y) {

		return x * y;

	}

 	public int modulus(int x, int y) {

		return x % y;

	}

 	

 	public int   bitNot(int x){

 		return ~x;

 	}

 	public int  bitAnd(int x,int y){

 		return x & y;

 	}

 	public int bitOr(int i, int j) {

		return i | j;

	}

 	public int bitExOr(int i, int j) {

		

		return i ^ j;

	}

 	public int bitShiftRightZero(int i) {

	

		return i>>1;

	}

 	public int bitShiftLeft(int i) {

	

		return i<<1;

	}



	public int bitShiftRight(int i){

		

        return i>>1;

	}

	public boolean equalTo(int x,int y){

		return x==y;

	}

	public boolean notEqualTo(int x,int y){

		return x!=y;

	}

	public boolean greaterThan(int x,int y){

		return x>y;

	}

	public boolean greaterThanOrEqual(int x,int y){

		return x>=y;

	}

	public boolean lessThan(int x,int y){

		return x<y;

	}

	public boolean lessThanOrEqual(int x,int y){

		return x<=y;

	}

	public boolean logicalNotEqual(boolean x){

		return !x;

	}

	public boolean logicalAnd(boolean x, boolean y) {

		return x && y;

	}

	public boolean logicalOr(boolean x, boolean y) {

		return x || y;

	}

	public boolean logicalExOr(boolean x, boolean y) {

		return x ^ y;

	}

	public boolean shortCircuitAnd(boolean x, boolean y) {

		return x && y;

	}

	

	public boolean shortCircuitOr(boolean x, boolean y) {

		return x || y;

	}


}
