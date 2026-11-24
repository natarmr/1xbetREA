package a;

/* JADX INFO: loaded from: classes2.dex */
public final class jex0 extends jkw0 {
    private static final jex0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        jex0 jex0Var = new jex0();
        zzc = jex0Var;
        jkw0.l(jex0.class, jex0Var);
    }

    public static jex0 A() {
        return zzc;
    }

    public static iex0 z() {
        return (iex0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (hex0.f12947a[i - 1]) {
            case 1:
                return new jex0();
            case 2:
                return new iex0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (jex0.class) {
                    try {
                        ikw0Var = zzd;
                        if (ikw0Var == null) {
                            ikw0Var = new ikw0();
                            zzd = ikw0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return ikw0Var;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final aex0 t() {
        aex0 aex0Var;
        int i = this.zzg;
        if (i == 0) {
            aex0Var = aex0.AEAD_UNKNOWN;
        } else if (i == 1) {
            aex0Var = aex0.AES_128_GCM;
        } else if (i != 2) {
            aex0Var = i != 3 ? null : aex0.CHACHA20_POLY1305;
        } else {
            aex0Var = aex0.AES_256_GCM;
        }
        return aex0Var == null ? aex0.UNRECOGNIZED : aex0Var;
    }

    public final dex0 x() {
        dex0 dex0Var;
        int i = this.zzf;
        if (i == 0) {
            dex0Var = dex0.KDF_UNKNOWN;
        } else if (i == 1) {
            dex0Var = dex0.HKDF_SHA256;
        } else if (i != 2) {
            dex0Var = i != 3 ? null : dex0.HKDF_SHA512;
        } else {
            dex0Var = dex0.HKDF_SHA384;
        }
        return dex0Var == null ? dex0.UNRECOGNIZED : dex0Var;
    }

    public final cex0 y() {
        cex0 cex0Var;
        switch (this.zze) {
            case 0:
                cex0Var = cex0.KEM_UNKNOWN;
                break;
            case 1:
                cex0Var = cex0.DHKEM_X25519_HKDF_SHA256;
                break;
            case 2:
                cex0Var = cex0.DHKEM_P256_HKDF_SHA256;
                break;
            case 3:
                cex0Var = cex0.DHKEM_P384_HKDF_SHA384;
                break;
            case 4:
                cex0Var = cex0.DHKEM_P521_HKDF_SHA512;
                break;
            case 5:
                cex0Var = cex0.X_WING;
                break;
            case 6:
                cex0Var = cex0.ML_KEM768;
                break;
            case 7:
                cex0Var = cex0.ML_KEM1024;
                break;
            default:
                cex0Var = null;
                break;
        }
        return cex0Var == null ? cex0.UNRECOGNIZED : cex0Var;
    }
}
