package raconcepts;

public class MethodChaining {
	
//	String place;
//	String modeOfTravel;
//	public String getPlace() {
//		return place;
//	}
//
//	public void setPlace(String place) {
//		this.place = place;
//	}
//	public String getModeOfTravel() {
//		return modeOfTravel;
//	}
//	public void setModeOfTravel(String modeOfTravel) {
//		this.modeOfTravel = modeOfTravel;
//	}
//	public void whereGoing() {
//		System.out.println(getPlace());
//		System.out.println("Are you going to "+getPlace()+" by "+getModeOfTravel());
//	}
//	public static void main(String[] args) {
//		MethodChaining chain=new MethodChaining();
//		chain.setPlace("Chennai");
//		chain.setModeOfTravel("Car");
//		chain.whereGoing();

		
		
		String place;
		String modeOfTravel;
	public String getPlace() {
			return place;
		}

	public MethodChaining setPlace(String place) {
			this.place = place;
			return this;
		}
	public String getModeOfTravel() {
			return modeOfTravel;
		}
	public MethodChaining setModeOfTravel(String modeOfTravel) {
			this.modeOfTravel = modeOfTravel;
			return this;
		}
	public void whereGoing() {
		System.out.println(getPlace());
		System.out.println("Are you going to "+getPlace()+" by "+getModeOfTravel());
	}
	public static void main(String[] args) {
			MethodChaining chain=new MethodChaining();
			chain.setPlace("Chennai").setModeOfTravel("Car").whereGoing();

	}

}
