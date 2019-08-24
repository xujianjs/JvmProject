package com.demo;

/**
 * The type Stack out of memory.
 *
 * java的栈：是用来存放 基本数据类型、实例方法、句柄（引用类型变量）
 * 栈的特性：大小有限、后进先出
 *
 */
public class StackOutOfMemory {

  /**
   * The constant count.
   */
  public static int count ;

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    //递归调用的话 会不停的压栈 最后导致栈 内存溢出
    print();
  }

  private static void print() {
    System.out.println(count++);
    print();
  }

}
