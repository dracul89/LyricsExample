package beaumont.danny.musicapipoc.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class LyricsResponse{

	@SerializedName("song")
	private String song;

	@SerializedName("artist")
	private String artist;

	@SerializedName("lyrics")
	private String lyrics;

	@SerializedName("url")
	private String url;

	public void setSong(String song){
		this.song = song;
	}

	public String getSong(){
		return song;
	}

	public void setArtist(String artist){
		this.artist = artist;
	}

	public String getArtist(){
		return artist;
	}

	public void setLyrics(String lyrics){
		this.lyrics = lyrics;
	}

	public String getLyrics(){
		return lyrics;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"LyricsResponse{" + 
			"song = '" + song + '\'' + 
			",artist = '" + artist + '\'' + 
			",lyrics = '" + lyrics + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}