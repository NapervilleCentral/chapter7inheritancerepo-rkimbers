

public class AnimalsClient
{
   //-----------------------------------------------------------------
   /**  Instantiates a Animal and Reptile object and prints information
   //  about them.
   */
   public static void main (String[] args)
   {

      //Animal bob = new Animal("Mammal");
      //System.out.println(bob  );
      
      Snake Putin = new Snake(10);
      System.out.println(Putin.getType());

      //Reptile sue = new Reptile();
      //System.out.println(sue.getType()  );
      //System.out.println( sue );

      Cobra Vlodo = new Cobra();
      
      System.out.println(Putin);
      
      Vlodo.bite(Putin);
      
      System.out.println(Putin);
      

       Platypus RyanJr = new Platypus();
       
       Vlodo.bite(RyanJr);
       
       System.out.println(RyanJr);
       
       
     /*
     /*
     */





   }
}
