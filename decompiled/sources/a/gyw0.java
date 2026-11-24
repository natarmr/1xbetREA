package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gyw0 extends mew0 {
    private static final gyw0 zze;
    private static volatile yfw0 zzf;
    private xew0 zzb = bgw0.e;

    static {
        gyw0 gyw0Var = new gyw0();
        zze = gyw0Var;
        mew0.m(gyw0.class, gyw0Var);
    }

    public static gyw0 t() {
        return zze;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", hyw0.class});
        }
        if (i2 == 3) {
            return new gyw0();
        }
        if (i2 == 4) {
            return new nsw0(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzf;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (gyw0.class) {
            try {
                jew0Var = zzf;
                if (jew0Var == null) {
                    jew0Var = new jew0(zze);
                    zzf = jew0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jew0Var;
    }

    public final List r() {
        return this.zzb;
    }

    public final int s() {
        return this.zzb.size();
    }
}
