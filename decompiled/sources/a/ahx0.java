package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ahx0 extends jkw0 {
    private static final ahx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private fhx0 zzg;

    static {
        ahx0 ahx0Var = new ahx0();
        zzc = ahx0Var;
        jkw0.l(ahx0.class, ahx0Var);
    }

    public static ahx0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (ahx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void v(ahx0 ahx0Var, fhx0 fhx0Var) {
        ahx0Var.zzg = fhx0Var;
        ahx0Var.zze |= 1;
    }

    public static ygx0 w() {
        return (ygx0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (chx0.f4384a[i - 1]) {
            case 1:
                return new ahx0();
            case 2:
                return new ygx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (ahx0.class) {
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

    public final fhx0 x() {
        fhx0 fhx0Var = this.zzg;
        return fhx0Var == null ? fhx0.w() : fhx0Var;
    }
}
