# spring-jms-activeMq
JMS (Java Message Service) is an API that provides the facility to create, send and read messages.
It provides loosely coupled, reliable and asynchronous communication.

    In this project folder I have added two project repos one JmsConsumer and and JmsProducer. 
    The project is deveoped by spring framework which  provides JmsTemlate to write down the java message serivce.

    How To run this program:
    ---------------------------
    1. Download the activemq message broker and run the activemq.bat file inside the bin folder.
    2. Then in the web browser run activemq with http://localhost:8161/admin/ and click in the queue tab and create a queue with the name CONSUMER.QUEUE 
    3. download the both jmsporducer and jmscosumber project to the eclipse.
    4. download apache tomcat (for JmsProduce then add to the eclipse)
    5. download another version of apache tomcat(JmsConsumer then add to the eclipse)
      (remeber tomcat by default running on port 8080  so we need change the port number of both tomcat so there will be no port confilct)
      for this go the server.xml of both tomcat change the following value
      <Server port="enter the value here" shutdown="SHUTDOWN">
      <Connector connectionTimeout="20000" port="enter the value here" protocol="HTTP/1.1" redirectPort="8443"/>
      <Connector port="enter the value here" protocol="AJP/1.3" redirectPort="8443"/>
    6. Then run the JmsProducer to one of the tomcat server and a jsp page will load to enter vendor information.
    7. Then go the activemq web brower and refresh and you will see the the pending
        message in CONSUMER.QUEUE and you can click to message and verify the message that you sent.
     8. Then just run  JmsProducer and then go the active web browser tab and refresh and you will see there is no pending message means 
        consumer consume it or deqeue it.
