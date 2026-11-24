package a;

/* JADX INFO: loaded from: classes2.dex */
public final class qxw0 extends mew0 {
    private static final qxw0 zzg;
    private static volatile yfw0 zzh;
    private int zzb;
    private int zze = 1;
    private xew0 zzf = bgw0.e;

    static {
        qxw0 qxw0Var = new qxw0();
        zzg = qxw0Var;
        mew0.m(qxw0.class, qxw0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zze", edw0.l, "zzf", vww0.class});
        }
        if (i2 == 3) {
            return new qxw0();
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
        synchronized (qxw0.class) {
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
}
