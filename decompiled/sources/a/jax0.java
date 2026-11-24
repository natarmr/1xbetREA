package a;

/* JADX INFO: loaded from: classes2.dex */
public final class jax0 extends jkw0 {
    private static final jax0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private pax0 zzf;
    private qdx0 zzg;

    static {
        jax0 jax0Var = new jax0();
        zzc = jax0Var;
        jkw0.l(jax0.class, jax0Var);
    }

    public static iax0 t() {
        return (iax0) zzc.o();
    }

    public static jax0 u(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (jax0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void v(jax0 jax0Var, pax0 pax0Var) {
        jax0Var.zzf = pax0Var;
        jax0Var.zze |= 1;
    }

    public static /* synthetic */ void w(jax0 jax0Var, qdx0 qdx0Var) {
        jax0Var.zzg = qdx0Var;
        jax0Var.zze |= 2;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (hax0.f12747a[i - 1]) {
            case 1:
                return new jax0();
            case 2:
                return new iax0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (jax0.class) {
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

    public final pax0 x() {
        pax0 pax0Var = this.zzf;
        return pax0Var == null ? pax0.x() : pax0Var;
    }

    public final qdx0 y() {
        qdx0 qdx0Var = this.zzg;
        return qdx0Var == null ? qdx0.z() : qdx0Var;
    }
}
