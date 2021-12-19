package com.company;

public class DoubleCycleLinkList {
    private class Node {
        private Integer veri;
        private Node oncekiNode;
        private Node sonrakiNode;
    }

    private int nodeCount = 0;
    Node mainNode = new Node();

    public void Ekle(int veri) {
        if (mainNode.veri == null) {
            mainNode.oncekiNode = mainNode;
            mainNode.sonrakiNode = mainNode;
            mainNode.veri = veri;
        } else {
            Node tempNode = new Node();
            tempNode = mainNode;
            while (tempNode.sonrakiNode != mainNode) {
                tempNode = tempNode.sonrakiNode;
            }
            Node eklenecekNode = new Node();
            eklenecekNode.veri = veri;
            tempNode.sonrakiNode = eklenecekNode;
            mainNode.oncekiNode = eklenecekNode;
            eklenecekNode.oncekiNode = tempNode;
            eklenecekNode.sonrakiNode = mainNode;

        }
        nodeCount++;
    }

    public void ArayaEkle(int sira, int veri) {
        if (sira == nodeCount + 1 | sira == 1) {
            Ekle(veri);
        } else if (sira <= nodeCount & sira > 1){
            Node tempNode = new Node();
            tempNode = mainNode;
            for (int i = 0; i < sira-1; i++) {
                tempNode = tempNode.sonrakiNode;
            }
            Node eklenecekNode = new Node();
            eklenecekNode.veri = veri;
            eklenecekNode.oncekiNode = tempNode.oncekiNode;
            tempNode.oncekiNode.sonrakiNode = eklenecekNode;
            tempNode.oncekiNode = eklenecekNode;
            eklenecekNode.sonrakiNode = tempNode;
            nodeCount++;
        }
        else System.out.println("İşlem gerçekleştirilemedi");
    }
}
