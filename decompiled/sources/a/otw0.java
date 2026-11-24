package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class otw0 extends mew0 {
    private static final otw0 zzj;
    private static volatile yfw0 zzk;
    private int zzb;
    private xew0 zze;
    private xew0 zzf;
    private xew0 zzg;
    private boolean zzh;
    private xew0 zzi;

    static {
        otw0 otw0Var = new otw0();
        zzj = otw0Var;
        mew0.m(otw0.class, otw0Var);
    }

    public otw0() {
        bgw0 bgw0Var = bgw0.e;
        this.zze = bgw0Var;
        this.zzf = bgw0Var;
        this.zzg = bgw0Var;
        this.zzi = bgw0Var;
    }

    public static otw0 x() {
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
            return new cgw0(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", xsw0.class, "zzf", zsw0.class, "zzg", itw0.class, "zzh", "zzi", xsw0.class});
        }
        if (i2 == 3) {
            return new otw0();
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
        synchronized (otw0.class) {
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

    public final List r() {
        return this.zze;
    }

    public final List s() {
        return this.zzf;
    }

    public final List t() {
        return this.zzg;
    }

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final xew0 w() {
        return this.zzi;
    }
}
