package a;

/* JADX INFO: loaded from: classes2.dex */
public final class aax0 extends jkw0 {
    private static final aax0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private dax0 zzg;

    static {
        aax0 aax0Var = new aax0();
        zzc = aax0Var;
        jkw0.l(aax0.class, aax0Var);
    }

    public static aax0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (aax0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void w(aax0 aax0Var, dax0 dax0Var) {
        aax0Var.zzg = dax0Var;
        aax0Var.zze |= 1;
    }

    public static z9x0 x() {
        return (z9x0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (y9x0.f42270a[i - 1]) {
            case 1:
                return new aax0();
            case 2:
                return new z9x0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (aax0.class) {
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

    public final dax0 y() {
        dax0 dax0Var = this.zzg;
        return dax0Var == null ? dax0.w() : dax0Var;
    }
}
