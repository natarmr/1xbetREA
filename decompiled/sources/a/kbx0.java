package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class kbx0 extends jkw0 {
    private static final kbx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private sjw0 zzf = sjw0.b;

    static {
        kbx0 kbx0Var = new kbx0();
        zzc = kbx0Var;
        jkw0.l(kbx0.class, kbx0Var);
    }

    public static kbx0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (kbx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void v(kbx0 kbx0Var, vjw0 vjw0Var) {
        Objects.requireNonNull(vjw0Var);
        kbx0Var.zzf = vjw0Var;
    }

    public static jbx0 w() {
        return (jbx0) zzc.o();
    }

    public static alw0 y() {
        return (alw0) zzc.h(7);
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (ibx0.f14511a[i - 1]) {
            case 1:
                return new kbx0();
            case 2:
                return new jbx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (kbx0.class) {
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
        return this.zze;
    }

    public final sjw0 x() {
        return this.zzf;
    }
}
