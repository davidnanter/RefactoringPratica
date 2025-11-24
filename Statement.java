import java.util.Enumeration;

public abstract class Statement {

   // ESTE É O TEMPLATE METHOD (MOVIDO DE TextStatement/HtmlStatement)
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = headerString(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         result += eachRentalString(each);
      }
      result += footerString(aCustomer);
      return result;
   }
   
   // MÉTODOS ABSTRATOS (IMPLEMENTADOS NAS SUBCLASSES)
   public abstract String headerString(Customer aCustomer);
   public abstract String eachRentalString(Rental each);
   public abstract String footerString(Customer aCustomer);
}