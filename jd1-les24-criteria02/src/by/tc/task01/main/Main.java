package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<Oven>(Oven.class);

		criteriaOven.add(Oven.CAPACITY, 33);

		appliances = service.find(criteriaOven);

		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>(Oven.class);
		criteriaOven.add(Oven.HEIGHT, 45.5);
		criteriaOven.add(Oven.DEPTH, 60);

		appliances = service.find(criteriaOven);

		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>(TabletPC.class);

		criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);

		appliances = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliances);

		/////////////////////////////////////////////////////////////////

		Criteria<Speakers> criteriaSpeakers = new Criteria<Speakers>(Speakers.class);

		criteriaSpeakers.add(Speakers.CORD_LENGTH, 5);

		appliances = service.find(criteriaSpeakers);

		PrintApplianceInfo.print(appliances);

		/////////////////////////////////////////////////////////////////

		Criteria<VacuumCleaner> criteriaVacuumCleaner = new Criteria<VacuumCleaner>(VacuumCleaner.class);

		criteriaVacuumCleaner.add(VacuumCleaner.WAND_TYPE, "all-in-one");

		appliances = service.find(criteriaVacuumCleaner);

		PrintApplianceInfo.print(appliances);

	}

}
