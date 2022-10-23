package Files;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class XML implements Files {
    public Car[] read() {
        System.out.println("read XML");
        Car[] cars = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            Document doc = factory.newDocumentBuilder().parse(new File("cars.xml"));
            doc.getDocumentElement().normalize();

            NodeList nodes = doc.getElementsByTagName("car");
            int len = nodes.getLength();
            cars = new Car[len];
            for (int i = 0; i < len; i++) {
                Node node = nodes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String brand = element.getElementsByTagName("brand").item(0).getTextContent();
                    String model = element.getElementsByTagName("model").item(0).getTextContent();
                    String year = element.getElementsByTagName("year").item(0).getTextContent();
                    cars[i] = new Car(brand, model, Integer.parseInt(year));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cars;
    }

    public void write(Car[] cars) {
        System.out.println("write XML");
        try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

            Element root = doc.createElement("cars");
            for (int i = 0; i < cars.length; i++) {
                Element car = doc.createElement("car");
                car.setAttribute("id", String.valueOf(i));

                Element brand = doc.createElement("brand");
                brand.setTextContent(cars[i].getBrand());
                car.appendChild(brand);

                Element model = doc.createElement("model");
                model.setTextContent(cars[i].getModel());
                car.appendChild(model);

                Element year = doc.createElement("year");
                year.setTextContent(String.valueOf(cars[i].getYear()));
                car.appendChild(year);

                root.appendChild(car);
            }
            doc.appendChild(root);
            FileOutputStream output = new FileOutputStream("cars.xml");
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            transformer.transform(new DOMSource(doc), new StreamResult(output));
        } catch (ParserConfigurationException | TransformerException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
