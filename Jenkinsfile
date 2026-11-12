pipeline {

    agent any

    stages {

        stage('Docker Check') {

            steps {

                bat 'whoami'
                bat 'docker context ls'
                bat 'docker info'

            }

        }

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
