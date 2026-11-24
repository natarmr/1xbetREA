package a;

/* JADX INFO: loaded from: classes2.dex */
public final class wfx0 extends jkw0 {
    private static final wfx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private bgx0 zzg;

    static {
        wfx0 wfx0Var = new wfx0();
        zzc = wfx0Var;
        jkw0.l(wfx0.class, wfx0Var);
    }

    public static wfx0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (wfx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void v(wfx0 wfx0Var, bgx0 bgx0Var) {
        wfx0Var.zzg = bgx0Var;
        wfx0Var.zze |= 1;
    }

    public static vfx0 w() {
        return (vfx0) zzc.o();
    }

    public static alw0 y() {
        return (alw0) zzc.h(7);
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (ufx0.f35596a[i - 1]) {
            case 1:
                return new wfx0();
            case 2:
                return new vfx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (wfx0.class) {
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

    public final bgx0 x() {
        bgx0 bgx0Var = this.zzg;
        return bgx0Var == null ? bgx0.w() : bgx0Var;
    }
}
