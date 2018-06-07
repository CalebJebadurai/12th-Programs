private class Mixer
{
    private int arr[],n;
    
    private Mixer(int nn)
    {
        n=nn;
    }
    
    private void accept()
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the "+i+"th Element of the Array:");
            Integer.parseInt(readLine());
        }
    }
    
    private Mixer mix(Mixer A)
    {
        Mixer AB=new Mixer(n+A.n);
        for(int i=0;i<A.n;i++)
        {
            AB.arr[i]=A.arr[i];
        }
        for(int i=0,j=A.n;i<n;i++,j++)
        {
            AB.arr[j]=arr[i];
        }
        for(int i=0;i<A.n;i++)
        {
            AB.arr[i]=A.arr[i];
        }
        
    }
    
    private void display()
    {
        
    }
    
    private static void main()
    {
        
    }