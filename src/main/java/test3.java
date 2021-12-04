import javax.swing.*;

/**
 * Project name(项目名称)：Swing对话框组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/4
 * Time(创建时间)： 23:06
 * Version(版本): 1.0
 * Description(描述)： 选项对话框
 * 选项对话框允许用户自己定制按钮内容。创建选项对话框的方法如下：
 * public static int showOptionDialog(Component parentComponent,Object message,String title,int optionType,int messageType,icon icon,Object[] options,Object initValue)
 * 其中，使用 options 参数指定按钮，initValue 参数用于指定默认获得焦点的按钮。该方法返回表明激活的按钮的一个整型值。
 */

public class test3
{
    public static void main(String[] args)
    {
        String[] str = {"0001", "0002", "0003", "0004"};
        int result;
        result = JOptionPane.showOptionDialog(null, "请选择其中一个：", "选择", 1, 3, null, str, str[0]);
        System.out.println(result);
    }
}
