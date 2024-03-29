package crawling0919;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Test03_egovframe {

	public static void main(String[] args) {
		// http://pretyimo.cafe24.com/lectureRead.do?lectureno=333
		// 크롤링(Crawling), 스크래핑(Scraping)
		// -> 개인 혹은 단체에서 필요한 데이터가 있는 웹(Web)페이지의 구조를 분석하고 파악하여 긁어옵니다.
		
		//연습) 전자정부표준프레임워크 공지사항(1~23페이지) 웹페이지 소스 가져오기.
			
		/*
			https://www.egovframe.go.kr/home/ntt/nttList.do?searchKey=&searchValue=&menuNo=74&bbsId=6&pagerOffset=0
			https://www.egovframe.go.kr/home/ntt/nttList.do?searchKey=&searchValue=&menuNo=74&bbsId=6&pagerOffset=10
			https://www.egovframe.go.kr/home/ntt/nttList.do?searchKey=&searchValue=&menuNo=74&bbsId=6&pagerOffset=20
			https://www.egovframe.go.kr/home/ntt/nttList.do?searchKey=&searchValue=&menuNo=74&bbsId=6&pagerOffset=30
			https://www.egovframe.go.kr/home/ntt/nttList.do?searchKey=&searchValue=&menuNo=74&bbsId=6&pagerOffset=40

			https://www.egovframe.go.kr/home/ntt/nttList.do?searchKey=&searchValue=&menuNo=74&bbsId=6&pagerOffset=220
		*/
		
		
		try {
			
			String URL    = "https://www.egovframe.go.kr/home/ntt/nttList.do";
			String params = "?searchKey=&searchValue=&menuNo=74&bbsId=6";
			
			//공지사항 HTML 페이지
			for(int p=0; p<=220; p+=10) {
				//String page = "pagerOffset=" + p;
				String page = "&pagerOffset=" + p;
				
				// System.out.println(params+page);
				Document doc = Jsoup.connect(URL+params+page).get();
				System.out.println(doc.toString());
			}//for end
			
		}catch (Exception e) {
			System.out.println("크롤링 실패 : " + e);
		}//end
		
		
	}//main() end
}//class end
