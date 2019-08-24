package java.lang;


/**
 * The type String.
 * 在双亲委派模型的定义中提到了“启动类加载器”。包括启动类加载器，绝大部分Java程序都会使用到以下3种系统提供的类加载器：
 *
 * 启动类加载器（Bootstrap ClassLoader）
 *    负责将存放在＜JAVA_HOME＞/lib目录中的
 *    JDK中的常用类大都由启动类加载器加载，如java.lang.String、java.util.List等。需要特别说明的是，启动类Main class也由启动类加载器加载。
 *
 *
 * 扩展类加载器（Extension ClassLoader）
 *    负责加载＜JAVA_HOME＞/lib/ext目录中的
 *
 * 应用程序类加载器（Application ClassLoader）
 *    它负责加载用户类路径ClassPath上所指定的类库：如果应用程序中没有自定义过自己的类加载器，一般情况下这个就是程序中默认的类加载器。
 *    启动类Main class、其他如工程中编写的类、maven引用的类，都会被放置在类路径下。Main class由启动类加载器加载，其他类由应用程序类加载器加载。
 *
 *
 *
 *
 */
public class String {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
//错误: 在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
  //   public static void main(String[] args)
  //否则 JavaFX 应用程序类必须扩展javafx.application.Application
  //因为双亲委派机制会 从BootStrap classLoader中发现java自带的String(自带的string是没有main方法的)
  public static void main(String[] args) {
    System.out.println(args);
  }

}
