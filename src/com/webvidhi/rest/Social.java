package com.webvidhi.rest;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@Path("/social")
public class Social {
	
	ConfigurationBuilder cb = new ConfigurationBuilder();
	
	public Social(){
	cb.setDebugEnabled(true)
	.setOAuthConsumerKey("WRge7xW4tOZ64ttYpAnvqtfcB")
	.setOAuthConsumerSecret("1HXHAoA9f9QnuIFoJ4bDM8wb27n5tuvITguU9pc9hBjsiCK6qr")
	.setOAuthAccessToken("51697894-uPE8aabxrD8yuzTvPmfAm5BT9hfoJJ9IzCdbrMPvM")
	.setOAuthAccessTokenSecret("CEbvp0NjbcHbtW5Bifn3VdEUbGNLjgPx5YHxhjrdGhTV9");}
	

	@GET
	public String getLastTweet() throws TwitterException{	
		
		return "tweet";
		
	}
	@PUT
	@Path("/{tweet}")
	public void dispatchTweet(@PathParam("tweet") String s) throws TwitterException{
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitt = tf.getInstance();
		twitt.updateStatus(s);
	}
}
