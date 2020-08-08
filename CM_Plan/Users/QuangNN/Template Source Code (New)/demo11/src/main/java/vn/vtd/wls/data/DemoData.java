package vn.vtd.wls.data;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import vn.vtd.wls.common.Handling;
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
//		userService.deleteAll();
		addUser();
//		getSameAccount
//		System.out.println(userService.getAccountFromFullName("QuangNN"));
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

				UserEntity userEntity = new UserEntity();
				
				userEntity.setFullName(Handling.getStandardFullName(listInfo[0]));
				userEntity.setAccount(userService.getAccountFromFullName(userEntity.getFullName()));
				userEntity.setGender(listInfo[1]);
				userEntity.setEnable(new Boolean(listInfo[2]));
				userEntity.setPhone(listInfo[3]);
				userEntity.setPassWord(listInfo[4]);
				userEntity.setRoleLogin(listInfo[5]);

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