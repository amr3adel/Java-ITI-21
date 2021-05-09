/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong;

/**
 *
 * @author amrad
 */
public class NewClass1 {
    //String address = "192.168.1.1";
    //String [] split = address.split("\\.");
    public static void main(String[] args) {

        String IP = "192.168.1.2";
        String[] output = IP.split("\\.");
        //System.out.println(output.length);       // 3

        for (String s : output) {
            System.out.println(s);
        }
    

}