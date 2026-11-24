package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class vax0 extends jkw0 {
    private static final vax0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private bbx0 zzg;
    private sjw0 zzh = sjw0.b;

    static {
        vax0 vax0Var = new vax0();
        zzc = vax0Var;
        jkw0.l(vax0.class, vax0Var);
    }

    public static alw0 A() {
        return (alw0) zzc.h(7);
    }

    public static vax0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (vax0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void v(vax0 vax0Var, vjw0 vjw0Var) {
        Objects.requireNonNull(vjw0Var);
        vax0Var.zzh = vjw0Var;
    }

    public static /* synthetic */ void w(vax0 vax0Var, bbx0 bbx0Var) {
        vax0Var.zzg = bbx0Var;
        vax0Var.zze |= 1;
    }

    public static uax0 x() {
        return (uax0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (tax0.f33635a[i - 1]) {
            case 1:
                return new vax0();
            case 2:
                return new uax0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (vax0.class) {
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

    public final bbx0 y() {
        bbx0 bbx0Var = this.zzg;
        return bbx0Var == null ? bbx0.w() : bbx0Var;
    }

    public final sjw0 z() {
        return this.zzh;
    }
}
