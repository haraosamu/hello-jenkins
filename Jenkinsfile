pipeline {

    agent any

    stages {

        stage('Test') {

            steps {

                bat 'call C:\\Tools\\apache-maven-3.10.0\\bin\\mvn.cmd test'

            }

        }

        stage('Package') {

            steps {

                bat 'call C:\\Tools\\apache-maven-3.10.0\\bin\\mvn.cmd package'

            }

        }

        stage('Archive') {

            steps {

                archiveArtifacts artifacts: 'target/*.jar'

            }

        }

        stage('Docker Build') {

            steps {

                bat 'docker build -t hello-jenkins .'

            }

        }

    }

}