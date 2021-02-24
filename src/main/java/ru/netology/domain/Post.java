package ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean likesInfo;
    private boolean commentsInfo;
    private boolean repost;
    private boolean viewsInfo;
    private boolean friendsOnly;

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getDate () {
        return date;
    }

    public void setDate ( int date ) {
        this.date = date;
    }

    public String getText () {
        return text;
    }

    public void setText ( String text ) {
        this.text = text;
    }

    public int getReplyOwnerId () {
        return replyOwnerId;
    }

    public void setReplyOwnerId ( int replyOwnerId ) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId () {
        return replyPostId;
    }

    public void setReplyPostId ( int replyPostId ) {
        this.replyPostId = replyPostId;
    }

    public boolean isLikesInfo () {
        return likesInfo;
    }

    public void setLikesInfo ( boolean likesInfo ) {
        this.likesInfo = likesInfo;
    }

    public boolean isCommentsInfo () {
        return commentsInfo;
    }

    public void setCommentsInfo ( boolean commentsInfo ) {
        this.commentsInfo = commentsInfo;
    }

    public boolean isRepost () {
        return repost;
    }

    public void setRepost ( boolean repost ) {
        this.repost = repost;
    }

    public boolean isViewsInfo () {
        return viewsInfo;
    }

    public void setViewsInfo ( boolean viewsInfo ) {
        this.viewsInfo = viewsInfo;
    }

    public boolean isFriendsOnly () {
        return friendsOnly;
    }

    public void setFriendsOnly ( boolean friendsOnly ) {
        this.friendsOnly = friendsOnly;
    }
}