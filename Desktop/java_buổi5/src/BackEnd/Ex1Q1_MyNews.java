package BackEnd;

import java.util.ArrayList;
import java.util.Scanner;

import Enity.News;

public class Ex1Q1_MyNews {
	private Scanner scanner;
	private ArrayList<News> arrayNews;

	public Ex1Q1_MyNews() {
		scanner = new Scanner(System.in);
		arrayNews = new ArrayList<News>();
	}

	public void menu() {
		while (true) {
			System.out.println("input 1,2,3 or 4(1.Insert News 2.View list News 3.Average Rate 4.Exit): ");
			int input = scanner.nextInt();
			switch (input) {
			case 1:
				InsertNews();
				break;
			case 2:
				ViewListNews();
				break;
			case 3:
				AverageRate();
				break;
			case 4:
				return;
			default:
				System.out.println("input only 1 or 2 or 3 or 4");
				break;
			}
		}
	}

	public void InsertNews() {
		System.out.println("nhập vào id: ");
		int inputId = scanner.nextInt();
		System.out.println("nhập vào Title: ");
		String inputTitle1 = scanner.nextLine();
		String inputTitle = scanner.nextLine();
		System.out.println("nhập vào PublishDate: ");
		String inputPublishDate = scanner.nextLine();
		System.out.println("nhập vào Author: ");
		String inputAuthor = scanner.nextLine();
		System.out.println("nhập vào Content: ");
		String inputContent = scanner.nextLine();
		System.out.println("nhập vào đánh giá 1: ");
		int inputDanhGia1 = scanner.nextInt();
		System.out.println("nhập vào đánh giá 2: ");
		int inputDanhGia2 = scanner.nextInt();
		System.out.println("nhập vào đánh giá 3: ");
		int inputDanhGia3 = scanner.nextInt();
		int[] rates = { inputDanhGia1, inputDanhGia2, inputDanhGia3 };
		News insertNews = new News(inputId, inputTitle, inputPublishDate, inputAuthor, inputContent);
		insertNews.setRates(rates);
		// insertNews.getAverageRate();
		arrayNews.add(insertNews);
		System.out.println(insertNews.toString());
	}

	public void ViewListNews() {
		for (News array : arrayNews) {
			array.Display();
		}
	}

	public void AverageRate() {
		for (News a : arrayNews) {
			System.out.println(a.getTitle() + "\n" + a.Calculate());
		}

	}
}
