package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t6x0 extends mew0 {
    private static final t6x0 zze;
    private static volatile yfw0 zzf;
    private xew0 zzb = bgw0.e;

    static {
        t6x0 t6x0Var = new t6x0();
        zze = t6x0Var;
        mew0.m(t6x0.class, t6x0Var);
    }

    public static t6x0 s(byte[] bArr, bew0 bew0Var) {
        return (t6x0) mew0.c(zze, bArr, bew0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new t6x0();
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
        synchronized (t6x0.class) {
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
}
