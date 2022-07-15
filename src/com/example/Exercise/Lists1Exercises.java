package com.example.Exercise;

/**
 * @author Aspartame
 * @version 1.0
 * @date 2022/7/12 14:58
 * @e-mail 1135975764@qq.com
 */
public class Lists1Exercises {
    public static void main(String[] args) {
        IntList L=new IntList(5,null);
        L=new IntList(10,L);
        L=new IntList(15,L);
        System.out.println(L.iterativeSize());
        System.out.println(L.get(0));
        IntList L2=L.incrList(L, 3);
        System.out.println(L2.get(0));
        IntList M=L.dincrList(L, 3);
        System.out.println(M.get(0));
        System.out.println(L.get(0));

    }
}
 class IntList {
    public  int first;
    public IntList rest;
    public IntList(int f,IntList r){
        this.first=f;
        this.rest=r;
    }
    /** 返回一个与 L 相同的 IntList，但具有每个元素增加 x。L不允许改变。*/
    public IntList incrList (IntList L,int x){
        if(L==null){
            return L;
        }else {
            return new IntList(L.first+x,incrList(L.rest,x));
        }
    }
    /** 返回一个与 L 相同的 IntList，但具有每个元素增加 x。不允许使用“new”关键字。*/
    //因此我们不得不使用指针，L也无法避免的会被改变。整体思路基本和incrList变化不大,地址和指针的一个东西
    public IntList dincrList(IntList L,int x){
        if (L==null){
            return L;
        }else {
            L.first= L.first+x;
            L.rest=dincrList(L.rest,x);
            return L;
        }
    }
    //递归实现获取链表长度
    public int size(){
        if(rest==null){
            return 1;
        }
        return 1+this.rest.size();
    }
    //使用迭代来改变列表大小
    public int iterativeSize(){
        IntList p=this;
        int totalSize=0;
        while (p!=null){
            totalSize+=1;
            p=p.rest;
        }return totalSize;

    }
    //返回第i项值
    public int get(int i){
        if(i>this.size()-1){
            return -1;
        }else if(i==0){
            return first;
        }else  {
            return rest.get(i-1);
        }
    }


}
