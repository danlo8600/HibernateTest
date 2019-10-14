package it.d4n1x.hbtest.entity;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ATTACHMENT")
public class Attachment extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4184485499256063137L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "FILE_NAME")
	private String fileName;

	@Lob
	@Column(name = "FILE")
	private Blob file;

	public Attachment() {

	}

	public Attachment(String fileName, Blob file) {
		super();
		this.fileName = fileName;
		this.file = file;
	}
}
