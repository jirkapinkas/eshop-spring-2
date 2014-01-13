package cz.jiripinkas.example.eshop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class User {

	public static final String FIND_ALL = "User.findAll";

	public static final String FIND_BY_NAME = "User.findByName";

	public static final String COUNT = "User.count";

	public static final String FIND_BY_ROLE_NAME = "User.findByRoleName";

	@Id
	@GeneratedValue
	private int id;

	@Size(min = 1, message = "Name must not be empty!")
	private String name;

	@Size(min = 1, message = "Password must not be empty!")
	private String password;

	private boolean enabled;

	@OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
	private List<UserRole> userRoles;

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}