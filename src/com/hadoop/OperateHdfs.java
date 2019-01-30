package com.hadoop;
/**
 * hdfs分布式文件操作系统相关操作
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class OperateHdfs {
	
	//hdfs的java访问接口 FileSystem
	public static FileSystem getFileSystem(){
		FileSystem fileSystem = null;
		try {
			System.setProperty("hadoop.home.dir","D://hadoop-2.7.2" );
			URI uri = new URI("hdfs://192.168.0.128:9000/");
		    fileSystem = FileSystem.get(uri, new Configuration());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileSystem;
	}
	
	/**
	 * 查看文件
	 * hadoop fs -get /up.log .
	 * ..上一级
	 * ~homemulu
	 */
	public static void readFile(){
		FileSystem fileSystem = getFileSystem();
		try {
			//用数据流去读取文件
			FSDataInputStream openStream = fileSystem.open(new Path("hdfs://192.168.0.128:9000/user/hdfs/recommend/step4/part-00000"));
			//false
			IOUtils.copyBytes(openStream, System.out, 1024, true);
			//IOUTils.closeStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 上传文件    先把文件从本地读进来再写入hdfs（-put）
	 */
	public static void uploadFile(){
		FileSystem fileSystem = getFileSystem();
		BufferedInputStream bi = null;
		FSDataOutputStream fdos = null;
		try {
			//读取本地文件
			bi = new BufferedInputStream(new FileInputStream("d:/2.txt"));
			//把文件写入hdfs
			fdos = fileSystem.create(new Path("hdfs://192.168.0.128:9000/2.txt"));
			IOUtils.copyBytes(bi,fdos, new Configuration(), true);
			System.out.println("上传成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 下载文件  
	 */
	public static void downloadFile(){
		FileSystem fileSystem = getFileSystem();
		OutputStream bos = null;
		FSDataInputStream fdis = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream("d:/result.csv"));
			fdis = fileSystem.open(new Path("hdfs://192.168.0.128:9000/user/hdfs/recommend/step4/part-00000"));
			IOUtils.copyBytes(fdis,bos, new Configuration(), true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 创建文件夹
	 * @param args
	 */
	public static void mkdir(){
		FileSystem fileSystem = getFileSystem();
		try {
			fileSystem.mkdirs(new Path("hdfs://192.168.0.128:9000/wyd"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 删除文件夹
	 * @param args
	 */
	public static void rmdir(){
		FileSystem fileSystem = getFileSystem();
		try {
			fileSystem.delete(new Path("hdfs://192.168.0.128:9000/wyd"), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 遍历文件系统的目录
	 * @param args
	 */
	public static void list(){
		FileSystem fileSystem = getFileSystem();
		try {
			//FileStatus:represents the client side information for a file代表客户端信息文件
		FileStatus[] listStatus = fileSystem.listStatus(new Path("hdfs://192.168.0.128:9000/"));
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
	
	public static void main(String[] args) {
		 //readFile();
		   downloadFile();
		//mkdir();
		//rmdir();
		//uploadFile();
		//list();
		
	}
	
}
