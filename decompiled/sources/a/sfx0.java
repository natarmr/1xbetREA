package a;

/* JADX INFO: loaded from: classes2.dex */
public final class sfx0 extends jkw0 {
    private static final sfx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private mkw0 zzf = blw0.e;

    static {
        sfx0 sfx0Var = new sfx0();
        zzc = sfx0Var;
        jkw0.l(sfx0.class, sfx0Var);
    }

    public static void u(sfx0 sfx0Var, qfx0 qfx0Var) {
        mkw0 mkw0VarC = sfx0Var.zzf;
        if (!((blw0) mkw0VarC).f2814a) {
            blw0 blw0Var = (blw0) mkw0VarC;
            mkw0VarC = blw0Var.c(blw0Var.c << 1);
            sfx0Var.zzf = mkw0VarC;
        }
        ((blw0) mkw0VarC).add(qfx0Var);
    }

    public static rfx0 v() {
        return (rfx0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (ofx0.f25189a[i - 1]) {
            case 1:
                return new sfx0();
            case 2:
                return new rfx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", qfx0.class});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (sfx0.class) {
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
