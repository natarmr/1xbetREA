package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class x9x0 extends jkw0 {
    private static final x9x0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private sjw0 zzg = sjw0.b;
    private dax0 zzh;

    static {
        x9x0 x9x0Var = new x9x0();
        zzc = x9x0Var;
        jkw0.l(x9x0.class, x9x0Var);
    }

    public static alw0 A() {
        return (alw0) zzc.h(7);
    }

    public static x9x0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (x9x0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void v(x9x0 x9x0Var, vjw0 vjw0Var) {
        Objects.requireNonNull(vjw0Var);
        x9x0Var.zzg = vjw0Var;
    }

    public static /* synthetic */ void w(x9x0 x9x0Var, dax0 dax0Var) {
        x9x0Var.zzh = dax0Var;
        x9x0Var.zze |= 1;
    }

    public static w9x0 x() {
        return (w9x0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (v9x0.f37056a[i - 1]) {
            case 1:
                return new x9x0();
            case 2:
                return new w9x0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (x9x0.class) {
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

    public final dax0 y() {
        dax0 dax0Var = this.zzh;
        return dax0Var == null ? dax0.w() : dax0Var;
    }

    public final sjw0 z() {
        return this.zzg;
    }
}
