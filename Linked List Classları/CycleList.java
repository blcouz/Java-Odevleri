package com.company;

public class CycleList {
    private class Node {
        private Integer veri;
        private Node sonrakiNode;
    }

    private Node mainNode = new Node();
    private int nodeCount = 0;

    public void Ekle(int veri) {
        if (mainNode.veri == null) {
            mainNode.veri = veri;
            mainNode.sonrakiNode = mainNode;
        } else {
            Node eklenecekNode = new Node();
            eklenecekNode.veri = veri;
            Node tempNode = new Node();
            tempNode = mainNode;
            while (tempNode.sonrakiNode != mainNode) {
                tempNode = tempNode.sonrakiNode;
            }
            tempNode.sonrakiNode = eklenecekNode;
            eklenecekNode.sonrakiNode = mainNode;

        }
        nodeCount++;
    }


    public void ArayaEkle(int sira, int veri) {
        if (sira == 1 | sira == nodeCount + 1) {
            Ekle(veri);
        } else if (sira <= nodeCount & sira > 1) {
            Node tempNode = new Node();
            tempNode = mainNode;
            Node oncekiNode = new Node();
            for (int i = 0; i < sira - 1; i++) {
                oncekiNode = tempNode;
                tempNode = tempNode.sonrakiNode;
            }
            Node eklenecekNode = new Node();
            eklenecekNode.veri = veri;
            eklenecekNode.sonrakiNode = tempNode;
            oncekiNode.sonrakiNode = eklenecekNode;
            nodeCount++;
        } else {
            System.out.println("İşlem gerçekleştirilemedi.");
        }
    }
}
