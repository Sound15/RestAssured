package serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class Serializer {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		SuperHeroMoviesAndTVSeries hmts=new SuperHeroMoviesAndTVSeries();
		hmts.setCategory("Super Hero Movies And TV Series");
		
		List<String> accfran=new ArrayList<String>();
		accfran.add("DC");
		accfran.add("Marvel");
		hmts.setAcceptedFranchises(accfran);
		
		List<String> genres=new ArrayList<String>();
		genres.add("Action");
		genres.add("Adventure");
		genres.add("Heroic");
		genres.add("Dark");
		genres.add("Funny");
		hmts.setGenres(genres);
		
		List<Movies> allmovies=new ArrayList<Movies>();
		
		Movies batman=new Movies();
		batman.setTitle("Batman:The Dark Knight");
		batman.setYear(2008);
		List<String> batmancast=new ArrayList<String>();
		batmancast.add("Christian Bale");
		batmancast.add("Heath Ledger");
		batman.setCast(batmancast);
		allmovies.add(batman);
		
		Movies justice=new Movies();
		justice.setTitle("Hustice League:Synder Cut");
		justice.setYear(2021);
		List<String> justicecast=new ArrayList<String>();
		justicecast.add("Henry Cavill");
		justicecast.add("Gal Gadot");
		justice.setCast(justicecast);
		allmovies.add(justice);
		
		Movies avengers=new Movies();
		avengers.setTitle("Avengers:Age of Ultron");
		avengers.setYear(2012);
		List<String> avengercast=new ArrayList<String>();
		avengercast.add("Robert Downey");
		avengercast.add("Chris Evans");
		avengers.setCast(avengercast);
		allmovies.add(avengers);
		
		List<TVSeries> alltvseries=new ArrayList<TVSeries>();
		
		TVSeries flash=new TVSeries();
		flash.setTitle("Flash");
		flash.setYear(2014);
		alltvseries.add(flash);
		
		TVSeries gotham=new TVSeries();
		gotham.setTitle("Gotham");
		gotham.setYear(2014);
		alltvseries.add(gotham);
		
		TVSeries supergirl=new TVSeries();
		supergirl.setTitle("Super Girl");
		supergirl.setYear(2015);
        alltvseries.add(supergirl);
        
        OtherDetails otherdetails=new OtherDetails();
        otherdetails.setCountry("Only USA");
        otherdetails.setLanguage("English");
        
        hmts.setMovies(allmovies);
        hmts.setTvseries(alltvseries);
        hmts.setOtherdetails( otherdetails);
        
        ObjectMapper mapper=new ObjectMapper();
        File superjson=new File("complex.json");
        mapper.writerWithDefaultPrettyPrinter().writeValue(superjson, hmts);
        
	}

}
