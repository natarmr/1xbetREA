package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class tcx0 extends jkw0 {
    private static final tcx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private mcx0 zzg;
    private sjw0 zzh;
    private sjw0 zzi;

    static {
        tcx0 tcx0Var = new tcx0();
        zzc = tcx0Var;
        jkw0.l(tcx0.class, tcx0Var);
    }

    public tcx0() {
        vjw0 vjw0Var = sjw0.b;
        this.zzh = vjw0Var;
        this.zzi = vjw0Var;
    }

    public static /* synthetic */ void A(tcx0 tcx0Var, sjw0 sjw0Var) {
        Objects.requireNonNull(sjw0Var);
        tcx0Var.zzi = sjw0Var;
    }

    public static scx0 B() {
        return (scx0) zzc.o();
    }

    public static tcx0 C() {
        return zzc;
    }

    public static alw0 E() {
        return (alw0) zzc.h(7);
    }

    public static tcx0 v(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (tcx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void x(tcx0 tcx0Var, sjw0 sjw0Var) {
        Objects.requireNonNull(sjw0Var);
        tcx0Var.zzh = sjw0Var;
    }

    public static /* synthetic */ void y(tcx0 tcx0Var, mcx0 mcx0Var) {
        tcx0Var.zzg = mcx0Var;
        tcx0Var.zze |= 1;
    }

    public final sjw0 D() {
        return this.zzh;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (ucx0.f35452a[i - 1]) {
            case 1:
                return new tcx0();
            case 2:
                return new scx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (tcx0.class) {
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

    public final sjw0 t() {
        return this.zzi;
    }

    public final int u() {
        return this.zzf;
    }

    public final mcx0 z() {
        mcx0 mcx0Var = this.zzg;
        return mcx0Var == null ? mcx0.z() : mcx0Var;
    }
}
