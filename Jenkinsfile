pipeline {
    agent any
    stages {
        stage ('Compile Stage') {
            steps {
                withMaven(maven : 'maven_3_6_0') {
                    sh 'mvn clean compile'
                }
            }
        }
        stage ('Testing Stage') {
                    steps {
                        withMaven(maven : 'maven_3_6_0') {
                            sh 'mvn test'
                        }
                    }
        }
        stage ('Deploy Stage') {
                    steps {
                        withMaven(maven : 'maven_3_6_0') {
                            sh 'mvn deplay'
                        }
                    }
        }
    }
}