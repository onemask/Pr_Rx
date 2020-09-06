class Leeet_99() {
    fun islandPerimeter(grid: Array<IntArray>?): Int {
        if (grid == null || grid.isEmpty() || grid[0].isEmpty()) {
            return 0
        }
        var count = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] == 1) {
                    count += 4
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        count -= 2
                    }
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        count -= 2
                    }
                }

                // System.out.println(count);
            }
        }
        return count
    }
}