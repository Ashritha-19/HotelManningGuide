package model;

import java.util.ArrayList;
import java.util.List;

public class Node {


        public String key;
        public String value;

        List<Node> nodeList = new ArrayList<>();


        @Override
        public String toString() {
                return "Node{" +
                        "key='" + key + '\'' +
                        ", value='" + value + '\'' +
                        ", nodeList=" + nodeList +
                        '}';
        }
}