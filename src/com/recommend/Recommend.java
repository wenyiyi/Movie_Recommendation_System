package com.recommend;
import java.io.IOException;
/**
 * 主任务启动程序
 */
import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.mapred.JobConf;

import com.base.SysConstants;

public class Recommend {

    public static void main(String[] args) throws Exception {
        Map<String, String> path = new HashMap<String, String>();
        path.put("data", "d:/user.csv");
        path.put("Step1Input", SysConstants.HDFS + "/user/hdfs/recommend");
        path.put("Step1Output", path.get("Step1Input") + "/step1");
        path.put("Step2Input", path.get("Step1Output"));
        path.put("Step2Output", path.get("Step1Input") + "/step2");
        path.put("Step3Input1", path.get("Step1Output"));
        path.put("Step3Output1", path.get("Step1Input") + "/step3_1");
        path.put("Step3Input2", path.get("Step2Output"));
        path.put("Step3Output2", path.get("Step1Input") + "/step3_2");
        path.put("Step4Input1", path.get("Step3Output1"));
        path.put("Step4Input2", path.get("Step3Output2"));
        path.put("Step4Output", path.get("Step1Input") + "/step4");

        Step1.run(path);
        Step2.run(path);
        Step3.run1(path);
        Step3.run2(path);
        Step4.run(path);
        System.exit(0);
    }
    
    public static void run(){
    	 Map<String, String> path = new HashMap<String, String>();
         path.put("data", "d:/user.csv");
         path.put("Step1Input", SysConstants.HDFS + "/user/hdfs/recommend");
         path.put("Step1Output", path.get("Step1Input") + "/step1");
         path.put("Step2Input", path.get("Step1Output"));
         path.put("Step2Output", path.get("Step1Input") + "/step2");
         path.put("Step3Input1", path.get("Step1Output"));
         path.put("Step3Output1", path.get("Step1Input") + "/step3_1");
         path.put("Step3Input2", path.get("Step2Output"));
         path.put("Step3Output2", path.get("Step1Input") + "/step3_2");
         path.put("Step4Input1", path.get("Step3Output1"));
         path.put("Step4Input2", path.get("Step3Output2"));
         path.put("Step4Output", path.get("Step1Input") + "/step4");

         try {
             Step1.run(path);
             Step2.run(path);
             Step3.run1(path);
             Step3.run2(path);
			 Step4.run(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
        // System.exit(0);
    }

    public static JobConf config() {
        JobConf conf = new JobConf(Recommend.class);
        conf.setJobName("Recommand");
        conf.set("mapreduce.task.io.sort.mb", "1024");
        return conf;
    }

}
