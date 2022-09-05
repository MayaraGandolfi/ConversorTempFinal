public class ToKelvin {
    public double toKelvinTransform(UnityTemp type, double temp) {
        if (type == UnityTemp.FAHRENHEIT) {
            return (temp - 32) * 5/9 + 273.15;
        } else if (type == UnityTemp.CELSIUS) {
            return temp + 273.15;
        } else {
            return temp;
        }

    }
}
