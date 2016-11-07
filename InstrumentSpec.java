
public abstract class InstrumentSpec {
	  protected Builder builder; 
	  protected String model;
	  protected Type type;
	  protected Wood backWood;
	  protected Wood topWood;
	  public Builder getBuilder() {
		    return builder;
	  }

	  public String getModel() {
		    return model;
	  }

	  public Type getType() {
		    return type;
		  }

	  public Wood getBackWood() {
		    return backWood;
	  }

	  public Wood getTopWood() {
		    return topWood;
		  }

}
