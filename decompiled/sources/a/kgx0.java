package a;

/* JADX INFO: loaded from: classes2.dex */
public final class kgx0 extends jkw0 {
    private static final kgx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private ogx0 zzg;

    static {
        kgx0 kgx0Var = new kgx0();
        zzc = kgx0Var;
        jkw0.l(kgx0.class, kgx0Var);
    }

    public static kgx0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (kgx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void v(kgx0 kgx0Var, ogx0 ogx0Var) {
        kgx0Var.zzg = ogx0Var;
        kgx0Var.zze |= 1;
    }

    public static igx0 w() {
        return (igx0) zzc.o();
    }

    public static alw0 y() {
        return (alw0) zzc.h(7);
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (hgx0.f13035a[i - 1]) {
            case 1:
                return new kgx0();
            case 2:
                return new igx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (kgx0.class) {
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

    public final ogx0 x() {
        ogx0 ogx0Var = this.zzg;
        return ogx0Var == null ? ogx0.y() : ogx0Var;
    }
}
