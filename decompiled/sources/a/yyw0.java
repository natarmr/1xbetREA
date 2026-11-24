package a;

import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yyw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h7x0 f43489a = new h7x0(uyw0.class, ymw0.class, new cpw0((byte) 23));
    public static final l5x0 b;
    public static final zqw0 c;
    public static final yqw0 d;

    static {
        qbx0.y();
        b = new l5x0(2, ymw0.class, "type.googleapis.com/google.crypto.tink.AesSivKey");
        c = new zqw0();
        d = new yqw0((byte) 9);
    }

    public static void a(zyw0 zyw0Var) {
        if (zyw0Var.f45226a != 64) {
            throw new InvalidAlgorithmParameterException(ua80.e(zyw0Var.f45226a, "invalid key size: ", ". Valid keys must have 64 bytes."));
        }
    }
}
