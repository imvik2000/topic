import java.util.Stack;
public class DeleteMiddleElementOfStack {
    

    public static void delete(Stack<Integer> st){
                int m=st.size()/2+1;
                delete(st,m);
    }
    public static void delete(Stack<Integer> st,int m){
        if(m==1){
            st.pop();
            return;
        }
        int temp=st.pop();
        delete(st,m-1);
        st.push(temp);
    }
    public static void print(Stack<Integer> st){
        for(Integer i:st)System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Stack<Integer> st=new Stack<>();
        for(int i:arr)st.push(i);
        print(st);
        delete(st);
        print(st);
    }
}

