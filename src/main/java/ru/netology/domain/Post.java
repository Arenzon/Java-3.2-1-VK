package ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostInfo;
    private ViewsInfo viewsInfo;

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

    public LikesInfo getLikesInfo () {
        return likesInfo;
    }

    public void setLikesInfo ( LikesInfo likesInfo ) {
        this.likesInfo = likesInfo;
    }

    public CommentsInfo getCommentsInfo () {
        return commentsInfo;
    }

    public void setCommentsInfo ( CommentsInfo commentsInfo ) {
        this.commentsInfo = commentsInfo;
    }

    public RepostsInfo getRepostInfo () {
        return repostInfo;
    }

    public void setRepostInfo ( RepostsInfo repostInfo ) {
        this.repostInfo = repostInfo;
    }

    public ViewsInfo getViewsInfo () {
        return viewsInfo;
    }

    public void setViewsInfo ( ViewsInfo viewsInfo ) {
        this.viewsInfo = viewsInfo;
    }
}