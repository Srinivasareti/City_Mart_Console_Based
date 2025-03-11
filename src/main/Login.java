package main;

import java.util.Scanner;

public class Login extends template
{
	static Scanner sc = new Scanner(System.in);
	static User obj1 = new User();

 //abstract override

	public void m1()
	{
		try
		{
	System.out.println(C.green+C.blink+"               .+#+=."+C.white);
		Thread.sleep(500);
        System.out.println(C.green+"               +@%%%%#*.");
		Thread.sleep(500);
        System.out.println(C.green+"                -+*%%%+:--");
		Thread.sleep(500);
        System.out.println(C.green+"                    .:.=: -:");
		Thread.sleep(500);
        System.out.println(C.green+"                        =: := ");
		Thread.sleep(500);
        System.out.println(C.green+"                         =: .= ");
		Thread.sleep(500);
        System.out.println(C.green+"                          +-:-+:::::::::...");
		Thread.sleep(500);
        System.out.println(C.green+"                           +. .=   :-   --...+-..:=::::=::::=::::::::::.....");
		Thread.sleep(500);
        System.out.println(C.green+"                            +. .-   -:   -    =   .-   .:   =.   =    +    *....+::.:=="+C.Orange+"                                    -+**+-");
		Thread.sleep(500);
        System.out.println(C.green+"                             +  ::   -.   =   .-   -.   -    =   ::   -.   =    =   .=-       "+C.Orange+"         .:-=+++=-:         #@@@@@@*");
        Thread.sleep(500);
		System.out.println(C.green+"                             .+  ::   -   .-   -.   =   ::   =.   =   .:   =    -   :+:  "+C.Orange+"           -*@@@@@@@@@@@@#+.     %@@@@@@%                                          :@@@@@@@@@:            =@@@@@@@@*");
        Thread.sleep(500);
		System.out.println(C.green+"                              .+  ::   =   ::   =   .-   =    -   =    -   -.   -   -*     "+C.Orange+"       =@@@@@@*+=+*@@@@@@@-    .*%%%#+           =+:                             :@@@@@@@@@#            @@@@@@@@@*                                                         .+=");
        Thread.sleep(500);
		System.out.println(C.green+"                               -+-:==::-*-::+=::-*---+=---*---+----+:::+-::=+:::+:::=*   "+C.Orange+"        +@@@@@+       #@@@@@@.                   -%@@-                             :@@@@@@@@@@:          =@@@@@@@@@*                                                       .*@@#");
        Thread.sleep(500);
		System.out.println(C.green+"                                --  =.  .-   +   -:  .=   =.  ::   +   -   .=   -  .=+   "+C.Orange+"       *@@@@@+        :@@@@@@-                .=%@@@@-                             :@@@@%@@@@@#          %@@@%@@@@@*            .:::-::.                      .:-:.      -*@@@@#");
        Thread.sleep(500);
		System.out.println(C.green+"                                 --  -.  ::   =   -   -:   -   =   -.  ::   =   -  :+-   "+C.Orange+"      -@@@@@@         :@@@@@%.   .#####+   .+%@@@@@@@%####.######          #####:  :@@@@*+@@@@@-        =@@@#+@@@@@*        -*%@@@@@@@@@@@*.        =%@@@= :#@@@@@@@*.=#@@@@@@@@####=");
        Thread.sleep(500);
		System.out.println(C.green+"                                  =:  -   -.  .:   -   =   -   -:   -   =   =   -  :*.   "+C.Orange+"      #@@@@@*         -#%@%+     .@@@@@#   :+++%@@@@@*++++ *@@@@@-        +@@@@%   :@@@@* @@@@@@        @@@@-+@@@@@*      .%@@@@@*-:.:+@@@@@=       *@@@@+*@@@@@@@@@@#+++*@@@@@%++++-");
        Thread.sleep(500);
		System.out.println(C.green+"                                   =.  =   =   -.  ::  .-  .-  .=.::=:::+:::+-::=::=*.   "+C.Orange+"      @@@@@@=                    .@@@@@#       *@@@@@-     .@@@@@%       .@@@@@.   :@@@@* +@@@@@=      +@@@% +@@@@@*      %@@@@@:      +@@@@@:      *@@@@@@#.  :@@@@@@   :@@@@@*");
        Thread.sleep(500);
		System.out.println(C.green+"                                    +:.:=:::=:::+-::=-::=-::+=..=-  -.  =.  =.  -  =+    "+C.Orange+"     -@@@@@@:                    .@@@@@#       *@@@@@-      *@@@@@:      *@@@@+    :@@@@*  @@@@@%     .@@@@: +@@@@@*      *@@@@@       :@@@@@+      *@@@@@@     %@@@@@   :@@@@@*");
        Thread.sleep(500);
		System.out.println(C.green+"                                    .*: .+  .+   +   =   =   =   -  .-  .-  ::..=:-*.  "+C.Orange+"       =@@@@@@:                    .@@@@@#       *@@@@@-      .@@@@@*     .@@@@@.    :@@@@*  =@@@@@-    +@@@*  +@@@@@*       -*##*.      :@@@@@*      *@@@@@*     @@@@#.   :@@@@@*");
        Thread.sleep(500);
		System.out.println(C.green+"                                     .=  ::  :-  .-  ::  ::  -:..=.::+===+===---:::    "+C.Orange+"       =@@@@@@:                    .@@@@@#       *@@@@@-       *@@@@@     +@@@@=     :@@@@*   %@@@@@    @@@@   +@@@@@*                   :@@@@@#      *@@@@@-              :@@@@@*");
        Thread.sleep(500);
		System.out.println(C.green+"                                      :=  :-  ::..-:::+-==+===---:::.           "+C.Orange+"              =@@@@@@:                    .@@@@@#       *@@@@@-       .@@@@@+    @@@@#      :@@@@*   :@@@@@+  *@@@+   +@@@@@*           .-==++**#@@@@@#      *@@@@@-              :@@@@@*");
        Thread.sleep(500);
		System.out.println(C.green+"                                       :+++*+*##%%@@+.                         "+C.Orange+"               -@@@@@@-                    .@@@@@#       *@@@@@-        +@@@@@   =@@@@.      :@@@@*    #@@@@@..@@@@.   +@@@@@*       .+#@@@@@@@%%%@@@@@#      *@@@@@:              :@@@@@*");
        Thread.sleep(500);
		System.out.println(C.green+"                                          .-+++=--..                           "+C.Orange+"                @@@@@@+                    .@@@@@#       *@@@@@-         @@@@@+  @@@@+       :@@@@*    -@@@@@+#@@@+    +@@@@@*      *@@@@@%+:.   :@@@@@#      *@@@@@:              :@@@@@*");
        Thread.sleep(500);
		System.out.println(C.green+"                                        .=+:                                   "+C.Orange+"                #@@@@@%             :-     .@@@@@#       *@@@@@-         +@@@@@ +@@@@        :@@@@*     #@@@@@@@@%     +@@@@@*     %@@@@@*       :@@@@@#      *@@@@@:              :@@@@@*");
        Thread.sleep(500);
		System.out.println(C.green+"                                      .-*:                                       "+C.Orange+"              :@@@@@@=           :@@+    .@@@@@#       *@@@@@-         .@@@@@=@@@@-        :@@@@*     .@@@@@@@@-     +@@@@@*    :@@@@@@        :@@@@@#      *@@@@@:              :@@@@@*");
        Thread.sleep(500);
		System.out.println(C.green+"                                     :+-                                             "+C.Orange+"           +@@@@@@+        .+@@@*    .@@@@@#       *@@@@@-          +@@@@@@@@#         :@@@@*      *@@@@@@%      +@@@@@*    :@@@@@@.       +@@@@@#      *@@@@@:              :@@@@@*");
        Thread.sleep(500);
		System.out.println(C.green+"                                   :++                                                "+C.Orange+"           =@@@@@@@#++++*%@@@@@.    .@@@@@#       *@@@@@+           @@@@@@@@.         :@@@@*       @@@@@@-      +@@@@@*     #@@@@@%-    .+@@@@@@#      *@@@@@:              :@@@@@%");
        Thread.sleep(500);
		System.out.println(C.green+"                                  =*+*+++++++++++++++++=+========================       "+C.Orange+"          :%@@@@@@@@@@@@@@@#.      @@@@@@-      :@@@@@@%:         ..+@@@@+          :@@@@*       +@@@@%       +@@@@@*      +@@@@@@@%%%@@@*@@@@@-     *@@@@@:               %@@@@@@+");
        Thread.sleep(500);
		System.out.println(C.green+"                                  :++++*######*+=====+======+==========****###*==*        "+C.Orange+"          :+#%@@@@@@@%#=.        .+%@@%+.      -#%@@#=           .@@@@@           .++++-       .++++:       -+++++-       .+#@@@@@@@#=  -#@@%+     -+++++.               .*%@@%*:");
        Thread.sleep(500);
		System.out.println(C.green+"                                       .#@@@@#*                        =*%@@@%:            "+C.Orange+"               ....                                             %@@@@-                                                        ...");
        Thread.sleep(500);
		System.out.println(C.green+"                                       =%@@@###.                       +#*@@@%+                "+C.Orange+"                                                           #@@@@*");
        Thread.sleep(500);
		System.out.println(C.green+"                                      :%@**@@+.                         -%@#=%@=                 "+C.Orange+"                                                        *@@@@@.");
        Thread.sleep(500);
		System.out.println(C.green+"                                       =%@@%=                            :#@@%+                    "+C.Orange+"                                                     =@@@@@=");

        Thread.sleep(500);
		System.out.println("      "+C.reset);  
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}    
	
	}
	
