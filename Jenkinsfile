pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {
                withMaven(maven: 'maven_3.6.0') {
                    sh 'mvn clean package'
                }
            }
        }

        stage ('Deploy Stage') {
            steps {
              sh 'cp appB/target/appB.war /tmp/deployment'
            }
        }
    }

}