package lecture.c03core;

public class Servlet1 {
	private Dao1 dao; // dao가 dependency
	
	public void doGet() {
		// request 파라미터 수집/가공
		// business logic 처리
		dao.select();
		// 결과 세팅
		// forward/redirect
	}
}
