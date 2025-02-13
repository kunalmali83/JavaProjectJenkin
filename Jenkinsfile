pipeline {
    agent any

    tools {
        maven 'Maven_3.8.1'  // Ensure this Maven version is configured in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/user/repo.git'  // Change this to your Git repo
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying the application..."
                // Add deployment steps
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
