package com.wutsi.marketplace.access.dto

import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.Int
import kotlin.Long
import kotlin.String

public data class DiscountSummary(
  public val id: Long = 0,
  public val storeId: Long = 0,
  public val type: String = "",
  public val name: String = "",
  public val rate: Int = 0,
  public val starts: LocalDate? = null,
  public val ends: LocalDate? = null,
  public val created: OffsetDateTime = OffsetDateTime.now(),
)
