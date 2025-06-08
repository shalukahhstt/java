public class FriendMain {
    public static void main(String[] args) {

        // static = Modifies a variable or method belong to the class,
        //               rather than to any specific object.
        //               Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        System.out.println(friend1.name + " " + friend2.name+ " "+ friend3.name+ " "+ friend4.name);

        Friend.showFriends();
    }
}