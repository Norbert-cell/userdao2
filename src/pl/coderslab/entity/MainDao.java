package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {

        UserDao userDao = new UserDao();

        User[] users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);


        }
    }
}
