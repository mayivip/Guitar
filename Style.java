public enum Style {
	BLOWBACK,FLATBACK,A,F,ELECTRIC,DOUBLE_NECK,BANJO;

	  public String toString() {
	    switch(this) {
	      case BLOWBACK: return "Blowback";
	      case FLATBACK: return "Flatback";
	      case A: return "A";
	      case F: return "F";
	      case ELECTRIC: return "Electric";
	      case DOUBLE_NECK: return "Double-neck";
	      case BANJO: return "banjo";
	      default:       return "unspecified";
	    }
	  }

}
