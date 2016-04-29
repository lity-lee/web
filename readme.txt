开发环境：eclise ee

这是一个java web 项目, 使用maven来管理依赖

开发流程
1. 不使用eclipse 的web 功能，如内嵌或者集成tomcat, deploy。eclipse仅用于开发(似乎eclise se也可以，未验证)
2. 项目放置于tomcat安装目录webapps下面， 导入到eclipse即可开发。
3. 另外maven管理的依赖如(jstl, structs2)需要手动得到WEB-INF/lib下面，可使用如下命令：
	mvn dependency:copy-dependencies -DoutputDirectory=WEB-INF/lib  -DincludeScope=runtime
4. 使用tomcat manager来reload, 可以减少频繁重启server

