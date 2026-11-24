package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qyw0 extends mew0 {
    private static final qyw0 zzk;
    private static volatile yfw0 zzl;
    private int zzb;
    private int zze;
    private xew0 zzf = bgw0.e;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        qyw0 qyw0Var = new qyw0();
        zzk = qyw0Var;
        mew0.m(qyw0.class, qyw0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", edw0.p, "zzf", qyw0.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new qyw0();
        }
        if (i2 == 4) {
            return new nsw0(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzl;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (qyw0.class) {
            try {
                jew0Var = zzl;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzk);
                    zzl = jew0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jew0Var;
    }

    public final List r() {
        return this.zzf;
    }

    public final String s() {
        return this.zzg;
    }

    public final boolean t() {
        return (this.zzb & 4) != 0;
    }

    public final String u() {
        return this.zzh;
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final boolean x() {
        return (this.zzb & 16) != 0;
    }

    public final double y() {
        return this.zzj;
    }

    public final int z() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
