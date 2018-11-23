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
        stage ('SonarQube Scanner') {
                            steps {
                                script {
                                    def sonnarScanner = tool "SonarQube Scanner"
                                }
                                withSonarQubeEnv('SonarQube Scanner') {
                                    bat '${sonnarScanner}/bin/sonar-scanner'
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
}