	//choose the option

	public void Any(String a)
	{
		switch(a)
		{
			case "1":
                System.out.println();
				System.out.print(C.redbri+"\n	Please Enter Username Or Enter 1.Back: "+C.whitebr);
				Login1();
				break;
			case "2":
				SignUp();
				break;
			case "3":
				System.out.print(C.redbri+"\n	Please Enter Username Or Enter 1.Back: "+C.whitebr);		
				Reset1();
				break;
			case "4":
				System.out.println("\n	Exit Successfull");
				System.exit(0);
			default:
				System.out.println(C.red+C.blink+"\n					Invalid Data Re-Enter any one of the Option Given Below       "+C.reset);
				System.out.print(C.magent+"\n					1. Login   2.Signup  3. Reset Password  4. Exit :"+C.reset);
				Any(sc.next());
				break;
		}
	}
	
	//first login

	public void Login1()
	{
		String a = sc.next();
		if(a.equals(obj1.getterUL()) || a.equals(obj1.getterUS()))
		{
			System.out.print(C.redbri+"\n	Please Enter Password Or Enter 1.Back: "+C.whitebr);
			if(a.equals(obj1.getterUL()))
				Login2();
			else 
				Login3();
		}
		else if(a.equals("1"))
		{
			log();
		}
		else
		{
			System.out.print(C.red+C.blink+"\n	Invalid Username Please Re Enter Or Enter 1.Back: "+C.reset);
			Login1();
		}	
	}
	
