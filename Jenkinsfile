@Library("shared-lib-assign4") _
pipeline {
    agent any 
        stages {
            stage('Clone') {
                steps {
                  script {
                    clone("https://github.com/sagarkalankar1/sagar-kalankar.git", "main")
                  }
                    
                }
            } 
          stage('Build') {
                steps {
                  script {
                    build() 
                  }
                    
                }
        }
    }
}
