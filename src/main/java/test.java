import javax.swing.*;
import java.net.URL;

/**
 * Project name(项目名称)：Swing对话框组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/4
 * Time(创建时间)： 22:24
 * Version(版本): 1.0
 * Description(描述)： 确认对话框
 * 确认对话框显示消息，并等待用户单击“确定”按钮来取消对话框，该对话框不返回任何值。而确认对话框询问一个问题，
 * 需要用户单击合适的按钮做出响应。确认对话框返回对应被选按钮的值。
 * public static int showConfirmDialog(Component parentComponent,Object message,String title,int optionType,int messageType,Icon icon)
 * 参数 parentComponent、message、title、messageType 和 icon 与 showMessageDialog() 方法中的参数的含义相同。
 * 其中，只有 parentComponent 和 message 参数是必需的，title 的默认值为“选择一个选项”。
 * messageType 的默认值是 QUESTION_MESSAGE。optionType 参数用于控制在对话框上显示的按钮，可选值如下：
 * 0 或 JOptionPane.YES_NO_OPTIION。
 * 1 或 JOptionPane.YES_NO_CANCEL_0PTII0N。
 * 2 或 JOptionPane.OK_CANCEL_OPTIION。
 * showConfirmDialog() 方法返回所选选项对应的值，这些值可以是整数或常量值，如下：
 * 0 或 JOptionPane.YES_OPTIION。
 * 1 或 JOptionPane.NO_OPTIION。
 * 2 或 JOptionPane.CANCEL_OPTIION。
 * 0 或 JOptionPane.OK_OPTIION。
 * -1 或 JOptionPane.CLOSED_OPTIION。
 * 除了 CLOSED_OPTIION 外，其他常量值都对应于激活的按钮。
 * CLOSED_OPTIION 表示对话框在没有任何按钮激活的情况下关闭，例如单击对话框上的关闭图标按钮。
 */

public class test
{
    public static void main(String[] args)
    {
        int result;
        result = JOptionPane.showConfirmDialog(null, "删除？", "删除提示", 0);
        System.out.println(result);
        result = JOptionPane.showConfirmDialog(null, "删除？", "删除提示", 1);
        System.out.println(result);
        result = JOptionPane.showConfirmDialog(null, "删除？", "删除提示", 2);
        System.out.println(result);
        result = JOptionPane.showConfirmDialog(null, "删除？", "删除提示", 0, 0);
        System.out.println(result);
        result = JOptionPane.showConfirmDialog(null, "删除？", "删除提示", 0, 1);
        System.out.println(result);
        result = JOptionPane.showConfirmDialog(null, "删除？", "删除提示", 0, 2);
        System.out.println(result);
        ImageIcon icon = new ImageIcon("t.png");
        result = JOptionPane.showConfirmDialog(null, "删除？", "删除提示", 2, 1, icon);
        System.out.println(result);

        test1.main(null);
        test2.main(null);
        test3.main(null);
        System.exit(1);
    }
}
