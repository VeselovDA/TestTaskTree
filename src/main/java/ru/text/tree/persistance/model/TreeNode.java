package ru.text.tree.persistance.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TreeNode {
    private final List<TreeNode> children;
    private final String name;

    public Collection<TreeNode> getChildren() {
        return children;
    }

    public TreeNode(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name;
    }

}
