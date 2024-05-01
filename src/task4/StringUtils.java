package task4;

public class StringUtils {

    public static String formatNameAndAddress(String firstName, String lastName, String city, String country) {
        String formattedName = formatName(firstName, lastName);
        String formattedAddress = formatAddress(city, country);
        return formattedName + ", " + formattedAddress;
    }

    private static String formatName(String firstName, String lastName) {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    private static String formatAddress(String city, String country) {
        return "City: " + city + ", Country: " + country;
    }
}

