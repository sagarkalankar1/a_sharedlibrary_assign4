def call(String url, String branch) {
  git branch: "${url}" , "${branch}"
  echo "cloning done"
}
