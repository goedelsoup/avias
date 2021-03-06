package avias.discovery.models
final case class ResourceNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class ExportFilter(name: java.lang.String, values: scala.List[java.lang.String], condition: java.lang.String)
final case class CustomerConnectorInfo(totalConnectors: scala.Int, activeConnectors: scala.Int, shutdownConnectors: scala.Int, unknownConnectors: scala.Int, unhealthyConnectors: scala.Int, blackListedConnectors: scala.Int, healthyConnectors: scala.Int)
final case class AgentNetworkInfo(ipAddress: scala.Option[java.lang.String] = scala.None, macAddress: scala.Option[java.lang.String] = scala.None)
final case class NeighborConnectionDetail(sourceServerId: java.lang.String, destinationServerId: java.lang.String, connectionsCount: scala.Long, destinationPort: scala.Option[scala.Int] = scala.None, transportProtocol: scala.Option[java.lang.String] = scala.None)
case object DisassociateConfigurationItemsFromApplicationResponse
final case class StartExportTaskRequest(exportDataFormat: scala.Option[scala.List[java.lang.String]] = scala.None, filters: scala.Option[scala.List[avias.discovery.models.ExportFilter]] = scala.None, startTime: scala.Option[java.time.Instant] = scala.None, endTime: scala.Option[java.time.Instant] = scala.None)
final case class DescribeConfigurationsResponse(configurations: scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, java.lang.String]]] = scala.None)
final case class StartDataCollectionByAgentIdsRequest(agentIds: scala.List[java.lang.String])
final case class ListConfigurationsResponse(configurations: scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, java.lang.String]]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class CustomerAgentInfo(totalAgents: scala.Int, blackListedAgents: scala.Int, shutdownAgents: scala.Int, activeAgents: scala.Int, unhealthyAgents: scala.Int, healthyAgents: scala.Int, unknownAgents: scala.Int)
case object DeleteTagsResponse
final case class DeleteTagsRequest(configurationIds: scala.List[java.lang.String], tags: scala.Option[scala.List[avias.discovery.models.Tag]] = scala.None)
case object CreateTagsResponse
final case class DeleteApplicationsRequest(configurationIds: scala.List[java.lang.String])
final case class AgentConfigurationStatus(agentId: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, operationSucceeded: scala.Option[scala.Boolean] = scala.None)
final case class ExportConfigurationsResponse(exportId: scala.Option[java.lang.String] = scala.None)
final case class TagFilter(name: java.lang.String, values: scala.List[java.lang.String])
final case class UpdateApplicationRequest(configurationId: java.lang.String, name: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class GetDiscoverySummaryResponse(servers: scala.Option[scala.Long] = scala.None, applications: scala.Option[scala.Long] = scala.None, serversMappedToApplications: scala.Option[scala.Long] = scala.None, serversMappedtoTags: scala.Option[scala.Long] = scala.None, agentSummary: scala.Option[avias.discovery.models.CustomerAgentInfo] = scala.None, connectorSummary: scala.Option[avias.discovery.models.CustomerConnectorInfo] = scala.None)
final case class DescribeConfigurationsRequest(configurationIds: scala.List[java.lang.String])
case object AssociateConfigurationItemsToApplicationResponse
final case class DescribeAgentsResponse(agentsInfo: scala.Option[scala.List[avias.discovery.models.AgentInfo]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListConfigurationsRequest(configurationType: java.lang.String, orderBy: scala.Option[scala.List[avias.discovery.models.OrderByElement]] = scala.None, filters: scala.Option[scala.List[avias.discovery.models.Filter]] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class AssociateConfigurationItemsToApplicationRequest(applicationConfigurationId: java.lang.String, configurationIds: scala.List[java.lang.String])
final case class DescribeTagsRequest(filters: scala.Option[scala.List[avias.discovery.models.TagFilter]] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class StartDataCollectionByAgentIdsResponse(agentsConfigurationStatus: scala.Option[scala.List[avias.discovery.models.AgentConfigurationStatus]] = scala.None)
final case class DescribeTagsResponse(tags: scala.Option[scala.List[avias.discovery.models.ConfigurationTag]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class Filter(name: java.lang.String, values: scala.List[java.lang.String], condition: java.lang.String)
final case class ListServerNeighborsResponse(neighbors: scala.List[avias.discovery.models.NeighborConnectionDetail], nextToken: scala.Option[java.lang.String] = scala.None, knownDependencyCount: scala.Option[scala.Long] = scala.None)
final case class DescribeAgentsRequest(agentIds: scala.Option[scala.List[java.lang.String]] = scala.None, filters: scala.Option[scala.List[avias.discovery.models.Filter]] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class AuthorizationErrorException(message: scala.Option[java.lang.String] = scala.None)
final case class Tag(key: java.lang.String, value: java.lang.String)
final case class ServerInternalErrorException(message: scala.Option[java.lang.String] = scala.None)
case object DeleteApplicationsResponse
final case class DescribeExportTasksResponse(exportsInfo: scala.Option[scala.List[avias.discovery.models.ExportInfo]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeExportTasksRequest(exportIds: scala.Option[scala.List[java.lang.String]] = scala.None, filters: scala.Option[scala.List[avias.discovery.models.ExportFilter]] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object UpdateApplicationResponse
final case class CreateTagsRequest(configurationIds: scala.List[java.lang.String], tags: scala.List[avias.discovery.models.Tag])
final case class DescribeExportConfigurationsRequest(exportIds: scala.Option[scala.List[java.lang.String]] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class OrderByElement(fieldName: java.lang.String, sortOrder: scala.Option[java.lang.String] = scala.None)
final case class StopDataCollectionByAgentIdsRequest(agentIds: scala.List[java.lang.String])
final case class StopDataCollectionByAgentIdsResponse(agentsConfigurationStatus: scala.Option[scala.List[avias.discovery.models.AgentConfigurationStatus]] = scala.None)
final case class InvalidParameterValueException(message: scala.Option[java.lang.String] = scala.None)
final case class InvalidParameterException(message: scala.Option[java.lang.String] = scala.None)
final case class OperationNotPermittedException(message: scala.Option[java.lang.String] = scala.None)
final case class CreateApplicationRequest(name: java.lang.String, description: scala.Option[java.lang.String] = scala.None)
final case class AgentInfo(agentId: scala.Option[java.lang.String] = scala.None, hostName: scala.Option[java.lang.String] = scala.None, lastHealthPingTime: scala.Option[java.lang.String] = scala.None, collectionStatus: scala.Option[java.lang.String] = scala.None, version: scala.Option[java.lang.String] = scala.None, registeredTime: scala.Option[java.lang.String] = scala.None, connectorId: scala.Option[java.lang.String] = scala.None, agentType: scala.Option[java.lang.String] = scala.None, agentNetworkInfoList: scala.Option[scala.List[avias.discovery.models.AgentNetworkInfo]] = scala.None, health: scala.Option[java.lang.String] = scala.None)
final case class CreateApplicationResponse(configurationId: scala.Option[java.lang.String] = scala.None)
final case class ListServerNeighborsRequest(configurationId: java.lang.String, neighborConfigurationIds: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, portInformationNeeded: scala.Option[scala.Boolean] = scala.None)
final case class DisassociateConfigurationItemsFromApplicationRequest(applicationConfigurationId: java.lang.String, configurationIds: scala.List[java.lang.String])
final case class ConfigurationTag(value: scala.Option[java.lang.String] = scala.None, configurationId: scala.Option[java.lang.String] = scala.None, configurationType: scala.Option[java.lang.String] = scala.None, timeOfCreation: scala.Option[java.time.Instant] = scala.None, key: scala.Option[java.lang.String] = scala.None)
final case class DescribeExportConfigurationsResponse(exportsInfo: scala.Option[scala.List[avias.discovery.models.ExportInfo]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class StartExportTaskResponse(exportId: scala.Option[java.lang.String] = scala.None)
final case class ExportInfo(statusMessage: java.lang.String, exportId: java.lang.String, exportStatus: java.lang.String, exportRequestTime: java.time.Instant, requestedStartTime: scala.Option[java.time.Instant] = scala.None, requestedEndTime: scala.Option[java.time.Instant] = scala.None, isTruncated: scala.Option[scala.Boolean] = scala.None, configurationsDownloadUrl: scala.Option[java.lang.String] = scala.None)
case object GetDiscoverySummaryRequest