package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ruw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6x0 f31145a = new y6x0(brw0.class, new vow0((byte) 18));
    public static final u6x0 b = new u6x0("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", new cpw0((byte) 18));
    public static final j5x0 c = new j5x0(uqw0.class, new zow0((byte) 18));
    public static final e5x0 d = new e5x0("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", new epw0((byte) 18));

    public static fhn a(mdx0 mdx0Var) throws GeneralSecurityException {
        int i = yuw0.f43290a[mdx0Var.ordinal()];
        if (i == 1) {
            return fhn.e;
        }
        if (i == 2) {
            return fhn.f;
        }
        if (i == 3) {
            return fhn.g;
        }
        if (i == 4) {
            return fhn.h;
        }
        if (i == 5) {
            return fhn.i;
        }
        throw new GeneralSecurityException(twn.m(mdx0Var.zza(), "Unable to parse HashType: "));
    }

    public static lpw0 b(arw0 arw0Var) {
        if (arw0Var.equals(arw0.c)) {
            return lpw0.c;
        }
        if (arw0Var == arw0.d) {
            return lpw0.f;
        }
        if (arw0Var == arw0.e) {
            return lpw0.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(arw0Var)));
    }

    public static arw0 c(lpw0 lpw0Var) throws GeneralSecurityException {
        arw0 arw0Var = arw0.d;
        if (lpw0Var == lpw0.c) {
            return arw0.c;
        }
        if (lpw0Var == lpw0.f || lpw0Var == lpw0.d) {
            return arw0Var;
        }
        if (lpw0Var == lpw0.e) {
            return arw0.e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
    }

    public static wdx0 d(brw0 brw0Var) {
        mdx0 mdx0Var;
        udx0 udx0VarX = wdx0.x();
        int i = brw0Var.d;
        udx0VarX.d();
        ((wdx0) udx0VarX.b).zzf = i;
        fhn fhnVar = brw0Var.f;
        if (fhnVar.equals(fhn.e)) {
            mdx0Var = mdx0.SHA1;
        } else if (fhnVar == fhn.f) {
            mdx0Var = mdx0.SHA224;
        } else if (fhnVar == fhn.g) {
            mdx0Var = mdx0.SHA256;
        } else if (fhnVar == fhn.h) {
            mdx0Var = mdx0.SHA384;
        } else {
            if (fhnVar != fhn.i) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(fhnVar)));
            }
            mdx0Var = mdx0.SHA512;
        }
        udx0VarX.d();
        ((wdx0) udx0VarX.b).zze = mdx0Var.zza();
        return (wdx0) udx0VarX.c();
    }
}
