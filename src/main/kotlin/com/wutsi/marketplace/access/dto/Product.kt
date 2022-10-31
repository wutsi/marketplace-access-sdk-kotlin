package com.wutsi.marketplace.access.dto

import java.time.OffsetDateTime
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List

public data class Product(
  public val id: Long = 0,
  public val storeId: Long = 0,
  public val thumbnail: PictureSummary = PictureSummary(),
  public val pictures: List<PictureSummary> = emptyList(),
  public val category: CategorySummary = CategorySummary(),
  public val title: String = "",
  public val summary: String? = null,
  public val description: String? = null,
  public val price: Long? = null,
  public val comparablePrice: Long? = null,
  public val currency: String = "",
  public val quantity: Int? = null,
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now(),
  public val status: String = "",
  public val published: OffsetDateTime? = null,
)
