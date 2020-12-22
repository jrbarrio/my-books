pipeline {
    agent { docker { image 'gradle:jdk15' } }
    stages {
        stage('Get Gradle version') {
            steps {
                sh 'gradle --version'
            }
        }
    }
}
