package it.d4n1x.hbtest.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "MESSAGE")
public class Message extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3051808199144341196L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "TEXT")
	private String text;

	@ManyToOne
	@JoinColumn(name = "fk_user")
	private User msgOwner;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_attachment")
	Attachment attachment;

	public Message() {

	}

	public Message(String text, User msgOwner, Attachment attachment) {
		super();
		this.text = text;
		this.msgOwner = msgOwner;
		this.attachment = attachment;
	}
}
