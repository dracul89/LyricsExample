package beaumont.danny.musicapipoc.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ItunesResponse{

	@SerializedName("resultCount")
	private int resultCount;

	@SerializedName("results")
	private List<ResultsItem> results;

	public void setResultCount(int resultCount){
		this.resultCount = resultCount;
	}

	public int getResultCount(){
		return resultCount;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"ItunesResponse{" + 
			"resultCount = '" + resultCount + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}