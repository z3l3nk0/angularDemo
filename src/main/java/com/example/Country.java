package com.example;

public class Country {
	
	private int id;
	private String capital;
	private int population;
	private int size;
	public Country(int id, String capital, int population, int size) {
		super();
		this.id = id;
		this.capital = capital;
		this.population = population;
		this.size = size;
	}
	
	public Country() {
		// TODO Auto-generated constructor stub
	}

	public int getName() {
		return id;
	}

	public void setName(int name) {
		this.id = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", capital=" + capital + ", population=" + population + ", size=" + size + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + id;
		result = prime * result + population;
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (id != other.id)
			return false;
		if (population != other.population)
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	
	
	
	
}
