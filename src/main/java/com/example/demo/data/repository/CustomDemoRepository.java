package com.example.demo.data.repository;

import reactor.core.publisher.Mono;

public interface CustomDemoRepository {

  Mono<String> testMethodOne();

  Mono<String> testMethodTwo();


  String simpleOne();

  String simpleTwo();
}
