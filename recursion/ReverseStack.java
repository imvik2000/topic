import java.util.Stack;
public class ReverseStack {
    static void reverse(Stack<Integer> s){
	    if(s.size()==1)
	      return;
	    int val=s.pop();
	    reverse(s);
	    swap(s,val);
	    return;
	    
	    
    }
    static void swap(Stack<Integer> s,int temp){
        if(s.size()==0){
            s.push(temp);
            return;
        } 
        int val=s.pop();
        swap(s,temp);
        s.push(val);
        return;
    }
    public static void print(Stack<Integer>s)
    {

        for(Integer i:s)
        System.out.println(i);
    }
    public static void main(String ars[])
    {
        int arr[]={1,2,3,4,5};
        Stack<Integer> st=new Stack<>();
        for(int i:arr)st.push(i);
        print(st);
        System.out.println("........");
        reverse(st);
        print(st);
    }
}
