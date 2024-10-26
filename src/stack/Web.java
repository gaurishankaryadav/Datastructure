package stack;

public class Web {
	public static void main(String[] args) {
		WebHistory web = new WebHistory();
		web.addpage("htttps://WWW.FlipKart/");
		web.addpage("htttps://WWW.FlipKart/Login/");
		web.addpage("htttps://WWW.FlipKart/Login/Home Page/");
		System.out.println(web.getCurrenPage());
		web.previousPage();
		System.out.println(web.getCurrenPage());
		web.previousPage();
		System.out.println(web.getCurrenPage());
		web.previousPage();
		System.out.println(web.getCurrenPage());
		web.previousPage();
		System.out.println("***************************");
		web.nextPage();
		System.out.println(web.getCurrenPage());
		web.nextPage();
		System.out.println(web.getCurrenPage());
		System.out.println("************New Page***************************");
		web.addpage("htttps://WWW.Amazon/");
		System.out.println(web.getCurrenPage());
		web.nextPage();
		System.out.println(web.getCurrenPage());
	}
}
