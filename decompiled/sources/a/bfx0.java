package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class bfx0 extends jkw0 {
    private static final bfx0 zzc;
    private static volatile alw0 zzd;
    private String zze = "";
    private sjw0 zzf = sjw0.b;
    private int zzg;

    static {
        bfx0 bfx0Var = new bfx0();
        zzc = bfx0Var;
        jkw0.l(bfx0.class, bfx0Var);
    }

    public static zex0 t() {
        return (zex0) zzc.o();
    }

    public static zex0 u(bfx0 bfx0Var) {
        hkw0 hkw0VarO = zzc.o();
        hkw0VarO.a(bfx0Var);
        return (zex0) hkw0VarO;
    }

    public static bfx0 v(byte[] bArr, dkw0 dkw0Var) {
        return (bfx0) jkw0.f(zzc, bArr, dkw0Var);
    }

    public static /* synthetic */ void x(bfx0 bfx0Var, sjw0 sjw0Var) {
        Objects.requireNonNull(sjw0Var);
        bfx0Var.zzf = sjw0Var;
    }

    public static /* synthetic */ void y(bfx0 bfx0Var, String str) {
        Objects.requireNonNull(str);
        bfx0Var.zze = str;
    }

    public static bfx0 z() {
        return zzc;
    }

    public final int A() {
        int iF = esw0.f(this.zzg);
        if (iF == 0) {
            return 7;
        }
        return iF;
    }

    public final sjw0 B() {
        return this.zzf;
    }

    public final String C() {
        return this.zze;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (yex0.f42513a[i - 1]) {
            case 1:
                return new bfx0();
            case 2:
                return new zex0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (bfx0.class) {
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
