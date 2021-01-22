
public class Country implements Comparable<Country> {
    private final String name;
    private final int year;
    private final String sex;
    private final double literacyRate; 

    public Country(String name, int year, String sex, double literacyRate) {
        this.name = name;
        this.year = year;
        this.sex = sex;
        this.literacyRate = literacyRate;
    }

    public double getLiteracyRate() {
        return literacyRate;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.year + "), " + this.sex + ", " + this.literacyRate;
    }
        
    @Override
    public int compareTo(Country o) {
        if(this.literacyRate < o.getLiteracyRate()){
            return -1;
        } else if(o.getLiteracyRate() < this.literacyRate){
            return 1;
        } else {
            return 0;
        }
    }
}
