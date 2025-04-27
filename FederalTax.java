// Federal Tax Class - J5A_Jasso
// Ricardo Jasso - BCIS 3630.2

/*
FederalTax
**********
-taxPayerID
-marStat
-income
-exemptAmt
***********
+FederalTax()
+ FederalTax(txPayID : String)
+ FederalTax(txPayID : String, mStat : String,
                  exAmt : double, inc : double
+ setTaxPayerID(txPayID : String) : void
+ setMarStatus(mStat : String) : void
+ setExemptAmt(exAmt : double) : void
+ setExemptAmt(exAmt : String) : void
+ setIncomeAmt(inc : double) : void
+ setIncomeAmt(inc : String) : void
+ getTaxPayerID() : String
+ getMarStatus() : String
+ getExemptAmt() : double
+ getIncomeAmt() : double
+ getFedTaxAmt() : double
*/

public class FederalTax
{
   private String taxPayerID ;
   private char marStat ;
   private double income ;
   private double exemptAmt ;
   
   public FederalTax()
   {
      taxPayerID = "";
      marStat = ' ';
      income = 0.0;
      exemptAmt = 0.0;
   }
   public FederalTax(String txPayID)
   {
      taxPayerID = txPayID;
      marStat = ' ';
      income = 0.0;
      exemptAmt = 0.0;
   }
   public FederalTax(String txPayID, char mStat, double inc, double exAmt)
   {
      taxPayerID = txPayID;
      marStat = mStat;
      exemptAmt = exAmt;
      income = inc;
   }
   public void setTaxPayerID(String txPayID)
   {
      taxPayerID = txPayID;
   }
    public void setMarStatus(char mStat)
   {
      marStat = mStat;
   }
    public void setExemptAmt(double exAmt)
   {
      exemptAmt = exAmt;
   }
    public void setExemptAmt(String exAmtStr)
   {
      double exAmt = Double.parseDouble(exAmtStr);
      setExemptAmt(exAmt);
   }
    public void setIncomeAmt(double inc)
   {
      income = inc;
   }
    public void setIncomeAmt(String incStr)
   {
      double inc = Double.parseDouble(incStr);
      setIncomeAmt(inc);
   }
   public String getTaxPayerID()
   {
      return taxPayerID;
   }
   public String getMarStatus()
   {
      if (marStat == 'M')
      {
         return "M" ;
      }
      else if (marStat == 'S')
      {
      return "S";
      }
      else 
      {
         return "";
      }
   }
   public double getExemptAmt()
   {
      return exemptAmt;
   }
   public double getIncomeAmt()
   {
      return income;
   }
   public double getFedTaxAmt()
   {
      double taxRate;
      if (marStat == 'M')
      {
         if (income > 50000)
         {
            taxRate = 0.20;
         } 
      else 
      {
         taxRate = 0.15;
      }
   }
   else if (marStat == 'S')
   {
      if (income > 30000)
         {
            taxRate = 0.20;
         } 
         else
         {
            taxRate = 0.15;
         }
      }
      else
      {
         taxRate = 0.0;
      }
      return (income - exemptAmt) * taxRate;
    }
    
}
