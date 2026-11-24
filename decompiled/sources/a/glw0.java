package a;

/* JADX INFO: loaded from: classes2.dex */
public final class glw0 extends jkw0 {
    private static final glw0 zzc;
    private static volatile alw0 zzd;
    private long zze;
    private int zzf;

    static {
        glw0 glw0Var = new glw0();
        zzc = glw0Var;
        jkw0.l(glw0.class, glw0Var);
    }

    public static flw0 x() {
        return (flw0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (hlw0.f13282a[i - 1]) {
            case 1:
                return new glw0();
            case 2:
                return new flw0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (glw0.class) {
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

    public final long w() {
        return this.zze;
    }
}
