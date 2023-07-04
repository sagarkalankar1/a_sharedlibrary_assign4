def call() {
  sh 'chmod +x Build.sh' 
  sh './Build.sh'
  echo "Build is successful"
}
