package a;

/* JADX INFO: loaded from: classes2.dex */
public final class jfx0 extends jkw0 {
    private static final jfx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private wex0 zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        jfx0 jfx0Var = new jfx0();
        zzc = jfx0Var;
        jkw0.l(jfx0.class, jfx0Var);
    }

    public static ifx0 B() {
        return (ifx0) zzc.o();
    }

    public static /* synthetic */ void w(jfx0 jfx0Var, wex0 wex0Var) {
        jfx0Var.zzf = wex0Var;
        jfx0Var.zze |= 1;
    }

    public final int A() {
        int i = this.zzg;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    i2 = i != 3 ? 0 : 4;
                }
            } else {
                i2 = 2;
            }
        }
        if (i2 == 0) {
            return 5;
        }
        return i2;
    }

    public final int C() {
        int iF = esw0.f(this.zzi);
        if (iF == 0) {
            return 7;
        }
        return iF;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (hfx0.f12992a[i - 1]) {
            case 1:
                return new jfx0();
            case 2:
                return new ifx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (jfx0.class) {
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

    public final boolean t() {
        return (this.zze & 1) != 0;
    }

    public final int u() {
        return this.zzh;
    }

    public final wex0 z() {
        wex0 wex0Var = this.zzf;
        return wex0Var == null ? wex0.y() : wex0Var;
    }
}
