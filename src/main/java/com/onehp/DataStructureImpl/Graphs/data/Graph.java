package com.onehp.DataStructureImpl.Graphs.data;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Graph {

    @Getter
    @Setter
    public Map<Node, List<Node>> adjacencyList;

    public Graph(Map<Node, List<Node>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public void addNode(String label, Integer value) {
        this.adjacencyList.putIfAbsent(n)
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Graph graph = (Graph) o;
        return Objects.equals(adjacencyList, graph.adjacencyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adjacencyList);
    }
}
