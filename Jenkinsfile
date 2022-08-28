pipeline {
    agent any
    stages {
        stage("Clean up") {
            steps {
                deleteDir()
            }
        }

        stage("Clone Repo") {
            steps {
                sh "git clone https://github.com/yzhang1122/spring-security-demo.git"
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