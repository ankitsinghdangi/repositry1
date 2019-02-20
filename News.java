package com.org.streamapijava;

public class News 
{
	int newsId;
	String postedByUser,commentByUser,comment;
	public News(int newsId, String postedByUser, String commentByUser, String comment) 
	{
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() 
	{
		return newsId;
	}
	public String getPostedByUser() 
	{
		return postedByUser;
	}
	public String getCommentByUser()
	{
		return commentByUser;
	}
	public String getComment()
	{
		return comment;
	}
	@Override
	public String toString() 
	{
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	
	

}
