package task4;

public class StringUtils {

    public static String formatNameAndAddress(String firstName, String lastName, String city, String country) {

        // Форматування імені та адреси

        String formattedName = firstName.toUpperCase() + " " + lastName.toUpperCase();

        String formattedAddress = "City: " + city + ", Country: " + country;

        return formattedName + ", " + formattedAddress;

    }

}
