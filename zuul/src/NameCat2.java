

public class NameCat2 {
	
	// 필드
	private String name;
	private int age;
	
	/**
	 * 구성자
	 */
	public NameCat2() { }
	
	/**
	 * 구성자
	 * @param name 이름
	 */
	public NameCat2(String name) {
		this.name = name;
	}
	
	/**
	 * 구성자
	 * @param name 이름
	 * @param age 나이
	 */
	public NameCat2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 먹는 동작 출력
	 */
	public void eat() {
		System.out.println("Nom nom nom!");
	}
	
	/**
	 * "야옹" 출력
	 */
	public void yaong() {
		System.out.println("meow~");
	}
	
	/**
	 * 이름을 설정한다.
	 * @param name 이름
	 */
	public void setName(String name) { 
		this.name = name; 
	}
	
	/**
	 * 나이를 설정한다.
	 * @param age 나이
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 이름을 확인한다.
	 * @return name 이름
	 */
	public String getName() { 
		return name; 
	}
	
	/**
	 * 나이를 확인한다.
	 * @return age 나이
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * 객체의 상태를 출력한다.
	 * @return 객체의 이름과 나이
	 */
	@Override
	public String toString() {
		return "NameCat2 [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		NameCat2 c1 = new NameCat2(); // 이름과 나이를 따로 설정
		c1.setName("Cleo");
		c1.setAge(20);
		
		NameCat2 c2 = new NameCat2("Bella"); // 이름을 생성자로 초기화
		c2.setAge(21);
		
		NameCat2 c3 = new NameCat2("Kitty", 19); // 이름과 나이 모두 생성자로 초기화
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		
		
		
		
	}
}
