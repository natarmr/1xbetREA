package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class max0 extends jkw0 {
    private static final max0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private sax0 zzg;
    private sjw0 zzh = sjw0.b;

    static {
        max0 max0Var = new max0();
        zzc = max0Var;
        jkw0.l(max0.class, max0Var);
    }

    public static /* synthetic */ void u(max0 max0Var, vjw0 vjw0Var) {
        Objects.requireNonNull(vjw0Var);
        max0Var.zzh = vjw0Var;
    }

    public static /* synthetic */ void v(max0 max0Var, sax0 sax0Var) {
        max0Var.zzg = sax0Var;
        max0Var.zze |= 1;
    }

    public static lax0 w() {
        return (lax0) zzc.o();
    }

    public static max0 x() {
        return zzc;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (kax0.f17987a[i - 1]) {
            case 1:
                return new max0();
            case 2:
                return new lax0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (max0.class) {
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

    public final sax0 y() {
        sax0 sax0Var = this.zzg;
        return sax0Var == null ? sax0.w() : sax0Var;
    }

    public final sjw0 z() {
        return this.zzh;
    }
}
