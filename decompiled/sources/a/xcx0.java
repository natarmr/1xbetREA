package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class xcx0 extends jkw0 {
    private static final xcx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private sjw0 zzg = sjw0.b;

    static {
        xcx0 xcx0Var = new xcx0();
        zzc = xcx0Var;
        jkw0.l(xcx0.class, xcx0Var);
    }

    public static vcx0 t() {
        return (vcx0) zzc.o();
    }

    public static /* synthetic */ void u(xcx0 xcx0Var, sjw0 sjw0Var) {
        Objects.requireNonNull(sjw0Var);
        xcx0Var.zzg = sjw0Var;
    }

    public static xcx0 x() {
        return zzc;
    }

    public final sjw0 A() {
        return this.zzg;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (cdx0.f4186a[i - 1]) {
            case 1:
                return new xcx0();
            case 2:
                return new vcx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (xcx0.class) {
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

    public final ddx0 y() {
        ddx0 ddx0Var;
        int i = this.zze;
        if (i == 0) {
            ddx0Var = ddx0.UNKNOWN_CURVE;
        } else if (i == 2) {
            ddx0Var = ddx0.NIST_P256;
        } else if (i == 3) {
            ddx0Var = ddx0.NIST_P384;
        } else if (i != 4) {
            ddx0Var = i != 5 ? null : ddx0.CURVE25519;
        } else {
            ddx0Var = ddx0.NIST_P521;
        }
        return ddx0Var == null ? ddx0.UNRECOGNIZED : ddx0Var;
    }

    public final mdx0 z() {
        mdx0 mdx0VarA = mdx0.a(this.zzf);
        return mdx0VarA == null ? mdx0.UNRECOGNIZED : mdx0VarA;
    }
}
