package a;

/* JADX INFO: loaded from: classes2.dex */
public final class stw0 extends mew0 {
    private static final stw0 zzh;
    private static volatile yfw0 zzi;
    private int zzb;
    private String zze = "";
    private xew0 zzf = bgw0.e;
    private boolean zzg;

    static {
        stw0 stw0Var = new stw0();
        zzh = stw0Var;
        mew0.m(stw0.class, stw0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zze", "zzf", nuw0.class, "zzg"});
        }
        if (i2 == 3) {
            return new stw0();
        }
        if (i2 == 4) {
            return new nsw0(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzi;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (stw0.class) {
            try {
                jew0Var = zzi;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzh);
                    zzi = jew0Var;
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
}
