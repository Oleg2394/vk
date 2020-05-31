package ru.netology.domain;

public class Post {
    private String dateTime;
    private String imageUrl;
    private String name;
    private String button;
    private CommentsInfo commentsInfo;
    private LikeAmount likeamount;
    private PostRetort postretort;
    private PostView postView;
    private String id;
    private String groupName;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    private String test;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public LikeAmount getLikeamount() {
        return likeamount;
    }

    public void setLikeamount(LikeAmount likeamount) {
        this.likeamount = likeamount;
    }

    public PostRetort getPostretort() {
        return postretort;
    }

    public void setPostretort(PostRetort postretort) {
        this.postretort = postretort;
    }

    public PostView getPostView() {
        return postView;
    }

    public void setPostView(PostView postView) {
        this.postView = postView;
    }

 }
