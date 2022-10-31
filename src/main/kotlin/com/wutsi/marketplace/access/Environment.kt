package com.wutsi.marketplace.access

import kotlin.String

public enum class Environment(
  public val url: String,
) {
  SANDBOX("https://marketplace-access-server-test.herokuapp.com"),
  PRODUCTION("https://marketplace-access-server-prod.herokuapp.com"),
  ;
}
