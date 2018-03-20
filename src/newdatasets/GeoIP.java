package newdatasets;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="GeoIP")
public class GeoIP {
    @Element(name="ReturnCode", required=false)
    private String returnCode;
    @Element(name="IP", required=false)
    private String ip;
    @Element(name="ReturnCodeDetails", required=false)
    private String returnCodeDetails;
    @Element(name="CountryName", required=false)
    private String countryName;
    @Element(name="CountryCode", required=false)
    private String countryCode;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getReturnCodeDetails() {
        return returnCodeDetails;
    }

    public void setReturnCodeDetails(String returnCodeDetails) {
        this.returnCodeDetails = returnCodeDetails;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    
    
}
