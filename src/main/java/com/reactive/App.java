package com.reactive;

//WebFlux = ���Ͻ�����, �񵿱� + Stream�� ���� �������Ű� ����� �����͸��� ������ ������ �����ϴ� + ������ �Һ� ������ ������ ����
//SSE����(Servlet, WebFlux) = ������ �Һ� ������ sTREAM�� ��� ���� �ȴ�.
public class App {
	public static void main(String[] args) {
		MyPub pub = new MyPub();	//�Ź��� ����
		MySub sub = new MySub();	//������ ����
		pub.subscribe(sub);
	}

}
