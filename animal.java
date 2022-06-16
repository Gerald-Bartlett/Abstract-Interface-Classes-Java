// abstract class Animal2{
//     // 3 methods eat, talk & walk
  
//     abstract void eat();    
//     abstract void talk();    
//     abstract void walk();
// }
// ----------------

// class tiger extends Animal2{
//     // 3 methods eat, talk & walk
//     void eat(){
//         System.out.println(" tiger method eat() is called");
//     }
//     void
//     talk(){
//         System.out.println("  tiger method talk() is called");
//     }
//     void
//   walk(){
//         System.out.println("  tiger method walk() is called");
//     }
// }
// //----------------
// class elephant extends Animal2{
//     // 3 methods eat, talk & walk
//     void eat(){
//         System.out.println("  elephant method eat() is called");
//     }
//     void
//     talk(){
//         System.out.println("  elephant method talk() is called");
//     }
//     void walk(){
//         System.out.println("  elephant method walk() is called");
//     }
// }
// ----------------
// class Test{
//     public static void main(String[] args) {
//         Animal2 zoo[];
//         zoo = new Animal2[3];
//         zoo[0] = new tiger();
//         zoo[1] = new elephant();
//         // zoo[2] = new tiger();

//         for(Animal2 a: zoo){
//             a.eat();
//             a.talk();
//             a.walk();
//         }
      
//     }
// }
interface Animal2{// all methods of an interface is public abstract by default
    void eat();
    void talk();
    void walk();
}
class tiger implements Animal2{
    // 3 methods eat, talk & walk
    public void eat(){
        System.out.println(" tiger method eat() is called");
    }
    public void talk(){
        System.out.println("  tiger method talk() is called");
    }
   public void walk(){
        System.out.println("  tiger method walk() is called");
    }
}
// //----------------
class elephant implements Animal2{
    // 3 methods eat, talk & walk
    public void eat(){
        System.out.println("  elephant method eat() is called");
    }
    public void talk(){
        System.out.println("  elephant method talk() is called");
    }
    public void walk(){
        System.out.println("  elephant method walk() is called");
    }
}
// // ----------------
class Test{
    public static void main(String[] args) {
        Animal2 zoo[];
        zoo = new Animal2[3];
        zoo[0] = new tiger();
        zoo[1] = new elephant();
        zoo[2] = new tiger();

        for(Animal2 a: zoo){
            a.eat();
            a.talk();
            a.walk();
        }
      
    }
}
