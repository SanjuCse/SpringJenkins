pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/SanjuCse/SpringJenkins.git'
            }
        }
        stage('Build') {
            steps {
                sh 'docker build -t myapp .'
            }
        }
        stage('Test') {
            steps {
                sh 'docker run myapp test'
            }
        }
        stage('Deploy') {
            steps {
                sh 'docker run -d -p 9090:9090 myapp'
            }
        }
    }
}
