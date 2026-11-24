package a;

/* JADX INFO: loaded from: classes2.dex */
public final class f4x0 extends mew0 {
    private static final f4x0 zzg;
    private static volatile yfw0 zzh;
    private int zzb;
    private w3x0 zze;
    private y3x0 zzf;

    static {
        f4x0 f4x0Var = new f4x0();
        zzg = f4x0Var;
        mew0.m(f4x0.class, f4x0Var);
    }

    public static f4x0 t(byte[] bArr, bew0 bew0Var) {
        return (f4x0) mew0.c(zzg, bArr, bew0Var);
    }

    public static e4x0 u() {
        return (e4x0) zzg.h();
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new f4x0();
        }
        if (i2 == 4) {
            return new e4x0(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzh;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (f4x0.class) {
            try {
                jew0Var = zzh;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzg);
                    zzh = jew0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jew0Var;
    }

    public final w3x0 r() {
        w3x0 w3x0Var = this.zze;
        return w3x0Var == null ? w3x0.F() : w3x0Var;
    }

    public final y3x0 s() {
        y3x0 y3x0Var = this.zzf;
        return y3x0Var == null ? y3x0.r() : y3x0Var;
    }

    public final /* synthetic */ void v(w3x0 w3x0Var) {
        this.zze = w3x0Var;
        this.zzb |= 1;
    }
}
