package com.wutsi.marketplace.access.dto

import java.time.OffsetDateTime
import kotlin.String

public data class Event(
  public val type: String = "",
  public val meetingId: String = "",
  public val meetingPassword: String? = null,
  public val starts: OffsetDateTime? = null,
  public val ends: OffsetDateTime? = null,
)
