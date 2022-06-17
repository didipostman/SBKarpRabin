/**
 * 
 */
package com.juxtapose.example.ch02;

/**

 * @author wadï mami (mailto:didipostman77@gmail.com)
 * 2013-1-6下午09:56:02
 */
public class DNA_Sequence {
	
	private String dna = "";
	private String seqDNA_Arrays = "";
	
	
	
	public String getDna() {
		return dna;
	}
	public void setDna(String dna) {
		this.dna = dna;
	}
	
	public String getSeqDNA_Arrays () {
		return seqDNA_Arrays;
	}
	public void setSeqDNA_Arrays(String seqDNA_Arrays) {
		this.seqDNA_Arrays = seqDNA_Arrays;
	}
	
	/**
	 * 
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append( "dna=" + getDna() +";pattern :" + getSeqDNA_Arrays() );
		return sb.toString();
	}
}
