package projects.service;

import projects.ProjectsApp;
import projects.dao.ProjectDao;
import projects.entity.Project;

public class Dao {

  // Step 1: Create and initialize the DAO object
  private ProjectDao projectDao = new ProjectDao();

  // Step 2: Define the addProject method
  public ProjectsApp addProject(Project project) {
    return projectDao.insertProject(project);
  }
}

