package a;

/* JADX INFO: loaded from: classes2.dex */
public final class hcx0 extends jkw0 {
    private static final hcx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private mcx0 zzf;

    static {
        hcx0 hcx0Var = new hcx0();
        zzc = hcx0Var;
        jkw0.l(hcx0.class, hcx0Var);
    }

    public static gcx0 t() {
        return (gcx0) zzc.o();
    }

    public static hcx0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (hcx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void v(hcx0 hcx0Var, mcx0 mcx0Var) {
        hcx0Var.zzf = mcx0Var;
        hcx0Var.zze |= 1;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (jcx0.f16302a[i - 1]) {
            case 1:
                return new hcx0();
            case 2:
                return new gcx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (hcx0.class) {
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

    public final mcx0 w() {
        mcx0 mcx0Var = this.zzf;
        return mcx0Var == null ? mcx0.z() : mcx0Var;
    }
}
