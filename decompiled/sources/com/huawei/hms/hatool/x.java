package com.huawei.hms.hatool;

import a.afn0;
import a.jwn;
import a.kng0;
import a.obc;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45892a = q0.i().getFilesDir().getPath();

    private static boolean b(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    v.c("hmsSdk", "delete file failed : " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                b(file2);
            }
        }
        return file.delete();
    }

    public static boolean c() {
        return b(new File(q0.i().getFilesDir().getPath() + "/hms"));
    }

    private String d() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }

    public String a() throws Throwable {
        String strB;
        String strB2;
        String strB3;
        String strB4;
        byte[] bArr;
        String strD = d();
        if (b()) {
            v.c("hmsSdk", "refresh components");
            strB = jwn.c(128);
            a("aprpap", strB);
            strB2 = jwn.c(128);
            a("febdoc", strB2);
            strB3 = jwn.c(128);
            a("marfil", strB3);
            strB4 = jwn.c(128);
            a("maywnj", strB4);
            d.b(q0.i(), "Privacy_MY", "assemblyFlash", System.currentTimeMillis());
        } else {
            strB = b("aprpap");
            strB2 = b("febdoc");
            strB3 = b("marfil");
            strB4 = b("maywnj");
        }
        char[] cArrA = a(strB, strB2, strB3, strD);
        byte[] bArrR = obc.R(strB4);
        if (cArrA == null || cArrA.length <= 0) {
            afn0.j("PBKDF2", "pbkdf password is empty.");
            bArr = new byte[0];
        } else if (bArrR.length <= 0) {
            afn0.j("PBKDF2", "pbkdf salt is empty.");
            bArr = new byte[0];
        } else if (bArrR.length < 16) {
            afn0.j("PBKDF2", "pbkdf salt parameter length is not enough, length must be more than 16.");
            bArr = new byte[0];
        } else {
            afn0.j("PBKDF2", "pbkdf bytes parameter count is less than 256.");
            bArr = new byte[0];
        }
        return obc.M(bArr);
    }

    private boolean b() {
        long jA = d.a(q0.i(), "Privacy_MY", "assemblyFlash", -1L);
        if (-1 != jA) {
            return System.currentTimeMillis() - jA > 31536000000L;
        }
        v.c("hmsSdk", "First init components");
        return true;
    }

    private String b(String str) throws Throwable {
        File file = new File(a(str), kng0.k("hianalytics_", str));
        if (a(file)) {
            return k1.a(file);
        }
        String strC = jwn.c(128);
        k1.a(file, strC);
        return strC;
    }

    private String a(String str) {
        return this.f45892a + "/hms/component/".replace("component", str);
    }

    private void a(String str, String str2) throws Throwable {
        File file = new File(a(str));
        File file2 = new File(a(str), kng0.k("hianalytics_", str));
        if (!file.exists() && file.mkdirs()) {
            v.c("hmsSdk", "file directory is mkdirs");
        }
        if (a(file2)) {
            k1.a(file2, str2);
        } else {
            v.f("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    private boolean a(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            v.f("hmsSdk", "create new file error!");
            return false;
        }
    }

    private char[] a(String str, String str2, String str3, String str4) {
        byte[] bArrR = obc.R(str);
        byte[] bArrR2 = obc.R(str2);
        byte[] bArrR3 = obc.R(str3);
        byte[] bArrR4 = obc.R(str4);
        int length = bArrR.length;
        if (length > bArrR2.length) {
            length = bArrR2.length;
        }
        if (length > bArrR3.length) {
            length = bArrR3.length;
        }
        if (length > bArrR4.length) {
            length = bArrR4.length;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (((bArrR[i] ^ bArrR2[i]) ^ bArrR3[i]) ^ bArrR4[i]);
        }
        return cArr;
    }
}
