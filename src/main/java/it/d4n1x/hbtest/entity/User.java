package it.d4n1x.hbtest.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "USER")
public class User extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6802873809391303685L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "SURNAME", nullable = false)
	private String surname;

	@Column(name = "EMAIL", nullable = false)
	private String email;

	@OneToMany
	private List<Message> msgList;

	public User() {

	}

	public User(String name, String surname, String email, List<Message> msgList) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.msgList = msgList;
	}
}
