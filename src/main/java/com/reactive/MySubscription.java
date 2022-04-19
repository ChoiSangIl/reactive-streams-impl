package com.reactive;

import java.util.Iterator;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

//구독정보(구독자, 어떤데이터를 구독할지)
public class MySubscription implements Subscription{
	
	private Subscriber s;
	private Iterator<Integer> it;
	
	public MySubscription(Subscriber<? super Integer> s, Iterable<Integer> its) {
		this.s = s;
		this.it = its.iterator();
	}

	public void request(long n) {
		// TODO Auto-generated method stub
		while(n > 0) {
			if(it.hasNext()) {
				s.onNext(it.next());
			}else {
				s.onComplete();
				break;
			}
			n--;
		}
		
	}

	public void cancel() {
		// TODO Auto-generated method stub
		
	}
}
