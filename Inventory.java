import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private List instruments;

  public Inventory() {
	 instruments = new LinkedList();
  }

  public void addInstrument(String serialNumber, double price, MandolinSpec spec) {
	Mandolin instrument = new Mandolin(serialNumber, price, spec);
	instruments.add(instrument);
  }

  public Mandolin getInstrument(String serialNumber) {
    for (Iterator i = instruments.iterator(); i.hasNext(); ) {
    	Mandolin instrument = (Mandolin)i.next();
      if (instrument.getSerialNumber().equals(serialNumber)) {
        return instrument;
      }
    }
    return null;
  }

  public List search(MandolinSpec searchSpec) {
    List matchingInstruments = new LinkedList();
    for (Iterator i = instruments.iterator(); i.hasNext(); ) {
     Mandolin instrument = (Mandolin)i.next();
      if (instrument.getSpec().matches(searchSpec))
        matchingInstruments.add(instrument);
    }
    return matchingInstruments;
  }
}
