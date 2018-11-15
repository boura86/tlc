pipeline  {
    agent any
    stages {
        stage ('Compile Stage') {
            steps {
                withMaven(maven : 'maven_3_6_0') {
                    bat 'mvn clean compile'
                }
            }
        }
        stage ('Testing Stage') {
                    steps {
                        withMaven(maven : 'maven_3_6_0') {
                            bat 'mvn test'
                        }
                    }
        }
        stage ('Deploy Stage') {
                    steps {
                        withMaven(maven : 'maven_3_6_0') {
                            bat 'mvn deploy'
                        }
                    }
        }
    }
    tools: {
        JDK: 'java_8'
    }
}