package com.wutsi.marketplace.access.dto

import java.time.OffsetDateTime
import kotlin.Long
import kotlin.String

public data class StoreSummary(
  public val id: Long = 0,
  public val accountId: Long = 0,
  public val currency: String = "",
  public val status: String = "",
  public val created: OffsetDateTime = OffsetDateTime.now(),
)
