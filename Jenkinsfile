pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Check out the source code
                    checkout scm
                }
                // Use Maven to build the project
                sh 'mvn clean package'
            }
        }
        stage('Run Banking System Application') {
            steps {
                // Run the banking system application
                sh 'java -jar target/banking-system-app.jar'
            }
        }
    }
}