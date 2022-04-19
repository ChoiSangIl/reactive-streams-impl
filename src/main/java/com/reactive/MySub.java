package com.reactive;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class MySub implements Subscriber<Integer>{

	private Subscription s;
	private int bufferSize = 2;
	
	public void onSubscribe(Subscription s) {
		// TODO Auto-generated method stub
		System.out.println("������ : �������� �� �޾Ҿ�");
		this.s = s;
		System.out.println("������ : �� ���� �Ź� 3���� ��");
		s.request(bufferSize);	//�Ź� �Ѱ��� ���ϸ��� ��!! (��������) �Һ��ڰ� �ѹ��� ó���� �� �ִ� ������ ��û
	}

	public void onNext(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("onNext():" + t);
		
		bufferSize--;
		if(bufferSize == 0) {
			System.out.println("�Ϸ�����");
			bufferSize = 2;
			s.request(bufferSize);
		}
	}

	public void onError(Throwable t) {
		// TODO Auto-generated method stub
		System.out.println("������ ����");		
	}

	public void onComplete() {
		// TODO Auto-generated method stub
		System.out.println("�����Ϸ�");
	}

}
