
public class TempCalcApp {

	public static void main(String[] args) {
		
		TemperatureConvertor temperatureConverter = new TemperatureConvertor();

		System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(68.0));

	}

}
