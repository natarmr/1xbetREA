package a;

/* JADX INFO: loaded from: classes2.dex */
public final class sax0 extends jkw0 {
    private static final sax0 zzc;
    private static volatile alw0 zzd;
    private int zze;

    static {
        sax0 sax0Var = new sax0();
        zzc = sax0Var;
        jkw0.l(sax0.class, sax0Var);
    }

    public static rax0 v() {
        return (rax0) zzc.o();
    }

    public static sax0 w() {
        return zzc;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (qax0.f28420a[i - 1]) {
            case 1:
                return new sax0();
            case 2:
                return new rax0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (sax0.class) {
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
}
