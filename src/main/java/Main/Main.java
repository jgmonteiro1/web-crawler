package Main;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

	public static void main(String[] args) {

		//String url = "https://formulariin.netlify.app";
		String url = "https://osqueridinhos.netlify.app";
		try {

			Document doc = Jsoup.connect(url).get();

			Elements elementosTag = doc.select("h1");

			System.out.println("Elementos nessa página de merda que utilizam a tag 'h1': ");

			for (Element element : elementosTag) {
				System.out.println(element.text());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
