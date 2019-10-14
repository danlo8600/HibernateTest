package it.d4n1x.hbtest.entity;

import java.util.Date;

import javax.persistence.Column;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
public abstract class AbstractEntity {

	@Column(name = "CREATION_USER")
	private String createdUser;

	@Column(name = "UPDATE_USER")
	private String updateUser;

	@Column(name = "CREATION_DATE")
	@CreationTimestamp
	private Date creationDate;

	@Column(name = "UPDATE_DATE")
	@UpdateTimestamp
	private Date updateDate;
}
