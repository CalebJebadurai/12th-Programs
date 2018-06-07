package rec;
class LinkedList extends Node
{
    protected Node start;
    public LinkedList(){start=null;}

    public boolean isEmpty(){return start==null;}

    public void Insert(int val)
    {
        Node nptr,ptr,save=null;
        nptr=new Node(val,null);
        boolean ins=false;
        if(start==null)start=nptr;
        else if(val<=start.getData()){nptr.setLink(start);start=nptr;}
        else
        {
            save=start;
            ptr=start.getLink();
            while(ptr!=null)
            {
                if(val>=save.getData()&&val<=ptr.getData())
                {
                    save.setLink(nptr);
                    nptr.setLink(ptr);
                    ins=true;
                    break;
                }
                else{save=ptr;ptr=ptr.getLink();}
                if(ins==false)save.setLink(nptr);
            }
        }
    }

    public void print_num(){print_num(start);}

    private void print_num(Node head)
    {
        if(head!=null)
        {
            System.out.print(head.getData()+" ");
            print_num(head.getLink());
        }
    }

    public int sumList(){return sumList(start);}

    private int sumList(Node head)
    {
        if(head==null)return 0;
        else return head.getData()+sumList(head.getLink());
    }

    public int no_nodes(){return no_nodes(start);}

    private int no_nodes(Node head)
    {
        if(head==null)return 0;
        else return(1+no_nodes(head.getLink()));
    }
}