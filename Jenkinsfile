pipeline {
    agent any

    tools {
        maven 'Maven_3.9.9'  // Ensure this Maven version is configured in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/kunalmali83/JavaProjectJenkin.git'  // Change this to your Git repo
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
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
