package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ugx0 extends jkw0 {
    private static final ugx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private fhx0 zzg;
    private sjw0 zzh = sjw0.b;

    static {
        ugx0 ugx0Var = new ugx0();
        zzc = ugx0Var;
        jkw0.l(ugx0.class, ugx0Var);
    }

    public static ugx0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (ugx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void v(ugx0 ugx0Var, vjw0 vjw0Var) {
        Objects.requireNonNull(vjw0Var);
        ugx0Var.zzh = vjw0Var;
    }

    public static /* synthetic */ void w(ugx0 ugx0Var, fhx0 fhx0Var) {
        ugx0Var.zzg = fhx0Var;
        ugx0Var.zze |= 1;
    }

    public static tgx0 x() {
        return (tgx0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (xgx0.f40862a[i - 1]) {
            case 1:
                return new ugx0();
            case 2:
                return new tgx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (ugx0.class) {
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

    public final fhx0 y() {
        fhx0 fhx0Var = this.zzg;
        return fhx0Var == null ? fhx0.w() : fhx0Var;
    }

    public final sjw0 z() {
        return this.zzh;
    }
}
