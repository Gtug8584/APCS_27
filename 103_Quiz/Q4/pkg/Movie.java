package pkg;
public class Movie{
    private String movie;
    private int revenue;
    private double rating;
    private int ratings;


    public Movie(){
        movie="Avengers";
        revenue=623357910;
        rating=8.0;
        ratings=33;
    }
    public Movie(String a, double b,int c,int d){
        movie=a;
        rating=b;
        ratings=c;
        revenue=d;
    }

    public void movieToString(){
        System.out.println("Movie: "+movie);
        System.out.println("rating: "+rating);
        System.out.println("ratings: "+ratings);
        System.out.println("revenue: "+revenue);
        
    } 
    public String getMovieName(){
        return movie;
    }
    public int getRevenue(){
        return revenue;
    }
    public double addRating(double a){
        ratings=ratings+1;
        rating=(((ratings*rating)+a)/ratings);
        return rating;
    }
    public double getRating(){
        return rating;
    }
    public boolean compareRatings(Movie a){
        if(rating>a.getRating()){
            return true;
        }
        else{
            return false;
        }
    }


    public Movie pirateMovie(){
        Movie arg=new Movie(movie,revenue,rating,ratings);
        return arg;
    }

}
