package com.algorithm.directInsertSort;

import java.util.Random;

/**
 *com.algorithm.directInsertSort.Main.java 
 *
 * @author 张富成
 * @history
 * <TABLE id="HistoryTable" border="1">
 * 	<TR><TD>时间</TD><TD>描述</TD><TD>作者</TD></TR>
 *	<TR><TD>2014-4-25</TD><TD>创建初始版本</TD><TD>张富成</TD></TR>
 * </TABLE>
 */
public class Main {
	/*
	 * 直接插入排序
	 * 将一个数插入到已经排好序的有序数据中，从而得到一个新的，个数加一的数据。
	 * 适用于少量数据，时间复杂度为O(n^2),是稳定的排序方法。
	 */
   public static void main(String[] args){
	   Random random = new Random();
	   int[] sort=new int[3];
	   for(int i=0;i<3;i++){
		   sort[i]=random.nextInt(50);
	   }
	   System.out.println("排序前数组：");
	   for(int i :sort){
		   System.out.print(i+" ");
	   }
	   //调用快速排序算法
	   directInsertSort(sort);
	   System.out.println();
	   System.out.println("排序后的数组：");
	   for(int i :sort){
		   System.out.print(i+" ");
	   }
   }
   
   private static void directInsertSort(int[] sort) {   
       for (int i = 1; i < sort.length; i++) {   
           int index = i - 1;   
           int temp = sort[i];   
           while (index >= 0 && sort[index] > temp) {   
               sort[index + 1] = sort[index];   
               index--;   
           }   
           sort[index + 1] = temp;   
       }   
   }
}

/**
 * Copyright © 2014,天津天安怡和科技有限公司 All rights reserved.
 */