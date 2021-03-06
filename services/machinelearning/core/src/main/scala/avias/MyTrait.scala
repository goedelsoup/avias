package avias.machinelearning
trait Amazonmachinelearning[F[_]] {
  def describeTags(input: avias.machinelearning.models.DescribeTagsInput): F[avias.machinelearning.models.DescribeTagsOutput]
  def createEvaluation(input: avias.machinelearning.models.CreateEvaluationInput): F[avias.machinelearning.models.CreateEvaluationOutput]
  def createDataSourceFromRedshift(input: avias.machinelearning.models.CreateDataSourceFromRedshiftInput): F[avias.machinelearning.models.CreateDataSourceFromRedshiftOutput]
  def describeBatchPredictions(input: avias.machinelearning.models.DescribeBatchPredictionsInput): F[avias.machinelearning.models.DescribeBatchPredictionsOutput]
  def createDataSourceFromRDS(input: avias.machinelearning.models.CreateDataSourceFromRDSInput): F[avias.machinelearning.models.CreateDataSourceFromRDSOutput]
  def createBatchPrediction(input: avias.machinelearning.models.CreateBatchPredictionInput): F[avias.machinelearning.models.CreateBatchPredictionOutput]
  def addTags(input: avias.machinelearning.models.AddTagsInput): F[avias.machinelearning.models.AddTagsOutput]
  def updateDataSource(input: avias.machinelearning.models.UpdateDataSourceInput): F[avias.machinelearning.models.UpdateDataSourceOutput]
  def deleteMLModel(input: avias.machinelearning.models.DeleteMLModelInput): F[avias.machinelearning.models.DeleteMLModelOutput]
  def deleteEvaluation(input: avias.machinelearning.models.DeleteEvaluationInput): F[avias.machinelearning.models.DeleteEvaluationOutput]
  def describeEvaluations(input: avias.machinelearning.models.DescribeEvaluationsInput): F[avias.machinelearning.models.DescribeEvaluationsOutput]
  def predict(input: avias.machinelearning.models.PredictInput): F[avias.machinelearning.models.PredictOutput]
  def describeDataSources(input: avias.machinelearning.models.DescribeDataSourcesInput): F[avias.machinelearning.models.DescribeDataSourcesOutput]
  def createDataSourceFromS3(input: avias.machinelearning.models.CreateDataSourceFromS3Input): F[avias.machinelearning.models.CreateDataSourceFromS3Output]
  def deleteDataSource(input: avias.machinelearning.models.DeleteDataSourceInput): F[avias.machinelearning.models.DeleteDataSourceOutput]
  def getBatchPrediction(input: avias.machinelearning.models.GetBatchPredictionInput): F[avias.machinelearning.models.GetBatchPredictionOutput]
  def deleteRealtimeEndpoint(input: avias.machinelearning.models.DeleteRealtimeEndpointInput): F[avias.machinelearning.models.DeleteRealtimeEndpointOutput]
  def describeMLModels(input: avias.machinelearning.models.DescribeMLModelsInput): F[avias.machinelearning.models.DescribeMLModelsOutput]
  def deleteBatchPrediction(input: avias.machinelearning.models.DeleteBatchPredictionInput): F[avias.machinelearning.models.DeleteBatchPredictionOutput]
  def createMLModel(input: avias.machinelearning.models.CreateMLModelInput): F[avias.machinelearning.models.CreateMLModelOutput]
  def updateBatchPrediction(input: avias.machinelearning.models.UpdateBatchPredictionInput): F[avias.machinelearning.models.UpdateBatchPredictionOutput]
  def getMLModel(input: avias.machinelearning.models.GetMLModelInput): F[avias.machinelearning.models.GetMLModelOutput]
  def updateMLModel(input: avias.machinelearning.models.UpdateMLModelInput): F[avias.machinelearning.models.UpdateMLModelOutput]
  def getEvaluation(input: avias.machinelearning.models.GetEvaluationInput): F[avias.machinelearning.models.GetEvaluationOutput]
  def createRealtimeEndpoint(input: avias.machinelearning.models.CreateRealtimeEndpointInput): F[avias.machinelearning.models.CreateRealtimeEndpointOutput]
  def updateEvaluation(input: avias.machinelearning.models.UpdateEvaluationInput): F[avias.machinelearning.models.UpdateEvaluationOutput]
  def deleteTags(input: avias.machinelearning.models.DeleteTagsInput): F[avias.machinelearning.models.DeleteTagsOutput]
  def getDataSource(input: avias.machinelearning.models.GetDataSourceInput): F[avias.machinelearning.models.GetDataSourceOutput]
}