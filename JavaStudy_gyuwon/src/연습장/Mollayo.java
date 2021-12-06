package 연습장;

public class Mollayo{
	public static void main(String[] args) {
		gocoder gcd=new gocoder();
		gcd.setName("이규원");
		gcd.setBlog("lee99won의 블로그");
		System.out.println("name: "+gcd.getName());
		System.out.println("blog: "+gcd.getBlog());
	}
}
class gocoder {
	private String name;
	private String blog;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBlog() {
		return blog;
	}
	public void setBlog(String blog) {
		this.blog = blog;
	}
}