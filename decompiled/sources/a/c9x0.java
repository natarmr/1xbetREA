package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c9x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6x0 f3983a = new y6x0(g8x0.class, new c8x0(1));
    public static final u6x0 b = new u6x0("type.googleapis.com/google.crypto.tink.AesCmacKey", new k8x0());
    public static final j5x0 c = new j5x0(v7x0.class, new d8x0());
    public static final e5x0 d = new e5x0("type.googleapis.com/google.crypto.tink.AesCmacKey", new m8x0());

    public static hbb a(lpw0 lpw0Var) throws GeneralSecurityException {
        if (lpw0Var == lpw0.c) {
            return hbb.p;
        }
        if (lpw0Var == lpw0.f) {
            return hbb.q;
        }
        if (lpw0Var == lpw0.d) {
            return hbb.r;
        }
        if (lpw0Var == lpw0.e) {
            return hbb.s;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
    }

    public static lpw0 b(hbb hbbVar) throws GeneralSecurityException {
        if (hbbVar.equals(hbb.p)) {
            return lpw0.c;
        }
        if (hbbVar == hbb.q) {
            return lpw0.f;
        }
        if (hbbVar == hbb.s) {
            return lpw0.e;
        }
        if (hbbVar == hbb.r) {
            return lpw0.d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(hbbVar)));
    }
}
