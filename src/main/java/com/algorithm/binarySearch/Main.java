package com.algorithm.binarySearch;


/**
 *com.algorithm.binarySearch.Main.java 
 *
 * @author 张富成
 * @history
 * <TABLE id="HistoryTable" border="1">
 * 	<TR><TD>时间</TD><TD>描述</TD><TD>作者</TD></TR>
 *	<TR><TD>2014-4-25</TD><TD>创建初始版本</TD><TD>张富成</TD></TR>
 * </TABLE>
 */
public class Main {
   public static void main(String[] args){
	   int[] sort={1,2,3};
	   //调用二分搜索算法
	   int address=binarySearch(sort,3);
	   System.out.println();
	   System.out.println("搜索后的坐标："+address);
   }
   
   private static int binarySearch(int[] sort,int data){   
       if(data<sort[0] || data>sort[sort.length-1]){   
           return -1;   
       }   
       int begin = 0;   
       int end = sort.length;   
       int mid = (begin+end)/2;   
       while(begin <= end){   
           mid = (begin+end)/2;   
           if(data > sort[mid]){   
               begin = mid + 1;   
           }else if(data < sort[mid]){   
               end = mid - 1;   
           }else{   
               return mid;   
           }   
       }   
       return -1;   
   }   
}

/**
 * Copyright © 2014,天津天安怡和科技有限公司 All rights reserved.
 */