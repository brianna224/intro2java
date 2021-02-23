/**************************************
*Brianna Patrick
*Lab03
*02/09/21
***************************************/
public class Expressions 
{
  public static void main(String[] args)
  {
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    
    /**********************************************************
     * 3 and 4 are added with sum 7       
     * 7 is divided by 5 with 1 the result of integer division
     * The value displayed is 1
     ***********************************************************/
    System.out.println("#1 " + ((a + b) / c));   
    
    /**********************************************************
     * Because division has higher precedence, 4 is divided by 5 with 0 the result of integer division       
     * 3 is added to 0 with sum 3
     *  The value displayed is 3
     ***********************************************************/
    System.out.println("#2 " + (a + b / c));       

     /*********************************************************
     * Add 1 to 3 with sum 4
     * a will be assigned to 4
     * The value displayed is 4
     *********************************************************/ 
     System.out.println("#3 " + (++a));   

    /*******************************************************
    * Subtract 1 from 4 with result 3
    * a will be assigned to 3
    * The value displayed is 3
    *******************************************************/    
    System.out.println("#4 " + (--a));

    /*****************************************************
    * Add 1 to 3 with sum 4 and returns the old value in variable
    * The value displayed is 3
    *****************************************************/
    System.out.println("#5 " + (a++));    

    /****************************************************
    * Subtract 1 from 4 with result 3 and returns the old value in variable
    * The value displayed is 4
    *****************************************************/   
    System.out.println("#6 " + (a--));

    /****************************************************
    * 3 is added to 1 with sum 4
    * The value displayed is 4
    ****************************************************/ 
    System.out.println("#7 " + (a + 1));      

    /***************************************************
    * 17 is divided 5
    * The remainder after dividing is 2
    * The value displayed is 2
    ****************************************************/
    System.out.println("#8 " + (d % c));  

    /***************************************************
    * 17 is divided by 5 with 3 the result of integer division
    * The value displayed is 3
    ****************************************************/     
    System.out.println("#9 " + (d / c));    

    /****************************************************
    * 17 is divided by 4
    * The remainder after dividing is 1
    * The value displayed is 1
    ****************************************************/   
    System.out.println("#10 " + (d % b)); 

    /**************************************************
    * 17 is divided by 4 with 4 the result of integer division
    * The value displayed is 4
    **************************************************/      
    System.out.println("#11 " + (d / b));      

    /**************************************************
    * Because division has higher precedence, 3 is divided by 17 with 0 the result of integer division
    * 17 is added to 0 with sum 17
    * 17 is added to 4 with sum 21
    * The value displayed is 21
    **************************************************/
    System.out.println("#12 " + (d + a / d + b)); 

    /**************************************************
    * 17 is added to 3 with sum 20
    * 17 is added to 4 with sum 21
    * 20 is divided by 21 with 0 the result of integer division
    * The value displayed is 0
    **************************************************/      
    System.out.println("#13 " + ((d + a) / (d + b)));   

    /*************************************************
    * The square root of 4 results in 2.0
    * The value displayed is 2.0
    **************************************************/    
    System.out.println("#14 " + (Math.sqrt(b)));     

    /************************************************
    * 3 is raised to the degree of 4 with result 81.0
    * The value displayed is 81.0
    *************************************************/
    System.out.println("#15 " + (Math.pow(a, b)));   

    /************************************************
    * The absolute value of -3 with result 3
    * The value displayed is 3
    ***********************************************/  
    System.out.println("#16 " + (Math.abs(-a)));

    /************************************************
    * The larger integer comparing 3 and 4 results in 4
    * The value displayed is 4
    ************************************************/
    System.out.println("#17 " + (Math.max(a, b)));    
  } 
} 
