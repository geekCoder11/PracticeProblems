 import java.util.Stack;  
      
public class validParentheses   
{  
    public boolean isValid(String expInput)   
    {  
        Stack<Character> expstack = new Stack<Character>();  
        for (char ch : expInput.toCharArray())   
        {  
            if (ch == '(')  
            {  
                expstack.push(')');  
            }  
            else if (ch == '{')  
            {  
                expstack.push('}');  
            }  
            else if (ch == '[')  
            {  
                expstack.push(']');  
            }  
            else if (expstack.isEmpty() || expstack.pop() != ch)  
            {  
                System.out.println(" invalid parentheses ");
                return false;  
            }  
        }  
        return expstack.isEmpty();  
    }  
      
}  
