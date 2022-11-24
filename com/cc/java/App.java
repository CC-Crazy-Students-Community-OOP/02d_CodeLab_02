package com.cc.java;

public class App {
    
    public static void main( String[] args ) {

        /************************************************************/
        /*******           Beispiel 01 laut Aufgabe           *******/
        /************************************************************/
            Employee employee1 = new Employee( "Mey", "Carl", "Employee", 2015  );
                output( 
                    employee1.getInfo( "#eFN" ) + " " + employee1.getInfo( "#eLN" ) + 
                    " (" + employee1.getInfo( "#eEY" ) + 
                    ") --> " + employee1.getInfo( "#eRL" ) 
                );
                output( " " );

            Employee employee2 = new Employee( "Doe", "John", "Leader", 2000  );
                output( 
                    employee2.getInfo( "#eFN" ) + " " + employee2.getInfo( "#eLN" ) + 
                    " (" + employee2.getInfo( "#eEY" ) + 
                    ") --> " + employee2.getInfo( "#eRL" ) 
                );
                output( " " );

            Employee employee3 = new Employee( "Poppinks", "Marrie", "Toiletman", 2020  );
                output( 
                    employee3.getInfo( "#eFN" ) + " " + employee3.getInfo( "#eLN" ) + 
                    " (" + employee3.getInfo( "#eEY" ) + 
                    ") --> " + employee3.getInfo( "#eRL" ) 
                );
            output( "------------------------" );
            
        /************************************************************/
        /*******       Beispiel 02 Arrays und Schleifen       *******/
        /************************************************************/
            String[] employees[] = {
                { "Mey", "Carl", "Employee", "2015" },
                { "Doe", "John", "Leader", "2000" },
                { "Poppinks", "Marrie", "Toiletman", "2020" }
            };

            Employee[] employee;
            employee = new Employee[ employees.length ];

            for ( int i = 0; i <= employees.length -1 ; i++ ) {
                for ( int j = 0; j <= employees[ i ].length -1 ; j++ ) {
                    employee[ i ] = new Employee( employees[ i ][ 0 ], employees[ i ][ 1 ], employees[ i ][ 2 ], employees[ i ][ 3 ] );
                }
            }

            
                output( 
                    employee1.getInfo( "#eFN" ) + " " + employee1.getInfo( "#eLN" ) + 
                    " (" + employee1.getInfo( "#eEY" ) + 
                    ") --> " + employee1.getInfo( "#eRL" ) 
                );
                output( "------------------------" );

            Employee employee2 = new Employee( "Doe", "John", "Leader", 2000  );
                output( 
                    employee2.getInfo( "#eFN" ) + " " + employee2.getInfo( "#eLN" ) + 
                    " (" + employee2.getInfo( "#eEY" ) + 
                    ") --> " + employee2.getInfo( "#eRL" ) 
                );
                output( "------------------------" );

            Employee employee3 = new Employee( "Poppinks", "Marrie", "Toiletman", 2020  );
                output( 
                    employee3.getInfo( "#eFN" ) + " " + employee3.getInfo( "#eLN" ) + 
                    " (" + employee3.getInfo( "#eEY" ) + 
                    ") --> " + employee3.getInfo( "#eRL" ) 
                );
                output( "------------------------" );
}


    public static void output( String outputStr ) { System.out.println( outputStr ); }



}

