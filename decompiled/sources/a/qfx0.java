package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class qfx0 extends jkw0 {
    private static final qfx0 zzc;
    private static volatile alw0 zzd;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        qfx0 qfx0Var = new qfx0();
        zzc = qfx0Var;
        jkw0.l(qfx0.class, qfx0Var);
    }

    public static /* synthetic */ void u(qfx0 qfx0Var, String str) {
        Objects.requireNonNull(str);
        qfx0Var.zze = str;
    }

    public static pfx0 x() {
        return (pfx0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (ofx0.f25189a[i - 1]) {
            case 1:
                return new qfx0();
            case 2:
                return new pfx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (qfx0.class) {
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
}
