import javax.swing.*;

/**
 * Project name(项目名称)：Swing对话框组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/4
 * Time(创建时间)： 22:52
 * Version(版本): 1.0
 * Description(描述)： 输入对话框
 * 输入对话框用于接收用户的输入。输入组件可以由文本框、下拉列表或者列表框进行实现。如果没有指定可选值，那么就使用文本框接收输入；
 * 如果指定了一组可选值，可选值的个数小于 20，那么将使用下拉列表显示；如果可选值的个数大于或等于 20，那么这些可选值将通过列表框显示。
 * 创建输入对话框的方法如下：
 * public static String showInputDialog(Component parentComponent,Object message,String title,int messageType)
 * public static Object showInputDSalog(Component parentComponent,Object message,String title,int messageType,Icon icon,Object[] selectionValue,Object initValue)
 * 其中，第一个 showInputDialog() 方法用于使用文本框输入，第二个 showInputDialog() 方法用于下拉列表或列表框的显示方式。
 * 参数 parentComponent 是必需的，message 默认为空，title 默认值为“输入”，
 * messageType 的值默认为 3 或 JOptionPane.QUESTION_MESSAGE。
 */

public class test2
{
    public static void main(String[] args)
    {
        String str;
        str = JOptionPane.showInputDialog("输入：");
        System.out.println(str);
        str = JOptionPane.showInputDialog(null, "请输入：", "用户名");
        System.out.println(str);
        str = JOptionPane.showInputDialog(null, "请输入：", "用户名", 0);
        System.out.println(str);
        str = JOptionPane.showInputDialog(null, "请输入：", "用户名", 1);
        System.out.println(str);
        str = JOptionPane.showInputDialog(null, "请输入：", "用户名", 2);
        System.out.println(str);
        str = JOptionPane.showInputDialog(null, "请输入：", "用户名", 3);
        System.out.println(str);
        String[] strs = {"admin1", "admin2", "admin3", "admin4", "admin5", "admin6"};
        str = (String) JOptionPane.showInputDialog(null, "请选择用户名：", "用户名选择", 1, null, strs, strs[0]);
        System.out.println(str);
        ImageIcon icon = new ImageIcon("t.png");
        str = (String) JOptionPane.showInputDialog(null, "请选择用户名：", "用户名选择", 2, icon, strs, strs[0]);
        System.out.println(str);
        //System.exit(1);
    }
}
