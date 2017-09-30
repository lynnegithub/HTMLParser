import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import java.util.List;
import java.util.Scanner;

/**
 * Created by silence on 9/28/17.
 */
public class HTMLParser {

    public static void main(String[] args) {
        System.out.println("Please input a valid HTML string: ");
        String teset = "<html><head><title>HTML highlight test page</title></head><body>This is text in the body.<br><h1>This is a heading</h1><p>This is a paragraph.</p>There is more text in the body after the paragraph.</body></html>";
        Scanner scanner = new Scanner(System.in);
        String HTMLFile = scanner.nextLine();
        System.out.println(HTMLFile);
        Document document = Jsoup.parse(HTMLFile);
        Node root = document.getAllElements().get(1);
        StringBuilder ret = new StringBuilder();
        dfs(root, ret);
        System.out.print(ret.toString());


    }

    public static void dfs(Node root, StringBuilder sb) {
        List<Node> children = root.childNodes();
        int size = root.childNodeSize();
        String colorText;
        String tagText;
        //child node
        if ((size == 1 && children.get(0) instanceof TextNode) || (size == 0 && root instanceof Element)) {
            colorText = HTMLTag.getColor(((Element) root).tagName()).toCode();
            sb.append(colorText);
            tagText = root.outerHtml();
            sb.append(tagText);
            return;

        }
        colorText = HTMLTag.getColor(((Element) root).tagName()).toCode();
        tagText = root.outerHtml().substring(0, root.outerHtml().indexOf(">") + 1);
        sb.append(colorText + tagText);
        for (int i = 0; i < size; ++i) {
            if (children.get(i) instanceof TextNode) {
                if (i == size - 1) {
                    sb.append(colorText);
                }
                sb.append(((TextNode) children.get(i)).text());
            }
            if (children.get(i) instanceof Element) {
                dfs(children.get(i), sb);
            }

            if (i == size - 1) {
                if (children.get(i) instanceof Element) {
                    sb.append(colorText);
                }
                sb.append(tagText.replace("<", "</"));
            }
        }

    }

}

