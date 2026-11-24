package a;

/* JADX INFO: loaded from: classes2.dex */
public final class dxw0 extends mew0 {
    private static final dxw0 zzh;
    private static volatile yfw0 zzi;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private lvw0 zzg;

    static {
        dxw0 dxw0Var = new dxw0();
        zzh = dxw0Var;
        mew0.m(dxw0.class, dxw0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new dxw0();
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
        synchronized (dxw0.class) {
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
}
