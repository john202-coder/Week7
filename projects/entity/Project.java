package projects.entity;

import java.math.BigDecimal;

public class Project {
  private Integer projectId;
  private String projectName;
  private BigDecimal estimatedHours;
  private BigDecimal actualHours;
  private Integer difficulty;
  private String notes;

  // Getters
  public Integer getProjectId() {
    return projectId;
  }

  public String getProjectName() {
    return projectName;
  }

  public BigDecimal getEstimatedHours() {
    return estimatedHours;
  }

  public BigDecimal getActualHours() {
    return actualHours;
  }

  public Integer getDifficulty() {
    return difficulty;
  }

  public String getNotes() {
    return notes;
  }

  // Setters
  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public void setEstimatedHours(BigDecimal estimatedHours) {
    this.estimatedHours = estimatedHours;
  }

  public void setActualHours(BigDecimal actualHours) {
    this.actualHours = actualHours;
  }

  public void setDifficulty(Integer difficulty) {
    this.difficulty = difficulty;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  // For printing the project details
  @Override
  public String toString() {
    return "\n  Project ID: " + projectId +
           "\n  Name: " + projectName +
           "\n  Estimated Hours: " + estimatedHours +
           "\n  Actual Hours: " + actualHours +
           "\n  Difficulty: " + difficulty +
           "\n  Notes: " + notes;
  }
}

