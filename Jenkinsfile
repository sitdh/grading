pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn compile'
      }
    }
    stage('Test') {
      steps {
        echo 'hello'
      }
    }
  }
}