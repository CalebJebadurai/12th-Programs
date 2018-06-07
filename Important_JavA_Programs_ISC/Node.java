package Important_JavA_Programs_ISC;

class Node
{
    private Node Node,link,next;
    int data;
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
}

class node
{
    private Node Node,link,n;
    int data;
    void search(node start, String b)
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
}

class ListNodes
{
    int listsum(ListNodes start)
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
}

//Source: http://www.javaforschool.com/1137558-some-operations-on-linked-list-using-java/#ixzz3R5Tz9qTd

//Source: http://www.javaforschool.com/1137558-some-operations-on-linked-list-using-java/#ixzz3R5Tszz7t

//Source: http://www.javaforschool.com/1137558-some-operations-on-linked-list-using-java/#ixzz3R5ToeoAa

//Source: http://www.javaforschool.com/1137558-some-operations-on-linked-list-using-java/#ixzz3R5Tjvio7

//Source: http://www.javaforschool.com/1137558-some-operations-on-linked-list-using-java/#ixzz3R5TdPxnP

//Source: http://www.javaforschool.com/1137558-some-operations-on-linked-list-using-java/#ixzz3R5TXPDyS

//Source: http://www.javaforschool.com/1137558-some-operations-on-linked-list-using-java/#ixzz3R5TSCqEA

//Source: http://www.javaforschool.com/1137558-some-operations-on-linked-list-using-java/#ixzz3R5TNli9G

//Source: http://www.javaforschool.com/1137558-some-operations-on-linked-list-using-java/#ixzz3R5TGPd8Q
