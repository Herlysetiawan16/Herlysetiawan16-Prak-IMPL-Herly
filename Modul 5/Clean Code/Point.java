public interface Point {
        // Mendapatkan nilai koordinat x
        double getX();
    
        // Mendapatkan nilai koordinat y
        double getY();
    
        // Mengatur nilai koordinat kartesian
        void setCartesian(double x, double y);
    
        // Mendapatkan nilai jarak (r) dalam koordinat polar
        double getR();
    
        // Mendapatkan nilai sudut (theta) dalam koordinat polar
        double getTheta();
    
        // Mengatur nilai koordinat polar
        void setPolar(double r, double theta);
    }
    
