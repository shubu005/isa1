
public class LightBulb {

	
	int watt;
	int price;
	String bname;
	
	
	public LightBulb (int w, int p, String n){
		this.price=p;
		this.bname=n;
		this.watt=w;
	}
	
	
	public void increasePrice(int amount){
		price+=amount;
	}
	
	public void increasePower(int pow){
		watt+=pow;
	}
	
	int getBulbWattage(){
		
		return watt;
		
	}
	
int getBulbPrice(){
		
		return price;
		
	}
	
}
