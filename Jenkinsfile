pipeline {
    agent any

    tools {
        maven 'Maven 3.9.6'   // 👈 Jenkins me configured Maven ka naam
        jdk 'Java 17'         // 👈 Jenkins me configured Java ka naam
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/KaminiPatidar30/demo.git'

            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Run (Optional)') {
            steps {
                bat 'java -jar target/demo-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
