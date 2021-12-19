package com.company;

public class DoubleLinkList {
    Node mainNode = new Node();
    private int nodeCount =0;
    static class Node {
        private Integer veri;
        private Node sonrakiNode;
        private Node oncekiNode;
    }

    public void SonaEkle(int veri) {
        if (mainNode.veri == null) {
            mainNode.veri = veri;
        } else {
            Node tempNode = new Node();
            tempNode = mainNode;
            while (tempNode.sonrakiNode != null) {
                tempNode = tempNode.sonrakiNode;
            }
            Node eklenecekNode = new Node();
            eklenecekNode.veri = veri;
            eklenecekNode.oncekiNode = tempNode;
            tempNode.sonrakiNode = eklenecekNode;
        }
        nodeCount++;
    }

    public void BasaEkle(int veri) {
        if (mainNode.veri == null) {
            mainNode.veri = veri;
        }
        else {
            Node eklenecekNode = new Node();
            eklenecekNode.veri = veri;
            eklenecekNode.sonrakiNode = mainNode;
            mainNode.oncekiNode = eklenecekNode;
            mainNode = eklenecekNode;
        }
        nodeCount++;
    }
    public void Ekle(int sira,int veri){
        if(sira<nodeCount||sira>1){
            Node tempNode = new Node();
            tempNode = mainNode;
            for (int i = 0; i < sira-1; i++) {
                tempNode = tempNode.sonrakiNode;
            }
            Node eklenecekNode = new Node();
            System.out.println(tempNode.oncekiNode.veri);
            tempNode.oncekiNode.sonrakiNode = eklenecekNode;
            eklenecekNode.veri = veri;
            eklenecekNode.oncekiNode = tempNode.oncekiNode;
            tempNode.oncekiNode = eklenecekNode;
            eklenecekNode.sonrakiNode = tempNode;
            nodeCount++;
        }
        else if(sira == 1){
            BasaEkle(veri);
        }
        else if(sira == nodeCount){
            SonaEkle(veri);
        }
        else{
            System.out.println("Geçersiz işlem.");
        }
    }

}
