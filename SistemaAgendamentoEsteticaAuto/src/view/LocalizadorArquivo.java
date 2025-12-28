package view;

import java.io.File;
import java.awt.Desktop;

public class LocalizadorArquivo {
    public static void main(String[] args) {
        File arquivo = new File("veiculos.txt");
        
        System.out.println("=================================");
        System.out.println("   LOCALIZADOR DE ARQUIVO");
        System.out.println("=================================\n");
        
        System.out.println("📂 CAMINHO COMPLETO:");
        System.out.println("   " + arquivo.getAbsolutePath());
        
        System.out.println("\n📁 PASTA DO ARQUIVO:");
        System.out.println("   " + arquivo.getAbsoluteFile().getParent());
        
        System.out.println("\n📊 INFORMAÇÕES:");
        System.out.println("   Existe? " + arquivo.exists());
        System.out.println("   Tamanho: " + arquivo.length() + " bytes");
        
        if (arquivo.exists()) {
            System.out.println("\n✅ O arquivo existe!");
            System.out.println("\n🔍 COPIE E COLE ESTE CAMINHO NO EXPLORADOR:");
            System.out.println("   " + arquivo.getAbsolutePath());
            
            // Tenta abrir a pasta automaticamente
            try {
                File pasta = arquivo.getAbsoluteFile().getParentFile();
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pasta);
                    System.out.println("\n📂 Abrindo a pasta automaticamente...");
                }
            } catch (Exception e) {
                System.out.println("\n⚠ Não foi possível abrir automaticamente.");
            }
        } else {
            System.out.println("\n❌ O arquivo NÃO existe neste local!");
        }
        
        System.out.println("\n=================================");
    }
}