package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vo80 f33345a;
    public static final uo80 b;
    public static final yky c;
    public static final rky d;

    static {
        sg9 sg9VarB = utt0.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f33345a = new vo80(q50.class);
        b = new uo80(sg9VarB);
        c = new yky(j50.class);
        d = new rky(sg9VarB, new jf4((byte) 10));
    }

    public static p50 a(af80 af80Var) throws GeneralSecurityException {
        int iOrdinal = af80Var.ordinal();
        if (iOrdinal == 1) {
            return p50.c;
        }
        if (iOrdinal == 2) {
            return p50.e;
        }
        if (iOrdinal == 3) {
            return p50.f;
        }
        if (iOrdinal == 4) {
            return p50.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + af80Var.b());
    }
}
