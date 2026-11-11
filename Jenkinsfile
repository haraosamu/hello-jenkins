pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat 'call C:\\Tools\\apache-maven-3.10.0\\bin\\mvn.cmd clean package'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar'
            }
        }

    }
}
