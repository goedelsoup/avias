package avias.servicecatalog.models
final case class CreateProductOutput(productViewDetail: scala.Option[avias.servicecatalog.models.ProductViewDetail] = scala.None, provisioningArtifactDetail: scala.Option[avias.servicecatalog.models.ProvisioningArtifactDetail] = scala.None, tags: scala.Option[scala.List[avias.servicecatalog.models.Tag]] = scala.None)
final case class UsageInstruction(`type`: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None)
final case class DescribeCopyProductStatusOutput(copyProductStatus: scala.Option[java.lang.String] = scala.None, targetProductId: scala.Option[java.lang.String] = scala.None, statusDetail: scala.Option[java.lang.String] = scala.None)
case object DeletePortfolioOutput
final case class UpdateProvisionedProductOutput(recordDetail: scala.Option[avias.servicecatalog.models.RecordDetail] = scala.None)
final case class DescribeTagOptionOutput(tagOptionDetail: scala.Option[avias.servicecatalog.models.TagOptionDetail] = scala.None)
final case class DescribeCopyProductStatusInput(copyProductToken: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class DescribeProvisionedProductOutput(provisionedProductDetail: scala.Option[avias.servicecatalog.models.ProvisionedProductDetail] = scala.None)
final case class CreateTagOptionInput(key: java.lang.String, value: java.lang.String)
final case class RecordOutput(outputKey: scala.Option[java.lang.String] = scala.None, outputValue: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class TagOptionDetail(key: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None, active: scala.Option[scala.Boolean] = scala.None, id: scala.Option[java.lang.String] = scala.None)
final case class ProvisioningParameter(key: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None)
final case class UpdateTagOptionOutput(tagOptionDetail: scala.Option[avias.servicecatalog.models.TagOptionDetail] = scala.None)
final case class RecordError(code: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class UpdateProvisioningArtifactInput(productId: java.lang.String, provisioningArtifactId: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class CopyProductOutput(copyProductToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeProductAsAdminInput(id: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class ListAcceptedPortfolioSharesOutput(portfolioDetails: scala.Option[scala.List[avias.servicecatalog.models.PortfolioDetail]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class ConstraintDetail(constraintId: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, owner: scala.Option[java.lang.String] = scala.None)
final case class DescribePortfolioInput(id: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class DescribeProductAsAdminOutput(productViewDetail: scala.Option[avias.servicecatalog.models.ProductViewDetail] = scala.None, provisioningArtifactSummaries: scala.Option[scala.List[avias.servicecatalog.models.ProvisioningArtifactSummary]] = scala.None, tags: scala.Option[scala.List[avias.servicecatalog.models.Tag]] = scala.None, tagOptions: scala.Option[scala.List[avias.servicecatalog.models.TagOptionDetail]] = scala.None)
final case class ListPortfoliosOutput(portfolioDetails: scala.Option[scala.List[avias.servicecatalog.models.PortfolioDetail]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class UpdateProductOutput(productViewDetail: scala.Option[avias.servicecatalog.models.ProductViewDetail] = scala.None, tags: scala.Option[scala.List[avias.servicecatalog.models.Tag]] = scala.None)
final case class ProvisioningArtifactProperties(info: scala.collection.immutable.Map[java.lang.String, java.lang.String], name: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None)
final case class ListTagOptionsOutput(tagOptionDetails: scala.Option[scala.List[avias.servicecatalog.models.TagOptionDetail]] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None)
final case class UpdateProductInput(id: java.lang.String, supportUrl: scala.Option[java.lang.String] = scala.None, supportDescription: scala.Option[java.lang.String] = scala.None, owner: scala.Option[java.lang.String] = scala.None, distributor: scala.Option[java.lang.String] = scala.None, addTags: scala.Option[scala.List[avias.servicecatalog.models.Tag]] = scala.None, removeTags: scala.Option[scala.List[java.lang.String]] = scala.None, name: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, supportEmail: scala.Option[java.lang.String] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class ListPortfoliosForProductOutput(portfolioDetails: scala.Option[scala.List[avias.servicecatalog.models.PortfolioDetail]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class SearchProductsAsAdminInput(productSource: scala.Option[java.lang.String] = scala.None, portfolioId: scala.Option[java.lang.String] = scala.None, sortOrder: scala.Option[java.lang.String] = scala.None, pageSize: scala.Option[scala.Int] = scala.None, filters: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None, sortBy: scala.Option[java.lang.String] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class DisassociateTagOptionFromResourceInput(resourceId: java.lang.String, tagOptionId: java.lang.String)
final case class CreatePortfolioOutput(portfolioDetail: scala.Option[avias.servicecatalog.models.PortfolioDetail] = scala.None, tags: scala.Option[scala.List[avias.servicecatalog.models.Tag]] = scala.None)
final case class AssociateProductWithPortfolioInput(productId: java.lang.String, portfolioId: java.lang.String, sourcePortfolioId: scala.Option[java.lang.String] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class ListRecordHistoryInput(searchFilter: scala.Option[avias.servicecatalog.models.ListRecordHistorySearchFilter] = scala.None, pageSize: scala.Option[scala.Int] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None, accessLevelFilter: scala.Option[avias.servicecatalog.models.AccessLevelFilter] = scala.None)
final case class ProvisioningArtifactParameter(isNoEcho: scala.Option[scala.Boolean] = scala.None, parameterConstraints: scala.Option[avias.servicecatalog.models.ParameterConstraints] = scala.None, parameterKey: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, parameterType: scala.Option[java.lang.String] = scala.None, defaultValue: scala.Option[java.lang.String] = scala.None)
final case class ListConstraintsForPortfolioOutput(constraintDetails: scala.Option[scala.List[avias.servicecatalog.models.ConstraintDetail]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class DeleteProductInput(id: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class RecordTag(key: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None)
final case class ListPortfoliosForProductInput(productId: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None, pageSize: scala.Option[scala.Int] = scala.None)
final case class DescribeProvisioningArtifactOutput(provisioningArtifactDetail: scala.Option[avias.servicecatalog.models.ProvisioningArtifactDetail] = scala.None, info: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None, status: scala.Option[java.lang.String] = scala.None)
case object DisassociateTagOptionFromResourceOutput
final case class AssociateTagOptionWithResourceInput(resourceId: java.lang.String, tagOptionId: java.lang.String)
final case class ListResourcesForTagOptionInput(tagOptionId: java.lang.String, resourceType: scala.Option[java.lang.String] = scala.None, pageSize: scala.Option[scala.Int] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None)
final case class ListProvisioningArtifactsInput(productId: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class UpdateConstraintOutput(constraintDetail: scala.Option[avias.servicecatalog.models.ConstraintDetail] = scala.None, constraintParameters: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None)
case object DeleteConstraintOutput
final case class ProductViewAggregationValue(value: scala.Option[java.lang.String] = scala.None, approximateCount: scala.Option[scala.Int] = scala.None)
final case class CreateTagOptionOutput(tagOptionDetail: scala.Option[avias.servicecatalog.models.TagOptionDetail] = scala.None)
final case class ProductViewDetail(productViewSummary: scala.Option[avias.servicecatalog.models.ProductViewSummary] = scala.None, status: scala.Option[java.lang.String] = scala.None, productARN: scala.Option[java.lang.String] = scala.None, createdTime: scala.Option[java.time.Instant] = scala.None)
final case class ListResourcesForTagOptionOutput(resourceDetails: scala.Option[scala.List[avias.servicecatalog.models.ResourceDetail]] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None)
case object ResourceInUseException
case object DeleteProvisioningArtifactOutput
final case class CreateProductInput(idempotencyToken: java.lang.String, provisioningArtifactParameters: avias.servicecatalog.models.ProvisioningArtifactProperties, owner: java.lang.String, productType: java.lang.String, name: java.lang.String, supportUrl: scala.Option[java.lang.String] = scala.None, supportDescription: scala.Option[java.lang.String] = scala.None, distributor: scala.Option[java.lang.String] = scala.None, tags: scala.Option[scala.List[avias.servicecatalog.models.Tag]] = scala.None, description: scala.Option[java.lang.String] = scala.None, supportEmail: scala.Option[java.lang.String] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class DescribeProductViewInput(id: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
case object ResourceNotFoundException
final case class PortfolioDetail(providerName: scala.Option[java.lang.String] = scala.None, displayName: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, id: scala.Option[java.lang.String] = scala.None, createdTime: scala.Option[java.time.Instant] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class ProvisionedProductDetail(idempotencyToken: scala.Option[java.lang.String] = scala.None, statusMessage: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, id: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, lastRecordId: scala.Option[java.lang.String] = scala.None, createdTime: scala.Option[java.time.Instant] = scala.None, name: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None)
case object DisassociateProductFromPortfolioOutput
case object LimitExceededException
final case class DeletePortfolioInput(id: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
case object CreatePortfolioShareOutput
final case class ProvisioningArtifactSummary(provisioningArtifactMetadata: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None, id: scala.Option[java.lang.String] = scala.None, createdTime: scala.Option[java.time.Instant] = scala.None, name: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class ParameterConstraints(allowedValues: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class AssociatePrincipalWithPortfolioInput(portfolioId: java.lang.String, principalARN: java.lang.String, principalType: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class UpdatePortfolioInput(id: java.lang.String, providerName: scala.Option[java.lang.String] = scala.None, displayName: scala.Option[java.lang.String] = scala.None, addTags: scala.Option[scala.List[avias.servicecatalog.models.Tag]] = scala.None, removeTags: scala.Option[scala.List[java.lang.String]] = scala.None, description: scala.Option[java.lang.String] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class DescribeProductOutput(productViewSummary: scala.Option[avias.servicecatalog.models.ProductViewSummary] = scala.None, provisioningArtifacts: scala.Option[scala.List[avias.servicecatalog.models.ProvisioningArtifact]] = scala.None)
final case class DescribePortfolioOutput(portfolioDetail: scala.Option[avias.servicecatalog.models.PortfolioDetail] = scala.None, tags: scala.Option[scala.List[avias.servicecatalog.models.Tag]] = scala.None, tagOptions: scala.Option[scala.List[avias.servicecatalog.models.TagOptionDetail]] = scala.None)
final case class ListTagOptionsFilters(key: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None, active: scala.Option[scala.Boolean] = scala.None)
case object InvalidParametersException
case object DuplicateResourceException
case object InvalidStateException
final case class ProvisioningArtifactDetail(id: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, createdTime: scala.Option[java.time.Instant] = scala.None)
final case class ListLaunchPathsInput(productId: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None, pageSize: scala.Option[scala.Int] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeProductViewOutput(productViewSummary: scala.Option[avias.servicecatalog.models.ProductViewSummary] = scala.None, provisioningArtifacts: scala.Option[scala.List[avias.servicecatalog.models.ProvisioningArtifact]] = scala.None)
final case class DescribeProvisioningArtifactInput(provisioningArtifactId: java.lang.String, productId: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None, verbose: scala.Option[scala.Boolean] = scala.None)
final case class DescribeRecordOutput(recordDetail: scala.Option[avias.servicecatalog.models.RecordDetail] = scala.None, recordOutputs: scala.Option[scala.List[avias.servicecatalog.models.RecordOutput]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class ProvisionProductInput(provisionToken: java.lang.String, provisionedProductName: java.lang.String, productId: java.lang.String, provisioningArtifactId: java.lang.String, provisioningParameters: scala.Option[scala.List[avias.servicecatalog.models.ProvisioningParameter]] = scala.None, notificationArns: scala.Option[scala.List[java.lang.String]] = scala.None, pathId: scala.Option[java.lang.String] = scala.None, tags: scala.Option[scala.List[avias.servicecatalog.models.Tag]] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None)
case object TagOptionNotMigratedException
final case class UpdateProvisioningArtifactOutput(provisioningArtifactDetail: scala.Option[avias.servicecatalog.models.ProvisioningArtifactDetail] = scala.None, info: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None, status: scala.Option[java.lang.String] = scala.None)
final case class CreateConstraintInput(idempotencyToken: java.lang.String, `type`: java.lang.String, portfolioId: java.lang.String, productId: java.lang.String, parameters: java.lang.String, description: scala.Option[java.lang.String] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class ListConstraintsForPortfolioInput(portfolioId: java.lang.String, productId: scala.Option[java.lang.String] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None, pageSize: scala.Option[scala.Int] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None)
final case class Tag(key: java.lang.String, value: java.lang.String)
final case class DescribeConstraintOutput(constraintDetail: scala.Option[avias.servicecatalog.models.ConstraintDetail] = scala.None, constraintParameters: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None)
final case class ProductViewSummary(distributor: scala.Option[java.lang.String] = scala.None, supportUrl: scala.Option[java.lang.String] = scala.None, supportDescription: scala.Option[java.lang.String] = scala.None, owner: scala.Option[java.lang.String] = scala.None, hasDefaultPath: scala.Option[scala.Boolean] = scala.None, id: scala.Option[java.lang.String] = scala.None, productId: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, shortDescription: scala.Option[java.lang.String] = scala.None, supportEmail: scala.Option[java.lang.String] = scala.None)
final case class SearchProductsInput(sortOrder: scala.Option[java.lang.String] = scala.None, pageSize: scala.Option[scala.Int] = scala.None, filters: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None, sortBy: scala.Option[java.lang.String] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None)
case object AssociatePrincipalWithPortfolioOutput
final case class TagOptionSummary(key: scala.Option[java.lang.String] = scala.None, values: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class ListRecordHistorySearchFilter(key: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None)
final case class DescribeProductInput(id: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class ProvisionProductOutput(recordDetail: scala.Option[avias.servicecatalog.models.RecordDetail] = scala.None)
final case class CreateProvisioningArtifactOutput(provisioningArtifactDetail: scala.Option[avias.servicecatalog.models.ProvisioningArtifactDetail] = scala.None, info: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None, status: scala.Option[java.lang.String] = scala.None)
final case class SearchProductsOutput(productViewSummaries: scala.Option[scala.List[avias.servicecatalog.models.ProductViewSummary]] = scala.None, productViewAggregations: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[avias.servicecatalog.models.ProductViewAggregationValue]]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class ListPortfolioAccessInput(portfolioId: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class CopyProductInput(sourceProductArn: java.lang.String, idempotencyToken: java.lang.String, targetProductId: scala.Option[java.lang.String] = scala.None, targetProductName: scala.Option[java.lang.String] = scala.None, sourceProvisioningArtifactIdentifiers: scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, java.lang.String]]] = scala.None, copyOptions: scala.Option[scala.List[java.lang.String]] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class DisassociatePrincipalFromPortfolioInput(portfolioId: java.lang.String, principalARN: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class AcceptPortfolioShareInput(portfolioId: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class SearchProductsAsAdminOutput(productViewDetails: scala.Option[scala.List[avias.servicecatalog.models.ProductViewDetail]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeConstraintInput(id: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class UpdateProvisionedProductInput(updateToken: java.lang.String, provisioningParameters: scala.Option[scala.List[avias.servicecatalog.models.UpdateProvisioningParameter]] = scala.None, provisionedProductId: scala.Option[java.lang.String] = scala.None, productId: scala.Option[java.lang.String] = scala.None, provisioningArtifactId: scala.Option[java.lang.String] = scala.None, pathId: scala.Option[java.lang.String] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None, provisionedProductName: scala.Option[java.lang.String] = scala.None)
final case class UpdatePortfolioOutput(portfolioDetail: scala.Option[avias.servicecatalog.models.PortfolioDetail] = scala.None, tags: scala.Option[scala.List[avias.servicecatalog.models.Tag]] = scala.None)
final case class TerminateProvisionedProductInput(terminateToken: java.lang.String, provisionedProductId: scala.Option[java.lang.String] = scala.None, ignoreErrors: scala.Option[scala.Boolean] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None, provisionedProductName: scala.Option[java.lang.String] = scala.None)
final case class ScanProvisionedProductsInput(acceptLanguage: scala.Option[java.lang.String] = scala.None, accessLevelFilter: scala.Option[avias.servicecatalog.models.AccessLevelFilter] = scala.None, pageSize: scala.Option[scala.Int] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None)
final case class ResourceDetail(name: scala.Option[java.lang.String] = scala.None, id: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, createdTime: scala.Option[java.time.Instant] = scala.None, arn: scala.Option[java.lang.String] = scala.None)
final case class DescribeProvisioningParametersOutput(provisioningArtifactParameters: scala.Option[scala.List[avias.servicecatalog.models.ProvisioningArtifactParameter]] = scala.None, constraintSummaries: scala.Option[scala.List[avias.servicecatalog.models.ConstraintSummary]] = scala.None, usageInstructions: scala.Option[scala.List[avias.servicecatalog.models.UsageInstruction]] = scala.None, tagOptions: scala.Option[scala.List[avias.servicecatalog.models.TagOptionSummary]] = scala.None)
final case class ScanProvisionedProductsOutput(provisionedProducts: scala.Option[scala.List[avias.servicecatalog.models.ProvisionedProductDetail]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class LaunchPathSummary(id: scala.Option[java.lang.String] = scala.None, constraintSummaries: scala.Option[scala.List[avias.servicecatalog.models.ConstraintSummary]] = scala.None, tags: scala.Option[scala.List[avias.servicecatalog.models.Tag]] = scala.None, name: scala.Option[java.lang.String] = scala.None)
final case class DescribeTagOptionInput(id: java.lang.String)
final case class CreateConstraintOutput(constraintDetail: scala.Option[avias.servicecatalog.models.ConstraintDetail] = scala.None, constraintParameters: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None)
final case class UpdateConstraintInput(id: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
case object AssociateTagOptionWithResourceOutput
final case class ListPrincipalsForPortfolioOutput(principals: scala.Option[scala.List[avias.servicecatalog.models.Principal]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class ListProvisioningArtifactsOutput(provisioningArtifactDetails: scala.Option[scala.List[avias.servicecatalog.models.ProvisioningArtifactDetail]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class UpdateProvisioningParameter(key: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None, usePreviousValue: scala.Option[scala.Boolean] = scala.None)
final case class ProvisioningArtifact(id: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, createdTime: scala.Option[java.time.Instant] = scala.None)
final case class ListPortfoliosInput(acceptLanguage: scala.Option[java.lang.String] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None, pageSize: scala.Option[scala.Int] = scala.None)
final case class CreatePortfolioShareInput(portfolioId: java.lang.String, accountId: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class Principal(principalARN: scala.Option[java.lang.String] = scala.None, principalType: scala.Option[java.lang.String] = scala.None)
final case class ListTagOptionsInput(filters: scala.Option[avias.servicecatalog.models.ListTagOptionsFilters] = scala.None, pageSize: scala.Option[scala.Int] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None)
final case class TerminateProvisionedProductOutput(recordDetail: scala.Option[avias.servicecatalog.models.RecordDetail] = scala.None)
final case class RejectPortfolioShareInput(portfolioId: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
case object DeleteProductOutput
final case class RecordDetail(recordType: scala.Option[java.lang.String] = scala.None, provisionedProductType: scala.Option[java.lang.String] = scala.None, provisionedProductName: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, productId: scala.Option[java.lang.String] = scala.None, provisionedProductId: scala.Option[java.lang.String] = scala.None, provisioningArtifactId: scala.Option[java.lang.String] = scala.None, pathId: scala.Option[java.lang.String] = scala.None, recordId: scala.Option[java.lang.String] = scala.None, recordTags: scala.Option[scala.List[avias.servicecatalog.models.RecordTag]] = scala.None, updatedTime: scala.Option[java.time.Instant] = scala.None, createdTime: scala.Option[java.time.Instant] = scala.None, recordErrors: scala.Option[scala.List[avias.servicecatalog.models.RecordError]] = scala.None)
final case class DescribeProvisioningParametersInput(productId: java.lang.String, provisioningArtifactId: java.lang.String, pathId: scala.Option[java.lang.String] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class CreatePortfolioInput(idempotencyToken: java.lang.String, providerName: java.lang.String, displayName: java.lang.String, tags: scala.Option[scala.List[avias.servicecatalog.models.Tag]] = scala.None, description: scala.Option[java.lang.String] = scala.None, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class CreateProvisioningArtifactInput(productId: java.lang.String, parameters: avias.servicecatalog.models.ProvisioningArtifactProperties, idempotencyToken: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
case object AssociateProductWithPortfolioOutput
final case class ListRecordHistoryOutput(recordDetails: scala.Option[scala.List[avias.servicecatalog.models.RecordDetail]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class DisassociateProductFromPortfolioInput(productId: java.lang.String, portfolioId: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class ListPortfolioAccessOutput(accountIds: scala.Option[scala.List[java.lang.String]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeRecordInput(id: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None, pageSize: scala.Option[scala.Int] = scala.None)
case object DeletePortfolioShareOutput
final case class ListPrincipalsForPortfolioInput(portfolioId: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None, pageSize: scala.Option[scala.Int] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None)
case object AcceptPortfolioShareOutput
case object RejectPortfolioShareOutput
final case class ListAcceptedPortfolioSharesInput(acceptLanguage: scala.Option[java.lang.String] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None, pageSize: scala.Option[scala.Int] = scala.None)
case object DisassociatePrincipalFromPortfolioOutput
final case class AccessLevelFilter(key: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None)
final case class DeleteConstraintInput(id: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class ConstraintSummary(`type`: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class DescribeProvisionedProductInput(id: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class DeletePortfolioShareInput(portfolioId: java.lang.String, accountId: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)
final case class ListLaunchPathsOutput(launchPathSummaries: scala.Option[scala.List[avias.servicecatalog.models.LaunchPathSummary]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class UpdateTagOptionInput(id: java.lang.String, value: scala.Option[java.lang.String] = scala.None, active: scala.Option[scala.Boolean] = scala.None)
final case class DeleteProvisioningArtifactInput(productId: java.lang.String, provisioningArtifactId: java.lang.String, acceptLanguage: scala.Option[java.lang.String] = scala.None)