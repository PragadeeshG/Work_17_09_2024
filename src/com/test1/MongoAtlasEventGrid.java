package com.test1;

public class MongoAtlasEventGrid {
	private Integer atlasSchemaCode;
	private Integer eventId;
	private Integer sequenceId;
	private String eventName;
	private String roleId;
	private Integer runIndicator;
	private String eventType;
	private String approximateEventDuration;
	private String eventStatus;
	private String reduceAtchitecturalComplexity;
	private String scaleOperations;
	private String isScheduled;
	private String entityState;

	public MongoAtlasEventGrid() {

	}

	public MongoAtlasEventGrid(Integer atlasSchemaCode, Integer eventId, Integer sequenceId, String eventName,
			String roleId, Integer runIndicator, String eventType, String approximateEventDuration, String eventStatus,
			String reduceAtchitecturalComplexity, String scaleOperations, String isScheduled, String entityState) {
		super();
		this.atlasSchemaCode = atlasSchemaCode;
		this.eventId = eventId;
		this.sequenceId = sequenceId;
		this.eventName = eventName;
		this.roleId = roleId;
		this.runIndicator = runIndicator;
		this.eventType = eventType;
		this.approximateEventDuration = approximateEventDuration;
		this.eventStatus = eventStatus;
		this.reduceAtchitecturalComplexity = reduceAtchitecturalComplexity;
		this.scaleOperations = scaleOperations;
		this.isScheduled = isScheduled;
		this.entityState = entityState;
	}

	public Integer getAtlasSchemaCode() {
		return atlasSchemaCode;
	}

	public void setAtlasSchemaCode(Integer atlasSchemaCode) {
		this.atlasSchemaCode = atlasSchemaCode;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(Integer sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Integer getRunIndicator() {
		return runIndicator;
	}

	public void setRunIndicator(Integer runIndicator) {
		this.runIndicator = runIndicator;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getApproximateEventDuration() {
		return approximateEventDuration;
	}

	public void setApproximateEventDuration(String approximateEventDuration) {
		this.approximateEventDuration = approximateEventDuration;
	}

	public String getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String getReduceAtchitecturalComplexity() {
		return reduceAtchitecturalComplexity;
	}

	public void setReduceAtchitecturalComplexity(String reduceAtchitecturalComplexity) {
		this.reduceAtchitecturalComplexity = reduceAtchitecturalComplexity;
	}

	public String getScaleOperations() {
		return scaleOperations;
	}

	public void setScaleOperations(String scaleOperations) {
		this.scaleOperations = scaleOperations;
	}

	public String getIsScheduled() {
		return isScheduled;
	}

	public void setIsScheduled(String isScheduled) {
		this.isScheduled = isScheduled;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
