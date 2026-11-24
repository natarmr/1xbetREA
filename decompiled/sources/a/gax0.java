package a;

/* JADX INFO: loaded from: classes2.dex */
public final class gax0 extends jkw0 {
    private static final gax0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private max0 zzg;
    private ldx0 zzh;

    static {
        gax0 gax0Var = new gax0();
        zzc = gax0Var;
        jkw0.l(gax0.class, gax0Var);
    }

    public static alw0 A() {
        return (alw0) zzc.h(7);
    }

    public static gax0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (gax0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void v(gax0 gax0Var, max0 max0Var) {
        gax0Var.zzg = max0Var;
        gax0Var.zze |= 1;
    }

    public static /* synthetic */ void w(gax0 gax0Var, ldx0 ldx0Var) {
        gax0Var.zzh = ldx0Var;
        gax0Var.zze |= 2;
    }

    public static fax0 x() {
        return (fax0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (eax0.f7491a[i - 1]) {
            case 1:
                return new gax0();
            case 2:
                return new fax0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (gax0.class) {
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

    public final int t() {
        return this.zzf;
    }

    public final max0 y() {
        max0 max0Var = this.zzg;
        return max0Var == null ? max0.x() : max0Var;
    }

    public final ldx0 z() {
        ldx0 ldx0Var = this.zzh;
        return ldx0Var == null ? ldx0.z() : ldx0Var;
    }
}
