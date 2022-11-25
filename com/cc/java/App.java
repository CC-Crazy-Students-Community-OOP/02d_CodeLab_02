package com.cc.java;

public class App {
    
    public static void main( String[] args ) {
        /************************************************************/
        /*******           Beispiel 01 laut Aufgabe           *******/
        /************************************************************/
            output( c( "#y" ) + "---" + c( "#r" ) + "Example 1" + c( "#y" ) + "---------------------" );

            Employee e1 = new Employee( "Boe", "Jane", "Employee", "2005"  );
                output( "\t" + c( "#c" ) + 
                    e1.getInfo( "#eFN" ) + " " + e1.getInfo( "#eLN" )  + c( "#b" ) + 
                    " (" + c( "#p" ) + e1.getInfo( "#eEY" ) + c( "#b" ) + ")" +c( "#b" ) + 
                    " --> " + c( "#g" ) + 
                    e1.getInfo( "#eRL" ) 
                );

            Employee e2 = new Employee( "Doe", "John", "Management", "2007"  );
                output( "\t" + c( "#c" ) + e2.getInfo( "#eFN" ) + " " + e2.getInfo( "#eLN" )  + c( "#b" ) + " (" + c( "#p" ) + e2.getInfo( "#eEY" ) + c( "#b" ) + ")" +c( "#b" ) + " --> " + c( "#g" ) + e2.getInfo( "#eRL" ) );

            Employee e3 = new Employee( "Foe", "Jack", "Service", "2009"  );
                output( "\t" + c( "#c" ) + e3.getInfo( "#eFN" ) + " " + e3.getInfo( "#eLN" )  + c( "#b" ) + " (" + c( "#p" ) + e3.getInfo( "#eEY" ) + c( "#b" ) + ")" +c( "#b" ) + " --> " + c( "#g" ) + e3.getInfo( "#eRL" ) );

        /************************************************************/
        /*******       Beispiel 02 Arrays und Schleifen       *******/
        /************************************************************/
            output( "\n" + c( "#y" ) + "---" + c( "#r" ) + "Example 2" + c( "#y" ) + "---------------------" );
            
            String[] ea2[] = {
                { "Goe", "Jade", "Employee", "2011" },
                { "Hoe", "Jaco", "Engineering", "2013" },
                { "Koe", "Jace", "Service", "2015", "" }
            };

            Employee[] ep2;
            ep2 = new Employee[ ea2.length ];

            for ( int i = 0; i <= ea2.length - 1; i++ ) {
                ep2[ i ] = new Employee( ea2[ i ][ 0 ], ea2[ i ][ 1 ], ea2[ i ][ 2 ], ea2[ i ][ 3 ] );
                output( "\t" + c( "#c" ) + ep2[ i ].getInfo( "#eFN" ) + " " + ep2[ i ].getInfo( "#eLN" ) + c( "#b" ) + " (" + c( "#p" ) + ep2[ i ].getInfo( "#eEY" ) + c( "#b" ) + ")" +c( "#b" ) + " --> " + c( "#g" ) + ep2[ i ].getInfo( "#eRL" ) );
            }
    
        /************************************************************/
        /*******                     Ende                     *******/
        /************************************************************/
            output( "\n" + c( "#y" ) + "---" + c( "#r" ) + "Ende" + c( "#y" ) + "--------------------------" );
    }

    /************************************************************/
    /*******                global methods                *******/
    /************************************************************/
    public static void output( String o ) { System.out.println( o ); }
    public static String c( String c ) {
        switch ( c ) {
            case "#r":
                return "\u001b[31m";
            case "#g":
                return "\u001b[32m";
            case "#y":
                return "\u001b[33m";
            case "#b":
                return "\u001b[34m";
            case "#p":
                return "\u001b[35m";
            case "#c":
                return "\u001b[36m";
            default:
                return "\u001b[0m";
        }
    }
}