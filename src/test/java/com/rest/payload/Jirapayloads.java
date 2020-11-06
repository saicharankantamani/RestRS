package com.rest.payload;

public class Jirapayloads {
	
	public static String seesionID(String userName, String pwd)
	{
		return "{ \"username\": \""+userName+"\", \"password\": \""+pwd+"\" }";
	}
	
	public static String createIssue() {
		return "{    \"fields\": { \r\n"
				+ "         \"project\":       {           \"key\": \"RES\"       },\r\n"
				+ "         \"summary\": \"Rest Api issue\",\r\n"
				+ "         \"description\": \"My third issue\", \r\n"
				+ "         \"issuetype\": {          \"name\": \"Bug\"       },\r\n"
				+ "         \"reporter\": {\r\n"
				+ "                    \"name\": \"saicharankantamani1\"\r\n"
				+ "            }\r\n"
				+ "}}";
	}
}