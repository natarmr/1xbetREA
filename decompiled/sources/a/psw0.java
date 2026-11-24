package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class psw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6x0 f27535a = new y6x0(msw0.class, new tow0((byte) 15));
    public static final u6x0 b = new u6x0("type.googleapis.com/google.crypto.tink.KmsAeadKey", new epw0((byte) 14));
    public static final j5x0 c = new j5x0(osw0.class, new epw0((byte) 15));
    public static final e5x0 d = new e5x0("type.googleapis.com/google.crypto.tink.KmsAeadKey", new zow0((byte) 15));

    public static lpw0 a(h70 h70Var) {
        if (h70Var == h70.k) {
            return lpw0.c;
        }
        if (h70Var == h70.l) {
            return lpw0.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(h70Var)));
    }
}
