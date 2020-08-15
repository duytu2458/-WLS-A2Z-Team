package vn.vtd.wls.commons;

import java.text.Normalizer;
import java.util.List;

public class Handling {

	public static String getStandardFullName(String fullName) {
		if (fullName == null) {
			return null;
		}

		if (fullName.length() > 0 && 65279 == fullName.charAt(0)) {
			fullName = fullName.substring(1);
		}

		fullName = fullName.trim().replaceAll(" +", " ");
		if ("".equals(fullName)) {
			return "";
		}

		String[] listInfoFullName = fullName.split(" ");

		StringBuffer stringBuffer = new StringBuffer();
		for (String InfoName : listInfoFullName) {
			stringBuffer.append(String.valueOf(InfoName.charAt(0)).toUpperCase());
			stringBuffer.append(InfoName.substring(1).toLowerCase());
			stringBuffer.append(" ");
		}

		return stringBuffer.toString().trim();
	}

	public static String getAccountFromFullName(String fullName) {
		fullName = getStandardFullName(fullName);
		if (fullName == null) {
			return null;
		}

		fullName = convertToLatinLanguage(fullName);

		int lastIndex = fullName.lastIndexOf(' ');

		if (lastIndex < 0) {
			return fullName;
		}

		String[] listInfoFullName = fullName.split(" ");

		int len = listInfoFullName.length;

		StringBuffer stringBuffer = new StringBuffer(listInfoFullName[len - 1]);
		for (int i = 0; i < len - 1; i++) {
			stringBuffer.append(listInfoFullName[i].charAt(0));
		}

		return stringBuffer.toString();
	}

	public static String getAccountFromAccountList(String account, List<String> accountList) {
		if (account == null) {
			return null;
		}

		if (accountList.size() == 0) {
			return account;
		}

		int accountLen = account.length();
		int maxAccountNumber = -1;
		int accountNumber;

		String accountNumberStr;
		for (String acc : accountList) {
			accountNumberStr = acc.substring(accountLen);
			if ("".equals(accountNumberStr)) {
				if (maxAccountNumber < 0) {
					maxAccountNumber = 0;
				}
				continue;
			}

			try {
				accountNumber = Integer.parseInt(accountNumberStr);
				if (maxAccountNumber < accountNumber) {
					maxAccountNumber = accountNumber;
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		}

		return maxAccountNumber == -1 ? account : account + String.valueOf(maxAccountNumber + 1);
	}

	private static String convertToLatinLanguage(String str) {
		return str == null ? null
				: Normalizer.normalize(str, Normalizer.Form.NFD).replace('đ', 'd').replaceAll("Đ", "D")
						.replaceAll("[^\\p{ASCII}]", "");
	}

}
