package com.onehp.DataStructureImpl.Graphs.data;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Node { // Vertex
    @Setter
    @Getter
    private String label;

    @Setter
    @Getter
    private Integer value;

    public Node(Integer value) {
        this.value = value;
    }

    public Node(String label) {
        this.label = label;
    }

    public Node(String label, Integer value) {
        this.label = label;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(label, node.label) && Objects.equals(value, node.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, value);
    }


/**
     * Node { value, List<Path> }
     * Edge { startNode, endNode, directionality, weight/cost, }
     * This doesn't seem like a start way to represent graphs
     *  given there are different type of graphs, simple graphs, directed graphs, weighted graph
     *  and or a mixture of all of these
     *
     * Graphs are represented as a Matrix or Adjacency List
     * **/
}
