package com.zlobrynya.testkotlin.rxbus

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

object RxBus {

    private val bus = PublishSubject.create<Any>()

    fun send(o: Any) = bus.onNext(o)

   // fun send(o: Current?) = bus.onNext(o)

    fun <T> listen(eventType: Class<T>): Observable<T> = bus.ofType(eventType)
}