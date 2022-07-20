package com.example.lab2;

/**
 * @author Aspartame
 * @version 1.0
 * @date 2022/7/20 15:08
 * @e-mail 1135975764@qq.com
 */
public class IntList {
    int first;
    IntList next;

    public IntList() {
    }

    public IntList(int first, IntList next) {
        this.first = first;
        this.next = next;
    }
    public  static IntList of(int i, int j, int z){
        IntList L = new IntList(i,new IntList(j,new IntList(z,null)));
        return L;
    }
    public  static IntList of(int i, int j, int z,int m){
        IntList L = new IntList(i,new IntList(j,new IntList(z,new IntList(m,null))));
        return L;
    }
    //修改列表，使其所有元素都是平方的。
    public static void dSquareList(IntList L){
        while (L!=null){
            L.first=L.first*L.first;
            L=L.next;
        }
    }
    //使用迭代返回所有元素平方的列表版本。该列表未修改
    public  IntList squareListIterative(IntList L){
        if(L==null){
            return null;
        }

        IntList s=new IntList(L.first*L.first,null);
        IntList p =L.next;
        IntList ptr = s;
        while (p!=null){
            ptr.next=new IntList(p.first*p.first,null);
            ptr=ptr.next;
            p=p.next;
        }
        return s;
    }
//    public static IntList squareListIterative(IntList L) {
//        if (L == null) {
//            return null;
//        }
//        IntList res = new IntList(L.first * L.first, null);
//        IntList ptr = res;
//        L = L.next;
//        while (L != null) {
//            ptr.next = new IntList(L.first * L.first, null);
//            L = L.next;
//            ptr = ptr.next;
//        }
//        return res;
//    }
    //使用递归返回所有元素平方的列表版本。该列表未修改
    public  IntList squareListsquareListRecursive(IntList L){
        IntList newList=this;
        if (newList==null){
            return newList;
        }else {
            newList.first = L.first*L.first;
            newList = L.next;
            return squareListsquareListRecursive(newList);
        }
    }
    //返回一个由 A 的所有元素组成的列表，后跟 B 的所有元素。可以修改 A。由您完成
    public static IntList dcatenate(IntList A, IntList B){
        IntList p =new IntList();
        p=A;
        while (p.next!=null){
            p=p.next;
        }
        while (B!=null){

            p.next=B;
            p=p.next;
            B = B.next;
        }
        return A;
    }
    //返回一个由 A 的所有元素组成的列表，后跟 B 的所有元素。不能修改 A。由您完成
    public static IntList catenate(IntList A, IntList B){
        if(A==null){
                return new IntList(B.first,B.next);

        }else if(A.next==null){
            return new IntList(A.first,B);
        }else {
            return new IntList(A.first,catenate(A.next,B));
        }
    }


    public static void main(String[] args) {
        IntList L=test();

    }
    public static  IntList test(){
//        dSquareList(origL);
        IntList myList = IntList.of(0, 1, 2);
        IntList L=myList.squareListIterative(myList);
//        IntList origL = IntList.of(1, 2, 3,8);
//        IntList L =catenate(origL,myList);
        return L;
    }
}
