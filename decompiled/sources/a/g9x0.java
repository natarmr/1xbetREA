package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g9x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final okt0 f10938a;
    public static final y6x0 b;
    public static final u6x0 c;
    public static final j5x0 d;
    public static final e5x0 e;

    static {
        fck0 fck0VarL = okt0.l();
        fck0VarL.A(mdx0.SHA1, o8x0.b);
        fck0VarL.A(mdx0.SHA224, o8x0.c);
        fck0VarL.A(mdx0.SHA256, o8x0.d);
        fck0VarL.A(mdx0.SHA384, o8x0.e);
        fck0VarL.A(mdx0.SHA512, o8x0.f);
        f10938a = fck0VarL.p();
        b = new y6x0(p8x0.class, new c8x0((byte) 2));
        c = new u6x0("type.googleapis.com/google.crypto.tink.HmacKey", new s6x0());
        d = new j5x0(h8x0.class, new k8x0());
        e = new e5x0("type.googleapis.com/google.crypto.tink.HmacKey", new d8x0());
    }

    public static lpw0 a(arw0 arw0Var) {
        if (arw0Var == arw0.k) {
            return lpw0.e;
        }
        if (arw0Var == arw0.h) {
            return lpw0.c;
        }
        if (arw0Var == arw0.j) {
            return lpw0.d;
        }
        if (arw0Var == arw0.i) {
            return lpw0.f;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(arw0Var)));
    }

    public static arw0 b(lpw0 lpw0Var) throws GeneralSecurityException {
        if (lpw0Var == lpw0.e) {
            return arw0.k;
        }
        if (lpw0Var == lpw0.c) {
            return arw0.h;
        }
        if (lpw0Var == lpw0.d) {
            return arw0.j;
        }
        if (lpw0Var == lpw0.f) {
            return arw0.i;
        }
        throw new GeneralSecurityException("unknown OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
    }
}
