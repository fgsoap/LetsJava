package com.geekbang.supermarket;

// >> TODO 用final 修饰类看看？
public class Phone extends MerchandiseV2 {

    // >> TODO 用 final 修饰静态变量看看？
    private final static int MAX_BUY_ONE_ORDER = 9;
    // >> TODO 用 final 修饰引用，最难理解
    private final MerchandiseV2 gift;
    // >> TODO 用 final 修饰成员变量看看？
    private double screenSize;
    private double cpuHZ;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;


    // >> TODO 构造方法不能用 final 修饰
    public Phone(
            String name, String id, int count, double soldPrice, double purchasePrice, MerchandiseV2 gift,
            double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os
    ) {
        super(name, id, count, soldPrice * 1.2, purchasePrice);
        this.screenSize = screenSize;
        this.cpuHZ = cpuHZ;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;
        this.gift = gift;
    }

    public static void staticNoOverride() {

        System.out.println("staticNoOverride in Phone");
    }

    // >> TODO 用 final 修饰方法看看？
    // >> TODO 用 final 修饰形参看看？
    // >> TODO 用 final 修饰局部变量看看？
    public double buy(final int count) {
        System.out.println("Phone里的buy(int count)");
        if (count > MAX_BUY_ONE_ORDER) {
            System.out.println("购买失败，手机一次最多只能买" + MAX_BUY_ONE_ORDER + "个");
            return -2;
        }

        final double cost;
        cost = super.buy(count);
        return cost;
    }

    public String getName() {
        return this.brand + ":" + this.os + ":" + super.getName();
    }

    public void describe() {
        System.out.println("此手机商品属性如下");
        super.describe();
        System.out.println("手机厂商为" + brand + "；系统为" + os + "；硬件配置如下：\n" +
                "屏幕：" + screenSize + "寸\n" +
                "cpu主频" + cpuHZ + " GHz\n" +
                "内存" + memoryG + "Gb\n" +
                "存储空间" + storageG + "Gb");

        System.out.println("赠品信息为：");
        gift.describe();
    }

//    public void setGift(MerchandiseV2 gift) {
//        this.gift = gift;
//    }

    public MerchandiseV2 getGift() {
        return gift;
    }

    public boolean meetCondition() {
        return true;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getCpuHZ() {
        return cpuHZ;
    }

    public void setCpuHZ(double cpuHZ) {
        this.cpuHZ = cpuHZ;
    }

    public int getMemoryG() {
        return memoryG;
    }

    public void setMemoryG(int memoryG) {
        this.memoryG = memoryG;
    }

    public int getStorageG() {
        return storageG;
    }

    public void setStorageG(int storageG) {
        this.storageG = storageG;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

}