	//2nd login
	
	public void Login2()
	{
		String a = sc.next();
		if(a.equals(obj1.getterPL()))
		{
			System.out.print(C.Orange+"\n										Loading "+C.reset);
			try{
			for(int i=1;i<=6;i++)
			{
				Thread.sleep(1000);
				System.out.print(C.Orange+"."+C.reset);
			}
                System.out.println();
				System.out.print(C.greenbr+"\n 								           Log in Successfull......!!"+C.reset);
                System.out.println();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
          //  System.out.println();
			//System.out.println(C.blue+"\n                                                       Choose the catogories...."+C.reset);
             //System.out.println();
			Cart1 o=new Cart1();
            o.cart();
			
		}
		else if(a.equals("1"))
		{
			log();
		}
		else
		{
			System.out.print(C.red+C.blink+"\n Invalid Password Please Re Enter Or Enter 1.Back: "+C.reset);
			Login2();
		}
	}
	
	//3rd log in
	
	public void Login3()
	{
		String a = sc.next();
		if(a.equals(obj1.getterPS()))
		{
			System.out.println(C.greenbr+"\n	                                Login Successfull"+C.reset);
			System.out.print(C.Orange+"\n										Loading "+C.reset);
			try{
			for(int i=1;i<=6;i++)
			{
				Thread.sleep(1000);
				System.out.print(C.Orange+"."+C.reset);
			}
                System.out.println();
				System.out.print(C.greenbr+"\n 								    Log in Successfull"+C.reset);
                System.out.println();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
             //System.out.println();
			//System.out.println(C.blue+"\n                                            Choose the catogories "+C.reset);
             //System.out.println();
			Cart1 o=new Cart1();
            o.cart();
          //  System.out.println();
			//System.out.println(C.blue+"\n                                       Select the Categories  "+C.reset);
            //System.out.println();
			
		}
		else if(a.equals("1"))
		{
			log();
		}
		else
		{
			System.out.print(C.red+C.blink+"\n	Invalid Password Please Re Enter Or Enter 1.Back: "+C.reset);
			Login3();
		}
	}
	
	//sign up strart
	
	public void SignUp()
	{
		System.out.print(C.redbri+"\n	Please Enter Username to Signup Or Enter 1.Back: "+C.reset);
		String a = sc.next();
		if(a.equals("1"))
		{
			log();
		}
		if(a.equals(obj1.getterUL())) 
		{
			System.out.println(C.red+C.blink+"\n	Invalid Existing Username"+C.reset);
			SignUp();
		}
		obj1.SetterUS(a);
		System.out.print(C.redbri+"\n	Please Enter Password to Signup Or Enter 1.Back: "+C.reset);
		String b = sc.next();
		if(b.equals("1"))
		{
			log();
		}
		obj1.SetterPS(b);
        System.out.println();
		System.out.println("\n	                                                    Signup Successfull");
        System.out.println();
		Any("1");
	}
	
	//reset start
	
	public void Reset1()
	{
		String a = sc.next();
		if(a.equals(obj1.getterUL())||a.equals(obj1.getterUS()))
		{
			System.out.print(C.redbri+"\n	Enter Old Password Or Enter 1.Back: "+C.whitebr);
			if(a.equals(obj1.getterUL()))
				Reset2();
			else if(a.equals(obj1.getterUS()))
				Reset3();
		}
		else if(a.equals("1"))
		{
			log();
		}
		else
		{
			System.out.print(C.redbri+C.blink+"\n	Invalid Username Please Re Enter Or Enter 1.Back: "+C.whitebr);
			Reset1();
		}
	}
	
	//reset 2

	public void Reset2()
	{
		String a = sc.next();
		if(a.equals(obj1.getterPL()))
		{
            System.out.println();
			System.out.print(C.redbri+"\n	Enter New Password Or Enter 1.Back: "+C.whitebr);
			String b = sc.next();
			if(b.equals("1"))
			{
				log();
			}
			obj1.SetterPL(b);
            System.out.println();
			System.out.println(C.green+"\n	Password Reset Successfully"+C.reset);
            log();
		}
		else
		{
			System.out.print(C.redbri+C.blink+"\n	Invalid Old Password Please Re Enter Or Enter 1.Back: "+C.whitebr);
			Reset2();
		}
	}
	
	//reset 3
	
	public void Reset3()
	{
		String a = sc.next();
		if(a.equals(obj1.getterPS()))
		{
			System.out.print(C.redbri+"\n	Enter New Password Or Enter 1.Back: "+C.whitebr);
			String b = sc.next();
			if(b.equals("1"))
			{
				log();
			}
			obj1.SetterPL(b);
            System.out.println();
			System.out.println("\n	Password Reset Successfully");
            System.out.println();
            log();
		}
		else
		{
			System.out.print(C.redbri+C.blink+"\n	Invalid Old Password Please Re Enter Or Enter 1.Back: "+C.reset);
			Reset3();
		}
	}
	
	public void log()
	{
        System.out.println();
		System.out.println(C.purple+"\n					Please Enter any one of the Options Given Below       "+C.reset);
		System.out.print(C.cyan+"\n					1. Login   2.Signup  3. Reset Password  4. Exit: "+C.reset);
		Any(sc.next());
	}

	public static void start()
	{
		Login obj = new Login();
		obj.m1();
		obj.log();
	}
}
