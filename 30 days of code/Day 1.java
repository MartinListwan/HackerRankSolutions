        /* Declare second integer, double, and String variables. */
        int number;
        double doubleType;
        String ss;

        /* Read and save an integer, double, and String to your variables.*/
        number = scan.nextInt();
        doubleType = scan.nextDouble();
        scan.nextLine();
        ss = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + number);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d + doubleType);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + ss);
