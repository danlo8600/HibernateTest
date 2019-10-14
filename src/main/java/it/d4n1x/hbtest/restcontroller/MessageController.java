package it.d4n1x.hbtest.restcontroller;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.rowset.serial.SerialBlob;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import it.d4n1x.hbtest.commons.RestConstants;
import it.d4n1x.hbtest.entity.Attachment;
import it.d4n1x.hbtest.entity.Message;
import it.d4n1x.hbtest.entity.User;
import it.d4n1x.hbtest.repository.UserRepository;

@RestController
@RequestMapping(RestConstants.MSG_CONTROLLER)
public class MessageController {

	@Resource
	UserRepository usrRepository;

	@PostMapping("/test")
	public void test() {
		System.out.println("CIAO REST");
	}

	@PostMapping(path = "/usr", produces = MediaType.APPLICATION_JSON_VALUE)
	public User usr(@RequestParam("file") MultipartFile file, @RequestParam("text") String text) {

		User usr = null;
		try {
			usr = new User("Mario", "Rossi", "mario.rossi@hbtest.com");
			Attachment att = new Attachment("prova", (Blob) new SerialBlob(file.getBytes()));
			Message msg = new Message(text, usr, att);
			usr.getMsgList().add(msg);
			usrRepository.save(usr);
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		return usr;
	}

}
