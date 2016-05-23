package recommender;

import librec.main.LibRec;
import librec.util.FileIO;

public class RecommenderTest {

	public static void main(String[] args) {
		
		/* LibRec: 	initModel(), 
		 * 			buildModel(), 
		 * 			predict(u, j, bounded), 
		 * 			ranking(u,j)
		 */
		String configDirPath = FileIO.makeDirPath("etc","librec");
		String[] configFiles = {
//				"timeSVD++.conf"
				"SVD++10.conf",
				"SVD++20.conf",
				"SVD++30.conf",
				"SVD++40.conf",
				"SVD++50.conf",
				"SVD++60.conf",
				"SVD++70.conf",
				"SVD++80.conf",
				"SVD++90.conf",
				"SVD++100.conf",
				"SVD++110.conf",
				"SVD++120.conf"
		};
		
		for (String configFile : configFiles){
			LibRec librec = new LibRec();
			librec.setConfigFiles(configDirPath + configFile);
			try {
				librec.execute(args);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
}
