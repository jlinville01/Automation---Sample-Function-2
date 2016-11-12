public String getTokenID(String email) throws Exception
{
	stmt = con.createStatement();
	String runReset = "SELECT GetTokenIdForEmail('" + email + "') as TokenId;";
	ResultSet result = stmt.executeQuery(runReset);
	String tokenId = null;

	while (result.next())
	{
		tokenId = result.getString("TokenId"); 
	}
	
	return tokenId;
}
