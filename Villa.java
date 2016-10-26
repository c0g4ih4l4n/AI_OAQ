/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testSQuares2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import javafx.scene.shape.Arc;

/**
 *
 * @author VPC
 */
public class Villa extends House {

    int quanID;
    int diemNhaQuan;
    public boolean coQuan;
    Shape shape = new Rectangle2D.Double(x, y, 65, 100);

    public Villa() {

    }

    public void setVilla(int ID, int x, int y, boolean coQuan) {
        this.quanID = ID;
        this.x = x;
        this.y = y;
        this.coQuan = coQuan;

    }

    public void setQuanID(int ID) {
        this.quanID = ID;
    }

    public int getDiemSo() {
        if (coQuan) {
            return danSo + 5;
        } else {
            return danSo;
        }
    }

    public void paint(Graphics2D g2d) {
        g2d.setColor(Color.gray);
        g2d.setFont(new Font("Tw Cen MT Bold Italic", Font.BOLD, 40));
        //Vẽ Nhà Quan
        if (quanID == 6) {
            
            //Hiển thị số dân trong quan
            g2d.drawString(String.valueOf(this.getDanSo()), 880, 300);
            if (coQuan) {
                //ve hinh co quan 6 + dan
                g2d.drawImage(Game.quan6, x + 100, y, null);
            }
            else {
                // ve hinh quan 6 co dan
            }

        } else {
            g2d.drawString(String.valueOf(this.getDanSo()), 200, 470);
            if (coQuan) {
                //ve hinh quan 0 co quan + dan
                g2d.drawImage(Game.quan0, x - 100, y, null);
            }
            else {
                // ve quan 0 co dan
            }
        }
        g2d.setColor(Color.gray);
        
    }

}
