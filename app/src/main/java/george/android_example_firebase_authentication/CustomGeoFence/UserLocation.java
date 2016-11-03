package george.android_example_firebase_authentication.CustomGeoFence;

/**
 * Created by magulo on 10/20/16.
 */

public class UserLocation {
    private double latitude;
    private double longitude;

    public UserLocation(){}

    public UserLocation(String latitude, String longitude) {
        this.latitude = Double.parseDouble(latitude);
        this.longitude = Double.parseDouble(longitude);
    }

    public double getLatitude() {
        return latitude;
    }
    public double getLongitude() {
        return longitude;
    }
}
