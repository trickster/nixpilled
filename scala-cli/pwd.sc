//> using jvm "17"
//> using lib "com.softwaremill.sttp.client4::core:4.0.0-M1"
//> using lib "com.softwaremill.sttp.client4::zio-json:latest.release"

import sttp.client4.*
val request =
  basicRequest.get(uri"https://api-recommend.travel.rakuten.co.jp/health")
val backend = DefaultSyncBackend()
println(request.send(backend).body.getOrElse("Nothing found"))
