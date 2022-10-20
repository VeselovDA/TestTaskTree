package ru.text.tree.service.impl;

import ru.text.tree.persistance.model.TreeNode;
import ru.text.tree.service.TreeService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TreeServiceImpl implements TreeService {
    @Override
    public Collection<TreeNode> getAllNodes(TreeNode treeNode) {
        var treeNodes = new ArrayList<TreeNode>();
        addToList(treeNodes, treeNode);
        return treeNodes;
    }

    private void addToList(List<TreeNode> targetList, TreeNode treeNode) {
        targetList.add(treeNode);
        if (!treeNode.getChildren().isEmpty()) {
            treeNode.getChildren().forEach(child -> addToList(targetList, child));
        }
    }
}
