package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ayw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6x0 f1690a = new y6x0(muw0.class, new epw0((byte) 22));
    public static final u6x0 b = new u6x0("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", new cpw0((byte) 22));
    public static final j5x0 c = new j5x0(cuw0.class, new tow0((byte) 23));
    public static final e5x0 d = new e5x0("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", new qow0((byte) 23));

    public static fhn a(lpw0 lpw0Var) throws GeneralSecurityException {
        fhn fhnVar = fhn.k;
        if (lpw0Var == lpw0.c) {
            return fhn.j;
        }
        if (lpw0Var == lpw0.f || lpw0Var == lpw0.d) {
            return fhnVar;
        }
        if (lpw0Var == lpw0.e) {
            return fhn.l;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
    }

    public static lpw0 b(fhn fhnVar) throws GeneralSecurityException {
        if (fhnVar == fhn.j) {
            return lpw0.c;
        }
        if (fhnVar == fhn.k) {
            return lpw0.f;
        }
        if (fhnVar == fhn.l) {
            return lpw0.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(fhnVar)));
    }
}
