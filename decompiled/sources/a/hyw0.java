package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hyw0 extends mew0 {
    private static final hyw0 zzg;
    private static volatile yfw0 zzh;
    private int zzb;
    private String zze = "";
    private xew0 zzf = bgw0.e;

    static {
        hyw0 hyw0Var = new hyw0();
        zzg = hyw0Var;
        mew0.m(hyw0.class, hyw0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", qyw0.class});
        }
        if (i2 == 3) {
            return new hyw0();
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
        synchronized (hyw0.class) {
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

    public final List s() {
        return this.zzf;
    }
}
