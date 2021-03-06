//Alexander Malcolm - S1317460
package org.me.myandroidstuff;

public class CarPark 
{
	//this class is created to be a holder for all the data for a car park that is retrieved from the xml feed
	// Alexander Malcolm
	//Student ID -- 
	
	private String name;
	private String status;
	private String percentOccupied;
	private String occupiedSpaces;
	private String totalSpaces;

	public CarPark() 
	{
		name = "";
		status = "";
		percentOccupied = "";
		occupiedSpaces ="";
		totalSpaces = "";
	}
	
	public CarPark(String newName, String newStatus, String newPercentOccupied, String newOccupiedSpaces, String newTotalSpaces)
	{
		name = newName;
		status = newStatus;
		percentOccupied = newPercentOccupied;
		occupiedSpaces = newOccupiedSpaces;
		totalSpaces = newTotalSpaces;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	public void setStatus(String newStatus)
	{
		status = newStatus;
	}
	public void setPercentOccupied(String newPercentOccupied)
	{
		percentOccupied = newPercentOccupied;
	}
	public void setOccupiedSpaces(String newOccupiedSpaces)
	{
		occupiedSpaces = newOccupiedSpaces;
	}
	public void setTotalSpaces(String newTotalSpaces)
	{
		totalSpaces = newTotalSpaces;
	}
	
	public String getName()
	{
		return name;	
	}
	public String getStatus()
	{
		return status;	
	}
	public String getPercentOccupied()
	{
		return percentOccupied;	
	}
	public String getOccupiedSpaces()
	{
		return occupiedSpaces;	
	}
	public String getTotalSpaces()
	{
		return totalSpaces;	
	}
	
	public String toString()
	{
		String temp;
		
		temp = name + " " + status + " " + percentOccupied + " " + occupiedSpaces + " " +
		totalSpaces;
		
		return temp;
	}

}
