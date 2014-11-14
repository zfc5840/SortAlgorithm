package com.algorithm.buddleSort;

import java.util.Random;

/**
 *com.algorithm.buddleSort.Main.java 
 *
 * @author 张富成
 * @history
 * <TABLE id="HistoryTable" border="1">
 * 	<TR><TD>时间</TD><TD>描述</TD><TD>作者</TD></TR>
 *	<TR><TD>2014-4-25</TD><TD>创建初始版本</TD><TD>张富成</TD></TR>
 * </TABLE>
 */
public class Main {
	
   /**
    * 冒泡排序
    * 依次比较相邻的两个数，将最小数放在前面，最大数放在后面
    * 冒泡排序具有稳定性
    * 时间复杂度O(n^2)
    * 不及堆排序，快速排序O（nlogn，底数为2）
    * @param args
    */
  public static void main(String[] args){
	   Random random=new Random();
	   int[] sort=new int[10];
	   for(int i=0;i<10;i++){
		   sort[i]=random.nextInt(50);
	   }
	   System.out.println("排序前数组：");
	   for(int i:sort){
		   System.out.print(i+" ");
	   }
	   //调用排序算法
	   
	   buddleSort(sort);
	   System.out.println();
	   System.out.println("排序后数组：");
	   for(int i:sort){
		   System.out.print(i+" ");
	   }
   }
   
   public static void buddleSort(int[] sort){
	   for(int i=1;i<sort.length;i++){
		   for(int j=0;j<sort.length-i;j++){
			   if(sort[j]>sort[j+1]){
				   int temp=sort[j];
				   sort[j]=sort[j+1];
				   sort[j+1]=temp;
			   }
		   }
	   }
   }
}

/**
 * Copyright © 2014,天津天安怡和科技有限公司 All rights reserved.
 */