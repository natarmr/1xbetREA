package a;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0x0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24451a;
    public final /* synthetic */ String b;
    public final /* synthetic */ jzw0 c;

    public /* synthetic */ o0x0(boolean z, String str, jzw0 jzw0Var) {
        this.f24451a = z;
        this.b = str;
        this.c = jzw0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.f24451a;
        String str = this.b;
        jzw0 jzw0Var = this.c;
        String str2 = (z || !s4x0.b(str, jzw0Var, true, false).b) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        s0x.H(messageDigest);
        byte[] bArrDigest = messageDigest.digest(jzw0Var.d);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : bArrDigest) {
            char[] cArr2 = nnw0.l;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return f140.n(b1j.n(str2, ": pkg=", str, ", sha256=", new String(cArr)), ", atk=", z, ", ver=12451000.false");
    }
}
