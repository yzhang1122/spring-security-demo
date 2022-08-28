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

        stages("Build") {
            steps {
                dir("spring-security-demo") {
                    sh "mvn clean install"
                }
            }
        }

        stages("Test") {
            steps {
                dir("spring-security-demo") {
                    sh "mvn test"
                }
            }
        }
    }
}