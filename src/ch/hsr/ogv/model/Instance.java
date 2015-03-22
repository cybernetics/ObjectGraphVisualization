package ch.hsr.ogv.model;

import java.util.HashMap;
import java.util.Map;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

/**
 * 
 * @author arieser
 *
 */
public class Instance extends ModelBox {

	private String name;
	private Map<Attribute, String> attributeValues = new HashMap<Attribute, String>();

	public Instance(String name, Point3D coordinates, double width, double heigth, Color color) {
		super(coordinates, width, heigth, color);
		this.name = name;
	}

	public Instance(String name, Point3D coordinates) {
		super(coordinates);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Attribute, String> getAttributeValues() {
		return attributeValues;
	}

	public void setAttributeValues(Map<Attribute, String> attributeValues) {
		this.attributeValues = attributeValues;
	}

	public boolean addAttributeValue(Attribute attribute, String attributeValue) {
		if (attributeValues.containsKey(attribute)) {
			return false;
		}
		attributeValues.put(attribute, attributeValue);
		return true;
	}
	
	public void updateAttribute(Attribute attribute, String value) {
		attributeValues.replace(attribute, value);
	}
}