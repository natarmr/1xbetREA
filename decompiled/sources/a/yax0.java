package a;

/* JADX INFO: loaded from: classes2.dex */
public final class yax0 extends jkw0 {
    private static final yax0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private bbx0 zzf;
    private int zzg;

    static {
        yax0 yax0Var = new yax0();
        zzc = yax0Var;
        jkw0.l(yax0.class, yax0Var);
    }

    public static yax0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (yax0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void w(yax0 yax0Var, bbx0 bbx0Var) {
        yax0Var.zzf = bbx0Var;
        yax0Var.zze |= 1;
    }

    public static xax0 x() {
        return (xax0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (wax0.f38850a[i - 1]) {
            case 1:
                return new yax0();
            case 2:
                return new xax0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (yax0.class) {
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
        return this.zzg;
    }

    public final bbx0 y() {
        bbx0 bbx0Var = this.zzf;
        return bbx0Var == null ? bbx0.w() : bbx0Var;
    }
}
