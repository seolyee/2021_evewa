[2021_06_27] slight decoration
추가한 파일은 없음, 글씨색상 바꾸고 텍스트뷰 찍은정도
fragment_home의 상단 액션바 제거(values.themes에서 NoActionBar 써줌), 헬루 텍스트뷰 넣고 검색창 크기&위치 수정
activity_main에서 하단 네비게이션 색상 없앰(맨 아래에 주석으로 빼놨음)

[2021_06_25] plan_choose two button clear
추가 xml 파일 :
+R.layout.activity_pchoose_qn_a_plan.xml
+R.layout.activity_pchoose_inbody_plan.xml
추가 자바 파일 :
+com.example.front_end_home_test.pchoose_QnA_plan.java
+com.example.front_end_home_test.pchoose_inbody_plan.java
manifest에 액티비티 추가한거 언급되어있음

[2021_06_24] bottom_navigation move
bottom navigation 추가 xml 파일:
    +R.layout.fragment_home.xml
    +R.layout.fragment_feed.xml
    +R.layout.fragment_mypage.xml
    +R.layout.fragment_setting.xml
    +R.menu.menu_bottom.xml
까지 총 5개의 파일 생성

bottom_navigation 추가 java 파일:
    +com.example.front_end_home.fragment_home.java
    +com.example.front_end_home_fragment_feed.java
    +com.example.front_end_home_fragment_mypage.java
    +com.example.front_end_home_fragment_setting.java
까지 총 4개의 파일 생성


R.layout.activity_main.xml 파일 내용 R.layout.fragment_home.xml로 옮김
    getApplicationContext() 함수 getContext() 함수로 수정
com.example.front_end_home_MainActivity.java 파일의 내용 com.example.front_end_home_fragment_home.xml로 옮김


[2021_06_23] README push
android studio에서 리드미 파일 생성

[2021_06_23] just menu name change
menu_bottom.xml
    bottom_navigation의 item 이름 수정

[2021_06_23] Add README.md
gitLab에서 리드미 파일 생성

[2021_06_23] 8 button all switch screens
8 button all switch screens의 파일에 추가한 파일 :
    +R.layout.activity_daily_stamp.xml
    +R.layout.activity_event_stamp.xml
    +R.layout.activity_plan_choose.xml
    +R.layout.activity_community.xml
    +R.layout.activity_inbody_check.xml
    +R.layout.activity_walking.xml
    +R.layout.activity_ranking.xml
    +R.layout.activity_record.xml
까지 총 8개의 액티비티 파일을 만들었음(홈에 있는 8개 버튼)

8 button java 추가 파일 :
    +com.example.front_end_home_test.daily_stamp.java
    +com.example.front_end_home_test.event_stamp.java
    +com.example.front_end_home_test.plan_choose.java
    +com.example.front_end_home_test.community.java
    +com.example.front_end_home_test.inbody_check.java
    +com.example.front_end_home_test.walking.java
    +com.example.front_end_home_test.ranking.java
    +com.example.front_end_home_record.java
까지 MainActivity.java를 제외한 8개의 자바파일을 만듦(홈에 있는 8개 버튼)

AndroidManifest.xml 수정
    <activity android:name=".record" />
    <activity android:name=".walking" />
    <activity android:name=".ranking" />
    <activity android:name=".inbody_check" />
    <activity android:name=".community" />
    <activity android:name=".event_stamp" />
    <activity android:name=".plan_choose" />
    <activity android:name=".daily_stamp" />
코드 추가로 activity 파일 추가 설정

210720 add naver map api