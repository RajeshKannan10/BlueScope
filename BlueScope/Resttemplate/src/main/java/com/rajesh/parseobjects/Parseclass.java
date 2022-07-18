package com.rajesh.parseobjects;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Parseclass {


	public static void main(String[] args) {

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;

		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc;
			doc = dBuilder.parse(new File("employee.xml"));
			doc.getDocumentElement().normalize();
			
			NodeList Emplist = doc.getElementsByTagName("Employee");
			for (int i = 0; i < Emplist.getLength(); i++) {
				Node Emp = Emplist.item(i);

				if (Emp.getNodeType() == Node.ELEMENT_NODE) {
					Element Empelement = (Element) Emp;
					System.out.println("ID: "+Empelement.getAttribute("id"));

					NodeList Empdetail = Emp.getChildNodes();
					for (int j = 0; j < Empdetail.getLength(); j++) {
						Node detail = Empdetail.item(j);

						if (detail.getNodeType() == Node.ELEMENT_NODE) {
							Element detailelement = (Element) detail;
							System.out.println(detailelement.getTagName()+":"+detailelement.getAttribute("value"));

						}

					}

				}

			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
