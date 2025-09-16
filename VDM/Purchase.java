public class Purchase {
    protected String customerName;
    protected String license; 
    protected int total;      
    protected int cash;       

    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setLicense(String license) { this.license = license; }
    public void setTotal(int total) { this.total = total; }
    public void setCash(int cash) { this.cash = cash; }

    public String getCustomerName() { return customerName; }
    public String getLicense() { return license; }
    public int getTotal() { return total; }
    public int getCash() { return cash; }

    public String getMaskedLicense() {
    if (license == null || license.isEmpty()) {
        return "*****";
    }
    if (license.length() > 5) {
        return license.substring(0, license.length() - 5) + "*****";
    }
    return "*****";
    }

        public int getReturnAmount() { return cash - total; }
    }
