package velocity;

import java.io.StringWriter;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.runtime.RuntimeConstants;

public class Example1
{
    public static void main( String args[] )
    {
        // first, we init the runtime engine.  Defaults are fine.
        //String loadpath = FileUtil.getPackageResourcePath("META-INF/profile/vm");
    	
    	 System.out.println(ClassLoader.getSystemResource("").getPath().toString());
         //RuntimeConstants.FILE_RESOURCE_LOADER_PATH =  ClassLoader.getSystemResource("").getPath().toString();
         Velocity.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, ClassLoader.getSystemResource("").getPath().toString());
         
        // Velocity.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        
        try
        {
            Velocity.init();
        }
        catch(Exception e)
        {
            System.out.println("Problem initializing Velocity : " + e );
            return;
        }

        // lets make a Context and put data into it 
       
        VelocityContext context = new VelocityContext();
        
        
        //properties.put(Velocity.FILE_RESOURCE_LOADER_PATH, "E:/project/velocity/vm/");

        context.put("name", "Velocity111");
        context.put("project", "Jakarta222");
        
        // lets render a template

        StringWriter w = new StringWriter();

        try
        {
        	
            Velocity.mergeTemplate("example2.vm", "UTF-8", context, w);
            //Velocity.mergeTemplate("example2.vm", context, w );
        }
        catch (Exception e )
        {
            System.out.println("Problem merging template : " + e );
        }

        System.out.println(" template : " + w );

        String s = "We are using $project $name to render this.";
        w = new StringWriter();

        try
        {
            Velocity.evaluate( context, w, "mystring", s );
        }
        catch( ParseErrorException pee )
        {
            System.out.println("ParseErrorException : " + pee );
        }
        catch( MethodInvocationException mee )
        {
            System.out.println("MethodInvocationException : " + mee );
        }
        catch( Exception e )
        {
            System.out.println("Exception : " + e );
        }

        System.out.println(" string : " + w );
    }
}