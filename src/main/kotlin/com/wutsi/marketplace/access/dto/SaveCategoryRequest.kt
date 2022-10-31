package com.wutsi.marketplace.access.dto

import kotlin.Long
import kotlin.String

public data class SaveCategoryRequest(
  public val parentId: Long? = null,
  public val title: String = "",
)
