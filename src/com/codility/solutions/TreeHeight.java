package com.codility.solutions;

// Credit Goes To dominik-sze
// https://github.com/dominik-sze/Codility

class TreeHeight {
    int depth = 0;
    public int solution(Tree T) {
        int level = 0;
        traverse(T, level);
        return depth;
    }
    
    public void traverse(Tree node, int level) {
        if(level>depth) {
            depth++;
        }
        if(node.l!=null) {
            traverse(node.l, level+1);
        }
        if(node.r!=null) {
            traverse(node.r, level+1);
        }
    }
    
    class Tree {
    	Tree l;
    	Tree r;
    }
}
