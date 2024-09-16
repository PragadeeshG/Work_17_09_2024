package com.test1;

public class MongoAtlasDatabase {
	private Integer atlasSchemaCode;
	private Integer masterSchemaEffective;
	private String masterSchemaEffectiveDate;
	private String masterSchemaSize;
	private String masterSchemaDbStat;
	private Integer serverlessIndicator;
	private String elastic;
	private String alwaysOnSecurity;
	private String performanceAdvice;
	private String nativeTooling;
	private String automatedDataTiring;

	public MongoAtlasDatabase() {

	}

	public MongoAtlasDatabase(Integer atlasSchemaCode, Integer masterSchemaEffective, String masterSchemaEffectiveDate,
			String masterSchemaSize, String masterSchemaDbStat, Integer serverlessIndicator, String elastic,
			String alwaysOnSecurity, String performanceAdvice, String nativeTooling, String automatedDataTiring) {
		super();
		this.atlasSchemaCode = atlasSchemaCode;
		this.masterSchemaEffective = masterSchemaEffective;
		this.masterSchemaEffectiveDate = masterSchemaEffectiveDate;
		this.masterSchemaSize = masterSchemaSize;
		this.masterSchemaDbStat = masterSchemaDbStat;
		this.serverlessIndicator = serverlessIndicator;
		this.elastic = elastic;
		this.alwaysOnSecurity = alwaysOnSecurity;
		this.performanceAdvice = performanceAdvice;
		this.nativeTooling = nativeTooling;
		this.automatedDataTiring = automatedDataTiring;
	}

	public Integer getAtlasSchemaCode() {
		return atlasSchemaCode;
	}

	public void setAtlasSchemaCode(Integer atlasSchemaCode) {
		this.atlasSchemaCode = atlasSchemaCode;
	}

	public Integer getMasterSchemaEffective() {
		return masterSchemaEffective;
	}

	public void setMasterSchemaEffective(Integer masterSchemaEffective) {
		this.masterSchemaEffective = masterSchemaEffective;
	}

	public String getMasterSchemaEffectiveDate() {
		return masterSchemaEffectiveDate;
	}

	public void setMasterSchemaEffectiveDate(String masterSchemaEffectiveDate) {
		this.masterSchemaEffectiveDate = masterSchemaEffectiveDate;
	}

	public String getMasterSchemaSize() {
		return masterSchemaSize;
	}

	public void setMasterSchemaSize(String masterSchemaSize) {
		this.masterSchemaSize = masterSchemaSize;
	}

	public String getMasterSchemaDbStat() {
		return masterSchemaDbStat;
	}

	public void setMasterSchemaDbStat(String masterSchemaDbStat) {
		this.masterSchemaDbStat = masterSchemaDbStat;
	}

	public Integer getServerlessIndicator() {
		return serverlessIndicator;
	}

	public void setServerlessIndicator(Integer serverlessIndicator) {
		this.serverlessIndicator = serverlessIndicator;
	}

	public String getElastic() {
		return elastic;
	}

	public void setElastic(String elastic) {
		this.elastic = elastic;
	}

	public String getAlwaysOnSecurity() {
		return alwaysOnSecurity;
	}

	public void setAlwaysOnSecurity(String alwaysOnSecurity) {
		this.alwaysOnSecurity = alwaysOnSecurity;
	}

	public String getPerformanceAdvice() {
		return performanceAdvice;
	}

	public void setPerformanceAdvice(String performanceAdvice) {
		this.performanceAdvice = performanceAdvice;
	}

	public String getNativeTooling() {
		return nativeTooling;
	}

	public void setNativeTooling(String nativeTooling) {
		this.nativeTooling = nativeTooling;
	}

	public String getAutomatedDataTiring() {
		return automatedDataTiring;
	}

	public void setAutomatedDataTiring(String automatedDataTiring) {
		this.automatedDataTiring = automatedDataTiring;
	}

}
