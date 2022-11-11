package SortFriend;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private ArrayList<Friend> friends;
    public void run(){


        friends = FriendCreator.createFriends();
        for(Friend f : friends) {
            System.out.println(f);
        }

            Collections.sort(friends);
            System.out.println("Sorted after ID number");
            for (Friend friend : friends) {
                System.out.println(friend);


            }
        }


    public static void main(String[] args) {
        new Main().run();
    }
}
