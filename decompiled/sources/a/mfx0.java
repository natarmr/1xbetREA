package a;

import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class mfx0 extends jkw0 {
    private static final mfx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private mkw0 zzf = blw0.e;

    static {
        mfx0 mfx0Var = new mfx0();
        zzc = mfx0Var;
        jkw0.l(mfx0.class, mfx0Var);
    }

    public static mfx0 u(ByteArrayInputStream byteArrayInputStream, dkw0 dkw0Var) throws qkw0 {
        jkw0 jkw0VarD = jkw0.d(zzc, new xjw0(byteArrayInputStream), dkw0Var);
        jkw0.m(jkw0VarD);
        return (mfx0) jkw0VarD;
    }

    public static mfx0 v(byte[] bArr, dkw0 dkw0Var) {
        return (mfx0) jkw0.f(zzc, bArr, dkw0Var);
    }

    public static void x(mfx0 mfx0Var, jfx0 jfx0Var) {
        mkw0 mkw0VarC = mfx0Var.zzf;
        if (!((blw0) mkw0VarC).f2814a) {
            blw0 blw0Var = (blw0) mkw0VarC;
            mkw0VarC = blw0Var.c(blw0Var.c << 1);
            mfx0Var.zzf = mkw0VarC;
        }
        ((blw0) mkw0VarC).add(jfx0Var);
    }

    public static kfx0 z() {
        return (kfx0) zzc.o();
    }

    public final mkw0 A() {
        return this.zzf;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (hfx0.f12992a[i - 1]) {
            case 1:
                return new mfx0();
            case 2:
                return new kfx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", jfx0.class});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (mfx0.class) {
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
        return ((blw0) this.zzf).size();
    }

    public final int y() {
        return this.zze;
    }
}
