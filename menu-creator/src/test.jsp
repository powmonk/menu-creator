<html>
<head><title>Dan's JSP</title></head>
<body>
	<%
		String outputString = request.getParameter("inputString");
		int loopCount = 1;
		String output = "testes";
		
		
		try{
			loopCount = Integer.parseInt(outputString);
		}catch (NumberFormatException e){
			outputString = outputString + " is not a positive integer";
		}
		
		for(int i=0;i<loopCount;i++){
	%>
		<a><% out.print(i+1); %>, </a>
	<%
		};
	%>
	
</body>
</html>
