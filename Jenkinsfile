pipeline {
    agent any
    
    parameters {
        booleanParam(defaultValue: false, description: "Enable service?", name: "myBoolean")
        string(defaultValue: "Test", description: "which env to deploy?", name: "deployEnv")
        choice(choices: ["E2E", "QA", "PROD", "Test"], description: "which env to deploy?", name: "deploySelect")
    }

    environment {
        def myString = "Hello World"
        def myNumber = 10
        def myBoolean = true
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
                echo "myString: ${myString}"
                echo "myNumber: ${myNumber}"
                echo "myBoolean: ${myBoolean}"
                echo "Running build with number: ${env.BUILD_NUMBER}"
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