package it.unibo.generics.graph.impl;

import it.unibo.generics.graph.api.Graph;

public class GraphImpl<N> implements Graph<N>{
    private List<N> nodes;
    SortingAlgorithm sort;

    public GraphImpl(SortingAlgorithm sort_algo){
        this.sort=sort_algo;
        this.nodes=new ArrayList<>();
    }

    @Override
    public void addNode(N node){

    }
}
