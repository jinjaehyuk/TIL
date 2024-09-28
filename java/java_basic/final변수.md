# final
## final 변수와 상수
- 변수에 `final` 키워드가 붙으면 더는 값을 변경할 수 없다.
- `final`은 class, method를 포함한 여러곳에 붙을 수 있다. 
``` java
    public static void main(String[] args) {
        //final 지역변수
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
//        data2 = 20; //컴파일 오류

        //final 지역변수2
        final int data2 = 10;
        method(10);

    }
    static void method(final int paramete){
//        parameter= 20; //컴파일오류
    }
```
- final을 지역 변수에 설정할 경우 최초 한번만 할당할 수 있다. 이후 변수의 값을 변경하려면 컴파일 오류가 발생
- `final`을 지역변수 선언시 바로 초기화 한 경우 이미 값이 할당되었기 때문에 값을 할당 x
- 매개변수에 final 이 붙으면 메서드 내부에서 매개변수의 값을 변경할 수 없다. 따라서 메서드 호출 시점에 사용된 값이 끝까지 사용됨.

### static final
- `FieldInte.MY_VALUE` 는 static영역에 존재한다. 그리고 final 키워드를 사용해서 초기화 값이 변하지 않는다.
- `static`영역은 단 하나만 존재하는 영역. MY_VALUE 변수는 JVM상에서 하나만 존재하므로 중복과 메모리 비효율 문제를 모두 해결할 수 있다.

### 상수(Constant)
- 상수는 변하지 않고, 항상 일정한 값을 갖는 수를 말한다. 자바에서는 보통 단 하나만 존재하는 변하지 않는 고정된 값을 상수라한다.
- 이런 이유로 상수는 `static final` 키워드를 사용한다.

### 자바 상수 특징
- `static final` 키워드를 사용
- 대문자를 사용하고 구분은 _(언더스코어)로 한다.(관례)
    - 일반적인 변수와 상수를 구분하기 위해
- 필드를 직접 접근해서 사용
    - 상수는 기능이 아니라 고정된 값 자체를 사용하는 것이 목적
    - 상수는 값을 변경할 수 없음. 필드에 직접 접근해도 데이터가 변하는 문제가 발생하지 않음.

```java
public class Constant {
    public static final double PI = 3.14;

    public static final int HOURS_IN_DAY = 24;
    public static final int HOURS_IN_HOUR = 60;
    public static final int HOURS_IN_MINUTE = 60;

    public static final int MAX_USERS = 1000;
}
```
- 애플리케이션 안에는 다양한 상수가 존재할 수 있음. 
- 보통 이런 상수들은 애플리케이션 전반에서 사용되기 때문에 public를 자주 사용. 특정 위치에서만 사용된다면 다른 접근제어자 사용
- 상수는 중앙에서 값을 하나로 관리할 수 있다는 장점도 있음.
- 상수는 런타임에 변경할 수 없다. 상수를 변경하려면 종료 후 수정한뒤 다시 실행해야한다.
- 매직넘버문제가 있을땐 상수를 사용하여 어떤 내용인지 인지할 수 있다.

## final 변수와 참조
`final`은 변수의 값을 변경하지 못하게 ㅁ가는다. 
- 변수느 크게 기본형변수와 참조형 변수가 있음.
- 기본형 변수는 10,20 같은 값을 보관하고, 참조형 변수는 객체의 참조값을 보관한다.
    - final을 기본형 변수에 사용하면 값을 변경할 수 없다.
    - final을 참조형 변수에 사용하면 참조값을 변경할 수 없다.
``` java
    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data();
        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value =20;
        System.out.println(data.value);
    }
```
- 참조형 변수 data에 final 이 붙었다. 변수 선언 시점에서 참조값을 할당했으므로 더는 참조값을 변경할 수 없다.
- 그런데 참조 대상의 객체 값은 변경이 가능함.
    - 참조형 변수 data에 final이 붙었지만 이 경우 참조형 변수에 들어있는 참조값을 다른값으로 변경하지 못한다. 
    - 다른 객체를 참조할 수 없는 형태이다. 
    - Data.value는 final 이 아니다. 따라서 값을 변경할 수 있다.