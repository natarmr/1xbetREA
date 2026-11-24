package a;

/* JADX INFO: loaded from: classes2.dex */
public final class dax0 extends jkw0 {
    private static final dax0 zzc;
    private static volatile alw0 zzd;
    private int zze;

    static {
        dax0 dax0Var = new dax0();
        zzc = dax0Var;
        jkw0.l(dax0.class, dax0Var);
    }

    public static cax0 v() {
        return (cax0) zzc.o();
    }

    public static dax0 w() {
        return zzc;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (bax0.f2280a[i - 1]) {
            case 1:
                return new dax0();
            case 2:
                return new cax0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (dax0.class) {
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
