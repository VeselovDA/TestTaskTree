package ru.text.tree.service;

import ru.text.tree.persistance.model.TreeNode;

import java.util.Collection;

public interface TreeService {
    Collection<TreeNode> getAllNodes(TreeNode treeNode);
}
