package a;

/* JADX INFO: loaded from: classes2.dex */
public final class pax0 extends jkw0 {
    private static final pax0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private sax0 zzf;
    private int zzg;

    static {
        pax0 pax0Var = new pax0();
        zzc = pax0Var;
        jkw0.l(pax0.class, pax0Var);
    }

    public static /* synthetic */ void v(pax0 pax0Var, sax0 sax0Var) {
        pax0Var.zzf = sax0Var;
        pax0Var.zze |= 1;
    }

    public static oax0 w() {
        return (oax0) zzc.o();
    }

    public static pax0 x() {
        return zzc;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (nax0.f23213a[i - 1]) {
            case 1:
                return new pax0();
            case 2:
                return new oax0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (pax0.class) {
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

    public final sax0 y() {
        sax0 sax0Var = this.zzf;
        return sax0Var == null ? sax0.w() : sax0Var;
    }
}
