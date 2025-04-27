package com.client.weatherclient.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeatherReportParameters implements WeatherReport {

	private static  Map<String, String> countryCodeMap;
	static {
		countryCodeMap = new HashMap<>();
		countryCodeMap.put("AF", "Afghanistan");
		countryCodeMap.put("AX", "Åland Islands");
		countryCodeMap.put("AL", "Albania");
		countryCodeMap.put("DZ", "Algeria");
		countryCodeMap.put("AS", "American Samoa");
		countryCodeMap.put("AD", "Andorra");
		countryCodeMap.put("AO", "Angola");
		countryCodeMap.put("AI", "Anguilla");
		countryCodeMap.put("AQ", "Antarctica");
		countryCodeMap.put("AG", "Antigua and Barbuda");
		countryCodeMap.put("AR", "Argentina");
		countryCodeMap.put("AM", "Armenia");
		countryCodeMap.put("AW", "Aruba");
		countryCodeMap.put("AU", "Australia");
		countryCodeMap.put("AT", "Austria");
		countryCodeMap.put("AZ", "Azerbaijan");
		countryCodeMap.put("BH", "Bahrain");
		countryCodeMap.put("BS", "Bahamas");
		countryCodeMap.put("BD", "Bangladesh");
		countryCodeMap.put("BB", "Barbados");
		countryCodeMap.put("BY", "Belarus");
		countryCodeMap.put("BE", "Belgium");
		countryCodeMap.put("BZ", "Belize");
		countryCodeMap.put("BJ", "Benin");
		countryCodeMap.put("BM", "Bermuda");
		countryCodeMap.put("BT", "Bhutan");
		countryCodeMap.put("BO", "Bolivia, Plurinational State of");
		countryCodeMap.put("BQ", "Bonaire, Sint Eustatius and Saba");
		countryCodeMap.put("BA", "Bosnia and Herzegovina");
		countryCodeMap.put("BW", "Botswana");
		countryCodeMap.put("BV", "Bouvet Island");
		countryCodeMap.put("BR", "Brazil");
		countryCodeMap.put("IO", "British Indian Ocean Territory");
		countryCodeMap.put("BN", "Brunei Darussalam");
		countryCodeMap.put("BG", "Bulgaria");
		countryCodeMap.put("BF", "Burkina Faso");
		countryCodeMap.put("BI", "Burundi");
		countryCodeMap.put("KH", "Cambodia");
		countryCodeMap.put("CM", "Cameroon");
		countryCodeMap.put("CA", "Canada");
		countryCodeMap.put("CV", "Cape Verde");
		countryCodeMap.put("KY", "Cayman Islands");
		countryCodeMap.put("CF", "Central African Republic");
		countryCodeMap.put("TD", "Chad");
		countryCodeMap.put("CL", "Chile");
		countryCodeMap.put("CN", "China");
		countryCodeMap.put("CX", "Christmas Island");
		countryCodeMap.put("CC", "Cocos (Keeling) Islands");
		countryCodeMap.put("CO", "Colombia");
		countryCodeMap.put("KM", "Comoros");
		countryCodeMap.put("CG", "Congo");
		countryCodeMap.put("CD", "Congo, the Democratic Republic of the");
		countryCodeMap.put("CK", "Cook Islands");
		countryCodeMap.put("CR", "Costa Rica");
		countryCodeMap.put("CI", "Côte d'Ivoire");
		countryCodeMap.put("HR", "Croatia");
		countryCodeMap.put("CU", "Cuba");
		countryCodeMap.put("CW", "Curaçao");
		countryCodeMap.put("CY", "Cyprus");
		countryCodeMap.put("CZ", "Czech Republic");
		countryCodeMap.put("DK", "Denmark");
		countryCodeMap.put("DJ", "Djibouti");
		countryCodeMap.put("DM", "Dominica");
		countryCodeMap.put("DO", "Dominican Republic");
		countryCodeMap.put("EC", "Ecuador");
		countryCodeMap.put("EG", "Egypt");
		countryCodeMap.put("SV", "El Salvador");
		countryCodeMap.put("GQ", "Equatorial Guinea");
		countryCodeMap.put("ER", "Eritrea");
		countryCodeMap.put("EE", "Estonia");
		countryCodeMap.put("ET", "Ethiopia");
		countryCodeMap.put("FK", "Falkland Islands (Malvinas)");
		countryCodeMap.put("FO", "Faroe Islands");
		countryCodeMap.put("FJ", "Fiji");
		countryCodeMap.put("FI", "Finland");
		countryCodeMap.put("FR", "France");
		countryCodeMap.put("GF", "French Guiana");
		countryCodeMap.put("PF", "French Polynesia");
		countryCodeMap.put("TF", "French Southern Territories");
		countryCodeMap.put("GA", "Gabon");
		countryCodeMap.put("GM", "Gambia");
		countryCodeMap.put("GE", "Georgia");
		countryCodeMap.put("DE", "Germany");
		countryCodeMap.put("GH", "Ghana");
		countryCodeMap.put("GI", "Gibraltar");
		countryCodeMap.put("GR", "Greece");
		countryCodeMap.put("GL", "Greenland");
		countryCodeMap.put("GD", "Grenada");
		countryCodeMap.put("GP", "Guadeloupe");
		countryCodeMap.put("GU", "Guam");
		countryCodeMap.put("GT", "Guatemala");
		countryCodeMap.put("GG", "Guernsey");
		countryCodeMap.put("GN", "Guinea");
		countryCodeMap.put("GW", "Guinea-Bissau");
		countryCodeMap.put("GY", "Guyana");
		countryCodeMap.put("HT", "Haiti");
		countryCodeMap.put("HM", "Heard Island and McDonald Islands");
		countryCodeMap.put("VA", "Holy See (Vatican City State)");
		countryCodeMap.put("HN", "Honduras");
		countryCodeMap.put("HK", "Hong Kong");
		countryCodeMap.put("HU", "Hungary");
		countryCodeMap.put("IS", "Iceland");
		countryCodeMap.put("IN", "India");
		countryCodeMap.put("ID", "Indonesia");
		countryCodeMap.put("IR", "Iran, Islamic Republic of");
		countryCodeMap.put("IQ", "Iraq");
		countryCodeMap.put("IE", "Ireland");
		countryCodeMap.put("IM", "Isle of Man");
		countryCodeMap.put("IL", "Israel");
		countryCodeMap.put("IT", "Italy");
		countryCodeMap.put("JM", "Jamaica");
		countryCodeMap.put("JP", "Japan");
		countryCodeMap.put("JE", "Jersey");
		countryCodeMap.put("JO", "Jordan");
		countryCodeMap.put("KZ", "Kazakhstan");
		countryCodeMap.put("KE", "Kenya");
		countryCodeMap.put("KI", "Kiribati");
		countryCodeMap.put("KP", "Korea, Democratic People's Republic of");
		countryCodeMap.put("KR", "Korea, Republic of");
		countryCodeMap.put("KW", "Kuwait");
		countryCodeMap.put("KG", "Kyrgyzstan");
		countryCodeMap.put("LA", "Lao People's Democratic Republic");
		countryCodeMap.put("LV", "Latvia");
		countryCodeMap.put("LB", "Lebanon");
		countryCodeMap.put("LS", "Lesotho");
		countryCodeMap.put("LR", "Liberia");
		countryCodeMap.put("LY", "Libya");
		countryCodeMap.put("LI", "Liechtenstein");
		countryCodeMap.put("LT", "Lithuania");
		countryCodeMap.put("LU", "Luxembourg");
		countryCodeMap.put("MO", "Macao");
		countryCodeMap.put("MK", "Macedonia, the Former Yugoslav Republic of");
		countryCodeMap.put("MG", "Madagascar");
		countryCodeMap.put("MW", "Malawi");
		countryCodeMap.put("MY", "Malaysia");
		countryCodeMap.put("MV", "Maldives");
		countryCodeMap.put("ML", "Mali");
		countryCodeMap.put("MT", "Malta");
		countryCodeMap.put("MH", "Marshall Islands");
		countryCodeMap.put("MQ", "Martinique");
		countryCodeMap.put("MR", "Mauritania");
		countryCodeMap.put("MU", "Mauritius");
		countryCodeMap.put("YT", "Mayotte");
		countryCodeMap.put("MX", "Mexico");
		countryCodeMap.put("FM", "Micronesia, Federated States of");
		countryCodeMap.put("MD", "Moldova, Republic of");
		countryCodeMap.put("MC", "Monaco");
		countryCodeMap.put("MN", "Mongolia");
		countryCodeMap.put("ME", "Montenegro");
		countryCodeMap.put("MS", "Montserrat");
		countryCodeMap.put("MA", "Morocco");
		countryCodeMap.put("MZ", "Mozambique");
		countryCodeMap.put("MM", "Myanmar");
		countryCodeMap.put("NA", "Namibia");
		countryCodeMap.put("NR", "Nauru");
		countryCodeMap.put("NP", "Nepal");
		countryCodeMap.put("NL", "Netherlands");
		countryCodeMap.put("NC", "New Caledonia");
		countryCodeMap.put("NZ", "New Zealand");
		countryCodeMap.put("NI", "Nicaragua");
		countryCodeMap.put("NE", "Niger");
		countryCodeMap.put("NG", "Nigeria");
		countryCodeMap.put("NU", "Niue");
		countryCodeMap.put("NF", "Norfolk Island");
		countryCodeMap.put("MP", "Northern Mariana Islands");
		countryCodeMap.put("NO", "Norway");
		countryCodeMap.put("OM", "Oman");
		countryCodeMap.put("PK", "Pakistan");
		countryCodeMap.put("PW", "Palau");
		countryCodeMap.put("PS", "Palestine, State of");
		countryCodeMap.put("PA", "Panama");
		countryCodeMap.put("PG", "Papua New Guinea");
		countryCodeMap.put("PY", "Paraguay");
		countryCodeMap.put("PE", "Peru");
		countryCodeMap.put("PH", "Philippines");
		countryCodeMap.put("PN", "Pitcairn");
		countryCodeMap.put("PL", "Poland");
		countryCodeMap.put("PT", "Portugal");
		countryCodeMap.put("PR", "Puerto Rico");
		countryCodeMap.put("QA", "Qatar");
		countryCodeMap.put("RE", "Réunion");
		countryCodeMap.put("RO", "Romania");
		countryCodeMap.put("RU", "Russian Federation");
		countryCodeMap.put("RW", "Rwanda");
		countryCodeMap.put("BL", "Saint Barthélemy");
		countryCodeMap.put("SH", "Saint Helena, Ascension and Tristan da Cunha");
		countryCodeMap.put("KN", "Saint Kitts and Nevis");
		countryCodeMap.put("LC", "Saint Lucia");
		countryCodeMap.put("MF", "Saint Martin (French part)");
		countryCodeMap.put("PM", "Saint Pierre and Miquelon");
		countryCodeMap.put("VC", "Saint Vincent and the Grenadines");
		countryCodeMap.put("WS", "Samoa");
		countryCodeMap.put("SM", "San Marino");
		countryCodeMap.put("ST", "Sao Tome and Principe");
		countryCodeMap.put("SA", "Saudi Arabia");
		countryCodeMap.put("SN", "Senegal");
		countryCodeMap.put("RS", "Serbia");
		countryCodeMap.put("SC", "Seychelles");
		countryCodeMap.put("SL", "Sierra Leone");
		countryCodeMap.put("SG", "Singapore");
		countryCodeMap.put("SX", "Sint Maarten (Dutch part)");
		countryCodeMap.put("SK", "Slovakia");
		countryCodeMap.put("SI", "Slovenia");
		countryCodeMap.put("SB", "Solomon Islands");
		countryCodeMap.put("SO", "Somalia");
		countryCodeMap.put("ZA", "South Africa");
		countryCodeMap.put("GS", "South Georgia and the South Sandwich Islands");
		countryCodeMap.put("SS", "South Sudan");
		countryCodeMap.put("ES", "Spain");
		countryCodeMap.put("LK", "Sri Lanka");
		countryCodeMap.put("SD", "Sudan");
		countryCodeMap.put("SR", "Suriname");
		countryCodeMap.put("SJ", "Svalbard and Jan Mayen");
		countryCodeMap.put("SZ", "Swaziland");
		countryCodeMap.put("SE", "Sweden");
		countryCodeMap.put("CH", "Switzerland");
		countryCodeMap.put("SY", "Syrian Arab Republic");
		countryCodeMap.put("TW", "Taiwan, Province of China");
		countryCodeMap.put("TJ", "Tajikistan");
		countryCodeMap.put("TZ", "Tanzania, United Republic of");
		countryCodeMap.put("TH", "Thailand");
		countryCodeMap.put("TL", "Timor-Leste");
		countryCodeMap.put("TG", "Togo");
		countryCodeMap.put("TK", "Tokelau");
		countryCodeMap.put("TO", "Tonga");
		countryCodeMap.put("TT", "Trinidad and Tobago");
		countryCodeMap.put("TN", "Tunisia");
		countryCodeMap.put("TR", "Turkey");
		countryCodeMap.put("TM", "Turkmenistan");
		countryCodeMap.put("TC", "Turks and Caicos Islands");
		countryCodeMap.put("TV", "Tuvalu");
		countryCodeMap.put("UG", "Uganda");
		countryCodeMap.put("UA", "Ukraine");
		countryCodeMap.put("AE", "United Arab Emirates");
		countryCodeMap.put("GB", "United Kingdom");
		countryCodeMap.put("US", "United States");
		countryCodeMap.put("UM", "United States Minor Outlying Islands");
		countryCodeMap.put("UY", "Uruguay");
		countryCodeMap.put("UZ", "Uzbekistan");
		countryCodeMap.put("VU", "Vanuatu");
		countryCodeMap.put("VE", "Venezuela, Bolivarian Republic of");
		countryCodeMap.put("VN", "Viet Nam");
		countryCodeMap.put("VG", "Virgin Islands, British");
		countryCodeMap.put("VI", "Virgin Islands, U.S.");
		countryCodeMap.put("WF", "Wallis and Futuna");
		countryCodeMap.put("EH", "Western Sahara");
		countryCodeMap.put("YE", "Yemen");
		countryCodeMap.put("ZM", "Zambia");
		countryCodeMap.put("ZW", "Zimbabwe");
	}

	private String reportString;

	public WeatherReportParameters(String reportString) {
		this.reportString = reportString;
	}

	@Override
	public String getCurrentTemp() {
		return KalvinToCelcius(getMatch("temp"));
	}

	@Override
	public String getMinimumTemp() {
		return KalvinToCelcius(getMatch("tempMin"));
	}

	@Override
	public String getFeelsLike() {
		return KalvinToCelcius(getMatch("feelsLike"));
	}

	@Override
	public String getHumidityLevel() {
		return getMatch("humidity");
	}

	@Override
	public String getCountry() {
		return countryCodeMap.get(getMatch("country"));
	}

	@Override
	public String getCity() {
		return getMatch("name");
	}

	@Override
	public String getMaximumTemp() {
		return KalvinToCelcius(getMatch("tempMax"));

	}

	private String getMatch(String toFind) {
		String pattern = toFind + "=" + "[\\w|\\d|.]+";
		Pattern p1 = Pattern.compile(pattern);
		Matcher m = p1.matcher(this.reportString);
		if (m.find()) {
			return m.group(0).replaceAll(toFind + "=", "");
		}
		
		return null;
	}

	private String KalvinToCelcius(String temperature) {
		Double tempInCelsius = Double.parseDouble(temperature) - 273.15;
		return String.format("%.2f", tempInCelsius);
	}

}
