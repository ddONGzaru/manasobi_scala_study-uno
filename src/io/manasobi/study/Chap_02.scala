package io.manasobi.study

import scala.io.StdIn

/**
 * @author Administrator
 */
object Chap_02 {
  
  def main(args: Array[String]) {

    //스칼라는 모든 구문이 값을 가진다.
    //블록은 값을 가진다 - 가장 마지막 식의 값이다.
    //스칼라의 for 루프는 자바의 강화된 for 루프와 유사하다.
    //세미콜론은 (대부분) 생략 가능하다.
    //void 타입은 Unit다.
    //함수 정의에 =가 없다는 점을 유의한다.
    //에외는 자바나 C++처럼 동작한다. 하지만 catch에 "패턴 매칭" 문법을 사용한다.
    //스칼라는 체크 예외가 없다.
    
    /*val name = StdIn.readLine("your name: ")
    print("Your age: ")
    val age = StdIn.readInt()
    printf("Hello, %s! Next year, you will %d.", name, age)*/
    
    
    //2.5 루프
    
    //스칼라는 for (init; test; update) 루프에 상응하는 것을 가지고 있지 않다. 이런 루프가 필요하면 두가지 선택이 있다.
    //whlie 루프를 사용하거나 다음과 같은 문을 사용한다.
    // for (i <- 1 to n) r = r * i
    
    //다음 구문은 변수 i를 <- 오른쪽 식의 모든 값을 돌게 만든다.
    //for (i <- expr)
    //for 루프에서 변수 앞에 val이나 var이 없다. 변수의 타입은 콜렉션의 원소 타입이다. 루프 변수 범위는 루프 끝까지 확장된다.
    
    //문자열이나 배열을 돌 때, 보통 0에서 n-1 범위가 필요하다. 이 경우, to메소드 대신에 until 메소드를 사용하기 바란다.
    //이 메소드는 상계를 포함하지 않는 범위를 리턴한다.
    
    val s = "Hello"
    var sum = ""
    
    for (i <- 0 until s.length) sum += s(i)    
    println(sum)
    
    var sum2 = ""
    for (ch <- s) sum2 += ch
    println(sum2)
    
    //2.6 고급 for 루프와 for 컴프리헨션
    
    //variable <- expression 형태의 여러 제너레이터를 가질 수 있다. 제너레이터는 세미콜론으로 구분한다.
    for (i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + " ") //11 12 13 21 22 23 31 32 33을 출력
    
    //각 제너레이터는 if 뒤에 오는 이진 조건인 가드를 가질 수 있다.
    for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + " ") //12 13 21 23 31 32을 출력 [if 앞에 세미콜론이 없음에 유의]
    
    //루프 안에서 사용할 수 있는 변수를 소개하는 여러 정의를 가질 수 있다.
    for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ") //13 22 23 31 32 33을 출력
    
    //for 루프의 바디가 yield로 시작하면, 각 반복마다 하나의 값으로 값의 콜렉션을 생성한다.
    val vertor = for (i <- 1 to 10) yield i % 3 //Vector(1, 2, 0, 1, 2, 0, 1, 2, 0, 1) 이런 루프 타입을 [for 컴프리헨션] 이라고 부른다.
    
    
    
  }
}