package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ohx0 extends jkw0 {
    private static final ohx0 zzc;
    private static volatile alw0 zzd;
    private int zze;

    static {
        ohx0 ohx0Var = new ohx0();
        zzc = ohx0Var;
        jkw0.l(ohx0.class, ohx0Var);
    }

    public static ohx0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (ohx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static ohx0 v() {
        return zzc;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (qhx0.f28765a[i - 1]) {
            case 1:
                return new ohx0();
            case 2:
                return new acx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (ohx0.class) {
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
}
