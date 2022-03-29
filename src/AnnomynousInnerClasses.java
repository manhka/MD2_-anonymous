public class AnnomynousInnerClasses {
    public static void main(String[] args) {
        // anonymous inner class
        Animal animal=new Animal(){
            public void makeNoise(){
                System.out.println("bbbbbbb");
            }
        };
        // anonymous inner class
        Animal animal1= new Animal(){
            void go(){
                System.out.println("i can fly");
            }
        };
       animal.makeNoise();
       animal1.go();

}}
// ANONYMOUS INNER CLASS IS AN INNER CLASS.
// Anonymous inner class without name, can only create an object .
// the purpose is to override a method.
// can be used only one time.
