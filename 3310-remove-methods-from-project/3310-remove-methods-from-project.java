import java.util.*;

class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer>[] graph = new ArrayList[n];
        int[] inDegree = new int[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] inv : invocations) {
            graph[inv[0]].add(inv[1]);
            inDegree[inv[1]]++;
        }

        Set<Integer> sps = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(k);
        sps.add(k);

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int neighbor : graph[curr]) {
                if (!sps.contains(neighbor)) {
                    sps.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (!sps.contains(i)) {
                for (int neighbor : graph[i]) {
                    if (sps.contains(neighbor)) {
                        return allMethods(n);
                    }
                }
            }
        }

        List<Integer> remaining = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!sps.contains(i)) {
                remaining.add(i);
            }
        }
        return remaining;
    }

    private List<Integer> allMethods(int n) {
        List<Integer> all = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            all.add(i);
        }
        return all;
    }
}
