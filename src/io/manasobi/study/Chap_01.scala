package io.manasobi.study

/**
 * @author Administrator
 */
object Chap_01 {
  
  def main(args: Array[String]): Unit = {
    
    println(1.toString())

    println(1.to(10))
    
    //스칼라는 래퍼 타입이 필요 없다. 기본 타입과 래퍼 사이 변환은 컴파일러 몱이다. 예를 들어, Int의 배열을 만들면 가상 머신에서는 int[] 배열이 된다.
    

    //스칼라 문자열은 java.lang.String에 의존한다. 하지만 스칼라는 100개가 넘는 연산을 가진 StringOps 클래스로 이를 보강한다.
    //예를 들어, intersect 메소드는 두 문자열에 공통인 문자들을 준다.
    
    val intersect = "Hello".intersect("World") // "lo"가 나온다.
    
    println(intersect)
    
    //숫자가 들어있는 문자열을 숫자로 변환하기 위해서는 toInt 혹은 toDouble을 사용한다. 예를 들어, "99.44".toDouble은 99.44다   
  
    
    //1.4 산술과 연산자 오버로딩
    
    //메소드 a method b는 다음의 축약이다. a.method(b)
    //따라서 1.to(10)은 1 to 10으로 사용가능하다. (여기서 메소드는 인자가 2개인 암묵적, 명시적 메소드임을 밝힘)
    println(1 to 10)
    
    //counter+=1 //counter를 증가한다. 스칼라는 ++이나 -- 연산자가 없다.
    
    
    //1.5 함수와 메소드 호출
    
    //import scala.math._ //scala에서 _문자는 자바의 *와 같이 와일드카드다.
    
    //스칼라는 정적 메소드가 없는 대신에 싱글톤 오브젝트라는 유사 기능이 있다.
    //클래스는 종종 메소드가 자바 정적 메소드와 같은 역할을 하는 컴패니언 오브젝트를 가진다.
    
    //인자가 없는 스칼라 메소드는 보통 괄호를 사용하지 않는다.
    println("manasobi".toUpperCase)
    
    
  }
}