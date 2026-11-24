package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class qex0 extends jkw0 {
    private static final qex0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private tex0 zzg;
    private sjw0 zzh = sjw0.b;

    static {
        qex0 qex0Var = new qex0();
        zzc = qex0Var;
        jkw0.l(qex0.class, qex0Var);
    }

    public static alw0 B() {
        return (alw0) zzc.h(7);
    }

    public static qex0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (qex0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void w(qex0 qex0Var, vjw0 vjw0Var) {
        Objects.requireNonNull(vjw0Var);
        qex0Var.zzh = vjw0Var;
    }

    public static /* synthetic */ void x(qex0 qex0Var, tex0 tex0Var) {
        qex0Var.zzg = tex0Var;
        qex0Var.zze |= 1;
    }

    public static oex0 y() {
        return (oex0) zzc.o();
    }

    public final sjw0 A() {
        return this.zzh;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (kex0.f18171a[i - 1]) {
            case 1:
                return new qex0();
            case 2:
                return new oex0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (qex0.class) {
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

    public final tex0 z() {
        tex0 tex0Var = this.zzg;
        return tex0Var == null ? tex0.B() : tex0Var;
    }
}
