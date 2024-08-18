package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();
	
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}
	
	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects()
	}
	
	public Project fetchProjectbyId(Integer projectId) {
		return projectDao.fetchProjectById(projectId).orElseThrow(() -> new NoSuchElementException("Project with project ID=" + projectId + " does not exist."));
	}
	
	public void modifyProjectDetails(Project project) {
	    if(!projectDao.modifyProjectDetails(project)) {
	      throw new DbException("Project with ID=" + project.getProjectId() + " does not exist.");
	    }
	  }
	
	public void deleteProject(Integer projectId) {
	    if(!projectDao.deleteProject(projectId)) {
	      throw new DbException("Project with ID=" + projectId + " does not exist.");
	    }
	  }
}
