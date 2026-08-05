class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] NSE = new int[n];
        NSE[n - 1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && heights[st.peek()] >= heights[i])
                st.pop();
            if (st.size() == 0)
                NSE[i] = n;
            else
                NSE[i] = st.peek();
            st.push(i);
        }

        while (st.size() != 0)
            st.pop();

        int[] PSE = new int[n];
        PSE[0] = -1;
        st.push(0);
        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && heights[st.peek()] >= heights[i])
                st.pop();
            if (st.size() == 0)
                PSE[i] = -1;
            else
                PSE[i] = st.peek();
            st.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int area = heights[i] * (NSE[i] - PSE[i] - 1);
            if (area > maxArea)
                maxArea = area;
        }

        return maxArea;
    }
}