pipeline {
    agent any
    stages {
        stage("Clean up") {
            steps {
                deleteDir()
            }
        }

        stage("Build") {
            steps {
                dir("spring-security-demo") {
                    sh "mvn clean install"
                }
            }
        }

        stage("Test") {
            steps {
                dir("spring-security-demo") {
                    sh "mvn test"
                }
            }
        }
    }
}