package com.algorithms.array;

/**
 * @ Author：chenxuebing
 * @ Date：2019/12/20 11:17
 * @ Description：操作数组的工具类
 */
public class ArrayUtils<T> {
    /**
     * @Author chenxuebing
     * @Description 插入一个数组元素
     * @Date 2019/12/20 15:30
     * @Param [arr, e]
     * @return
     **/
    public T[] insertElement(T[] arr, int index, T e){
        int size = arr.length;
        //数组元素后移
        for(int i = size - 1; i >= index; i--){
            //数组后移
            arr[i+1] = arr[i];
        }
        arr[index] = e;
        //返回插入的值
        return arr;
    }

    /**
     * @Author chenxuebing
     * @Description 删除指定位置的元素
     * @Date 2019/12/25 11:39
     * @Param [arr, Index]
     * @return
     **/
    public T deleteElement(T[] arr, int index){
        //数组元素前移
        int size = arr.length;
        for(int i = index; i < size-1; i++){
            arr[i] = arr[i+1];
        }
        return arr[index];
    }

    /**
     * @Author chenxuebing
     * @Description 插入元素时如果不考虑元素的有序性，假如要在第K个元素进行插入，直接将第k个元素移到末尾，在第k个位置插入元素
     *              针对引用型数据类型
     * @Date 2019/12/25 14:18
     * @Param [arr, index]
     * @return
     **/
    public T[] insertElementUnOrder(T[] arr, int index, T e){
        //直接在数组的末尾插入元素，时间复杂度O(1)
        int flag = 0;
        for(int i = 0; i < arr.length; i++){
            flag++;
            if(arr[i] == null){
                break;
            }
        }
        arr[flag] = arr[index];
        arr[index] = e;
        return arr;
    }

    /**
     * @Author chenxuebing
     * @Description 使用标记的方法删除数组的元素，即对指定位置的元素做标记删除操作，待数组的元素满了之后再进行删除操作
     *              这样做的好处：对多次删除元素的移动缩减为一次移动
     * @Date 2019/12/25 15:07
     * @Param [arr, index]
     * @return
     **/
    public T[] deleteElementFlag(T[] arr, int index){
        return null;
    }
}
