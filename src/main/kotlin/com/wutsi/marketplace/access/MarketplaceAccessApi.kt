package com.wutsi.marketplace.access

import com.wutsi.marketplace.access.dto.CheckProductAvailabilityRequest
import com.wutsi.marketplace.access.dto.CreatePictureRequest
import com.wutsi.marketplace.access.dto.CreatePictureResponse
import com.wutsi.marketplace.access.dto.CreateProductRequest
import com.wutsi.marketplace.access.dto.CreateProductResponse
import com.wutsi.marketplace.access.dto.CreateReservationRequest
import com.wutsi.marketplace.access.dto.CreateReservationResponse
import com.wutsi.marketplace.access.dto.CreateStoreRequest
import com.wutsi.marketplace.access.dto.CreateStoreResponse
import com.wutsi.marketplace.access.dto.GetCategoryResponse
import com.wutsi.marketplace.access.dto.GetProductResponse
import com.wutsi.marketplace.access.dto.GetStoreResponse
import com.wutsi.marketplace.access.dto.SaveCategoryRequest
import com.wutsi.marketplace.access.dto.SearchCategoryRequest
import com.wutsi.marketplace.access.dto.SearchCategoryResponse
import com.wutsi.marketplace.access.dto.SearchPictureRequest
import com.wutsi.marketplace.access.dto.SearchPictureResponse
import com.wutsi.marketplace.access.dto.SearchProductRequest
import com.wutsi.marketplace.access.dto.SearchProductResponse
import com.wutsi.marketplace.access.dto.SearchReservationRequest
import com.wutsi.marketplace.access.dto.SearchReservationResponse
import com.wutsi.marketplace.access.dto.SearchStoreRequest
import com.wutsi.marketplace.access.dto.SearchStoreResponse
import com.wutsi.marketplace.access.dto.UpdateProductAttributeRequest
import com.wutsi.marketplace.access.dto.UpdateProductEventRequest
import com.wutsi.marketplace.access.dto.UpdateProductStatusRequest
import com.wutsi.marketplace.access.dto.UpdateReservationStatusRequest
import com.wutsi.marketplace.access.dto.UpdateStoreStatusRequest
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Long
import kotlin.Unit

public interface MarketplaceAccessApi {
  @RequestLine("POST /v1/categories/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchCategory(request: SearchCategoryRequest): SearchCategoryResponse

  @RequestLine("GET /v1/categories/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getCategory(@Param("id") id: Long): GetCategoryResponse

  @RequestLine("POST /v1/categories/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun saveCategory(@Param("id") id: Long, request: SaveCategoryRequest): Unit

  @RequestLine("POST /v1/stores")
  @Headers(value=["Content-Type: application/json"])
  public fun createStore(request: CreateStoreRequest): CreateStoreResponse

  @RequestLine("POST /v1/stores/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchStore(request: SearchStoreRequest): SearchStoreResponse

  @RequestLine("GET /v1/stores/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getStore(@Param("id") id: Long): GetStoreResponse

  @RequestLine("POST /v1/stores/{id}/status")
  @Headers(value=["Content-Type: application/json"])
  public fun updateStoreStatus(@Param("id") id: Long, request: UpdateStoreStatusRequest): Unit

  @RequestLine("POST /v1/products")
  @Headers(value=["Content-Type: application/json"])
  public fun createProduct(request: CreateProductRequest): CreateProductResponse

  @RequestLine("POST /v1/products/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchProduct(request: SearchProductRequest): SearchProductResponse

  @RequestLine("GET /v1/products/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getProduct(@Param("id") id: Long): GetProductResponse

  @RequestLine("DELETE /v1/products/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun deleteProduct(@Param("id") id: Long): Unit

  @RequestLine("POST /v1/products/{id}/status")
  @Headers(value=["Content-Type: application/json"])
  public fun updateProductStatus(@Param("id") id: Long, request: UpdateProductStatusRequest): Unit

  @RequestLine("POST /v1/products/{id}/attributes")
  @Headers(value=["Content-Type: application/json"])
  public fun updateProductAttribute(@Param("id") id: Long, request: UpdateProductAttributeRequest):
      Unit

  @RequestLine("POST /v1/products/{id}/event")
  @Headers(value=["Content-Type: application/json"])
  public fun updateProductEvent(@Param("id") id: Long, request: UpdateProductEventRequest): Unit

  @RequestLine("POST /v1/products/availability")
  @Headers(value=["Content-Type: application/json"])
  public fun checkProductAvailability(request: CheckProductAvailabilityRequest): Unit

  @RequestLine("POST /v1/pictures")
  @Headers(value=["Content-Type: application/json"])
  public fun createPicture(request: CreatePictureRequest): CreatePictureResponse

  @RequestLine("POST /v1/pictures/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchPicture(request: SearchPictureRequest): SearchPictureResponse

  @RequestLine("DELETE /v1/pictures/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun deletePicture(@Param("id") id: Long): Unit

  @RequestLine("POST /v1/reservations")
  @Headers(value=["Content-Type: application/json"])
  public fun createReservation(request: CreateReservationRequest): CreateReservationResponse

  @RequestLine("POST /v1/reservations/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchReservation(request: SearchReservationRequest): SearchReservationResponse

  @RequestLine("POST /v1/reservations/{id}/status")
  @Headers(value=["Content-Type: application/json"])
  public fun updateReservationStatus(@Param("id") id: Long,
      request: UpdateReservationStatusRequest): Unit
}
