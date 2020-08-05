package vn.vtd.wls.data;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import vn.vtd.wls.entitys.UserEntity;
import vn.vtd.wls.service.UserService;

@Component
public class DemoData {
	private static String link = "";

	private final UserService userService;

	public DemoData(UserService userService) {
		this.userService = userService;
	}

	@EventListener
	public void appReady(ApplicationReadyEvent event) {
		userService.deleteAll();
		addUser();

	}

	public void addUser() {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = docDuLieuTuFile(link + "user.csv");

			String line;
			String[] listInfo;
			while ((line = bufferedReader.readLine()) != null) {
				line += ", ";
				listInfo = line.split(",");
				UserEntity userEntity = new UserEntity(listInfo[0], listInfo[1], listInfo[3], listInfo[2], listInfo[4],
						new Boolean(listInfo[5]), new Boolean(listInfo[6]));
				userService.save(userEntity);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static BufferedReader docDuLieuTuFile(String str) throws IOException {
		FileInputStream fi = new FileInputStream(str);
		InputStreamReader dem = new InputStreamReader(fi);
		BufferedReader buR = new BufferedReader(dem);
		return buR;
	}
}