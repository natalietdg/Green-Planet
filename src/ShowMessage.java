import java.util.ArrayList;

public class ShowMessage {
	
	public static ArrayList<String>[][] getLevelmessage() {
		ArrayList<String>[][] message = new ArrayList[200][200]; 
			
			message[0][5] = new ArrayList();
			message[0][6] = new ArrayList();
			message[0][7] = new ArrayList();
			message[0][8] = new ArrayList();
			message[0][9] = new ArrayList();
			message[0][11] = new ArrayList();
			message[0][5].add("On December 3, 1984, a Union Carbide Corporation plant accidentally released tons of the gas, which killed thousands of people living near the plant and created mass panic as tens of thousands tried to flee Bhopal. -National Geographic");
			message[0][6].add("Also referred to as the British Petroleum(BP) oil spill, the Deepwater Horizon oil spill released nearly 4.9 million barrels of crude oil into the Gulf of Mexico. BP was later charged with 11 counts of manslaughter and agreed to pay 4.5 billion in fines.”-National Geographic");
			message[0][7].add("Indoor air pollutant levels may be 25% to 62% greater than outside levels, experts say. Many people spend most of their lives indoors and may never suffer more from the effects of indoor air pollution that outdoor pollution.”-National Geographic");
			message[0][8].add("Unlike pollution from industrial and sewage treatment plants, nonpoint source pollution often comes from sources that are difficult to pinpoint, such as farms and construction sites. Rainfall or snowmelt carries the pollutants, such as fertilisers and nutrients, into rivers, lakes and oceans.");
			message[0][9].add("Plastic makes up 90% of all trash floating in the ocean, enough that, in some areas, plastic outweighs plankton by a ratio of 6 to 1. The Great Pacific Garbage Patch is the world’s largest landfill.");
			message[0][11].add("Most ozone found in the upper part of the atmosphere, the stratosphere, which sits about 6 miles above Earth’s surface."); //message
		
			message[1][10] = new ArrayList();
			message[1][11] = new ArrayList();
			message[1][12] = new ArrayList();
			message[1][13] = new ArrayList();
			message[1][19] = new ArrayList();
			message[1][22] = new ArrayList();
			message[1][10].add("During an unusually cold winter, smoke from one million coal-fired stoves combined with industrial emissions, choking the skies with smog. Short-term air pollution such as smog can cause upper respiratory infections, headaches, nausea, and allergic reactions, and can greatly aggravate existing medical conditions.”-National Geographic");
			message[1][11].add("Particles fewer than 10 micrometers in diameter- a fraction of the diameter of a human hair- are most dangerous because they can lodge deep in a person’s lungs. Particles larger than 10 micrometers do not usually reach a person’s lung, but they do irritate the eyes,nose, and throat.”-National Geographic");
			message[1][12].add("The estimated 450k brownfields in the U.S. contain hazardous substances, pollutants or contaminants that prevent their redevelopment. The Brownfield Program, administered by the U.S. EPA facilitates the clean up and revitalisation of abandoned hazardous waste sites by local communities, while the Superfund program, enacted into law in 1980, allows the EPA to compel those responsible to either clean up the sites or reimburse the government.”-National Geographic");
			message[1][13].add("Almost all europeans can’t see a true night sky due to unobstructed light from cities, which can reach 124 miles away from their source.” -National Geographic");
			message[1][19].add("Who blames 150000 global deaths per year on the effects of global warming including extreme weather, drought, heat waves, decreased food production, and the increased spread of vector borne diseases like malaria.”-National Geographic");
			message[1][22].add("Airplane contrails often trap heat from the Earth’s surface during the day but reflect solar radiation- balancing some of the harmful effects of air travel. However, at night, there is no sun to reflect, and contrails have a stronger warming effect.” -National Geographic");
			
			return message;
		}

}