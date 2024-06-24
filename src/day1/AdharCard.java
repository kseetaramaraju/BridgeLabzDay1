package day1;

public class AdharCard {

	long adharNo;
	String name;

	public static AdharCard ad;

	private AdharCard(long adharNo, String name) {
		super();
		this.adharNo = adharNo;
		this.name = name;
	}

	public static AdharCard helper()
	{
		if(ad==null)
		{
			ad=new AdharCard(215703260000l,"Seetaramaraju");
		}
		else
		{
			System.out.println(" Second Time Can Not Create Object ");
		}
		return ad;
	}

	@Override
	public String toString() {
		return "AdharCard [adharNo=" + adharNo + ", name=" + name + "]";
	}




}
