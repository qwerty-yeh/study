// 2018-02-12
12:31
建立分支 jar

12:18
war 測試完畢，開始建立分支測試 jar


// 2018-02-12
11:31
移掉部份不需要的設定


11:20
已確認無法用 export war 方式輸出 war 檔案

10:58
修改為 port 8080，製作成 war 檔案，
上傳環境 64bit Amazon Linux 2017.09 v2.7.5 running Tomcat 8 Java 8，
可以執行，之前應該是忘記改 port 

目前結論
war 安裝在純 java 環境，一定會發生 404 問題




// 2018-02-09
16:31
build.gradle 修改
repositories {
	mavenCentral()
}
To
repositories {
	jcenter()
    maven { url "http://repo.spring.io/libs-snapshot" }
}

16:14
環境 64bit Amazon Linux 2017.09 v2.7.5 running Tomcat 8 Java 8
(環境 64bit Amazon Linux 2017.09 v2.6.5 running Java 8 才會)
log 不會出現 Spring 啟動畫面
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.4.3.RELEASE)

且呼叫記錄也會出現
2018-02-09 08:14:11.952  WARN 1658 --- [nio-5000-exec-1] spring-boot-gradle                       : Qwerty

之後測試先以 64bit Amazon Linux 2017.09 v2.6.5 running Java 8 優先



15:04 預設網頁改為 log 紀錄

錯誤
Whitelabel Error Page
This application has no explicit mapping for /error, so you are seeing this as a fallback.
Fri Feb 09 06:54:10 UTC 2018
There was an unexpected error (type=Not Found, status=404).
/WEB-INF/jsp/.jsp



14:56 增加
spring.resources.static-locations=/WEB-INF/jsp/

錯誤
Whitelabel Error Page
This application has no explicit mapping for /error, so you are seeing this as a fallback.
Fri Feb 09 06:54:10 UTC 2018
There was an unexpected error (type=Not Found, status=404).
/WEB-INF/jsp/AA.jsp



14:48
修改 
spring.mvc.view.prefix=/WEB-INF/jsp/
To
spring.mvc.view.prefix=classpath:/WEB-INF/jsp/

錯誤
Whitelabel Error Page
This application has no explicit mapping for /error, so you are seeing this as a fallback.
Fri Feb 09 06:54:10 UTC 2018
There was an unexpected error (type=Not Found, status=404).
/classpath%3A/WEB-INF/jsp/AA.jsp



14:42
改以 war 上傳以下環境 

1.64bit Amazon Linux 2017.09 v2.7.5 running Tomcat 8 Java 8
錯誤
HTTP Status 404 - /
type Status report
message /
description The requested resource is not available.
Apache Tomcat/8.0.47

2.64bit Amazon Linux 2017.09 v2.6.5 running Java 8
錯誤
Whitelabel Error Page
This application has no explicit mapping for /error, so you are seeing this as a fallback.
Fri Feb 09 06:46:39 UTC 2018
There was an unexpected error (type=Not Found, status=404).
/WEB-INF/jsp/AA.jsp




12:51
上傳 github

12:49
gradle bootRepackage 輸出成 jar 檔案，執行會出現以下錯誤

Whitelabel Error Page
This application has no explicit mapping for /error, so you are seeing this as a fallback.

Fri Feb 09 12:30:37 CST 2018
There was an unexpected error (type=Not Found, status=404).
/WEB-INF/jsp/welcome.jsp