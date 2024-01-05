package window;

import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;

import javax.swing.*;

/**
 * @author yumu
 * @date 2024/1/5 12:07
 * @description
 */
public class NewBeeToolWindow implements ToolWindowFactory, DumbAware {

    @Override
    public void createToolWindowContent(Project project, ToolWindow toolWindow) {
        // 创建你的主面板
        JComponent myToolWindowContent = new JLabel("hello???");

        // 获取ContentFactory实例
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(myToolWindowContent, "", false);

        // 将内容添加到工具窗口
        toolWindow.getContentManager().addContent(content);
    }
}