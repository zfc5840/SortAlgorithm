package com.algorithm.quickSort;

import java.util.Random;

/**
 *com.algorithm.quickSort.Main.java 
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
	 * 快速排序
	 * 快速排序通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的数据都比另外一部分的数据小。
	 * 然后按此方法对两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序数列。
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
	   //调用快速排序算法
	   quickSort(sort, 0, sort.length - 1);
	   System.out.println();
	   System.out.println("排序后的数组：");
	   for(int i :sort){
		   System.out.print(i+" ");
	   }
   }
  
   public static void quickSort(int[] list, int low, int high){
	   if (low < high) {  
           int middle = getMiddle(list, low, high);  //将list数组进行一分为二  
           _quickSort(list, low, middle - 1);        //对低字表进行递归排序  
           _quickSort(list, middle + 1, high);       //对高字表进行递归排序  
       }  
   }
   
   public static int getMiddle(int[] list, int low, int high) {  
       int tmp = list[low];    //数组的第一个作为中轴  
       while (low < high) {  
           while (low < high && list[high] > tmp) {  
               high--;  
           }  
           list[low] = list[high];   //比中轴小的记录移到低端  
           while (low < high && list[low] < tmp) {  
               low++;  
           }  
           list[high] = list[low];   //比中轴大的记录移到高端  
       }  
       list[low] = tmp;              //中轴记录到尾  
       return low;                   //返回中轴的位置  
   } 
   
   //递归调用
   public static void _quickSort(int[] list, int low, int high) {  
       if (low < high) {  
           int middle = getMiddle(list, low, high);  //将list数组进行一分为二  
           _quickSort(list, low, middle - 1);        //对低字表进行递归排序  
           _quickSort(list, middle + 1, high);       //对高字表进行递归排序  
       }  
   }  
}

/**
 * Copyright © 2014,天津天安怡和科技有限公司 All rights reserved.
 */