/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Perkenalan Mahasiswa
 */
package pbo210116397latihan31perkenalanmahasiswa;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.nim = "10110269";
        mahasiswa1.nama="Rizki Adam Kurniawan"+"\n";
        mahasiswa1.PerkenalanDiri(mahasiswa1.nim, mahasiswa1.nama);
        
        mahasiswa mahasiswa2 = new mahasiswa();
        mahasiswa2.nim = "10110270";
        mahasiswa2.nama="Indra Tiola"+"\n";
        mahasiswa2.PerkenalanDiri(mahasiswa2.nim, mahasiswa2.nama);
        
        mahasiswa mahasiswa3 = new mahasiswa();
        mahasiswa3.nim = "10110271";
        mahasiswa3.nama= "Robi Tanzil Ganefi"+ "\n";
        mahasiswa3.PerkenalanDiri(mahasiswa3.nim, mahasiswa3.nama);
        
        mahasiswa mahasiswa4 = new mahasiswa();
        mahasiswa4.nim = "10110272";
        mahasiswa4.nama="muhammad Nur Awaludin"+"\n";
        mahasiswa4.PerkenalanDiri(mahasiswa4.nim, mahasiswa4.nama);
    }
    }
    

