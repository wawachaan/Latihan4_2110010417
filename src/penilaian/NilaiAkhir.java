
package penilaian;


class NilaiAkhir {
    private double uts;
    private double uas;
    private double tugas;
    
    public double getUts() {
        return uts;
    }
    
    public void setUts(double uts) {
        this.uts = uts;
    }
    
    public double getUas() {
        return uas;
    }
    
    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double getTugas() {
        return tugas;
    }
    
    public void setTugas(double tugas) {
        this.tugas = tugas;
    }
    
    public double hitungNilaiAkhir() {
        // Menggunakan bobot 40% UTS, 40% UAS, dan 20% tugas
        double bobotUts = 0.4;
        double bobotUas = 0.4;
        double bobotTugas = 0.2;
        
        return (uts * bobotUts) + (uas * bobotUas) + (tugas * bobotTugas);
    }
}