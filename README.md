# ParallelPursuit

🔙🔚💾😭💸🆘


[gh repo create ParallelPursuit --private --add-readme --gitignore=Node --license=gpl-3.0 ]


mvn compile
mvn test -Dtest=StartSessionRunner
mvn testng:test -Dtestng.test.class=StartSessionRunner
java -cp target/classes org.testng.TestNG StartSessionRunner



# ---
mvn test -Dtest=StartSessionRunner -DfailIfNoTests=false


String url = cypher.decrypt(properties.getProperty("site"));
