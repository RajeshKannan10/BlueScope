package com.rajesh.parseobjects;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParseXMLwithXpath {

	public static void main(String[] args) {

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = null;

		try {
			dBuilder = dbFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document doc = null;
		try {
			doc = dBuilder.parse(new File("employee.xml"));
			doc.getDocumentElement().normalize();

			XPath xpath = XPathFactory.newInstance().newXPath();
			String expression = "/Employees/Employee";

			try {
				NodeList Emplist = (NodeList) xpath.compile(expression).evaluate(doc, XPathConstants.NODESET);

				for (int i = 0; i < Emplist.getLength(); i++) {
					Node Emp = Emplist.item(i);
					System.out.println(Emp.getNodeName());

					if (Emp.getNodeType() == Node.ELEMENT_NODE) {
						Element Empelement = (Element) Emp;
						System.out.println("ID: " + Empelement.getAttribute("id"));
						
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
			} catch (XPathExpressionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
