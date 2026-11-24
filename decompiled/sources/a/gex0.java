package a;

/* JADX INFO: loaded from: classes2.dex */
public final class gex0 extends jkw0 {
    private static final gex0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private jex0 zzf;

    static {
        gex0 gex0Var = new gex0();
        zzc = gex0Var;
        jkw0.l(gex0.class, gex0Var);
    }

    public static gex0 t(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (gex0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void u(gex0 gex0Var, jex0 jex0Var) {
        gex0Var.zzf = jex0Var;
        gex0Var.zze |= 1;
    }

    public static fex0 v() {
        return (fex0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (eex0.f7696a[i - 1]) {
            case 1:
                return new gex0();
            case 2:
                return new fex0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (gex0.class) {
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

    public final jex0 w() {
        jex0 jex0Var = this.zzf;
        return jex0Var == null ? jex0.A() : jex0Var;
    }
}
