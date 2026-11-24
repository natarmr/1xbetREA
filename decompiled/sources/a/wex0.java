package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class wex0 extends jkw0 {
    private static final wex0 zzc;
    private static volatile alw0 zzd;
    private String zze = "";
    private sjw0 zzf = sjw0.b;
    private int zzg;

    static {
        wex0 wex0Var = new wex0();
        zzc = wex0Var;
        jkw0.l(wex0.class, wex0Var);
    }

    public static vex0 t() {
        return (vex0) zzc.o();
    }

    public static void u(wex0 wex0Var, int i) {
        int i2;
        if (i == 6) {
            lkw0.c();
            throw null;
        }
        switch (i) {
            case 1:
                i2 = 0;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = -1;
                break;
            default:
                throw null;
        }
        wex0Var.zzg = i2;
    }

    public static /* synthetic */ void v(wex0 wex0Var, sjw0 sjw0Var) {
        Objects.requireNonNull(sjw0Var);
        wex0Var.zzf = sjw0Var;
    }

    public static /* synthetic */ void w(wex0 wex0Var, String str) {
        Objects.requireNonNull(str);
        wex0Var.zze = str;
    }

    public static wex0 y() {
        return zzc;
    }

    public final String A() {
        return this.zze;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (uex0.f35553a[i - 1]) {
            case 1:
                return new wex0();
            case 2:
                return new vex0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (wex0.class) {
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

    /* JADX WARN: Code duplicated, block: B:13:0x0014 A[PHI: r1
  0x0014: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:5:0x0006, B:9:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    public final int x() {
        int i = this.zzg;
        int i2 = 1;
        if (i != 0) {
            int i3 = 2;
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    i3 = 4;
                    if (i != 3) {
                        i2 = i != 4 ? 0 : 5;
                    } else {
                        i2 = i3;
                    }
                }
            } else {
                i2 = i3;
            }
        }
        if (i2 == 0) {
            return 6;
        }
        return i2;
    }

    public final sjw0 z() {
        return this.zzf;
    }
}
