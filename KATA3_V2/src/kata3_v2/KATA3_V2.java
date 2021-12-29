package kata3_v2;

public class KATA3_V2 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();  
        
        histogram.increment("ulpgc.es");    
        histogram.increment("ull.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");    
        
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram); 
        histogramDisplay.execute();
        
    }
    
}

