public class MandolinSpec extends InstrumentSpec {
	  private Style style;

	  public MandolinSpec(Builder builder, String model, Type type, Style style, Wood backWood, Wood topWood) {
	    this.builder = builder;
	    this.model = model;
	    this.type = type;
	    this.style = style;
	    this.backWood = backWood;
	    this.topWood = topWood;
	  }

	  public Style getStyle() {
	    return style;
	  }

	  public boolean matches(MandolinSpec otherSpec) {
	    if (builder != otherSpec.builder)
	      return false;
	    if ((model != null) && (!model.equals("")) &&  (!model.toLowerCase().equals(otherSpec.model.toLowerCase())))
	      return false;
	    if (type != otherSpec.type)
	      return false;
	    if (style != otherSpec.style)
	      return false;
	    if (backWood != otherSpec.backWood)
	      return false;
	    if (topWood != otherSpec.topWood)
	      return false;
	    return true;
	  }

}
