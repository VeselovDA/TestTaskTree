package ru.text.tree;

import ru.text.tree.persistance.model.TreeNode;
import ru.text.tree.service.TreeService;
import ru.text.tree.service.impl.TreeServiceImpl;

public class Application {
    public static void main(String[] args) {
        var tree = initTree();
        TreeService treeService = new TreeServiceImpl();
        treeService.getAllNodes(tree).forEach(System.out::println);
    }

    private static TreeNode initTree() {
        var m = new TreeNode("m");

        var j = new TreeNode("j");
        j.getChildren().add(m);

        var i = new TreeNode("i");

        var d = new TreeNode("d");
        d.getChildren().add(i);
        d.getChildren().add(j);

        var e = new TreeNode("e");

        var f = new TreeNode("f");

        var k = new TreeNode("k");

        var n = new TreeNode("n");

        k.getChildren().add(n);
        f.getChildren().add(k);

        var b = new TreeNode("b");

        b.getChildren().add(d);
        b.getChildren().add(e);
        b.getChildren().add(f);

        var l = new TreeNode("l");
        var h = new TreeNode("h");
        h.getChildren().add(l);

        var g = new TreeNode("g");

        var c = new TreeNode("c");
        c.getChildren().add(g);
        c.getChildren().add(h);

        var a = new TreeNode("a");
        a.getChildren().add(b);
        a.getChildren().add(c);

        return a;

    }
}
