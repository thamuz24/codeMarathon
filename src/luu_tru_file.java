public class luu_tru_file {
    public static int getCluster(int fileSize) {
        int kbUse = 0;
        int  cluster = 4096;
        kbUse = fileSize / cluster;
        if (fileSize % cluster != 0) {
            kbUse += 1;
        }
        return kbUse*4;

    }
}
