package a;

/* JADX INFO: loaded from: classes2.dex */
public final class nbx0 extends jkw0 {
    private static final nbx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;

    static {
        nbx0 nbx0Var = new nbx0();
        zzc = nbx0Var;
        jkw0.l(nbx0.class, nbx0Var);
    }

    public static nbx0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (nbx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static mbx0 x() {
        return (mbx0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (lbx0.f19773a[i - 1]) {
            case 1:
                return new nbx0();
            case 2:
                return new mbx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (nbx0.class) {
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
        return this.zze;
    }

    public final int w() {
        return this.zzf;
    }
}
