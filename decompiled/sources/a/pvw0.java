package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pvw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6x0 f27682a = new y6x0(mrw0.class, new qow0((byte) 20));
    public static final u6x0 b = new u6x0("type.googleapis.com/google.crypto.tink.AesGcmKey", new epw0((byte) 19));
    public static final j5x0 c = new j5x0(krw0.class, new vow0((byte) 20));
    public static final e5x0 d = new e5x0("type.googleapis.com/google.crypto.tink.AesGcmKey", new tow0((byte) 20));

    public static p50 a(lpw0 lpw0Var) throws GeneralSecurityException {
        p50 p50Var = p50.j;
        if (lpw0Var == lpw0.c) {
            return p50.i;
        }
        if (lpw0Var == lpw0.f || lpw0Var == lpw0.d) {
            return p50Var;
        }
        if (lpw0Var == lpw0.e) {
            return p50.k;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
    }

    public static lpw0 b(p50 p50Var) {
        if (p50Var.equals(p50.i)) {
            return lpw0.c;
        }
        if (p50Var == p50.j) {
            return lpw0.f;
        }
        if (p50Var == p50.k) {
            return lpw0.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(p50Var)));
    }

    public static void c(mrw0 mrw0Var) {
        int i = mrw0Var.c;
        int i2 = mrw0Var.b;
        if (i != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(mrw0Var.c)));
        }
        if (i2 != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(i2)));
        }
    }
}
