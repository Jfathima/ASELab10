package com.assignment.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("/FeetToYard")
public class FeetToYard {
	@GET
	@Produces("application/xml")
	public String FToY(){
		 
		Double f = 0.0;
		Double y;
		
		y = f*0.3333;
		
		String result="Output: Mile to Kilometer \n\n" + y;
		return "<FeetToYard>" + "<Feet>" + f + "</Feet>" + "<output>" + result + "</output>" + "</FeetToYard>";
		
	}
		@Path("{f}")
		@GET
		@Produces("application/xml")
		
		public String HeightConvert(@PathParam("f") Double f) {
			Double y;
			
			y = f*0.3333;
			
			String result="Output: Mile to Kilometer \n\n" + y;
			return "<FeetToYard>" + "<Feet>" + f + "</Feet>" + "<output>" + result + "</output>" + "</FeetToYard>";	
		}

}

