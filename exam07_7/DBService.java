package exam07_7;

public class DBService {
	DBDAO dao;
	
	public void setDAO(DBDAO mySQLDAO){
		this.dao = mySQLDAO;
	}
	public void connect() {
		dao.connect();
	}
}
