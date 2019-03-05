
package com.example.types;

import java.util.ArrayList;
import java.util.List;

public class Entities {

    private List<Object> hashtags = new ArrayList<Object>();
    private List<Object> symbols = new ArrayList<Object>();
    private List<Object> userMentions = new ArrayList<Object>();
    private List<Object> urls = new ArrayList<Object>();

    public List<Object> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Object> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    public List<Object> getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(List<Object> userMentions) {
        this.userMentions = userMentions;
    }

    public List<Object> getUrls() {
        return urls;
    }

    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Entities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hashtags");
        sb.append('=');
        sb.append(((this.hashtags == null)?"<null>":this.hashtags));
        sb.append(',');
        sb.append("symbols");
        sb.append('=');
        sb.append(((this.symbols == null)?"<null>":this.symbols));
        sb.append(',');
        sb.append("userMentions");
        sb.append('=');
        sb.append(((this.userMentions == null)?"<null>":this.userMentions));
        sb.append(',');
        sb.append("urls");
        sb.append('=');
        sb.append(((this.urls == null)?"<null>":this.urls));
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
        result = ((result* 31)+((this.urls == null)? 0 :this.urls.hashCode()));
        result = ((result* 31)+((this.hashtags == null)? 0 :this.hashtags.hashCode()));
        result = ((result* 31)+((this.userMentions == null)? 0 :this.userMentions.hashCode()));
        result = ((result* 31)+((this.symbols == null)? 0 :this.symbols.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entities) == false) {
            return false;
        }
        Entities rhs = ((Entities) other);
        return (((((this.urls == rhs.urls)||((this.urls!= null)&&this.urls.equals(rhs.urls)))&&((this.hashtags == rhs.hashtags)||((this.hashtags!= null)&&this.hashtags.equals(rhs.hashtags))))&&((this.userMentions == rhs.userMentions)||((this.userMentions!= null)&&this.userMentions.equals(rhs.userMentions))))&&((this.symbols == rhs.symbols)||((this.symbols!= null)&&this.symbols.equals(rhs.symbols))));
    }

}
