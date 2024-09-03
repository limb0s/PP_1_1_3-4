package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Egor", "Mironov", (byte) 20);
        userDao.saveUser("Alex", "Gorsh", (byte) 22);
        userDao.saveUser("Barbara", "Vening", (byte) 43);
        userDao.saveUser("Ilya", "Belyaev", (byte) 54);
        userDao.getAllUsers().forEach(System.out::println);
        userDao.cleanUsersTable();
        userDao.dropUsersTable();


    }
}
