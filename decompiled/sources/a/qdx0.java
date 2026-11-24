package a;

/* JADX INFO: loaded from: classes2.dex */
public final class qdx0 extends jkw0 {
    private static final qdx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private wdx0 zzf;
    private int zzg;
    private int zzh;

    static {
        qdx0 qdx0Var = new qdx0();
        zzc = qdx0Var;
        jkw0.l(qdx0.class, qdx0Var);
    }

    public static qdx0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (qdx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void w(qdx0 qdx0Var, wdx0 wdx0Var) {
        qdx0Var.zzf = wdx0Var;
        qdx0Var.zze |= 1;
    }

    public static odx0 y() {
        return (odx0) zzc.o();
    }

    public static qdx0 z() {
        return zzc;
    }

    public final wdx0 A() {
        wdx0 wdx0Var = this.zzf;
        return wdx0Var == null ? wdx0.y() : wdx0Var;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (tdx0.f33793a[i - 1]) {
            case 1:
                return new qdx0();
            case 2:
                return new odx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (qdx0.class) {
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

    public final int x() {
        return this.zzh;
    }
}
