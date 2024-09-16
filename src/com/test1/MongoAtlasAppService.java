package com.test1;

public class MongoAtlasAppService {
	private Integer atlasSchemaCode;
	private Integer dataDictionary;
	private Integer numberOfInstances;
	private String metadata;
	private Integer queryPlan;
	private boolean optimizable;
	private boolean performanceTunable;
	private String serviceName;
	private String serviceCode;
	private String dataEngine;
	private String underlyingMachine;
	private String continuousBackups;
	private String workloadIsolation;
	private String multiRegionMultiCloudSupport;

	public MongoAtlasAppService() {

	}

	public MongoAtlasAppService(Integer atlasSchemaCode, Integer dataDictionary, Integer numberOfInstances,
			String metadata, Integer queryPlan, boolean optimizable, boolean performanceTunable, String serviceName,
			String serviceCode, String dataEngine, String underlyingMachine, String continuousBackups,
			String workloadIsolation, String multiRegionMultiCloudSupport) {
		super();
		this.atlasSchemaCode = atlasSchemaCode;
		this.dataDictionary = dataDictionary;
		this.numberOfInstances = numberOfInstances;
		this.metadata = metadata;
		this.queryPlan = queryPlan;
		this.optimizable = optimizable;
		this.performanceTunable = performanceTunable;
		this.serviceName = serviceName;
		this.serviceCode = serviceCode;
		this.dataEngine = dataEngine;
		this.underlyingMachine = underlyingMachine;
		this.continuousBackups = continuousBackups;
		this.workloadIsolation = workloadIsolation;
		this.multiRegionMultiCloudSupport = multiRegionMultiCloudSupport;
	}

	public Integer getAtlasSchemaCode() {
		return atlasSchemaCode;
	}

	public void setAtlasSchemaCode(Integer atlasSchemaCode) {
		this.atlasSchemaCode = atlasSchemaCode;
	}

	public Integer getDataDictionary() {
		return dataDictionary;
	}

	public void setDataDictionary(Integer dataDictionary) {
		this.dataDictionary = dataDictionary;
	}

	public Integer getNumberOfInstances() {
		return numberOfInstances;
	}

	public void setNumberOfInstances(Integer numberOfInstances) {
		this.numberOfInstances = numberOfInstances;
	}

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public Integer getQueryPlan() {
		return queryPlan;
	}

	public void setQueryPlan(Integer queryPlan) {
		this.queryPlan = queryPlan;
	}

	public boolean isOptimizable() {
		return optimizable;
	}

	public void setOptimizable(boolean optimizable) {
		this.optimizable = optimizable;
	}

	public boolean isPerformanceTunable() {
		return performanceTunable;
	}

	public void setPerformanceTunable(boolean performanceTunable) {
		this.performanceTunable = performanceTunable;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getDataEngine() {
		return dataEngine;
	}

	public void setDataEngine(String dataEngine) {
		this.dataEngine = dataEngine;
	}

	public String getUnderlyingMachine() {
		return underlyingMachine;
	}

	public void setUnderlyingMachine(String underlyingMachine) {
		this.underlyingMachine = underlyingMachine;
	}

	public String getContinuousBackups() {
		return continuousBackups;
	}

	public void setContinuousBackups(String continuousBackups) {
		this.continuousBackups = continuousBackups;
	}

	public String getWorkloadIsolation() {
		return workloadIsolation;
	}

	public void setWorkloadIsolation(String workloadIsolation) {
		this.workloadIsolation = workloadIsolation;
	}

	public String getMultiRegionMultiCloudSupport() {
		return multiRegionMultiCloudSupport;
	}

	public void setMultiRegionMultiCloudSupport(String multiRegionMultiCloudSupport) {
		this.multiRegionMultiCloudSupport = multiRegionMultiCloudSupport;
	}

}
