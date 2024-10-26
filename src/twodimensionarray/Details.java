package twodimensionarray;

public class Details {
	private String name;
	private String emailId;
	private int age;
	private String PhNo;
	private String movieName;
	private String seatNumber;

	public Details(String name, String emailId, int age, String phNo, String movieName, String seatNumber) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.age = age;
		this.PhNo = phNo;
		this.movieName = movieName;
		this.seatNumber = seatNumber;
	}

	public String getName() {
		return name;
	}

	public String getEmailId() {
		return emailId;
	}

	public int getAge() {
		return age;
	}

	public String getPhNo() {
		return PhNo;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

//	for (int row = 0; row < arr.length; row++) {
//		for (int col = 0; col < arr[row].length; col++) {
//			System.out.print((char) (65 + row) + "" + (col + 1));
//		}
//		System.out.println();
//	}

}


