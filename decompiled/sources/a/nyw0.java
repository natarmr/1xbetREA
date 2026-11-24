package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nyw0 extends mew0 {
    private static final nyw0 zzg;
    private static volatile yfw0 zzh;
    private int zzb;
    private xew0 zze = bgw0.e;
    private gyw0 zzf;

    static {
        nyw0 nyw0Var = new nyw0();
        zzg = nyw0Var;
        mew0.m(nyw0.class, nyw0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", qyw0.class, "zzf"});
        }
        if (i2 == 3) {
            return new nyw0();
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
        synchronized (nyw0.class) {
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

    public final List r() {
        return this.zze;
    }

    public final gyw0 s() {
        gyw0 gyw0Var = this.zzf;
        return gyw0Var == null ? gyw0.t() : gyw0Var;
    }
}
