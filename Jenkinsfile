pipeline {
    agent any

    tools {
        maven 'Mvn'  // Make sure this matches your Maven tool configuration in Jenkins
        jdk 'JDK-17'  // Update to your JDK version if necessary
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from your Git repository
                git branch: 'main', url: 'https://github.com/MINAWI0/NeedThisBackend.git'
            }
        }

        stage('Build') {
            steps {
                // Build the project using Maven
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Run tests
                sh 'mvn test'
            }
        }

        stage('Archive') {
            steps {
                // Archive the JAR file
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
         stage('Trigger Another Job') {
            steps {
                // Call another job
                build job: 'code-quality'
            }
        }
    }
}

