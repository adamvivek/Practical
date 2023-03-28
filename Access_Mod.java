package acc;
import Access_Mod.display; 
class AccessMod extends Private_AM {
    public static void main(String[] args) {
    // create an object of Dog class
    	AccessMod dog = new AccessMod();
         // access protected method
        dog.display();
    }
}