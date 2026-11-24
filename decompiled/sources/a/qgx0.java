package a;

/* JADX INFO: loaded from: classes2.dex */
public final class qgx0 extends jkw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28709a = 0;
    private static final qgx0 zzc;
    private static volatile alw0 zzd;
    private String zze = "";
    private mkw0 zzf = blw0.e;

    static {
        qgx0 qgx0Var = new qgx0();
        zzc = qgx0Var;
        jkw0.l(qgx0.class, qgx0Var);
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (sgx0.f32183a[i - 1]) {
            case 1:
                return new qgx0();
            case 2:
                return new acx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", ffx0.class});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (qgx0.class) {
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
