package cz.jiripinkas.example.eshop.entity;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
public class Role {

        public static final String FIND_ALL = "Role.findAll";

        public static final String FIND_BY_NAME = "Role.findByName";

        public static final String COUNT = "Role.count";

        public static final String FIND_BY_USER_NAME = "Role.findByUserName";

        @Id
        @GeneratedValue
        private int id;

        private String name;

        @OneToMany(mappedBy = "role")
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

}