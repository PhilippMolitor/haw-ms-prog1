package io.philslab.prog1.vorlesung_11;

public class ErrorHandling {
    public static void main(String[] args) {
        // friend vars
        Freund bestFriend = null;
        Freund[] allFriends = new Freund[4];

        // generate new friends (reallife is worse)
        allFriends[0] = new Freund("Hans");
        allFriends[1] = new Freund("Gamb");
        allFriends[2] = null;
        allFriends[3] = new Freund("Kim-Jong");

        // select best friend and handle exceptions
        try {
            bestFriend = allFriends[3]; // CHANGE THIS VALUE TO THROW EXCEPTIONS
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Du hast gar nicht so viele Freunde...");
        }

        // make best friend shout his goddamn name
        try {
            bestFriend.sayName();
        } catch (NullPointerException e) {
            System.out.println("Du hast gar keinen besten Freund...");
        }
    }
}
