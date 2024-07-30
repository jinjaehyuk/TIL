# 자바 기본편
###  
## 클래스가 필요한 이유
- 자바는 클래스와 객체로 이루어져있다. 그만큼 클래스와 객체라는 개념은 중요함

## 클래스를 이해하기 위한 문제
### 문제 : 학생정보 출력 프로그램 만들기
- 요구사항
    1. 첫 번째 학생의 이름은 "학생1", 나이는 15, 성적은 90
    2. 두 번째 학생의 이름은 "학생2", 나이는 16, 성적은 80
    3. 각 학생의 정보를 다음과 같은 형식으로 출력해야함=>`이름 : [이름] 나이 : [나이] 성적 : [성적]`
    4. 변수를 사용해서 학생 정보를 저장하고 변수를 사용해서 학생정보를 출력

- 변수사용
    ```java
        public static void main(String[] args) {
            String student1Name = "학생1";
            int student1Age = 15;
            int student1Grade=90;
            
            String student2Name = "학생2";
            int student2Age = 16;
            int student2Grade=80;

            System.out.println("이름 : " + student1Name+" 나이 : " + student1Age+" 성적 : " + student1Grade);
            System.out.println("이름 : " + student2Name+" 나이 : " + student2Age+" 성적 : " + student2Grade);
        }
    ```
    - 문제점 : 학생이 증가할 때 마다 변수를 추가로 선언해줘야함.
- 배열 사용
    ```java
        public static void main(String[] args) {
            String[] studentName = {"학생1","학생2"};
            int[] studentAge ={15,16};
            int[] studentGrade ={90,80};

            for(int i =0; i<studentName.length; i ++){
                System.out.println("이름 : " + studentName[i]+" 나이 : " + studentAge[i]+" 성적 : " + studentGrade[i]);
            }
        }
    ```
    - 문제점 : 3개 배열의 인덱스 순서를 항상 정확하게 맞춰야함. 실수할 가능성이 높음.
- 클래스 사용
    ### Student 클래스
    ```java
        public class Student {
            String name;
            int age;
            int grade;
        }
    ```
    - 클래스에 정의한 변수들을 멤버 변수, 또는 필드
        - `멤버변수(Member Variable)` : 이 변수들은 특정 클래스에 소속된 멤버이기 때문
        - `필드 (Field)` : 데이터 항목을 가르키는 전통적인 용어
        - 멤버 변수 = 필드 , 클래스에 소속된 변수를 뜻함
    ### 클래스는 관례상 대문자로 시작하고 낙타 표기법을 사용
    ex) `Student`, `User`, `MemberService`
    ```java
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // 학생을 실제 메모리에 만듦.
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 80;

        System.out.println("이름: "+ student1.name + " 나이 :" + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름: "+ student2.name + " 나이 :" + student2.age + " 성적 : " + student2.grade);
    }

    ```
    ### 클래스와 사용자 정의 타입
    - 타입은 데이터의 종류나 형태를 나타냄
    - 사용자가 직접 정의하는 사용자 정의타입은 클래스임.
    - 실제 메모리에 만들어진 실체를 객체 또는 인스턴스
    - 클래스를 통해 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.