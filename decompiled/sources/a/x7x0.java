package a;

import android.os.Build;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x7x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f40437a = Charset.forName("UTF-8");

    public static boolean a(fck0 fck0Var) {
        for (int i = 0; i < ((List) fck0Var.b).size(); i++) {
            dow0 dow0VarQ = fck0Var.q(i);
            if (dow0VarQ.e && dow0VarQ.c == pfw.g) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static Integer c() {
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }
}
