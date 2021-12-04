import javax.swing.*;

/**
 * Project name(项目名称)：Swing对话框组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/4
 * Time(创建时间)： 22:38
 * Version(版本): 1.0
 * Description(描述)： 消息对话框
 * 消息对话框显示一条提示或警告用户的信息，并等待用户单击 OK 或“确定”按钮以关闭对话框。创建消息对话框的方法如下：
 * public static void showMessageDialog(Component parentComponent,Object message,String title,int messageType,Icon icon)
 * 其中，只有 parentComponent 参数和 message 参数是必须指定的。parentComponent 可以是任意组件或者为空；
 * message 用来定义提示信息，它是一个对象，但是通常使用字符串表示；title 是设置对话框标题的字符串；messageType 是以下整型或常量中的一个。
 * 其中，只有 parentComponent 参数和 message 参数是必须指定的。parentComponent 可以是任意组件或者为空；message 用来定义提示信息，
 * 它是一个对象，但是通常使用字符串表示；title 是设置对话框标题的字符串；messageType 是以下整型或常量中的一个。
 * 0 或 JOptionPane.ERROR_MESSAGE。
 * 1 或 JOptionPane.INFORMATION_MESSAGE。
 * JOptionPane.PLAIN_MESSAGE。
 * 2 或 JOptionPane.WARNING_MESSAGE。
 * 3 或 JOptionPane.QUESTION_MESSAGE。
 * 默认情况下，messageType 的值是 JOptionPane.INFORMATION_MESSAGE。除类型 PLAIN_MESSAGE外，
 * 每种类型都有相应的图标，也可以通过 icon 参数提供自己的图标。
 */

public class test1
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "密码错误！！！");
        JOptionPane.showMessageDialog(null, "密码错误！！！", "提示", 0);
        JOptionPane.showMessageDialog(null, "密码错误！！！", "提示", 1);
        JOptionPane.showMessageDialog(null, "密码错误！！！", "提示", 2);
        JOptionPane.showMessageDialog(null, "密码错误！！！", "提示", 3);
        ImageIcon icon = new ImageIcon("t.png");
        JOptionPane.showMessageDialog(null, "密码错误！！！", "提示", 0, icon);

        //System.exit(1);
    }
}
