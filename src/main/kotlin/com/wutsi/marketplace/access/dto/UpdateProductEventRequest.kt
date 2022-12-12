package com.wutsi.marketplace.access.dto

import java.time.OffsetDateTime
import kotlin.String

public data class UpdateProductEventRequest(
  public val type: String = "",
  public val meetingId: String = "",
  public val meetingPassword: String? = null,
  public val starts: OffsetDateTime = OffsetDateTime.now(),
  public val ends: OffsetDateTime = OffsetDateTime.now(),
)
