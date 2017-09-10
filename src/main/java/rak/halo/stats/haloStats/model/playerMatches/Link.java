package rak.halo.stats.haloStats.model.playerMatches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Link {

	@JsonProperty("AuthorityId")
	private String authorityId;
	
	@JsonProperty("Path")
	private String path;
	
	@JsonProperty("QueryString")
	private String queryString;
	
	@JsonProperty("RetryPolicyId")
	private String retryPolicyId;
	
	@JsonProperty("TopicName")
	private String topicName;
	
	@JsonProperty("AcknowledgementTypeId")
	private String acknowledgementTypeId;
	
	@JsonProperty("AuthenticationLifetimeExtensionSupported")
	private String authenticationLifetimeExtensionSupported;

	public String getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(String authorityId) {
		this.authorityId = authorityId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	public String getRetryPolicyId() {
		return retryPolicyId;
	}

	public void setRetryPolicyId(String retryPolicyId) {
		this.retryPolicyId = retryPolicyId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getAcknowledgementTypeId() {
		return acknowledgementTypeId;
	}

	public void setAcknowledgementTypeId(String acknowledgementTypeId) {
		this.acknowledgementTypeId = acknowledgementTypeId;
	}

	public String getAuthenticationLifetimeExtensionSupported() {
		return authenticationLifetimeExtensionSupported;
	}

	public void setAuthenticationLifetimeExtensionSupported(String authenticationLifetimeExtensionSupported) {
		this.authenticationLifetimeExtensionSupported = authenticationLifetimeExtensionSupported;
	}
	
}
