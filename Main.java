import pengguna.Mhs;
class Main {
    public static void main(String[] args) {

            Mhs mhs = new Mhs("ini_username", "ini_password");

    
            mhs.setNama("Totti Diescha Mahendra");
            mhs.setNim("G.111.20.0007");
            mhs.setSmt(6);

            System.out.println("Nama Mhs: " + mhs.getNama());
            System.out.println("Nim Mhs: " + mhs.getNim());
            System.out.println("Smt Mhs: " + mhs.getSmt(0));
            System.out.println("Username: " + mhs.getusername());
            System.out.println("Password: " + mhs.getpassword());
    }
}