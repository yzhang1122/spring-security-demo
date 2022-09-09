pipeline {
    agent any
    parameters {
        booleanParam(defaultValue: false, description: "Enable service?", name: "myBoolean")
    }
    stages {
        stage("Build") {
            steps {
            echo "booleanParam is set to: ${params.myBoolean}"
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