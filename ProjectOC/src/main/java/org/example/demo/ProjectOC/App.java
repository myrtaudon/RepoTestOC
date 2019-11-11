package org.example.demo.ProjectOC;

import org.example.demo.model.Personne;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Personne p = new Personne("Myriam", (short)40);
        System.out.println( "Hello "+p.getName()+" !" );
    }
}
