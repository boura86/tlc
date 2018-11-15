pipeline  {
    agent any
    stages {
        stage ('Compile Stage') {
            steps {
                withMaven(jdk: 1.8, maven : 'maven_3_6_0') {
                    bat 'mvn clean compile'
                }
            }
        }
        stage ('Testing Stage') {
                    steps {
                        withMaven(jdk: 1.8, maven : 'maven_3_6_0') {
                            bat 'mvn test'
                        }
                    }
        }
        stage ('Deploy Stage') {
                    steps {
                        withMaven(jdk: 1.8, maven : 'maven_3_6_0') {
                            bat 'mvn deploy'
                        }
                    }
        }
    }
}