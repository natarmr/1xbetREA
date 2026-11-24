package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fww0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6x0 f10281a = new y6x0(srw0.class, new zow0((byte) 20));
    public static final u6x0 b = new u6x0("type.googleapis.com/google.crypto.tink.AesGcmSivKey", new qow0((byte) 21));
    public static final j5x0 c = new j5x0(nrw0.class, new epw0((byte) 20));
    public static final e5x0 d = new e5x0("type.googleapis.com/google.crypto.tink.AesGcmSivKey", new tow0((byte) 21));

    public static m60 a(lpw0 lpw0Var) throws GeneralSecurityException {
        m60 m60Var = m60.i;
        if (lpw0Var == lpw0.c) {
            return m60.h;
        }
        if (lpw0Var == lpw0.f || lpw0Var == lpw0.d) {
            return m60Var;
        }
        if (lpw0Var == lpw0.e) {
            return m60.j;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
    }

    public static lpw0 b(m60 m60Var) {
        if (m60Var.equals(m60.h)) {
            return lpw0.c;
        }
        if (m60Var == m60.i) {
            return lpw0.f;
        }
        if (m60Var == m60.j) {
            return lpw0.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(m60Var)));
    }
}
