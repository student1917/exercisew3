/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.data;
import murach.business.User;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author TAM
 */
public class UserDB {
    private static List<User> users = new ArrayList<User>();

    public static void insert(User user) {
        users.add(user);
    }

    public static List<User> getUsers() {
        return users;
    }
}
