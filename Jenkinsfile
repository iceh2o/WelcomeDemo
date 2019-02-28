pipeline {
    agent any
    tools {
        maven 'maven_3.6.0'
    }

    stages {
        stage ('Compile Stage') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage ('Deploy Stage') {
            steps {
              sh 'cp appB/target/appB.war /tmp/deployment'
            }
        }
    }

}