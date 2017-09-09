package exercises;

public class Ex15 {

	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public  Ex15(String id, String desc, int qty, double UnitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = UnitPrice;
				
	}

	public String getId() {
		return id;
	}


	public String getDesc() {
		return desc;
	}

	
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getTotal(double unitPrice, int qty) {
		return unitPrice*qty;
	}

	@Override
	public String toString() {
		return "Ex15 [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	}
	
	
	
	
	
	
	
	
}
