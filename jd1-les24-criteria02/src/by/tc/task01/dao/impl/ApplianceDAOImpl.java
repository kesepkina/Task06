package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DaoException;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public <E> List<Appliance> find(Criteria<E> criteria) throws DaoException {
		String categoryOfGoods;
		List<Appliance> appliances = new ArrayList<Appliance>();
		String searchingCriterias = criteria.getCriteria().toString();

		searchingCriterias = searchingCriterias.substring(1, searchingCriterias.length() - 1);

		categoryOfGoods = criteria.getGroupSearchName().getSimpleName();

		System.out.println("---" + categoryOfGoods);

		FileReader reader = null;
		BufferedReader bufReader = null;

		String[] params = null;
		String[] searchParams = searchingCriterias.replaceAll(",", "").split("\\s+");

		try {

			reader = new FileReader("resources/appliances_db.txt");
			bufReader = new BufferedReader(reader);

			String nextLine;
			boolean fits = true;

			try {
				while ((nextLine = bufReader.readLine()) != null) {
					fits = true;
					params = nextLine.replaceAll(",", "").replaceAll(";", "").split("\\s+");
					nextLine = nextLine.toUpperCase();
					if (params[0].equals(categoryOfGoods)) {
						for (int i = 0; i < searchParams.length; i++) {
							if (!(nextLine.contains(searchParams[i].toUpperCase() + ",")
									|| nextLine.contains(searchParams[i].toUpperCase() + ";"))) {
								fits = false;
								break;
							}
						}
						if (fits) {
							switch (categoryOfGoods) {
							case "Laptop":
								appliances.add(new Laptop(params));
								break;
							case "Oven":
								appliances.add(new Oven(params));
								break;
							case "Refrigerator":
								appliances.add(new Refrigerator(params));
								break;
							case "Speakers":
								appliances.add(new Speakers(params));
								break;
							case "TabletPC":
								appliances.add(new TabletPC(params));
								break;
							case "VacuumCleaner":
								appliances.add(new VacuumCleaner(params));
								break;
							default:
								throw new DaoException("Category name ERROR");
							}
						}
					}
				}
			} catch (IOException e) {
				throw new DaoException("Error by reading a line!", e);
			}

		} catch (FileNotFoundException e) {
			throw new DaoException(e);
		} finally {
			if (bufReader != null) {
				try {
					bufReader.close();
				} catch (IOException e) {
					// log - error
					System.err.println(e);
				}
			}
		}

		return appliances;

	}

}
