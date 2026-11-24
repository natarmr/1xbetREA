package a;

/* JADX INFO: loaded from: classes2.dex */
public final class luw0 extends mew0 {
    private static final luw0 zzj;
    private static volatile yfw0 zzk;
    private int zzb;
    private int zze = 14;
    private int zzf = 11;
    private int zzg = 60;
    private int zzh = 13;
    private int zzi = 11;

    static {
        luw0 luw0Var = new luw0();
        zzj = luw0Var;
        mew0.m(luw0.class, luw0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new luw0();
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
        synchronized (luw0.class) {
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
}
