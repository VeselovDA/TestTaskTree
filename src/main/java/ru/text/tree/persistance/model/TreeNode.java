package ru.text.tree.persistance.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TreeNode {
    private List<TreeNode> children;
     private final String name;
    public Collection<TreeNode> getChildren(){
        if(children==null){
            children =new ArrayList<>();
        }
        return children;
    }

    @Override
    public String toString() {
        return name;
    }
    public TreeNode(String name){
        this.name=name;
    }

}
