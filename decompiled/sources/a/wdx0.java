package a;

/* JADX INFO: loaded from: classes2.dex */
public final class wdx0 extends jkw0 {
    private static final wdx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;

    static {
        wdx0 wdx0Var = new wdx0();
        zzc = wdx0Var;
        jkw0.l(wdx0.class, wdx0Var);
    }

    public static udx0 x() {
        return (udx0) zzc.o();
    }

    public static wdx0 y() {
        return zzc;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (ydx0.f42461a[i - 1]) {
            case 1:
                return new wdx0();
            case 2:
                return new udx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (wdx0.class) {
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

    public final mdx0 w() {
        mdx0 mdx0VarA = mdx0.a(this.zze);
        return mdx0VarA == null ? mdx0.UNRECOGNIZED : mdx0VarA;
    }
}
