pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                sh "mvn clean install"
            }
        }

        stage("Test") {
            steps {
                sh "mvn test"
            }
        }

        stage("Complete") {
            steps {
                echo "Job Complete test"
            }
        }
    }
}