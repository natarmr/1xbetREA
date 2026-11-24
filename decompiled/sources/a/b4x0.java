package a;

/* JADX INFO: loaded from: classes2.dex */
public final class b4x0 extends mew0 {
    private static final b4x0 zzg;
    private static volatile yfw0 zzh;
    private int zzb;
    private String zze = "";
    private long zzf;

    static {
        b4x0 b4x0Var = new b4x0();
        zzg = b4x0Var;
        mew0.m(b4x0.class, b4x0Var);
    }

    public static b4x0 t() {
        return zzg;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new b4x0();
        }
        if (i2 == 4) {
            return new nsw0(zzg);
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
        synchronized (b4x0.class) {
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

    public final String r() {
        return this.zze;
    }

    public final long s() {
        return this.zzf;
    }
}
