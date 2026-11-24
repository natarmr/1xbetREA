package a;

/* JADX INFO: loaded from: classes2.dex */
public final class hbx0 extends jkw0 {
    private static final hbx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;

    static {
        hbx0 hbx0Var = new hbx0();
        zzc = hbx0Var;
        jkw0.l(hbx0.class, hbx0Var);
    }

    public static hbx0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (hbx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static gbx0 x() {
        return (gbx0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (fbx0.f9282a[i - 1]) {
            case 1:
                return new hbx0();
            case 2:
                return new gbx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (hbx0.class) {
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
