class SortedLinkedList{
    int num1,num2;
    int size=0;
    SortedLinkedList prev=null;
    SortedLinkedList next=null;
    public SortedLinkedList(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
        this.size++;
    }
    private void rightMerge(SortedLinkedList curr,int num2){
        // System.out.println("Right merge of ("+curr.num1+", "+curr.num2+") for " +num2);
        SortedLinkedList next=curr.next;
        while(next!=null){
            int nextX=next.num1,nextY=next.num2;
            if(nextX<=num2) num2=Math.max(num2,nextY);
            else break;
            if(next.prev!=null||next.next!=null) this.size--;
            if(next.prev!=null) next.prev.next=next.next;
            if(next.next!=null) next.next.prev=next.prev;
            next=next.next;
        }
        curr.num2=num2;
        return;
    }
    public SortedLinkedList addPrev(SortedLinkedList curr,SortedLinkedList newNode){
        newNode.next=curr;
        newNode.prev=curr.prev;
        curr.prev=newNode;
        if(newNode.prev!=null){
            newNode.prev.next=newNode;
        }
        else{
            newNode.size=this.size;
            return newNode;
        }
        return this;
    }
    public SortedLinkedList addNext(SortedLinkedList curr,SortedLinkedList newNode){
        newNode.prev=curr;
        newNode.next=curr.next;
        if(curr.next!=null){
            curr.next.prev=newNode;
        }
        curr.next=newNode;
        return this;
    }
    public SortedLinkedList add(int num1,int num2){
        // System.out.println("num1="+num1+";num2="+num2);
        SortedLinkedList curr = this;
        while(curr!=null){
            int x=curr.num1,y=curr.num2;
            // System.out.println("x="+x+";y="+y);
            if(num1<x){
                if(num2<x){
                    // System.out.println("Add Node place 1");
                    this.size++;
                    return addPrev(curr,new SortedLinkedList(num1,num2));
                }
                else if(x==num2 || num2<=y){
                    curr.num1=num1;
                    return this;
                }
                else if(y<num2){
                    curr.num1=Math.min(x,num1);
                    // System.out.println("place 1");
                    rightMerge(curr,num2);
                    return this;
                }
            }
            if(x==num1){
                if(num2<=y){
                    return this;
                }
                else if(y<num2){
                    curr.num1=Math.min(x,num1);
                    // System.out.println("place 2");
                    rightMerge(curr,num2);
                    return this;
                }
            }
            if(x<num1){
                if(num2<=y){
                    return this;//Both are within the boundary
                }
                else if(y<num2){
                    if(num1<=y){
                        curr.num1=Math.min(x,num1);
                        // System.out.println("place 3");
                        rightMerge(curr,num2);
                        return this;
                    }

                }
            }
            if(curr.next==null){
                // System.out.println("Add Node place 2");
                this.size++;
                return addNext(curr,new SortedLinkedList(num1,num2));
            }
            curr=curr.next;
        }
        return this;
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        int len=intervals.length;
        SortedLinkedList head=new SortedLinkedList(intervals[0][0],intervals[0][1]);
        for(int i=1;i<len;i++){
            int[] interval=intervals[i];
            head=head.add(interval[0],interval[1]);
            // System.out.println("=====");
        }
        SortedLinkedList itr=head;
        int[][] res=new int[head.size][2];
        int i=0;
        while(itr!=null){
            res[i++]=new int[]{itr.num1,itr.num2};
            // System.out.println("("+itr.num1+","+itr.num2+"),");
            itr=itr.next;
        }
        return res;
    }
}