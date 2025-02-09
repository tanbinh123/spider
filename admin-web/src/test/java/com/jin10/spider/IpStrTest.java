package com.jin10.spider;

/**
 * @author hongda.fang
 * @date 2019-12-02 14:33
 * ----------------------------------------------
 */
public class IpStrTest {
    
    static String ip = "183.154.49.22," +
            "114.239.253.64," +
            "36.22.79.130," +
            "117.57.91.25," +
            "36.22.78.137," +
            "121.226.215.175," +
            "117.26.45.136," +
            "114.239.254.131," +
            "117.69.201.107," +
            "59.57.38.194," +
            "183.154.52.105," +
            "113.124.92.201," +
            "49.70.17.235," +
            "110.243.22.74," +
            "117.95.200.33," +
            "114.239.172.251," +
            "183.164.239.92," +
            "114.239.148.193," +
            "114.239.151.60," +
            "183.164.239.53," +
            "61.128.208.94," +
            "106.14.14.20," +
            "218.2.226.42," +
            "222.218.122.5," +
            "210.26.49.88," +
            "118.126.15.136," +
            "114.249.118.1," +
            "115.195.89.54," +
            "122.224.65.201," +
            "111.160.169.54," +
            "112.95.205.137," +
            "153.101.64.50," +
            "125.46.0.62," +
            "118.89.234.236," +
            "59.36.10.52," +
            "116.252.39.176," +
            "58.59.8.94," +
            "122.224.65.198," +
            "124.237.83.14," +
            "1.196.161.46," +
            "117.57.91.25," +
            "59.57.38.194," +
            "183.154.52.105," +
            "113.124.92.201," +
            "183.164.239.53," +
            "183.154.48.115," +
            "117.28.97.156," +
            "121.226.188.249," +
            "171.35.163.175," +
            "115.221.245.217," +
            "114.233.51.97," +
            "123.160.68.190," +
            "110.189.152.86," +
            "180.122.224.241," +
            "61.145.49.16," +
            "117.95.232.43," +
            "117.95.199.57," +
            "113.194.29.179," +
            "183.166.102.226," +
            "114.239.254.161," +
            "183.154.49.22," +
            "114.239.253.64," +
            "36.22.79.130," +
            "36.22.78.137," +
            "121.226.215.175," +
            "117.26.45.136," +
            "114.239.254.131," +
            "117.69.201.107," +
            "49.70.17.235," +
            "110.243.22.74," +
            "117.95.200.33," +
            "114.239.172.251," +
            "183.164.239.92," +
            "114.239.148.193," +
            "114.239.151.60," +
            "106.110.212.44," +
            "171.35.172.57," +
            "113.120.38.48," +
            "117.57.91.166," +
            "114.239.250.37";


    static String port = "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "31394," +
            "9999," +
            "35873," +
            "808," +
            "808," +
            "9999," +
            "3128," +
            "3128," +
            "80," +
            "9999," +
            "3128," +
            "8080," +
            "9000," +
            "8118," +
            "3128," +
            "42626," +
            "8888," +
            "12034," +
            "53281," +
            "8787," +
            "3128," +
            "53281," +
            "20179," +
            "3128," +
            "53281," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "52277," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "31394," +
            "9999," +
            "35873," +
            "808," +
            "808," +
            "9999," +
            "9999," +
            "9999," +
            "9999," +
            "9999" ;


    public static void main(String[] args) {
        String[] ips = ip.split(",");
        String[] ports = port.split(",");
        StringBuilder builder = new StringBuilder();
        for (int i = 0 ; i < ips.length ; i ++){
            builder.append(ips[i] + ":" + ports[i] + ",");
        }
        System.out.println(builder.toString());
    }
}
