package stack;

import java.util.Stack;

public class WebHistory {
	private Stack<String> backWardStack;
	private Stack<String> forWardStack;
	private String currentPage;

	public WebHistory() {
		backWardStack = new Stack<String>();
		forWardStack = new Stack<String>();
		currentPage = "Home Page";
	}

	public void addpage(String url) {
		if (currentPage != null) {
			backWardStack.push(currentPage);
		}
		currentPage = url;
		forWardStack.clear();
	}

	public void previousPage() {
		if (!backWardStack.isEmpty()) {
			forWardStack.push(currentPage);
			currentPage = backWardStack.pop();
		} else {
			System.out.println("You Reached Last Page");
		}
	}

	public void nextPage() {
		if (!forWardStack.isEmpty()) {
			backWardStack.push(currentPage);
			currentPage = forWardStack.pop();
		} else {
			System.out.println("You Reached Home Page");
		}
	}

	public String getCurrenPage() {
		return currentPage;
	}
		
	}


