
	package com.EdurekaProject.Metadata;

	public enum FlightDetailsEnum {

		//DEPART FLIGHTS
		BLUESKIESAIRLINES360("BlueSkies Airlines$360$270$5:03"),
		BLUESKIESAIRLINES361("BlueSkies Airlines$361$271$7:10"),
		PANGAEAAIRLINES362("Pangea Airlines$362$274$9:17"),
		UNIFIEDAIRLINES363("Unified Airlines$363$281$11:24"),
		
		//RETURN FLIGHTS
		BLUESKIESAIRLINES630("Blue Skies Airlines$630$270$12:23"),
		BLUESKIESAIRLINES631("Blue Skies Airlines$631$273$14:30"),
		PANGAEAAIRLINES632("Pangea Airlines$632$282$16:37"),
		UNIFIEDAIRLINES633("Unified Airlines$633$303$18:44");

		
		String flightNameValue;
		
		private FlightDetailsEnum(String flightNameValue){
			this.flightNameValue = flightNameValue;
			
		}

		/**
		 * @return the flightNameValue
		 */
		public String getFlightNameValue() {
			return flightNameValue;
		}

		/**
		 * @param flightNameValue the flightNameValue to set
		 */
		public void setFlightNameValue(String flightNameValue) {
			this.flightNameValue = flightNameValue;
		}

		
	}


