
public class Yemek {

	private String ad;
	private double fiyat;
	private int adet;
	
	
	public Yemek(String ad, double fiyat, int adet) {
		super();
		this.ad = ad;
		this.fiyat = fiyat;
		this.adet = adet;
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	public int getAdet() {
		return adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	
}
