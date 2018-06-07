/**
 * The Program Runs in Command Prompt Or in IDE using URLs
 * in the form of Parameters. All URLs must be in http:// form.
 * © SHANTANU KHAN 
 * @ shantanukhan1995@gmail.com
 * @website 0code.blogspot.com 
 * Program Type : BlueJ Program - Java
 */
import java.net.URI;
import java.awt.Desktop;
public class OpenURL
{
    public static void main(String[] args)
    {
        if(!java.awt.Desktop.isDesktopSupported())
        {
            System.err.println("Desktop is not supported (fatal)");
            System.exit(1);
        }
        if(args.length==0)
        {
            System.out.println( "Usage: OpenURI [URI [URI ... ]]" );
            System.exit( 0 );
        }
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        if(!desktop.isSupported(java.awt.Desktop.Action.BROWSE))
        {
            System.err.println( "Desktop doesn't support the browse action (fatal)" );
            System.exit( 1 );
        }
        for(String arg:args)
        {
            try{
                java.net.URI uri = new java.net.URI(arg);
                desktop.browse( uri );
            }
            catch(Exception e){
                System.err.println(e.getMessage());
            }
        }
    }
}