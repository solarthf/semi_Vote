# 지역구의원투표 프로그램

[정보처리산업기사 지역구의원투표 프로그램.pdf](https://github.com/solarthf/semi_Vote/files/10833519/default.pdf)


## 개발환경
| 개발환경 |  |
| :---: | --- |
| 운영체제 | Windows 10 64bit |
| 개발언어 | Java, HTML5, JSP, JavaScript, jQuery, SQL |
| 개발도구 | Eclipse, SQLdeveloper |
| 데이터베이스 | Oracle 21c |
| WAS | Apache Tomcat 9 |
| 웹브라우저 | Chrome |
| 형상관리시스템 | Git |
| 라이브러리 | jstl-1.2, ojdbc8 |
| 프레임워크 | Bootstrap |

## 메인 화면
![1](https://user-images.githubusercontent.com/115023222/221407639-aeabcb85-4995-4965-bc53-55c28764fa4d.png)
index.jsp화면이지만 header.jsp파일을 따로 만들어서 적용시켰다.

## 후보조회 화면
![2](https://user-images.githubusercontent.com/115023222/221407704-12d515ea-e165-436c-9998-9112b2dd6fce.png)
후보자테이블과 정당테이블을 참조하여 후보자의 정보를 모두 조회했다.

## 투표하기 화면
![3](https://user-images.githubusercontent.com/115023222/221407767-d71355c5-4065-497d-aab6-23b1bd890eb7.png)
유효성 체크를 통해 각 항목별 알림창이 나타나야 하지만 하나로 통일시켰다.
모든 항목을 입력한 후 투표하기 버튼을 클릭하면 데이터베이스에 저장되면서 '투표하기 정보가 정상적으로 등록되었습니다!'란 알림창과 함께 메인 화면으로 이동한다.
입력한 정보의 확인은 '투표검수조회' 화면에서 가능하다.

## 투표검수조회 화면
![4](https://user-images.githubusercontent.com/115023222/221407914-5e14c31c-a1ff-47ed-99b4-ce862636bd47.png)
투표이력 테이블의 정보 중 '제1투표장'의 정보만을 출력하는 화면이다.

## 후보자등수 화면
![5](https://user-images.githubusercontent.com/115023222/221408329-90ef182e-8fa5-4434-8d9d-579cbee45621.png)
투표이력테이블과 후보자테이블을 참조하여 총투표건수를 출력한다.

---
## 소감
두개의 테이블을 참조해서 정보를 나타내기위해 SQL문법을 사용하면서 다시금 공부하게 되었다.
따로따로 배웠던 것들을 하나씩하나씩 적용하면서 하나의 페이지가 되가는걸 보며 신기하고 재미있었다.
