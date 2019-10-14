package it.d4n1x.hbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.d4n1x.hbtest.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {

}
