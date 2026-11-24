package a;

/* JADX INFO: loaded from: classes2.dex */
public final class mcx0 extends jkw0 {
    private static final mcx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private xcx0 zzf;
    private dcx0 zzg;
    private int zzh;

    static {
        mcx0 mcx0Var = new mcx0();
        zzc = mcx0Var;
        jkw0.l(mcx0.class, mcx0Var);
    }

    public static /* synthetic */ void u(mcx0 mcx0Var, dcx0 dcx0Var) {
        mcx0Var.zzg = dcx0Var;
        mcx0Var.zze |= 2;
    }

    public static /* synthetic */ void w(mcx0 mcx0Var, xcx0 xcx0Var) {
        mcx0Var.zzf = xcx0Var;
        mcx0Var.zze |= 1;
    }

    public static kcx0 y() {
        return (kcx0) zzc.o();
    }

    public static mcx0 z() {
        return zzc;
    }

    public final xcx0 A() {
        xcx0 xcx0Var = this.zzf;
        return xcx0Var == null ? xcx0.x() : xcx0Var;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (ncx0.f23315a[i - 1]) {
            case 1:
                return new mcx0();
            case 2:
                return new kcx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (mcx0.class) {
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

    public final ecx0 t() {
        ecx0 ecx0Var;
        int i = this.zzh;
        if (i == 0) {
            ecx0Var = ecx0.UNKNOWN_FORMAT;
        } else if (i == 1) {
            ecx0Var = ecx0.UNCOMPRESSED;
        } else if (i != 2) {
            ecx0Var = i != 3 ? null : ecx0.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        } else {
            ecx0Var = ecx0.COMPRESSED;
        }
        return ecx0Var == null ? ecx0.UNRECOGNIZED : ecx0Var;
    }

    public final dcx0 x() {
        dcx0 dcx0Var = this.zzg;
        return dcx0Var == null ? dcx0.v() : dcx0Var;
    }
}
