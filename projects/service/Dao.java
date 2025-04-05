package projects.service;

import projects.ProjectsApp;
import projects.dao.ProjectDao;

public class Dao {

  // Step 1: Create and initialize the DAO object
  private ProjectDao projectDao = new ProjectDao();

  // Step 2: Define the addProject method
  public ProjectsApp addProject(ProjectsApp project) {
    return projectDao.insertProject(project);
  }
}

