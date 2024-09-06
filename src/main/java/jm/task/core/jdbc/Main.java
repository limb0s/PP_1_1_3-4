package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("Egor", "Mironov", (byte) 20);
        userDaoHibernate.saveUser("Alex", "Gorsh", (byte) 22);
        userDaoHibernate.saveUser("Barbara", "Vening", (byte) 43);
        userDaoHibernate.saveUser("Ilya", "Belyaev", (byte) 54);
        userDaoHibernate.getAllUsers().forEach(System.out::println);
        userDaoHibernate.cleanUsersTable();
        userDaoHibernate.dropUsersTable();






    }
}
