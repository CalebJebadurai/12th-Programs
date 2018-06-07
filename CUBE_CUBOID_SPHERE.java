import java.io.* ;
class CUBE_CUBOID_SPHERE
    {
        public static void main(String args[])throws IOException
        {
            int ch;
            int side;
            int length;
            int bredth;
            int height;
            int radius;
            double ans;
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("PRESS '1' FOR FINDING THE VOLUME OF A CUBE "+0x2746+"  ");
            System.out.println("                   OR                        ");
            System.out.println("PRESS '2' FOR FINDING THE VOLUME OF A CUBOID.");
            System.out.println("                   OR                        ");
            System.out.println("PRESS '3' FOR FINDING THE VOLUME OF A SPHERE.");
            ch=Integer.parseInt(in.readLine());
            switch(ch)
            {
                case 1:
                    System.out.println("ENTER THE VALUES FOR A CUBE:(i.e IT'S'SIDE')");
                    side=Integer.parseInt(in.readLine());
                    ans=side*side*side;
                    System.out.println("THE VOLUME OF THE CUBE IS:"+ans);
                break;
                case 2:
                    System.out.println("ENTER THE VALUES FOR A CUBOID:(i.e IT'S 'LENGTH' 'BREDTH' 'HEIGHT')");
                    length=Integer.parseInt(in.readLine());
                    bredth=Integer.parseInt(in.readLine());
                    height=Integer.parseInt(in.readLine());
                    ans=length*bredth*height;
                    System.out.println("THE VOLUME OF THE CUBOID IS:"+ans);
                break;
                case 3:
                    System.out.println("ENTER THE VALUES FOR A SPHERE:(i.e IT'S 'RADIUS')");
                    radius=Integer.parseInt(in.readLine());
                    ans=(radius*radius*radius*4*22)/(3*7);
                    System.out.println("THE VOLUME OF THE SPHERE IS:"+ans);
                break;
                default:
                System.out.println("SORRY I CANNOT YOUR QUESTION");
            }
        }
    }