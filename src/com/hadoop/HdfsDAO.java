package com.hadoop;


import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.mapred.JobConf;

public class HdfsDAO {

    private static final String HDFS = "hdfs://192.168.0.128:9000/";

    public HdfsDAO(Configuration conf) {
        this(HDFS, conf);
    }

    public HdfsDAO(String hdfs, Configuration conf) {
        this.hdfsPath = hdfs;
        this.conf = conf;
    }

    private String hdfsPath;
    private Configuration conf;

    public static void main(String[] args) throws IOException {
        JobConf conf = config();
        HdfsDAO hdfs = new HdfsDAO(conf);
        hdfs.list();
        hdfs.copyFile("logfile/small.csv", "/tmp/new");
        hdfs.ls("/tmp/new");
    }        
    
    public static JobConf config(){
        JobConf conf = new JobConf(HdfsDAO.class);
        conf.setJobName("HdfsDAO");
        conf.addResource("classpath:/hadoop/core-site.xml");
        conf.addResource("classpath:/hadoop/hdfs-site.xml");
        conf.addResource("classpath:/hadoop/mapred-site.xml");
        return conf;
    }
    /**
     * 创建文件夹
     * TODO 填写方法的作用功能
     * @param folder
     * @throws IOException
     */
    public void mkdirs(String folder) throws IOException {
        Path path = new Path(folder);
        FileSystem fs = FileSystem.get(URI.create(hdfsPath), conf);
        if (!fs.exists(path)) {
            fs.mkdirs(path);
            System.out.println("Create: " + folder);
        }
        fs.close();
    }
    /**
     * 删除文件夹
     * TODO 填写方法的作用功能
     * @param folder
     * @throws IOException
     */
    public void rmr(String folder) throws IOException {
        Path path = new Path(folder);
        FileSystem fs = FileSystem.get(URI.create(hdfsPath), conf);
        fs.deleteOnExit(path);
        System.out.println("Delete: " + folder);
        fs.close();
    }
   /**
    * 改名
    * TODO 填写方法的作用功能
    * @param output
    * @param pr
    * @throws IOException
    */
	public void rename(String output, String pr) throws IOException {
	     FileSystem fs = FileSystem.get(URI.create(hdfsPath), conf);
	     Path output2 = new Path(output);
	     Path pr2 = new Path(pr);
	     fs.rename(output2, pr2);
	     fs.close();
	}
    /**
     * 查看文件夹内容
     * TODO 填写方法的作用功能
     * @param folder
     * @throws IOException
     */
    public void ls(String folder) throws IOException {
        Path path = new Path(folder);
        FileSystem fs = FileSystem.get(URI.create(hdfsPath), conf);
        FileStatus[] list = fs.listStatus(path);
        System.out.println("ls: " + folder);
        System.out.println("==========================================================");
        for (FileStatus f : list) {
            System.out.printf("name: %s, folder: %s, size: %d\n", f.getPath(), f.isDir(), f.getLen());
        }
        System.out.println("==========================================================");
        fs.close();
    }
    /**
     * 创建文件
     * TODO 填写方法的作用功能
     * @param file
     * @param content
     * @throws IOException
     */
    public void createFile(String file, String content) throws IOException {
        FileSystem fs = FileSystem.get(URI.create(hdfsPath), conf);
        byte[] buff = content.getBytes();
        FSDataOutputStream os = null;
        try {
            os = fs.create(new Path(file));
            os.write(buff, 0, buff.length);
            System.out.println("Create: " + file);
        } finally {
            if (os != null)
                os.close();
        }
        fs.close();
    }
    /**
     * 复制文件
     * TODO 填写方法的作用功能
     * @param local
     * @param remote
     * @throws IOException
     */
    public void copyFile(String local, String remote) throws IOException {
        FileSystem fs = FileSystem.get(URI.create(hdfsPath), conf);
        fs.copyFromLocalFile(new Path(local), new Path(remote));
        System.out.println("copy from: " + local + " to " + remote);
        fs.close();
    }
    /**
     * 下载文件
     * TODO 填写方法的作用功能
     * @param remote
     * @param local
     * @throws IOException
     */
    public void download(String remote, String local) throws IOException {
        Path path = new Path(remote);
        FileSystem fs = FileSystem.get(URI.create(hdfsPath), conf);
        fs.copyToLocalFile(path, new Path(local));
        System.out.println("download: from" + remote + " to " + local);
        fs.close();
    }
    /**
     * 查看文件内容
     * TODO 填写方法的作用功能
     * @param remoteFile
     * @throws IOException
     */
    public void cat(String remoteFile) throws IOException {
        Path path = new Path(remoteFile);
        FileSystem fs = FileSystem.get(URI.create(hdfsPath), conf);
        FSDataInputStream fsdis = null;
        System.out.println("cat: " + remoteFile);
        try {  
            fsdis =fs.open(path);
            IOUtils.copyBytes(fsdis, System.out, 4096, false);  
          } finally {  
            IOUtils.closeStream(fsdis);
            fs.close();
          }
    }
    
    /**
	 * 遍历文件系统的目录
	 * @param args
     * @throws IOException 
	 */
	private void list() throws IOException{
		FileSystem fs = FileSystem.get(URI.create(hdfsPath), conf);
		try {
			//FileStatus:represents the client side information for a file代表客户端信息文件
		FileStatus[] listStatus = fs.listStatus(new Path("hdfs://192.168.0.128:9000/"));
			//遍历数组
			for(FileStatus fileStatus:listStatus){
				//可能是目录，可能是文件
				String isDir = fileStatus.isDir()?"目录":"文件";
				//获取名字 String	new Path().getName() :Returns the final component of this path.
				String name = fileStatus.getPath().getName();
				System.out.println("isDir:"+name);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
