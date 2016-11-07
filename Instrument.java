public abstract class Instrument {
	  protected String serialNumber;
	  protected double price;

	  public String getSerialNumber() {
		    return serialNumber;
	  }
	  
      public double getPrice() {
		    return price;
	  }

      public void setPrice(float newPrice) {
		    this.price = newPrice;
      }

}
