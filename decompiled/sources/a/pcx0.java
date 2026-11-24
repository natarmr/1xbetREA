package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class pcx0 extends jkw0 {
    private static final pcx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private tcx0 zzg;
    private sjw0 zzh = sjw0.b;

    static {
        pcx0 pcx0Var = new pcx0();
        zzc = pcx0Var;
        jkw0.l(pcx0.class, pcx0Var);
    }

    public static alw0 B() {
        return (alw0) zzc.h(7);
    }

    public static pcx0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (pcx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void w(pcx0 pcx0Var, sjw0 sjw0Var) {
        Objects.requireNonNull(sjw0Var);
        pcx0Var.zzh = sjw0Var;
    }

    public static /* synthetic */ void x(pcx0 pcx0Var, tcx0 tcx0Var) {
        pcx0Var.zzg = tcx0Var;
        pcx0Var.zze |= 1;
    }

    public static ocx0 y() {
        return (ocx0) zzc.o();
    }

    public final sjw0 A() {
        return this.zzh;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (rcx0.f30262a[i - 1]) {
            case 1:
                return new pcx0();
            case 2:
                return new ocx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (pcx0.class) {
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

    public final tcx0 z() {
        tcx0 tcx0Var = this.zzg;
        return tcx0Var == null ? tcx0.C() : tcx0Var;
    }
}
