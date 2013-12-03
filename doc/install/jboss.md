JBoss Installation/MySQL
========================

Setup the datasource
´´´xml
<datasource jta="true" jndi-name="java:/datasources/TravelDiaryDs" pool-name="TravelDiary" enabled="true" use-java-context="true">
    <connection-url>jdbc:mysql://localhost:3306/travelDiary</connection-url>
    <driver>mysql-connector-java-5.1.25-bin.jar</driver>
    <pool>
        <min-pool-size>10</min-pool-size>
        <max-pool-size>20</max-pool-size>
        <prefill>true</prefill>
    </pool>
    <security>
        <user-name>root</user-name>
    </security>
</datasource>
´´´