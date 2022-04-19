package com.reactive;

//WebFlux = 단일스레드, 비동기 + Stream을 통해 백프레셔가 적용된 데이터만을 간헐적 응답이 가능하다 + 데이터 소비가 끝나면 응답이 종료
//SSE적용(Servlet, WebFlux) = 데이터 소비가 끝나도 sTREAM이 계속 유지 된다.
public class App {
	public static void main(String[] args) {
		MyPub pub = new MyPub();	//신문사 생성
		MySub sub = new MySub();	//구독자 생성
		pub.subscribe(sub);
	}

}
