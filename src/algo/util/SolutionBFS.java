package algo.util;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Input :
 * Output :
 */

public class SolutionBFS {
    int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '1', '1'},
    };
    int m = grid.length;
    int n = grid[0].length;

    public static void main(String[] args) {
        new SolutionBFS().solve("");
    }

    public String solve(String str) {
        return null;
    }

    public void bfs(char[][] grid, int x, int y) {
        grid[x][y] = 'X';
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int[] dir : dirs) {
                int x1 = cur[0] + dir[0];
                int y1 = cur[1] + dir[1];
/*                if( x1<0 || x1>= m || y1<0 || y1>=n ||
                        visited[x1][y1] == true || grid[x1][y1] == 'X')
                    continue;*/
                if (x1 >= 0 && y1 >= 0 && x1 < m && y1 < n
                        && grid[x1][y1] == '1') {
                    grid[x1][y1] = 'X';
                    queue.offer(new int[] {x1, y1});
                }
            }
        }
    }
}
