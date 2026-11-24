package a;

/* JADX INFO: loaded from: classes2.dex */
public final class wuw0 extends mew0 {
    private static final wuw0 zzj;
    private static volatile yfw0 zzk;
    private int zzb;
    private int zzh;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";

    static {
        wuw0 wuw0Var = new wuw0();
        zzj = wuw0Var;
        mew0.m(wuw0.class, wuw0Var);
    }

    public static wuw0 t() {
        return zzj;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new wuw0();
        }
        if (i2 == 4) {
            return new nsw0(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzk;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (wuw0.class) {
            try {
                jew0Var = zzk;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzj);
                    zzk = jew0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jew0Var;
    }

    public final int r() {
        return this.zzh;
    }

    public final String s() {
        return this.zzi;
    }
}
