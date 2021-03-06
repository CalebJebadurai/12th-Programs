package rec;
import java.io.*;
class LinkListTest extends LinkedList
{
    protected static LinkedList E;
    int count(Node ptr_start)
    {
        int c=0;
        Node ptr = new Node();
        ptr = ptr_start;
        while(ptr.link != null)
        {
            c++;
            ptr = ptr.next;
        }
        return c;
    }

    void search(Node start, String b)
    {
        int f=0;
        node ptr = new node();
        ptr = start;
        while(ptr.link != null)
        {
            if(b.equalsIgnoreCase(ptr.n))
            {
                f=1;
                System.out.println("Content of the node  = " + ptr.p);
            }
            ptr = ptr.next;
        }
        if(f==0)
            System.out.println("Name not found");
    }

    int listsum(Node start)
    {
        int sum=0;
        ListNodes ptr = new ListNodes();
        ptr = start;
        while(ptr.link != null)
        {
            sum = sum + ptr.item;
            ptr = ptr.next;
        }
        return sum;
    }

    void search(Node start, int value)
    {
        int f=0;
        Node ptr = new Node();
        ptr = start;
        while(ptr.link != null)
        {
            if(ptr.data == value)
            {
                f=1;
            }
            ptr = ptr.next;
        }
        if(f == 1)
            System.out.println("Search is Successful");
        else
            System.out.println("Search is Unsuccessful");
    }

    void display(Node start)
    {
        Node ptr = new Node();
        ptr = start;
        System.out.println("Data in the linked list are: ");
        while(ptr.link != null)
        {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    void insertBeginning(Node start, int x)
    {
        Node temp = new Node();
        temp.data = x;
        temp.link = start;
        start = temp;
    }

    void insertMiddle(Node start, int x, int n)
    {
        Node temp = new Node();
        temp.data = x;
        Node ptr = new Node();
        ptr = start;

        int c = 0;
        while(c <= n) //'ptr' will access all nodes up to the nth node
        {
            ptr = ptr.link;
            c++;
        }

        temp.link = ptr.link;
        ptr.link = temp;
    }

    void insertEnd(Node start, int x)
    {
        Node temp = new Node();
        temp.data = x;
        Node ptr = new Node();
        ptr = start;

        while(ptr.link != null) //'ptr' will access all nodes up to the last node
        {
            ptr = ptr.link;
        }

        temp.link = null;
        ptr.link = temp;
    }

    void deleteNode(Node start, int n)
    {
        Node ptr = new Node(); //'ptr' is the node which will be deleted
        Node ptr1 = new Node(); //'ptr1' is the node just before the node to be deleted
        ptr = start;
        ptr1 = ptr;

        int c = 0;
        while(c <= n)
        {
            ptr1 = ptr;
            ptr = ptr.link;
            c++;
        }

        ptr1.link = ptr.link;
        ptr.link = null;
    }

    public static void main(String args[])throws IOException
    {
        int num;
        E=new LinkedList();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\t...Starting List Test...");
        for(int a=0;a<5;++a)
        {
            System.out.print("\n\tEnter a number: ");
            try
            {
                num=Integer.parseInt(br.readLine());
                E.Insert(num);
            }
            catch(Exception e){System.out.println(e);}
        }
        System.out.println("\n\tCreated List is: ");
        E.print_num();
        System.out.println("\n\tNumber of nodes in this listis: "+E.no_nodes());
        System.out.println("\n\tSum of its elements is: "+E.sumList());
        System.out.println("\n\t...List Test Over...");
    }
}