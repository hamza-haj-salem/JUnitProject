pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
        
       stage('SonarQube Analysis') {
            steps {
                withCredentials([string(credentialsId: 'tokenSonar', variable: 'SONAR_TOKEN')]) {
                    bat 'mvn sonar:sonar -Dsonar.projectKey=JUnit_Basic -Dsonar.host.url=http://localhost:9000 -Dsonar.token=%SONAR_TOKEN%'
                }
            }
        } 
        
       
    }
    
}