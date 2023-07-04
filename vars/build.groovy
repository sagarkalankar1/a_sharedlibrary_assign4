def call() {
  sh 'javac Hello.java' 
  sh 'java Hello'
  echo "Build is successful"
}
