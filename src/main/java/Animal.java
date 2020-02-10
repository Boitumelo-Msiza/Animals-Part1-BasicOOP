public class Animal {

    private String name;


      public Animal(){

      }

      public void setName(String name){
          this.name = name;
      }

        public void sounds(){

            System.out.println("sound");
        }

        public void eat(){

            System.out.println(name + " eat");
        }
}
