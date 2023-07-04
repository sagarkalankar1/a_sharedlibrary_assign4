def call(String url, String branch) {
  git branch: "${branch}" , url: "${url}"
  echo "cloning done"
}
