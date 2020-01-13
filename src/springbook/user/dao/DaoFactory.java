package springbook.user.dao;

public class DaoFactory {
	public UserDao userDao() {
		return new UserDao(new DConnectionMaker());
	}
	public AccountDao accountDao() {
		return new AccountDao(new DconnectionMaker());
	}
	public MessageDao messageDao() {
		return new Message(new DConnectionMaker());
	}
	public ConnectionMaker connectionMaker() {
		return new DconnectionMaker();
	}
}
