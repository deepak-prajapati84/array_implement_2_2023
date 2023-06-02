import java.util.Stack;

public class arrI
{

    public static class Stack
    {
        private int[] arr=new int[5];
        int idx =0;

        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }

        int peek(){
            if(idx==0)
            {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty!");
                return -1;
            }

            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }

        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isempty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }
    }
    public static void main(String[] args)
    {
        Stack st=new Stack();

        st.push(39);
        st.display();
        st.push(19);
        st.display();
        st.push(43);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(20);
        st.push(34);
        st.push(54);
        st.display();
        System.out.println(st.isFull());
        st.push(84);
    }
}