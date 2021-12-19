package com.company;

public class LinkedList {
    private Node mainNode = new Node();
    private int nodeCount = 0;

    private class Node {
        public Integer veri;
        public Node sonrakiNode;
    }

    public void SonaEkle(int veri) {
        if (mainNode.veri == null) {
            mainNode.veri = veri;
        } else {
            Node eklenecekNode = new Node();
            eklenecekNode.veri = veri;
            eklenecekNode.sonrakiNode = null;
            Node tempNode = new Node();
            tempNode = mainNode;
            while (tempNode.sonrakiNode != null) {
                tempNode = tempNode.sonrakiNode;
            }
            tempNode.sonrakiNode = eklenecekNode;
        }
        nodeCount++;
    }

    public void BasaEkle(int veri) {
        if (mainNode.veri == null) {
            mainNode.veri = veri;
        } else {
            Node tempNode = new Node();
            tempNode = mainNode;
            System.out.println(tempNode.veri.toString());
            Node eklenecekNode = new Node();
            eklenecekNode.sonrakiNode = tempNode;
            eklenecekNode.veri = veri;
            mainNode = eklenecekNode;
        }
        nodeCount++;
    }

    public void Ekle(int siraNo, int veri) {
        if (siraNo > nodeCount || siraNo < 2) {
            System.out.println("Bu sırada bir eleman yok.");
        } else {
            Node tempNode = new Node();
            tempNode = mainNode;
            Node oncekiNode = new Node();
            for (int i = 0; i < siraNo - 1; i++) {
                oncekiNode = tempNode;
                tempNode = tempNode.sonrakiNode;

            }
            Node eklenecekNode = new Node();
            eklenecekNode.veri = veri;
            eklenecekNode.sonrakiNode = tempNode;
            oncekiNode.sonrakiNode = eklenecekNode;
            nodeCount++;
        }
    }
}
