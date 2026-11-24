package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class bgx0 extends jkw0 {
    private static final bgx0 zzc;
    private static volatile alw0 zzd;
    private String zze = "";

    static {
        bgx0 bgx0Var = new bgx0();
        zzc = bgx0Var;
        jkw0.l(bgx0.class, bgx0Var);
    }

    public static agx0 t() {
        return (agx0) zzc.o();
    }

    public static bgx0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (bgx0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void v(bgx0 bgx0Var, String str) {
        Objects.requireNonNull(str);
        bgx0Var.zze = str;
    }

    public static bgx0 w() {
        return zzc;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (zfx0.f44320a[i - 1]) {
            case 1:
                return new bgx0();
            case 2:
                return new agx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (bgx0.class) {
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

    public final String x() {
        return this.zze;
    }
}
