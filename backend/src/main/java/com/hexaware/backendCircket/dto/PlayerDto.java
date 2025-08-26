package com.hexaware.backendCircket.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class PlayerDto {
	
	private long id;
	
	@NotBlank(message = "Name is required")
    private String name;

    @NotNull(message = "Jersey number is required")
    @Min(value = 1, message = "Jersey number must be positive")
    private Integer jerseyNumber;

    @NotBlank(message = "Role is required")
    @Pattern(
            regexp = "Batsman|Bowler|Keeper|All Rounder",
            message = "Role must be Batsman, Bowler, Keeper, or All Rounder"
        )
    private String role;

    @NotNull(message = "Total matches is required")
    @Min(value = 0, message = "Total matches must be positive")
    private Integer totalMatches;

    @NotBlank(message = "Team name is required")
    private String teamName;

    @NotBlank(message = "Country is required")
    private String country;

    private String description;
    
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getJerseyNumber() { return jerseyNumber; }
    public void setJerseyNumber(Integer jerseyNumber) { this.jerseyNumber = jerseyNumber; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public Integer getTotalMatches() { return totalMatches; }
    public void setTotalMatches(Integer totalMatches) { this.totalMatches = totalMatches; }

    public String getTeamName() { return teamName; }
    public void setTeamName(String teamName) { this.teamName = teamName; }

    public String getCountry() { return country; }
    public void setCountry(String countryOrState) { this.country = countryOrState; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public PlayerDto() {
    	
    }
	public PlayerDto(@NotNull long id, @NotBlank(message = "Name is required") String name,
			@NotNull(message = "Jersey number is required") @Min(value = 0, message = "Jersey number must be positive") Integer jerseyNumber,
			@NotBlank(message = "Role is required") String role,
			@NotNull(message = "Total matches is required") @Min(value = 0, message = "Total matches must be positive") Integer totalMatches,
			@NotBlank(message = "Team name is required") String teamName,
			@NotBlank(message = "Country is required") String country, String description) {
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
		return "PlayerDto [id=" + id + ", name=" + name + ", jerseyNumber=" + jerseyNumber + ", role=" + role
				+ ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", country=" + country
				+ ", description=" + description + "]";
	}
}

