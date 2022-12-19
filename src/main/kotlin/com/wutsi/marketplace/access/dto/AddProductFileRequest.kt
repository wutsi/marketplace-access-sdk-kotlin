package com.wutsi.marketplace.access.dto

import kotlin.Int
import kotlin.String

public data class AddProductFileRequest(
  public val url: String = "",
  public val contentType: String = "",
  public val contentSize: Int = 0,
)
