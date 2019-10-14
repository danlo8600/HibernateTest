package it.d4n1x.hbtest.entity;

import java.util.Date;

import javax.persistence.Column;

import lombok.Data;

@Data
public abstract class AbstractEntity {

	@Column(name = "CREATION_USER")
	private String createdUser;

	@Column(name = "UPDATE_USER")
	private String updateUser;

	@Column(name = "CREATION_DATE")
	private Date creationDate;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;
}
