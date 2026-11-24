package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ogx0 extends jkw0 {
    private static final ogx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private String zzf = "";
    private bfx0 zzg;

    static {
        ogx0 ogx0Var = new ogx0();
        zzc = ogx0Var;
        jkw0.l(ogx0.class, ogx0Var);
    }

    public static ogx0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (ogx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void v(ogx0 ogx0Var, bfx0 bfx0Var) {
        Objects.requireNonNull(bfx0Var);
        ogx0Var.zzg = bfx0Var;
        ogx0Var.zze |= 1;
    }

    public static /* synthetic */ void w(ogx0 ogx0Var, String str) {
        Objects.requireNonNull(str);
        ogx0Var.zzf = str;
    }

    public static ngx0 x() {
        return (ngx0) zzc.o();
    }

    public static ogx0 y() {
        return zzc;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (mgx0.f21763a[i - 1]) {
            case 1:
                return new ogx0();
            case 2:
                return new ngx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (ogx0.class) {
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

    public final bfx0 t() {
        bfx0 bfx0Var = this.zzg;
        return bfx0Var == null ? bfx0.z() : bfx0Var;
    }

    public final String z() {
        return this.zzf;
    }
}
