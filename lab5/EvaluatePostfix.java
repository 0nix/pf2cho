import java.util.Scanner;
import java.util.StringTokenizer;


public class EvaluatePostfix
{
	private static String getExpressionFromKeyboard(){
		Scanner sc = new Scanner(System.in);
//		System.out.print("What is your postfix arithmetic expression? ");
		System.out.print("Type your postfix arithmetic expression (e.g., 10 20 30 / *): ");
		return sc.nextLine();
	}


//==============================================
// TASK#1
//==============================================
// Returns if the given string is one of the four binary operators: +, -, /, and *
// Otherwise, return false;
	private static boolean isOperator(String s){
		return s.matches("[+]|[-]|[*]|[/]");
	}
//==============================================
// TASK#2
//==============================================
// Returns result of binary operation, given two double values and a binary operator.
// Assume that only a valid operator is passed (i.e., +, -, /, or *)
	private static double evaluateOperation(double operand1, double operand2, String operator)
	{
		double res = 0.0;
		switch(operator){
			case "+":
				res = operand1 + operand2;
				break;
			case "-":
				res = operand1 - operand2;
				break;
			case "*":
				res = operand1 * operand2;
				break;
			case "/":
				res = operand1 / operand2;
				break;
		}
		return res;
	}


//==============================================
// TASK#3
// Refer to "Evaluating Postfix Expression" in handout_chap7.pdf.
//==============================================
	private static Double evaluateExpression(String expression)
	{
// ALSO, THIS VERSION WORKS FINE.
//		StackArrayBased myStack = new StackArrayBased();
		StackReferenceBased myStack = new StackReferenceBased();
		//StackListBased myStack = new StackListBased();
		StringTokenizer st = new StringTokenizer(expression);
		while (st.hasMoreTokens()){
			String s = st.nextToken();
			if (isOperator(s)) {
				String o1 = (String) myStack.pop();
				String o2 = (String) myStack.pop();
				/*double r = evaluateOperation(Double.parseDouble(o2), Double.parseDouble(o1), s);
				System.out.println(o2 +" "+s+" "+o1+"="+r);*/
				myStack.push(Double.toString(evaluateOperation(Double.parseDouble(o2), Double.parseDouble(o1), s)));
				//=============================
				// YOUR CODE GOES HERE...
				//=============================

			} else {
				myStack.push(s);
				//=============================
				// YOUR CODE GOES HERE...
				//=============================
			}
		}
		return Double.valueOf(myStack.peek().toString());
	}


	public static void main(String[] args)
	{
		String str = getExpressionFromKeyboard();
		Double result = evaluateExpression(str);

		System.out.println(str + " = " + result);

  	} // end main


} // end EvaluatePostFix