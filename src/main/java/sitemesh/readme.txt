一般 sitemesh 是结合 jsp 使用的，
freemarker 自身有一套布局的机制，二者不适合结合。 


Freemarker  是模板引擎。
Sitemesh 是用于装饰页面。
freemarker是一个模板引擎，而 sitemesh 是一个web布局框架


SiteMesh是一个用来在JSP中实现页面布局和装饰
（layout and decoration）的框架组件，
能够帮助网站开发人员较容易实现页面中动态内容和静态装饰外观的分离。

Velocity是模板引擎

在寻求网站结构的高效统一上，SiteMesh通过Decorator的设计模式，十分利索地达到了目的。
其设计思想是，用户发送request至服务器，服务器根据此request生成动态数据，
生成网页，准备返回给客户端。就在返回前，SiteMesh进行拦截，对此网页进行解析，
将title、body等部分拆解出来，套上模板后，再返回给客户端。由于SiteMesh在返
回客户端的最后一步工作，此时的网页已经具备了标准的html网页格式，因此SiteMesh
只需解析标准的html网页，无需考虑各个Web应用是应用了JSP、ASP，还是Velocity技术，
相当灵活。