package projects.entity;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Project {
	private Integer recipeId;
	private String projectName;
	private BigDecimal estimatedHours;
	private BigDecimal actualHours;
	private Integer difficulty;
	private String notes;
	
	private List<Category> categories = new LinkedList<>();
	private List<Step> steps = new LinkedList<>();
	private List<Material> materials = new LinkedList<>();
	public Integer getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(Integer recipeId) {
		this.recipeId = recipeId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public BigDecimal getEstimatedHours() {
		return estimatedHours;
	}
	public void setEstimatedHours(BigDecimal estimatedHours) {
		this.estimatedHours = estimatedHours;
	}
	public BigDecimal getActualHours() {
		return actualHours;
	}
	public void setActualHours(BigDecimal actualHours) {
		this.actualHours = actualHours;
	}
	public Integer getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public List<Step> getSteps() {
		return steps;
	}
	public List<Material> getMaterials() {
		return materials;
	}
	@Override
	public String toString() {
		String project = "";
		
		project += "\n    ID=" + recipeId;
		project += "\n    projectName" + projectName;
		project += "\n    estimatedHours" + estimatedHours;
		project += "\n    actualHours" + actualHours;
		project += "\n    difficulty" + difficulty;
		project += "\n    notes" + notes;
		
		project += "\n    Categories:";
		
		for(Category category : categories) {
			project += "\n      " + category;
		}
		
		project += "\n    Steps:";
		
		for(Step step : steps) {
			project += "\n      " + step;
		}
		
		project += "\n    Materials:";
		
		for(Material material : materials) {
			project += "\n      " + material;
		}
		
		return project;
	}
	
	
}
