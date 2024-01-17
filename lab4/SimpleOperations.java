public class SimpleOperations {
    public static double count(String inputString) throws CustomUnsupportedOperationException {
        String[] arr;
        double res;
        int plus = inputString.indexOf('+');
        int minus = inputString.indexOf('-');
        int divide = inputString.indexOf('/');
        int mult = inputString.indexOf('*');
        if (plus != -1) {
            arr = inputString.split("[+]");
            res = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
        } else if (minus != -1) {
            arr = inputString.split("[-]");
            res = Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]);
        } else if (divide != -1) {
            arr = inputString.split("[/]");
            res = (double) Integer.parseInt(arr[0]) / Integer.parseInt(arr[1]);
        } else if (mult != -1) {
            arr = inputString.split("[*]");
            res = (double) Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
        } else {
            throw new CustomUnsupportedOperationException(" operation is not supported");
        }

        return res;

    }
}
