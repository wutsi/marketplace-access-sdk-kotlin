package com.wutsi.marketplace.access.dto

import java.time.OffsetDateTime
import kotlin.Int
import kotlin.Long
import kotlin.String

public data class StoreSummary(
  public val id: Long = 0,
  public val accountId: Long = 0,
  public val productCount: Int = 0,
  public val publishedProductCount: Int = 0,
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now(),
  public val suspended: OffsetDateTime? = null,
  public val status: String = "",
)
