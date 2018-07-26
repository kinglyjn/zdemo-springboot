package test01.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {
	
	@Autowired
	private GirlDao girlDao;
	
	
	/**
	 * 测试事务
	 * 
	 */
	@Transactional
	public void addTwoGirls() {
		girlDao.save(new Girl("小娟", "B"));
		Integer.valueOf("aaa");
		girlDao.save(new Girl("小花", "C"));
	}
}
