package document;

public interface DocTest {
	public static void main(String[] args) {
		JavaDocTest test = null;
		
		// 해당 메소드에 마우스 올리면 내가 제작한 문서 보임
		test.methodAdd(0,0);
		test.methodTest(0, 0);
	}
}
