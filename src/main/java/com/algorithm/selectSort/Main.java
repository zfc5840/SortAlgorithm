package com.algorithm.selectSort;

import java.util.Random;

/**
 *com.algorithm.selectSort.Main.java 
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
    *  选择排序
    *  每一趟从待排序的中选出最小或最大的值
    *  顺序放在已排好序的数列的后面，直到全部待排序的数据元素排完。 
    *  选择排序是不稳定的排序方法。
    * @param args
    */
public static void main(String[] args){
	   Random random = new Random();
	   int[] sort=new int[10];
	   for(int i=0;i<10;i++){
		   sort[i]=random.nextInt(50);
	   }
	   System.out.println("排序前数组：");
	   for(int i :sort){
		   System.out.print(i+" ");
	   }
	   //调用选择排序
	   selectSort(sort);
	   System.out.println();
	   System.out.println("排序后的数组：");
	   for(int i :sort){
		   System.out.print(i+" ");
	   }
   }
   
   public static void selectSort(int[] sort){
	   for(int i=0;i<sort.length-1;i++){
		   for(int j=i+1;j<sort.length;j++){
			   if(sort[j]<sort[i]){
				   int temp=sort[i];
				   sort[i]=sort[j];
				   sort[j]=temp;
			   }
		   }
	   }
   }
}

/**
 * Copyright © 2014,天津天安怡和科技有限公司 All rights reserved.
 */