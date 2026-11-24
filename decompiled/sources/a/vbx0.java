package a;

/* JADX INFO: loaded from: classes2.dex */
public final class vbx0 extends jkw0 {
    private static final vbx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;

    static {
        vbx0 vbx0Var = new vbx0();
        zzc = vbx0Var;
        jkw0.l(vbx0.class, vbx0Var);
    }

    public static vbx0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (vbx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static ubx0 x() {
        return (ubx0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (tbx0.f33691a[i - 1]) {
            case 1:
                return new vbx0();
            case 2:
                return new ubx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (vbx0.class) {
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
