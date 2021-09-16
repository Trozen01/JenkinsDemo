node{
  stage('SCM Checkout'){   
   git 'https://github.com/Trozen01/JenkinsDemo'
  }
  stage('Compile-Package'){
    def mvnHome = tool name: 'TestMaven', type: 'maven'
    sh 'mvn package'
  }
  
}
