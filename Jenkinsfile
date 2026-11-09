pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat 'C:\\Tools\\apache-maven-3.10.0\\bin\\mvn.cmd clean package'
            }
        }

    }
}