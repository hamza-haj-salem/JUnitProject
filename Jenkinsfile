pipeline {
    agent any

    stages {
    	
    	stage('Checkout') {
   			steps {
       			checkout scm
    		}
		}
    	
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
                bat 'mvn sonar:sonar -Dsonar.projectKey=JUnit_Basic -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqa_620aae6e85db7fc0b8d210e2f69fffec4a59ebf4'
            }
        }  
    }
    
     post {
        success {
            publishChecks name: 'Jenkins', conclusion: 'SUCCESS'
        }
        failure {
            publishChecks name: 'Jenkins', conclusion: 'FAILURE'
        }
    }
    
}