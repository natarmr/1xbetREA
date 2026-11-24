package a;

/* JADX INFO: loaded from: classes2.dex */
public final class bcx0 extends jkw0 {
    private static final bcx0 zzc;
    private static volatile alw0 zzd;

    static {
        bcx0 bcx0Var = new bcx0();
        zzc = bcx0Var;
        jkw0.l(bcx0.class, bcx0Var);
    }

    public static void t(sjw0 sjw0Var, dkw0 dkw0Var) {
    }

    public static bcx0 u() {
        return zzc;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (zbx0.f44140a[i - 1]) {
            case 1:
                return new bcx0();
            case 2:
                return new acx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0000", null);
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (bcx0.class) {
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
}
