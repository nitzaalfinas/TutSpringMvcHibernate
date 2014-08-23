1. Setup dependency pada pom.xml
    tambahkan 'spring-orm'
    tambahkan 'hibernate-core' 4.3.5
    tambahkan 'javax.servlet-api' 3.1.0
    tambahkan 'javax.servlet.jsp-api' 2.3.1
    tambahkan 'jstl' 1.2
    tambahkan 'commons-dbcp2' 2.0
    tambahkan 'mysql-connector-java' 5.1.30

2. Setup database Student
    tambahkan tabel student
    CREATE TABLE IF NOT EXISTS `student` (
        `studentId` int(11) NOT NULL AUTO_INCREMENT,
        `full_name` varchar(50) NOT NULL,
        `address` varchar(100) NOT NULL,
        `phone` varchar(30) NOT NULL,
         PRIMARY KEY (`studentId`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

3. Tambahkan model Student

4. Buat mapping xml untuk model Student

5. Buat config hibernate
