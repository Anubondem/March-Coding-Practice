

        /* Declare second integer, double, and String variables. */
        
        int i2 = 12;
        double d2 = 4.0;;
        String s2 = "is the best place to learn and practice coding!";
        

        /* Read and save an integer, double, and String to your variables.*/
        
        //System.out.println("Please input an interger: ");
        i2 = scan.nextInt();
        i2 += i;
        
        //System.out.println("Please input a double: ");
        d2 = scan.nextDouble();
        d2 += d;
        
        //System.out.println("Please input a string: ");
        scan.nextLine();
        s2 = scan.nextLine();
        
        
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        
        System.out.println(i2);

        /* Print the sum of the double variables on a new line. */
		
        System.out.println(d2);
        
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
            
            String e = s + s2;
            System.out.println(e);

