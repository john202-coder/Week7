/**
 * 
 */
package projects.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import projects.ProjectsApp;
import projects.entity.entity.Project;
import projects.exception.DbException;
import provided.util.DaoBase;

public class ProjectDao extends DaoBase {

  

  public Project insertProject(Project project) {
	  String sql = ""
	      + "INSERT INTO project (project_name, estimated_hours, actual_hours, difficulty, notes) "
	      + "VALUES (?, ?, ?, ?, ?)";

	  try (Connection conn = startTransaction();
	       PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

	    stmt.setString(1, project.getProjectName());
	    stmt.setBigDecimal(2, project.getEstimatedHours());
	    stmt.setBigDecimal(3, project.getActualHours());

	    if (project.getDifficulty() == null) {
	      stmt.setObject(4, null);
	    } else {
	      stmt.setInt(4, project.getDifficulty());
	    }

	    stmt.setString(5, project.getNotes());

	    stmt.executeUpdate();

	    try (ResultSet rs = stmt.getGeneratedKeys()) {
	      if (rs.next()) {
	        project.setProjectId(rs.getInt(1));
	      } else {
	        throw new SQLException("Project ID was not generated.");
	      }
	    }

	    commitTransaction(conn);
	    return project;

	  } catch (Exception e) {
	    throw new DbException("Error inserting project into database", e);
	  }
	}

public projects.entity.Project insertProject(projects.entity.Project project) {
	// TODO Auto-generated method stub
	return project;
}

public ProjectsApp insertProject(ProjectsApp project) {
	// TODO Auto-generated method stub
	return null;
}
}
