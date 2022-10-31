package com.wutsi.marketplace.access.dto

import kotlin.Long
import kotlin.String

public data class CreateProductRequest(
  public val storeId: Long = 0,
  public val pictureUrl: String = "",
  public val categoryId: Long? = null,
  public val title: String? = null,
  public val summary: String? = null,
  public val price: Long? = null,
)
