package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class dcx0 extends jkw0 {
    private static final dcx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private bfx0 zzf;

    static {
        dcx0 dcx0Var = new dcx0();
        zzc = dcx0Var;
        jkw0.l(dcx0.class, dcx0Var);
    }

    public static ccx0 t() {
        return (ccx0) zzc.o();
    }

    public static /* synthetic */ void u(dcx0 dcx0Var, bfx0 bfx0Var) {
        Objects.requireNonNull(bfx0Var);
        dcx0Var.zzf = bfx0Var;
        dcx0Var.zze |= 1;
    }

    public static dcx0 v() {
        return zzc;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (fcx0.f9332a[i - 1]) {
            case 1:
                return new dcx0();
            case 2:
                return new ccx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (dcx0.class) {
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

    public final bfx0 w() {
        bfx0 bfx0Var = this.zzf;
        return bfx0Var == null ? bfx0.z() : bfx0Var;
    }
}
