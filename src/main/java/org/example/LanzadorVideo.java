package org.example;

import java.io.IOException;

public class LanzadorVideo {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "start", "https://www.youtube.com/watch?v=LXb3EKWsInQ");
        try {
            Process process = pb.start();
            System.out.println("Video Lanzado");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
