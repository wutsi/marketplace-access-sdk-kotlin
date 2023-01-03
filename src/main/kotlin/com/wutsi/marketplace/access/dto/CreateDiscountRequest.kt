package com.wutsi.marketplace.access.dto

import java.time.LocalDate
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

public data class CreateDiscountRequest(
  public val storeId: Long = 0,
  public val name: String = "",
  public val type: String = "",
  public val rate: Int = 0,
  public val starts: LocalDate? = null,
  public val ends: LocalDate? = null,
  public val allProducts: Boolean = false,
)
