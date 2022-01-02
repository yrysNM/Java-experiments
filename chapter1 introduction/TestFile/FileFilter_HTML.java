import java.io.*;

public class FileFilter_HTML{
	public static void main(String[] args) {
		File currecntDir = new File(System.getProperty("user.dir"));

		String[] filteredList = currecntDir.list(new ExtFilter("html"));

		for(int i = 0; i < filteredList.length; i++) {
			System.out.println(filteredList[i] + " <? yrys_NM>>");
		}
	}
}

class ExtFilter implements FilenameFilter{
	String ext;

	ExtFilter(String ext) {
		this.ext = "." + ext;
	}

	public boolean accept(File dir , String name) {
		return name.endsWith(ext);
	}
}