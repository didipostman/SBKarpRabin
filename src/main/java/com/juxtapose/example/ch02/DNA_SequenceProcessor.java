/**
 * 
 */
package com.juxtapose.example.ch02;

import org.springframework.batch.item.ItemProcessor;
import com.juxtapose.example.ch02.RabinKarp;

/**

 * @author wadï mami (mailto:didipostman77@gmail.com)
 * 2013-1-6下午09:55:38
 */
public class DNA_SequenceProcessor implements
		ItemProcessor<DNA_Sequence, DNA_Sequence> {
			
        
	private String[] snippetsPatternsDna = {"TGCTGCT", "AATTCC", " GGAATAA"};  // the array can be more larger it is just an explanation
	
	public DNA_Sequence process(DNA_Sequence dnas) throws Exception {
		
	String DNA_ARRAYS ="";	
		
	for (int i=0; i<snippetsPatternsDna.length; i++)  
          {  
  
            
	String pat = snippetsPatternsDna[i] ;
	
        String txt = dnas.getDna() ;

        RabinKarp searcher = new RabinKarp.getInstance(pat);
        
		int[] offset = searcher.search(txt);
	
		for (int j=0; j< offset.length; j++)
	
		DNA_ARRAYS = DNA_ARRAYS +"(" +String.valueOf(offset[j]) + "," + pat.length() + ")";
	
        
        
	}
		dnas.setSeqDNA_Arrays(DNA_ARRAYS);
		return dnas ;
     } 
}
