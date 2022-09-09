pipeline {
    agent any
    parameters {
        booleanParam(defaultValue: false, description: "Enable service?", name: "myBoolean")
        string(defaultValue: "Test", description: "which env to deploy?", name: "deployEnv")
        choice(choices: ["E2E", "QA", "PROD"], "Test", description: "which env to deploy?", name: "deploySelect")
    }
    stages {
        stage("Build") {
            steps {
            echo "booleanParam is set to: ${params.myBoolean}"
            echo "stringParam is set to: ${params.deployEnv}"
            echo "stringParam is set to: ${params.deploySelect}"
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