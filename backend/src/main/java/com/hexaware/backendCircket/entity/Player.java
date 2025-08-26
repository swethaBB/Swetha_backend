package com.hexaware.backendCircket.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "players")
public class Player {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private Integer jerseyNumber;
	    private String role;
	    private Integer totalMatches;
	    private String teamName;
	    private String country;
	    private String description;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getJerseyNumber() {
			return jerseyNumber;
		}
		public void setJerseyNumber(Integer jerseyNumber) {
			this.jerseyNumber = jerseyNumber;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public Integer getTotalMatches() {
			return totalMatches;
		}
		public void setTotalMatches(Integer totalMatches) {
			this.totalMatches = totalMatches;
		}
		public String getTeamName() {
			return teamName;
		}
		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String countryOrState) {
			this.country = countryOrState;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		public Player() {
			
		}
		
		public Player(Long id, String name, Integer jerseyNumber, String role, Integer totalMatches, String teamName,
				String country, String description) {
			super();
			this.id = id;
			this.name = name;
			this.jerseyNumber = jerseyNumber;
			this.role = role;
			this.totalMatches = totalMatches;
			this.teamName = teamName;
			this.country = country;
			this.description = description;
		}
		@Override
		public String toString() {
			return "Player [id=" + id + ", name=" + name + ", jerseyNumber=" + jerseyNumber + ", role=" + role
					+ ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", country=" + country
					+ ", description=" + description + "]";
		} 
	    
}
