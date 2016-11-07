import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

  public static void main(String[] args) {
    // Set up Rick's guitar inventory
    Inventory inventory = new Inventory();
    initializeInventory(inventory);

    MandolinSpec whatErinLikes = new MandolinSpec(Builder.FENDER, "Stratocastor",  Type.ELECTRIC,Style.A, Wood.ALDER, Wood.ALDER);
    List matchingGuitars = inventory.search(whatErinLikes);
    if (!matchingGuitars.isEmpty()) {
      System.out.println("Erin, you might like these mandolins:");
      for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
    	Mandolin guitar = (Mandolin)i.next();
        MandolinSpec spec = guitar.getSpec();
        System.out.println("  We have a " +
          spec.getBuilder() + " " + spec.getModel() + " " +
          spec.getType() + " mandolin:\n     " +
          spec.getBackWood() + " back and sides,\n     " +
          spec.getTopWood() + " top.\n  You can have it for only $" +
          guitar.getPrice() + "!\n  ----");
      }
    } else {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }
  }

  private static void initializeInventory(Inventory inventory) {
    inventory.addInstrument("11277", 3999.95, new MandolinSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, Style.A, Wood.INDIAN_ROSEWOOD, Wood.SITKA));
    inventory.addInstrument("V95693", 1499.95, new MandolinSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Style.F, Wood.ALDER, Wood.ALDER));
    inventory.addInstrument("V9512", 1549.95, new MandolinSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Style.A, Wood.ALDER, Wood.ALDER));
    inventory.addInstrument("122784", 5495.95, new MandolinSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, Style.DOUBLE_NECK, Wood.MAHOGANY, Wood.ADIRONDACK));
    inventory.addInstrument("76531", 6295.95, new MandolinSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, Style.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
    inventory.addInstrument("70108276", 2295.95, new MandolinSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, Style.F, Wood.MAHOGANY, Wood.MAHOGANY));
    inventory.addInstrument("82765501", 1890.95, new MandolinSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, Style.BLOWBACK, Wood.MAHOGANY, Wood.MAHOGANY));
    inventory.addInstrument("77023", 6275.95,  new MandolinSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, Style.A, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
    inventory.addInstrument("1092", 12995.95, new MandolinSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, Style.F, Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
    inventory.addInstrument("566-62", 8999.95, new MandolinSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, Style.ELECTRIC,Wood.COCOBOLO, Wood.CEDAR));
    inventory.addInstrument("6 29584", 2100.95, new MandolinSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC, Style.A, Wood.MAHOGANY, Wood.MAPLE));
  }
}
