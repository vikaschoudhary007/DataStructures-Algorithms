package Graphs;

import java.util.*;

public class Graph101 {

    public static void dfs(HashMap<String, List<String>> graph, String source){

        Stack<String> stack = new Stack<>();
        stack.push(source);

        while (!stack.isEmpty()){
            String node = stack.pop();
            System.out.print(node + " -> ");
            for(String value : graph.get(node)){
                stack.push(value);
            }
        }

    }


    public static void bfs(HashMap<String, List<String>> graph, String source){

        Queue<String> queue = new LinkedList<>();
        queue.add(source);

        while (!queue.isEmpty()){
            String node = queue.remove();
            System.out.print(node + " -> ");
            for(String value : graph.get(node)){
                queue.add(value);
            }
        }

    }

    public static void main(String[] args) {

        HashMap<String, List<String>> graph = new HashMap<>();

        graph.put("a", new ArrayList<>(Arrays.asList("b", "d")));
        graph.put("b", new ArrayList<>());
        graph.put("c", new ArrayList<>());
        graph.put("d", new ArrayList<>(Arrays.asList("e", "g")));
        graph.put("e", new ArrayList<>(Arrays.asList("c")));
        graph.put("f", new ArrayList<>());
        graph.put("g", new ArrayList<>(Arrays.asList("f")));


        System.out.println("Adjacency List Representation : ");
        for(Map.Entry<String, List<String>> node : graph.entrySet()){
            String key = node.getKey();
            List<String> values = node.getValue();

            System.out.println(key + " : " + Arrays.toString(values.toArray()));
        }

        System.out.println("DFS : ");
        dfs(graph, "a");

        System.out.println("\nBFS : ");
        bfs(graph, "a");
    }
}
