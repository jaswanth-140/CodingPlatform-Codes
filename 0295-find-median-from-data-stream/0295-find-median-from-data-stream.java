class MedianFinder {
    Queue<Integer> a=new PriorityQueue<>(Collections.reverseOrder());
    Queue<Integer> b=new PriorityQueue<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(a.isEmpty()||num<a.peek())
        {
            a.add(num);
        }
        else
        {
            b.add(num);
        }

        if(a.size()>b.size()+1)
        {
            b.add(a.remove());
        }
        else if(b.size()>a.size())
        {
            a.add(b.remove());
        }
    }
    
    public double findMedian() {
        double temp;
        if(a.size()==b.size())
        {
            temp=(double)(a.peek()+b.peek())/2;
        }
        else
        {
            temp=(double)a.peek();
        }
        return temp;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */