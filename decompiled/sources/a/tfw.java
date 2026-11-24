package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tfw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vo80 f33885a;
    public static final uo80 b;
    public static final yky c;
    public static final rky d;

    static {
        sg9 sg9VarB = utt0.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f33885a = new vo80(qfw.class);
        b = new uo80(sg9VarB);
        c = new yky(mfw.class);
        d = new rky(sg9VarB, new ohq((byte) 11));
    }

    public static h70 a(jnv jnvVar) throws GeneralSecurityException {
        int iOrdinal = jnvVar.ordinal();
        if (iOrdinal == 1) {
            return h70.f;
        }
        if (iOrdinal == 2) {
            return h70.i;
        }
        if (iOrdinal == 3) {
            return h70.h;
        }
        if (iOrdinal == 4) {
            return h70.j;
        }
        if (iOrdinal == 5) {
            return h70.g;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + jnvVar.a());
    }

    public static pfw b(af80 af80Var) throws GeneralSecurityException {
        int iOrdinal = af80Var.ordinal();
        if (iOrdinal == 1) {
            return pfw.c;
        }
        if (iOrdinal == 2) {
            return pfw.e;
        }
        if (iOrdinal == 3) {
            return pfw.f;
        }
        if (iOrdinal == 4) {
            return pfw.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + af80Var.b());
    }
}
