public class validParenthesis {
    public static boolean validP(String s,stack stk){
        for (int i = 0 ; i < s.length() ; i++)
    {
        switch(s.charAt(i))
        {
            case '(':
            case '[':
            case '{':
                stk.push(s.charAt(i));
                break;
            case ')':
                if (!stk.isEmpty() && stk.peekStack().toString().charAt(0) == '(')
                    stk.pop();
                else
                    return false;
                break;
            case ']':
                if (!stk.isEmpty() && stk.peekStack().toString().charAt(0) == '[')
                    stk.pop();
                else
                    return false;
                break;
            case '}':
                if (!stk.isEmpty() && stk.peekStack().toString().charAt(0) == '{')
                    stk.pop();
                else
                    return false;
                break;
            default:
                return false;
        }
    }
    if(stk.isEmpty())
        return true;
    else
        return false;
}
    public static void main(String[] args) {
        //create a string
        String s = "()[]{}";
        stack stk = new stack();
        boolean result = validP(s, stk);
        System.out.println(result);

    
    
}
}
