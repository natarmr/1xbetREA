package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ldx0 extends jkw0 {
    private static final ldx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private wdx0 zzg;
    private sjw0 zzh = sjw0.b;

    static {
        ldx0 ldx0Var = new ldx0();
        zzc = ldx0Var;
        jkw0.l(ldx0.class, ldx0Var);
    }

    public static alw0 t() {
        return (alw0) zzc.h(7);
    }

    public static ldx0 v(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (ldx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void w(ldx0 ldx0Var, sjw0 sjw0Var) {
        Objects.requireNonNull(sjw0Var);
        ldx0Var.zzh = sjw0Var;
    }

    public static /* synthetic */ void x(ldx0 ldx0Var, wdx0 wdx0Var) {
        ldx0Var.zzg = wdx0Var;
        ldx0Var.zze |= 1;
    }

    public static jdx0 y() {
        return (jdx0) zzc.o();
    }

    public static ldx0 z() {
        return zzc;
    }

    public final wdx0 A() {
        wdx0 wdx0Var = this.zzg;
        return wdx0Var == null ? wdx0.y() : wdx0Var;
    }

    public final sjw0 B() {
        return this.zzh;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (ndx0.f23355a[i - 1]) {
            case 1:
                return new ldx0();
            case 2:
                return new jdx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (ldx0.class) {
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

    public final int u() {
        return this.zzf;
    }
}
