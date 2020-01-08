import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answers {

	private static ArrayList<String>[][] answers;
	
	public Answers() {
		answers = new ArrayList[30][4];
	}
	
	public static ArrayList<String>[][] getLevel1A() {
		String[][] answerBank = {
				
				{"I & II only" , "I & III only" ,"I, II & IV only", "All of the other options"},
				{"I & II only", "I & III only", "All of the other options", "I, II, III only"},
				{"17%, 16 times", "27%, 12 times","47%, 14 times","37%, 20 times"},
				{"I & II only", "II & III only","I & III only","All of the other options"},
				{"Carbon dioxide, Temperature","Carbon dioxide, chlorofluorocarbons","Temperature, carbon dioxide","Temperature, chlorofluorocarbons"},
				{"Indore","Tawai","Manoharpur","Bhopal"},
				{"4.2","5","4.3","4.9"},
				{"5%","86%","12%","62%"},
				{"Construction dirt","Farm irrigation","Livestock nutrients","Sewage plants"},
				{"Glass","Aluminium cans","Waste from boats","Plastic"},
				{"Troposphere","Mesosphere","Heliosphere","Stratosphere"},
				{"Meteors and rocks burn up","Weather occurs here","The atmosphere merges into space","Shields humans from harmful UV radiation"},
				{"Ozone","Carbon dioxide","Nitrogen","Smog"},
				{"Carbon dioxide","Nitrogen","Helium","Carbon monoxide"},
				{"Ozone layer","None of the above","Oil","Acid rain"},
				{"Indoor pollution","Outdoor pollution","Air pollution","Black carbon pollution"},
				{"Carbon dioxide","Salt","Hydrogen","Oil"},
				{"Increase risk of having cancer","Reduce the ability carrying blood to body tissues","Reduce resistance to cold","Neurological and developmental damage"},
				{"Aerosol cans","Aircraft Halon","Refrigerator","Forest Burning"},
				{"Reduce amount of mature vegetation","Mudslide cases","Lead to desertification","Causing irreparable damage to ozone layer"},
				{"I & II only","I & IV only","I, III & IV only","All of the other options"},
				{"Depression and Anxiety","Headaches and Depression","Headaches and Dizziness","Anxiety and Headaches"},
				{"Conserve energy","Reduce, Reuse and Recycle","Increase the usage of public transportation","Reduce the usage of fertilizer"},
				{"I, II & IV  only","I, III & IV only","All of the other options","I, II & III only"},
				{"7, 17", "6, 18", "7, 18", "6, 17"},
				{"I, II, III & IV", "I, IV, II & III", "I, IV, III & II", "I, III, IV & II"},
				{"Irritation of the eyes", "Hay Fever","Asthma attacks", "Allergies"},
				{"Carbon monoxide from car exhausts", "Sulfur dioxide from the combustion of coal", "Smokes from fire", "All the other options"},
				{"Industrial waste", "Sewage and waste water", "Marine dumping", "All of the other options"},
				{"Greenhouse gases", "Smokes from fire", "Lights from the city", "Acid rain"},
				{"Soil erosion", "Deforestation", "City lights", "A & B"},
				{"Dumping of radioactive wastes", "Nuclear weapon testing", "Radiaoctive emissions from thermos-electrical generators", "All of the other options"},
				{"Industrialization", "Poor urban planning", "Transportation", "All of the other options"},
				{"Light trespass", "Sky glow", "Over-illumination", "All of the other options"}};
		addAnswers(answerBank);						
		return answers;
	}
	public static ArrayList<String>[][] getLevel2A(){
		String[][] answer = {{"Thyroid hormone axis", "Dermatitis", "Disruptions in fertility, reproduction, sexual maturation", "Down syndrome"},
				{"Nose", "Mouth", "Skin", "Eye"},
				{"6 million tonnes, 10%, 60%", "5 million tonnes, 4%, 50%","7 million tonnes, 7%, 60%", "8 million tonnes, 9%, 80%"},
				{"Depletion of ozone", "Air pollution", "Water pollution", "Global warming"},
				{"Mutation in gene to form blastocytes", "Food poisoning", "Dwarfism", "Blue baby syndrome"},
				{"I & II only","I & III only","All of the other options", "I, II & III only"},
				{"I, II & III only", "II, III & IV only", "I, III & IV only", "All of the other options"},
				{"400 tons of contaminated water per day", "200,400 cubic meters of radioactive rubble", "Branches and logs from 220 acres of deforested land", "70% of global CFC (Chlorofluorocarbon) production"},
				{"II, III & IV only", "I, III & IV only", "All of the other options", "I, II & III only"}, 
				{"I & II only", "I & III only", "II & III only", "All of the other options"},
				{"Radon gas", "Acid rain", "Particulate matter", "Smog"},
				{"80 micrometers", "1 centimeter", "50 micrometers", "10 micrometers"},
				{"2300", "450000", "10500", "780"},
				{"54%","87.9%", "31%", "99.9%"},
				{"Disturbs bird migration","Confuses sea turtles","Can’t see stars","Cause blindness"},
				{"Chlorine","PCB","Cyanide","DDT"},
				{"1 million","3 million","500000","50000"},
				{"2 degrees Fahrenheit","3 degrees Fahrenheit","4 degrees Fahrenheit","1 degrees Fahrenheit"},
				{"it flows to other parts of the world","it kills animals and plants living there","it causes water pollution","B and C"},
				{"1,500","10,500","1,500,000","150,000"},
				{"Malaria","Respiratory infections","Decreased food production","Extreme weather"},
				{"Tropical frogs","Toucan","Polar bears","Narwhals"},
				{"It makes no difference","Nighttime","Midnight","Daytime"},
				{"I, II, III","II, III, IV","All of the other options","I , II & IV"},
				{"10%, 20%","15%, 25%","10%, 30%","20%, 30%"},
				{"Promoting climate adaptation plans.","Increase parks to provide habitat for the wildlife.","Reduce carbon emissions.","Increase deforestation"},
				{"4.0, 12.5","4.5, 13.0","4.2, 12.3","4.8, 12.7"},
				{"Growing health impact","More intense and frequent heat","Melting glaciers","Enhance vegetation growth"},
				{"II, IV","I, III & IV","II, III & IV","All of the other options"},
				{"2.3 million","3.1 million","4.0 million","3.6 million"},
				{"Massive crop failure","More killer storms","Disappearance of coral reefs","Increasing risk of cancer"},
				{"Revving up renewables","Promoting usage of public transport","Ensuring sustainable development","Developing country construction"},};
				
			addAnswers(answer);
		return answers;
	}
	
	public static ArrayList<String>[][] getLevel3A(){
		String[][] answer = {
				{"Total Minimum Dissolved Load","Total Maximum Dissolved Load","Total Minimum Daily Load","Total Maximum Daily Load"},
				{"Nitrogen and potassium","Magnesium citrate and phosphorus","Potassium and magnesium citrate","Nitrogen and phosphorus"},
				{"Ladybirds","Chickens","Caterpillars","Earthworms"},
				{"Flowers","Tress","Grass","Mushroom"},
				{"chemical and biological agents","insect and plants","bacteria and animals","cultured plants and animals"},
				{"Salmon and seaweed","Shellfish and corals","Salmon and corals","Shellfish and seaweed"},
				{"I & II only","I, II & IV only","All of the other options","I, II & III only"},
				{"10pm","9pm","8pm","11pm"}, 
				{"USA","Kenya","China","Bangladesh"},
				{"Impose a total ban on plastic bags","Consider a total plastic bag ban","No action taken","Impose tax on plastic bags"},
				{"Reduce","Reuse","Recycle","All of the other options"},
				{"The government", "The people", "The corporations", "All of the other options"},
				{"Turn off electricity when not using it.", "Consume less from electrical devices.", "Opt for manual labour instead of relying on electric equipment", "All of the other options"},
				{"Use biodegradable products","Don't use pesticides", "Store chemicals and waste in spill-proof containers", "All of the other options"},
				{"Reduce traveling in car","Reduce burning rubbish","Reduce or eliminate fireplace and wood stove use.","All of the other options"},
				{"Run the dishwasher or clothes washer only when you have a full load","Don’t dispose of household chemicals or cleaning agents down the sink or toilet","Minimize the use of pesticides, herbicides, fertilizers","All of the other options"},
				{"Cooling towers and artificial lakes","Use of alternative cooling agents- other than water","Cogeneration","All of the other options"},
				{"Stoppage of leakage from nuclear reactors","Safe disposal of radioactive material","Safe storage of radioactive material","All of the other options"},
				{"Turn off electronics when not in use","Sound proofing","Mask noises","All of the other options"},
				{"Only purchase IDA Approved light fixtures","Use Core Glow stones for all tour Outdoor Night Lighting","Reduce usage of light","All of the other options"},
				{"Apple peel","Watermelon skin","Orange peel","Banana peel"},
				{"Oxygen","Helium","Krypton","Carbon Dioxide"},
				{"Corn, Olive tree","Tobacco, Olive tree","Sunflower, Coconut tree","Corn, tobacco and sunflower"},
				{"II, III","I, II & IV","I, II, III and IV","I, II, III"},
				{"Changing driving style","Reduce or cut off use of CFC","Use resources wisely","Increasing deforestation"}};
			
			addAnswers(answer);
		return answers;
	}
	
	public static void addAnswers(String[][] answer) {
		answers = new ArrayList[answer.length][4];
		for(int x = 0; x < answer.length; x++) {
			for (int y = 0; y < 4; y++) {
					answers[x][y] = new ArrayList(); 
					answers[x][y].add(answer[x][y]);
			}
		}		
	}
}