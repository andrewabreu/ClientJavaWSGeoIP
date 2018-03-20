package parser;

import clientjavawsgeoip.ClientJavaWSGeoIP;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import newdatasets.GeoIP;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class ParserSimpleXML {
    public static GeoIP getGeoIPObject(String ip){
        GeoIP geoIp = null;
        try {
            URL url = new URL("http://www.webservicex.net/geoipservice.asmx/GetGeoIP?IPAddress=" + ip);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            geoIp = new GeoIP();
            Serializer s = new Persister();
            try {
                s.read(geoIp,connection.getInputStream());
            } catch (Exception ex) {
                Logger.getLogger(ClientJavaWSGeoIP.class.getName()).log(Level.SEVERE, null, ex);
            }    
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientJavaWSGeoIP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientJavaWSGeoIP.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return geoIp;
    }
    
    public static GeoIP getGeoIPContextObject(){
        GeoIP geoIp = null;
        try {
            URL url = new URL("http://www.webservicex.net/geoipservice.asmx/GetGeoIPContext");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            geoIp = new GeoIP();
            Serializer s = new Persister();
            try {
                s.read(geoIp,connection.getInputStream());
            } catch (Exception ex) {
                Logger.getLogger(ClientJavaWSGeoIP.class.getName()).log(Level.SEVERE, null, ex);
            }    
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientJavaWSGeoIP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientJavaWSGeoIP.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return geoIp;        
    }
    
}
