package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rww0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6x0 f31235a = new y6x0(vrw0.class, new vow0((byte) 21));
    public static final u6x0 b = new u6x0("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", new cpw0((byte) 21));
    public static final j5x0 c = new j5x0(trw0.class, new zow0((byte) 21));
    public static final e5x0 d = new e5x0("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", new epw0((byte) 21));

    public static y60 a(lpw0 lpw0Var) throws GeneralSecurityException {
        y60 y60Var = y60.l;
        if (lpw0Var == lpw0.c) {
            return y60.k;
        }
        if (lpw0Var == lpw0.f || lpw0Var == lpw0.d) {
            return y60Var;
        }
        if (lpw0Var == lpw0.e) {
            return y60.m;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
    }

    public static lpw0 b(y60 y60Var) throws GeneralSecurityException {
        if (y60Var == y60.k) {
            return lpw0.c;
        }
        if (y60Var == y60.l) {
            return lpw0.f;
        }
        if (y60Var == y60.m) {
            return lpw0.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(y60Var)));
    }
}
