package springbook.user.dao;

import java.sql.SQLException;

public class UserDaoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//ConnectionMaker connectionMaker = new DConnectionMaker();
		//UserDao dao = new UserDao(connectionMaker);
		UserDao dao = new DaoFactory().userDao();
	}
}
