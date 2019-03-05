
package com.example.types;


public class Schema {

    private String createdAt;
    private Long id;
    private String idStr;
    private String text;
    private Boolean truncated;
    private Entities entities;
    private String source;
    private Object inReplyToStatusId;
    private Object inReplyToStatusIdStr;
    private Object inReplyToUserId;
    private Object inReplyToUserIdStr;
    private Object inReplyToScreenName;
    private User user;
    private Object geo;
    private Object coordinates;
    private Object place;
    private Object contributors;
    private Boolean isQuoteStatus;
    private Long retweetCount;
    private Long favoriteCount;
    private Boolean favorited;
    private Boolean retweeted;
    private String lang;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Object getGeo() {
        return geo;
    }

    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public Object getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    public Object getPlace() {
        return place;
    }

    public void setPlace(Object place) {
        this.place = place;
    }

    public Object getContributors() {
        return contributors;
    }

    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    public Boolean getIsQuoteStatus() {
        return isQuoteStatus;
    }

    public void setIsQuoteStatus(Boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
    }

    public Long getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(Long retweetCount) {
        this.retweetCount = retweetCount;
    }

    public Long getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Boolean getFavorited() {
        return favorited;
    }

    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public Boolean getRetweeted() {
        return retweeted;
    }

    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Schema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("idStr");
        sb.append('=');
        sb.append(((this.idStr == null)?"<null>":this.idStr));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("truncated");
        sb.append('=');
        sb.append(((this.truncated == null)?"<null>":this.truncated));
        sb.append(',');
        sb.append("entities");
        sb.append('=');
        sb.append(((this.entities == null)?"<null>":this.entities));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("inReplyToStatusId");
        sb.append('=');
        sb.append(((this.inReplyToStatusId == null)?"<null>":this.inReplyToStatusId));
        sb.append(',');
        sb.append("inReplyToStatusIdStr");
        sb.append('=');
        sb.append(((this.inReplyToStatusIdStr == null)?"<null>":this.inReplyToStatusIdStr));
        sb.append(',');
        sb.append("inReplyToUserId");
        sb.append('=');
        sb.append(((this.inReplyToUserId == null)?"<null>":this.inReplyToUserId));
        sb.append(',');
        sb.append("inReplyToUserIdStr");
        sb.append('=');
        sb.append(((this.inReplyToUserIdStr == null)?"<null>":this.inReplyToUserIdStr));
        sb.append(',');
        sb.append("inReplyToScreenName");
        sb.append('=');
        sb.append(((this.inReplyToScreenName == null)?"<null>":this.inReplyToScreenName));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("geo");
        sb.append('=');
        sb.append(((this.geo == null)?"<null>":this.geo));
        sb.append(',');
        sb.append("coordinates");
        sb.append('=');
        sb.append(((this.coordinates == null)?"<null>":this.coordinates));
        sb.append(',');
        sb.append("place");
        sb.append('=');
        sb.append(((this.place == null)?"<null>":this.place));
        sb.append(',');
        sb.append("contributors");
        sb.append('=');
        sb.append(((this.contributors == null)?"<null>":this.contributors));
        sb.append(',');
        sb.append("isQuoteStatus");
        sb.append('=');
        sb.append(((this.isQuoteStatus == null)?"<null>":this.isQuoteStatus));
        sb.append(',');
        sb.append("retweetCount");
        sb.append('=');
        sb.append(((this.retweetCount == null)?"<null>":this.retweetCount));
        sb.append(',');
        sb.append("favoriteCount");
        sb.append('=');
        sb.append(((this.favoriteCount == null)?"<null>":this.favoriteCount));
        sb.append(',');
        sb.append("favorited");
        sb.append('=');
        sb.append(((this.favorited == null)?"<null>":this.favorited));
        sb.append(',');
        sb.append("retweeted");
        sb.append('=');
        sb.append(((this.retweeted == null)?"<null>":this.retweeted));
        sb.append(',');
        sb.append("lang");
        sb.append('=');
        sb.append(((this.lang == null)?"<null>":this.lang));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.idStr == null)? 0 :this.idStr.hashCode()));
        result = ((result* 31)+((this.inReplyToUserId == null)? 0 :this.inReplyToUserId.hashCode()));
        result = ((result* 31)+((this.coordinates == null)? 0 :this.coordinates.hashCode()));
        result = ((result* 31)+((this.truncated == null)? 0 :this.truncated.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.retweeted == null)? 0 :this.retweeted.hashCode()));
        result = ((result* 31)+((this.geo == null)? 0 :this.geo.hashCode()));
        result = ((result* 31)+((this.isQuoteStatus == null)? 0 :this.isQuoteStatus.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.inReplyToScreenName == null)? 0 :this.inReplyToScreenName.hashCode()));
        result = ((result* 31)+((this.entities == null)? 0 :this.entities.hashCode()));
        result = ((result* 31)+((this.inReplyToStatusId == null)? 0 :this.inReplyToStatusId.hashCode()));
        result = ((result* 31)+((this.inReplyToStatusIdStr == null)? 0 :this.inReplyToStatusIdStr.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.place == null)? 0 :this.place.hashCode()));
        result = ((result* 31)+((this.contributors == null)? 0 :this.contributors.hashCode()));
        result = ((result* 31)+((this.inReplyToUserIdStr == null)? 0 :this.inReplyToUserIdStr.hashCode()));
        result = ((result* 31)+((this.lang == null)? 0 :this.lang.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.retweetCount == null)? 0 :this.retweetCount.hashCode()));
        result = ((result* 31)+((this.favoriteCount == null)? 0 :this.favoriteCount.hashCode()));
        result = ((result* 31)+((this.favorited == null)? 0 :this.favorited.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Schema) == false) {
            return false;
        }
        Schema rhs = ((Schema) other);
        return ((((((((((((((((((((((((this.idStr == rhs.idStr)||((this.idStr!= null)&&this.idStr.equals(rhs.idStr)))&&((this.inReplyToUserId == rhs.inReplyToUserId)||((this.inReplyToUserId!= null)&&this.inReplyToUserId.equals(rhs.inReplyToUserId))))&&((this.coordinates == rhs.coordinates)||((this.coordinates!= null)&&this.coordinates.equals(rhs.coordinates))))&&((this.truncated == rhs.truncated)||((this.truncated!= null)&&this.truncated.equals(rhs.truncated))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.retweeted == rhs.retweeted)||((this.retweeted!= null)&&this.retweeted.equals(rhs.retweeted))))&&((this.geo == rhs.geo)||((this.geo!= null)&&this.geo.equals(rhs.geo))))&&((this.isQuoteStatus == rhs.isQuoteStatus)||((this.isQuoteStatus!= null)&&this.isQuoteStatus.equals(rhs.isQuoteStatus))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.inReplyToScreenName == rhs.inReplyToScreenName)||((this.inReplyToScreenName!= null)&&this.inReplyToScreenName.equals(rhs.inReplyToScreenName))))&&((this.entities == rhs.entities)||((this.entities!= null)&&this.entities.equals(rhs.entities))))&&((this.inReplyToStatusId == rhs.inReplyToStatusId)||((this.inReplyToStatusId!= null)&&this.inReplyToStatusId.equals(rhs.inReplyToStatusId))))&&((this.inReplyToStatusIdStr == rhs.inReplyToStatusIdStr)||((this.inReplyToStatusIdStr!= null)&&this.inReplyToStatusIdStr.equals(rhs.inReplyToStatusIdStr))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.place == rhs.place)||((this.place!= null)&&this.place.equals(rhs.place))))&&((this.contributors == rhs.contributors)||((this.contributors!= null)&&this.contributors.equals(rhs.contributors))))&&((this.inReplyToUserIdStr == rhs.inReplyToUserIdStr)||((this.inReplyToUserIdStr!= null)&&this.inReplyToUserIdStr.equals(rhs.inReplyToUserIdStr))))&&((this.lang == rhs.lang)||((this.lang!= null)&&this.lang.equals(rhs.lang))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.retweetCount == rhs.retweetCount)||((this.retweetCount!= null)&&this.retweetCount.equals(rhs.retweetCount))))&&((this.favoriteCount == rhs.favoriteCount)||((this.favoriteCount!= null)&&this.favoriteCount.equals(rhs.favoriteCount))))&&((this.favorited == rhs.favorited)||((this.favorited!= null)&&this.favorited.equals(rhs.favorited))));
    }

}
