// EM Statement.java

public abstract class Statement {

   // MÉTODOS ABSTRATOS QUE TRATAM A FORMATAÇÃO ESPECÍFICA
   public abstract String headerString(Customer aCustomer);
   public abstract String eachRentalString(Rental each);
   public abstract String footerString(Customer aCustomer);
}