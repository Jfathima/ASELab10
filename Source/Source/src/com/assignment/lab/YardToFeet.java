package com.assignment.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/YardToFeet")
public class YardToFeet {
	@GET
	@Produces("application/xml")
	public String kmtom(){
		 
		Double y = 0.0;
		Double f;
		
		f = y*3;
		
		String result = "Output: Yard To Feet \n\n" + f;
		return "<YardToFeet>" + "<yard>" + y + "</yard>" + "<output>" + result + "</output>" + "</YardToFeet>";
		
	}
		@Path("{y}")
		@GET
		@Produces("application/xml")
		
		public String WeightConvert(@PathParam("y") Double y) {
			Double f;
			f = y*3;
			
			String result = "Output: Yard To Feet \n\n" + f;
			return "<YardToFeet>" + "<yard>" + y + "</yard>" + "<output>" + result + "</output>" + "</YardToFeet>";
			}
}

